package blog.model;
import java.util.Date;


public class ToRead {
	protected Users user;
	protected String bookId;

	public ToRead(Users user) {
		this.user = user;
	}

	public ToRead(Users user, String bookId) {

		this.user = user;
		this.bookId = bookId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
}
