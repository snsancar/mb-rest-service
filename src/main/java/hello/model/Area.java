package hello.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Area {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("iso-3166-1-codes")
	@Expose
	private List<String> iso31661Codes = new ArrayList<String>();
	@SerializedName("sort-name")
	@Expose
	private String sortName;
	@SerializedName("disambiguation")
	@Expose
	private String disambiguation;
	@SerializedName("id")
	@Expose
	private String id;

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
	 * @return The iso31661Codes
	 */
	public List<String> getIso31661Codes() {
		return iso31661Codes;
	}

	/**
	 * 
	 * @param iso31661Codes
	 *            The iso-3166-1-codes
	 */
	public void setIso31661Codes(List<String> iso31661Codes) {
		this.iso31661Codes = iso31661Codes;
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

}
