package com.ask.be.configuration;

import java.util.Date;

/**
 * @author Srivastava Class to define the configuration of a vaccination card
 *         (its content)
 */
public class VaccineCard {

	String id;
	String dueDate;
	String dateGiven;
	String vaccine;
	String age;
	float weight;
	float heigth;
	float BMI;
	String placeName;


	public VaccineCard(String id, String dueDate, String dateGiven, String vaccine, String age, float weight, float heigth,
			float bMI, String placeName) {
		super();
		this.id = id;
		this.dueDate = dueDate;
		this.dateGiven = dateGiven;
		this.vaccine = vaccine;
		this.age = age;
		this.weight = weight;
		this.heigth = heigth;
		BMI = bMI;
		this.placeName = placeName;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getDateGiven() {
		return dateGiven;
	}

	public void setDateGiven(String dateGiven) {
		this.dateGiven = dateGiven;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeigth() {
		return heigth;
	}

	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}

	public float getBMI() {
		return BMI;
	}

	public void setBMI(float bMI) {
		BMI = bMI;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	@Override
	public String toString() {
		return "VaccineCard [id=" + id + ", dueDate=" + dueDate + ", dateGiven=" + dateGiven + ", vaccine=" + vaccine
				+ ", age=" + age + ", weight=" + weight + ", heigth=" + heigth + ", BMI=" + BMI + ", placeName="
				+ placeName + "]";
	}

	
	
	

}
