package blog.model;

public class Users {
	protected String userName;
	protected String password;
	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	protected Address address;
    protected CreditCards card;

	public Users(String userName) {
		this.userName = userName;
	}

	public Users(String userName, String password, String firstName, String lastName, String phoneNumber, Address address, CreditCards card) {
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
        this.card = card;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
    
    public CreditCards getCreditCard() {
        return card;
    }
    
    public void setCreditCard(CreditCards card) {
        this.card = card;
    }

}
