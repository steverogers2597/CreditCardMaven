package com.cg.creditcard.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Card")
public class CreditCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String bankName;
	private String cardType;
	private String cardName;
	private String cardNumber;
    private LocalDate Expirydate;
    private int cvv;
    
	public CreditCard(long id, String bankName, String cardType, String cardName, String cardNumber,
			LocalDate expirydate, int cvv) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.cardType = cardType;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		Expirydate = expirydate;
		this.cvv = cvv;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getExpirydate() {
		return Expirydate;
	}
	public void setExpirydate(LocalDate expirydate) {
		Expirydate = expirydate;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", bankName=" + bankName + ", cardType=" + cardType + ", cardName=" + cardName
				+ ", cardNumber=" + cardNumber + ", Expirydate=" + Expirydate + ", cvv=" + cvv + "]";
	}
    
}
