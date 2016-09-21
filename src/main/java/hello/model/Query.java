package hello.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Query {

	@SerializedName("normalized")
	@Expose
	private List<Normalized> normalized = new ArrayList<Normalized>();
	@SerializedName("pages")
	@Expose
	private Pages pages;

	/**
	 * 
	 * @return The normalized
	 */
	public List<Normalized> getNormalized() {
		return normalized;
	}

	/**
	 * 
	 * @param normalized
	 *            The normalized
	 */
	public void setNormalized(List<Normalized> normalized) {
		this.normalized = normalized;
	}

	/**
	 * 
	 * @return The pages
	 */
	public Pages getPages() {
		return pages;
	}

	/**
	 * 
	 * @param pages
	 *            The pages
	 */
	public void setPages(Pages pages) {
		this.pages = pages;
	}

}