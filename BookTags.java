package blog.model;

public class BookTags {
	protected Books book;
	protected TagDetails tag;

	public BookTags(Books book, TagDetails tag) {
		this.book = book;
		this.tag = tag;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public TagDetails getTag() {
		return tag;
	}

	public void setTag(TagDetails tag) {
		this.tag = tag;
	}
}
