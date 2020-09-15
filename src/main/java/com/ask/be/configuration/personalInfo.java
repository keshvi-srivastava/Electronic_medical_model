package com.ask.be.configuration;

import java.util.ArrayList;

public class personalInfo{

	String id;
	String name;
	String DOB;
	String currentAddress;
	String bloodGroup;
	String gender;
	ArrayList<trustedContacts> contact1;
	ArrayList<trustedContacts> contact2;
	String aadharCard;
	
	
	public personalInfo(String id, String name, String dOB, String currentAddress, String bloodGroup, String gender,
			ArrayList<trustedContacts> contact1, ArrayList<trustedContacts> contact2, String aadharCard) {
		super();
		this.id = id;
		this.name = name;
		DOB = dOB;
		this.currentAddress = currentAddress;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.contact1 = contact1;
		this.contact2 = contact2;
		this.aadharCard = aadharCard;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	public ArrayList<trustedContacts> getContact1() {
		return contact1;
	}
	public void setContact1(ArrayList<trustedContacts> contact1) {
		this.contact1 = contact1;
	}
	public ArrayList<trustedContacts> getContact2() {
		return contact2;
	}
	public void setContact2(ArrayList<trustedContacts> contact2) {
		this.contact2 = contact2;
	}

	@Override
	public String toString() {
		return "personalInfo [id=" + id + ", name=" + name + ", DOB=" + DOB + ", currentAddress=" + currentAddress
				+ ", bloodGroup=" + bloodGroup + ", gender=" + gender + ", contact1=" + contact1 + ", contact2="
				+ contact2 + ", aadharCard=" + aadharCard + "]";
	}
	
}
