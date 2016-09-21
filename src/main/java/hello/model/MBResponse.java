package hello.model;

import java.util.List;

/**
 * Model class used to hold the final output details like wikipedia description
 * and Album with cover art details for the artist.
 * 
 * @author sankar
 *
 */
public class MBResponse {

	private String mbid;
	private String description;
	private List<AlbumWithCoverArt> albumCoverArtList;

	public String getMbid() {
		return mbid;
	}

	public void setMbid(String mbid) {
		this.mbid = mbid;
	}

	public List<AlbumWithCoverArt> getAlbumCoverArtList() {
		return albumCoverArtList;
	}

	public void setAlbumCoverArtList(List<AlbumWithCoverArt> albumCoverArtList) {
		this.albumCoverArtList = albumCoverArtList;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
