package blog.model;
import java.util.Date;


public class Books {
	protected String bookId;
	protected String isbn;
	protected String author;
	protected float averageRating;
	protected float ratingsCount;
	protected int publicationYear;
	protected String imageUrl;

	public Books(String bookId, String isbn, String author, float averageRating, float ratingsCount, int publicationYear, String imageUrl) {

		this.bookId = bookId;
		this.isbn = isbn;
		this.author = author;
		this.averageRating = averageRating;
		this.ratingsCount = ratingsCount;
		this.publicationYear = publicationYear;
		this.imageUrl = imageUrl;
	}

	public Books(String bookId) {
		this.bookId = bookId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

	public float getRatingsCount() {
		return ratingsCount;
	}

	public void setRatingsCount(float ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
