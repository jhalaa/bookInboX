package blog.model;

public class Reviews {
	protected int reviewId;
	protected Books book;
	protected Users user;
	protected String content;

	public Reviews(int reviewId, Books book, Users user, String content) {
		this.reviewId = reviewId;
		this.book = book;
		this.user = user;
		this.content = content;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
