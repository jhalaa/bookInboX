package blog.model;
import java.util.Date;


public class CreditCards {
	protected Long cardNumber;
	protected Date expiration;


	public CreditCards(Long cardNumber, Date expiration) {
		this.cardNumber = cardNumber;
		this.expiration = expiration;
	}

	public CreditCards(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpiration() {
		return expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
}
