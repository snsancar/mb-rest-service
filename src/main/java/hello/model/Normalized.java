package hello.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Normalized {

	@SerializedName("from")
	@Expose
	private String from;
	@SerializedName("to")
	@Expose
	private String to;

	/**
	 * 
	 * @return The from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * 
	 * @param from
	 *            The from
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * 
	 * @return The to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * 
	 * @param to
	 *            The to
	 */
	public void setTo(String to) {
		this.to = to;
	}

}