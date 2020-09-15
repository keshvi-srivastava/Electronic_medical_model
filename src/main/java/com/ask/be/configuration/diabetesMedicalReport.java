package com.ask.be.configuration;

public class diabetesMedicalReport {

	String id;
	String reportType;
	int age;
	String gender;
	double Glucose;
	
	public diabetesMedicalReport(String id, String reportType, int age, String gender, double glucose) {
		super();
		this.id = id;
		this.reportType = reportType;
		this.age = age;
		this.gender = gender;
		Glucose = glucose;
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
	public double getGlucose() {
		return Glucose;
	}
	public void setGlucose(double glucose) {
		this.Glucose = glucose;
	}

	@Override
	public String toString() {
		return "diabetesMedicalReport [id=" + id + ", reportType=" + reportType + ", age=" + age + ", gender=" + gender
				+ ", Glucose=" + Glucose + "]";
	}
	
	
	
	
}
