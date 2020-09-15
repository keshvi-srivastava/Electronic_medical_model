package com.ask.be.configuration;

public class vitaminMedicalReport {

	String id;
	String reportType;
	int age;
	String gender;
	double vitaminB12;
	double vitaminD;
	
	
	public vitaminMedicalReport(String id, String reportType, int age, String gender, double vitaminB12, double vitaminD) {
		super();
		this.id = id;
		this.reportType = reportType;
		this.age = age;
		this.gender = gender;
		this.vitaminB12 = vitaminB12;
		this.vitaminD = vitaminD;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getVitaminB12() {
		return vitaminB12;
	}
	public void setVitaminB12(double vitaminB12) {
		this.vitaminB12 = vitaminB12;
	}
	public double getVitaminD() {
		return vitaminD;
	}
	public void setVitaminD(double vitaminD) {
		this.vitaminD = vitaminD;
	}

	@Override
	public String toString() {
		return "vitaminMedicalReport [id=" + id + ", reportType=" + reportType + ", age=" + age + ", gender=" + gender
				+ ", vitaminB12=" + vitaminB12 + ", vitaminD=" + vitaminD + "]";
	}
	
	
	
	
	
}
