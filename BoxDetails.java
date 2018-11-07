package blog.model;

public class BoxDetails {
	protected int boxNumber;
	protected int month;
	protected int year;

	public BoxDetails(int boxNumber, int month, int year) {
		this.boxNumber = boxNumber;
		this.month = month;
		this.year = year;
	}

	public BoxDetails(int boxNumber) {
		this.boxNumber = boxNumber;
	}

	public int getBoxNumber() {
		return boxNumber;
	}

	public void setBoxNumber(int boxNumber) {
		this.boxNumber = boxNumber;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
