package com.ask.be.configuration;

import java.util.ArrayList;

public class emergencyDetail {


	String id;
	ArrayList<insurance> insuranceDetails;
	ArrayList<String> allergies;
	String DOB;
	String bloodGroup;
	String gender;
	ArrayList<trustedContacts> contact1;
	ArrayList<trustedContacts> contact2;
	String aadharCard;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<insurance> getInsuranceDetails() {
		return insuranceDetails;
	}
	public void setInsuranceDetails(ArrayList<insurance> insuranceDetails) {
		this.insuranceDetails = insuranceDetails;
	}
	public ArrayList<String> getAllergies() {
		return allergies;
	}
	public void setAllergies(ArrayList<String> allergies) {
		this.allergies = allergies;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
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
	public String getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}
	@Override
	public String toString() {
		return "emergencyDetail [id=" + id + ", insuranceDetails=" + insuranceDetails + ", allergies=" + allergies
				+ ", DOB=" + DOB + ", bloodGroup=" + bloodGroup + ", gender=" + gender + ", contact1=" + contact1
				+ ", contact2=" + contact2 + ", aadharCard=" + aadharCard + "]";
	}
	
	
	
	
}
