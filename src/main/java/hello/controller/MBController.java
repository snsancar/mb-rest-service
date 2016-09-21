package hello.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import hello.model.AlbumWithCoverArt;
import hello.model.CoverArt;
import hello.model.Image;
import hello.model.MB;
import hello.model.MBResponse;
import hello.model.Relation;
import hello.model.ReleaseGroup;
import hello.model.Wikipedia;

/**
 * Rest Controller used to call the MusizBrainz Rest API based on MB ID.
 * 
 * @author sankar
 *
 */
@RestController
public class MBController {

	private static final Logger LOG = LoggerFactory.getLogger(MBController.class);

	/**
	 * This method maps the URL and calls the MB APP REst API with MB id.
	 * @param mbid
	 * @return MBResponse - contains title, album, cover art details.
	 */
	@RequestMapping("/mbapp/{mbid}")
	public MBResponse mbRestService(@PathVariable("mbid") String mbid) {

		RestTemplate restTemplate = new RestTemplate();
		Gson gson = new Gson();
		String mbRestUrl = "http://musicbrainz.org/ws/2/artist/{mbid}?&fmt=json&inc=url-rels+release-groups";
		MBResponse mbFinalResponse = new MBResponse();
		try {
			ResponseEntity<String> mbResponse = restTemplate.exchange(mbRestUrl, HttpMethod.GET,
					new HttpEntity<>(new HttpHeaders()), String.class, mbid);
			MB mbPojo = gson.fromJson(mbResponse.getBody(), MB.class);
			String wikiPediaUrl = getWikiPediaURL(mbPojo);
			String artistName = wikiPediaUrl.substring(wikiPediaUrl.lastIndexOf("/") + 1, wikiPediaUrl.length());
			// get Wikipedia Description for the Artist
			String description = getWikiPediaDescription(restTemplate, gson, artistName);

			List<ReleaseGroup> releaseGroups = mbPojo.getReleaseGroups();
			// Get Album With Cover Art details based on Release Groups ID.
			List<AlbumWithCoverArt> coverArtList = getAlbumCoverArtDetails(restTemplate, gson, releaseGroups);

			mbFinalResponse.setMbid(mbid);
			mbFinalResponse.setDescription(description);
			mbFinalResponse.setAlbumCoverArtList(coverArtList);
		} catch (RestClientException rce) {
			LOG.error(rce.getMessage());
		} catch (JsonSyntaxException jse) {
			LOG.error(jse.getMessage());
		}
		return mbFinalResponse;
	}

	/**
	 * This method used to get the Album with Cover Art details based on Release
	 * Group and ID.
	 * 
	 * @param restTemplate
	 * @param gson
	 * @param releaseGroups
	 * @return List<AlbumWithCoverArt> - list of album with cover art details.
	 */
	private List<AlbumWithCoverArt> getAlbumCoverArtDetails(RestTemplate restTemplate, Gson gson,
			List<ReleaseGroup> releaseGroups) {
		List<AlbumWithCoverArt> coverArtList = releaseGroups.stream().map(releaseGroup -> {

			String id = releaseGroup.getId();
			String title = releaseGroup.getTitle();
			String coverArtRestUrl = "http://coverartarchive.org/release-group/{id}";
			AlbumWithCoverArt albumCoverArt = new AlbumWithCoverArt();
			try {
				ResponseEntity<String> coverArtResponse = restTemplate.exchange(coverArtRestUrl, HttpMethod.GET,
						new HttpEntity<>(new HttpHeaders()), String.class, id);
				CoverArt coverArtPojo = gson.fromJson(coverArtResponse.getBody(), CoverArt.class);
				List<Image> images = coverArtPojo.getImages();
				List<String> backCover = images.stream().filter(image -> image.getBack()).map(image -> image.getImage())
						.collect(Collectors.toList());
				List<String> frontCover = images.stream().filter(image -> image.getFront())
						.map(image -> image.getImage()).collect(Collectors.toList());
				if (!backCover.isEmpty()) {
					albumCoverArt.setBackCoverImageUrl(backCover.get(0));
				}
				if (!frontCover.isEmpty()) {
					albumCoverArt.setFrontCoverImageUrl(frontCover.get(0));
				}
			} catch (HttpStatusCodeException hsce) {
				LOG.info(hsce.getMessage());
			} catch (RestClientException rce) {
				LOG.info(rce.getMessage());
			}
			albumCoverArt.setId(id);
			albumCoverArt.setTitle(title);
			return albumCoverArt;
		}).collect(Collectors.toList());
		return coverArtList;
	}

	/**
	 * This method used to get the WikiPedia URL from the MusicBrainz Response.
	 * 
	 * @param mbPojo
	 * @return String - wikipedia url
	 */
	private String getWikiPediaURL(MB mbPojo) {
		List<Relation> relations = mbPojo.getRelations();
		List<String> wikiType = relations.stream().filter(relation -> {
			if (relation.getType().equals("wikipedia")) {
				return true;
			} else {
				return false;
			}
		}).map(relation -> relation.getUrl().getResource()).collect(Collectors.toList());

		return wikiType.get(0);
	}

	/**
	 * This method used to get the WikiPedia Description based on Artist Name.
	 * 
	 * @param restTemplate
	 * @param gson
	 * @param artistName
	 * @return String - artist name
	 */
	private String getWikiPediaDescription(RestTemplate restTemplate, Gson gson, String artistName) {
		String wikiPediaRestUrl = "https://en.wikipedia.org/w/api.php?action=query&format=json&prop=extracts&exintro=true&redirects=true&titles={artistName}";
		String description = "";
		try {
			ResponseEntity<String> wikiPediaResponse = restTemplate.exchange(wikiPediaRestUrl, HttpMethod.GET,
					new HttpEntity<>(new HttpHeaders()), String.class, artistName);
			Wikipedia wikiPediaPojo = gson.fromJson(wikiPediaResponse.getBody(), Wikipedia.class);
			description = wikiPediaPojo.getQuery().getPages().get14995351().getExtract();
		} catch (RestClientException rce) {
			LOG.error(rce.getMessage());
		} catch (JsonSyntaxException jse) {
			LOG.error(jse.getMessage());
		}
		return description;
	}
}
