package com.app.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {

	@Id
	private String custId;
	private String firstName;
	private String lastName;
	private Double billAmount;
	private Double discount;
	
	public Customer() {
		super();
	}
	
	public Customer(String firstName, String lastName, Double billAmount, Double discount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.billAmount = billAmount;
		this.discount = discount;
	}

	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
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
	public Double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", billAmount="
				+ billAmount + ", discount=" + discount + "]";
	}
	
	
}
