package blog.model;

public class Rating {
	protected Books book;
	protected Users user;
	protected int rating;

	public Rating(Books book, Users user, int rating) {
		this.book = book;
		this.user = user;
		this.rating = rating;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
