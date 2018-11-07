package blog.model;

public class Comments {
	protected int commentId;
	protected Reviews review;
	protected Users user;
	protected String content;

	public Comments(int commentId, Reviews review, Users user, String content) {
		this.commentId = commentId;
		this.review = review;
		this.user = user;
		this.content = content;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public Reviews getReview() {
		return review;
	}

	public void setReview(Reviews review) {
		this.review = review;
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
