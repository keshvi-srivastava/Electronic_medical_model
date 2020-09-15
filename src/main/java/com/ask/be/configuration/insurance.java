package com.ask.be.configuration;

public class insurance {

	String nameOfCompany;
	String expiryDate;
	String costLimit;
	String contact;
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCostLimit() {
		return costLimit;
	}
	public void setCostLimit(String costLimit) {
		this.costLimit = costLimit;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "insurance [nameOfCompany=" + nameOfCompany + ", expiryDate=" + expiryDate + ", costLimit=" + costLimit
				+ ", contact=" + contact + "]";
	}

	
}
