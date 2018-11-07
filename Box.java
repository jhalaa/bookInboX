package blog.model;

public class Box {
	protected int boxNumber;
	protected Users user;
	protected Books book;

	public Box(int boxNumber, Users user, Books book) {

		this.boxNumber = boxNumber;
		this.user = user;
		this.book = book;
	}

	public Box(int boxNumber, Users user) {
		this.boxNumber = boxNumber;
		this.user = user;
	}

	public int getBoxNumber() {
		return boxNumber;
	}

	public void setBoxNumber(int boxNumber) {
		this.boxNumber = boxNumber;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}
}
