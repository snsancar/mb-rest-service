package hello.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class LifeSpan {

	@SerializedName("ended")
	@Expose
	private Boolean ended;
	@SerializedName("end")
	@Expose
	private String end;
	@SerializedName("begin")
	@Expose
	private String begin;

	/**
	 * 
	 * @return The ended
	 */
	public Boolean getEnded() {
		return ended;
	}

	/**
	 * 
	 * @param ended
	 *            The ended
	 */
	public void setEnded(Boolean ended) {
		this.ended = ended;
	}

	/**
	 * 
	 * @return The end
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * 
	 * @param end
	 *            The end
	 */
	public void setEnd(String end) {
		this.end = end;
	}

	/**
	 * 
	 * @return The begin
	 */
	public String getBegin() {
		return begin;
	}

	/**
	 * 
	 * @param begin
	 *            The begin
	 */
	public void setBegin(String begin) {
		this.begin = begin;
	}

}