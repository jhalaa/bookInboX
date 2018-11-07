package blog.model;

public class TagDetails {
	protected String tagId;
	protected String tagName;

	public TagDetails(String tagId, String tagName) {

		this.tagId = tagId;
		this.tagName = tagName;
	}

	public TagDetails(String tagId) {
		this.tagId = tagId;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
}
