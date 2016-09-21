package hello.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class MB {

	@SerializedName("area")
	@Expose
	private Area area;
	@SerializedName("type-id")
	@Expose
	private String typeId;
	@SerializedName("relations")
	@Expose
	private List<Relation> relations = new ArrayList<Relation>();
	@SerializedName("sort-name")
	@Expose
	private String sortName;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("gender")
	@Expose
	private String gender;
	@SerializedName("end_area")
	@Expose
	private EndArea endArea;
	@SerializedName("life-span")
	@Expose
	private LifeSpan lifeSpan;
	@SerializedName("disambiguation")
	@Expose
	private String disambiguation;
	@SerializedName("gender-id")
	@Expose
	private String genderId;
	@SerializedName("release-groups")
	@Expose
	private List<ReleaseGroup> releaseGroups = new ArrayList<ReleaseGroup>();
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("begin_area")
	@Expose
	private BeginArea beginArea;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("ipis")
	@Expose
	private List<String> ipis = new ArrayList<String>();

	/**
	 * 
	 * @return The area
	 */
	public Area getArea() {
		return area;
	}

	/**
	 * 
	 * @param area
	 *            The area
	 */
	public void setArea(Area area) {
		this.area = area;
	}

	/**
	 * 
	 * @return The typeId
	 */
	public String getTypeId() {
		return typeId;
	}

	/**
	 * 
	 * @param typeId
	 *            The type-id
	 */
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	/**
	 * 
	 * @return The relations
	 */
	public List<Relation> getRelations() {
		return relations;
	}

	/**
	 * 
	 * @param relations
	 *            The relations
	 */
	public void setRelations(List<Relation> relations) {
		this.relations = relations;
	}

	/**
	 * 
	 * @return The sortName
	 */
	public String getSortName() {
		return sortName;
	}

	/**
	 * 
	 * @param sortName
	 *            The sort-name
	 */
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	/**
	 * 
	 * @return The country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 *            The country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 
	 * @return The gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 
	 * @param gender
	 *            The gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 
	 * @return The endArea
	 */
	public EndArea getEndArea() {
		return endArea;
	}

	/**
	 * 
	 * @param endArea
	 *            The end_area
	 */
	public void setEndArea(EndArea endArea) {
		this.endArea = endArea;
	}

	/**
	 * 
	 * @return The lifeSpan
	 */
	public LifeSpan getLifeSpan() {
		return lifeSpan;
	}

	/**
	 * 
	 * @param lifeSpan
	 *            The life-span
	 */
	public void setLifeSpan(LifeSpan lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	/**
	 * 
	 * @return The disambiguation
	 */
	public String getDisambiguation() {
		return disambiguation;
	}

	/**
	 * 
	 * @param disambiguation
	 *            The disambiguation
	 */
	public void setDisambiguation(String disambiguation) {
		this.disambiguation = disambiguation;
	}

	/**
	 * 
	 * @return The genderId
	 */
	public String getGenderId() {
		return genderId;
	}

	/**
	 * 
	 * @param genderId
	 *            The gender-id
	 */
	public void setGenderId(String genderId) {
		this.genderId = genderId;
	}

	/**
	 * 
	 * @return The releaseGroups
	 */
	public List<ReleaseGroup> getReleaseGroups() {
		return releaseGroups;
	}

	/**
	 * 
	 * @param releaseGroups
	 *            The release-groups
	 */
	public void setReleaseGroups(List<ReleaseGroup> releaseGroups) {
		this.releaseGroups = releaseGroups;
	}

	/**
	 * 
	 * @return The id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The beginArea
	 */
	public BeginArea getBeginArea() {
		return beginArea;
	}

	/**
	 * 
	 * @param beginArea
	 *            The begin_area
	 */
	public void setBeginArea(BeginArea beginArea) {
		this.beginArea = beginArea;
	}

	/**
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return The ipis
	 */
	public List<String> getIpis() {
		return ipis;
	}

	/**
	 * 
	 * @param ipis
	 *            The ipis
	 */
	public void setIpis(List<String> ipis) {
		this.ipis = ipis;
	}

}