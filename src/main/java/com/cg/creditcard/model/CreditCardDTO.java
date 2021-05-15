package com.cg.creditcard.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class CreditCardDTO {
	
	private long id;
	private String cardName;
	private String cardType;
	private String cardNumbe;
	private LocalDate expiryDate;
	private String bankName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardNumbe() {
		return cardNumbe;
	}
	public void setCardNumbe(String cardNumbe) {
		this.cardNumbe = cardNumbe;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public CreditCardDTO(long id, String cardName, String cardType, String cardNumbe, LocalDate expiryDate,
			String bankName) {
		super();
		this.id = id;
		this.cardName = cardName;
		this.cardType = cardType;
		this.cardNumbe = cardNumbe;
		this.expiryDate = expiryDate;
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "CreditCardDTO [id=" + id + ", cardName=" + cardName + ", cardType=" + cardType + ", cardNumbe="
				+ cardNumbe + ", expiryDate=" + expiryDate + ", bankName=" + bankName + "]";
	}
	
	
	
}
