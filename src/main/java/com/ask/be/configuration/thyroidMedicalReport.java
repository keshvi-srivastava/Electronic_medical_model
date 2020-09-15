package com.ask.be.configuration;

public class thyroidMedicalReport {

	String id;
	String reportType;
	int age;
	String gender;
	boolean onThyroxine;
	boolean onAntiThyroideMed;
	boolean sick;
	boolean pregnant;
	boolean recentThryoidSurgery;
	boolean I131Treatment;
	boolean lithium;
	boolean goitre;
	boolean tumor;
	boolean hypopituitary;
	double TSH;
	double T3;
	double TT4;
	double T4U;
	double FTI;
	double TBG;
	
	
	public thyroidMedicalReport(String id, String reportType, int age, String gender, boolean onThyroxine, boolean onAntiThyroideMed, boolean sick,
			boolean pregnant, boolean recentThryoidSurgery, boolean i131Treatment, boolean lithium, boolean goitre,
			boolean tumor, boolean hypopituitary, double tSH, double t3, double tT4, double t4u, double fTI, double tBG) {
		super();
		this.id = id;
		this.reportType = reportType;
		this.age = age;
		this.gender = gender;
		this.onThyroxine = onThyroxine;
		this.onAntiThyroideMed = onAntiThyroideMed;
		this.sick = sick;
		this.pregnant = pregnant;
		this.recentThryoidSurgery = recentThryoidSurgery;
		I131Treatment = i131Treatment;
		this.lithium = lithium;
		this.goitre = goitre;
		this.tumor = tumor;
		this.hypopituitary = hypopituitary;
		TSH = tSH;
		T3 = t3;
		TT4 = tT4;
		T4U = t4u;
		FTI = fTI;
		TBG = tBG;
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
	public boolean isOnThyroxine() {
		return onThyroxine;
	}
	public void setOnThyroxine(boolean onThyroxine) {
		this.onThyroxine = onThyroxine;
	}
	public boolean isOnAntiThyroideMed() {
		return onAntiThyroideMed;
	}
	public void setOnAntiThyroideMed(boolean onAntiThyroideMed) {
		this.onAntiThyroideMed = onAntiThyroideMed;
	}
	public boolean isSick() {
		return sick;
	}
	public void setSick(boolean sick) {
		this.sick = sick;
	}
	public boolean isPregnant() {
		return pregnant;
	}
	public void setPregnant(boolean pregnant) {
		this.pregnant = pregnant;
	}
	public boolean isRecentThryoidSurgery() {
		return recentThryoidSurgery;
	}
	public void setRecentThryoidSurgery(boolean recentThryoidSurgery) {
		this.recentThryoidSurgery = recentThryoidSurgery;
	}
	public boolean isI131Treatment() {
		return I131Treatment;
	}
	public void setI131Treatment(boolean i131Treatment) {
		I131Treatment = i131Treatment;
	}
	public boolean isLithium() {
		return lithium;
	}
	public void setLithium(boolean lithium) {
		this.lithium = lithium;
	}
	public boolean isGoitre() {
		return goitre;
	}
	public void setGoitre(boolean goitre) {
		this.goitre = goitre;
	}
	public boolean isTumor() {
		return tumor;
	}
	public void setTumor(boolean tumor) {
		this.tumor = tumor;
	}
	public boolean isHypopituitary() {
		return hypopituitary;
	}
	public void setHypopituitary(boolean hypopituitary) {
		this.hypopituitary = hypopituitary;
	}
	public double getTSH() {
		return TSH;
	}
	public void setTSH(double tSH) {
		TSH = tSH;
	}
	public double getT3() {
		return T3;
	}
	public void setT3(double t3) {
		T3 = t3;
	}
	public double getTT4() {
		return TT4;
	}
	public void setTT4(double tT4) {
		TT4 = tT4;
	}
	public double getT4U() {
		return T4U;
	}
	public void setT4U(double t4u) {
		T4U = t4u;
	}
	public double getFTI() {
		return FTI;
	}
	public void setFTI(double fTI) {
		FTI = fTI;
	}
	public double getTBG() {
		return TBG;
	}
	public void setTBG(double tBG) {
		TBG = tBG;
	}

	@Override
	public String toString() {
		return "thyroidMedicalReport [id=" + id + ", reportType=" + reportType + ", age=" + age + ", gender=" + gender
				+ ", onThyroxine=" + onThyroxine + ", onAntiThyroideMed=" + onAntiThyroideMed + ", sick=" + sick
				+ ", pregnant=" + pregnant + ", recentThryoidSurgery=" + recentThryoidSurgery + ", I131Treatment="
				+ I131Treatment + ", lithium=" + lithium + ", goitre=" + goitre + ", tumor=" + tumor
				+ ", hypopituitary=" + hypopituitary + ", TSH=" + TSH + ", T3=" + T3 + ", TT4=" + TT4 + ", T4U=" + T4U
				+ ", FTI=" + FTI + ", TBG=" + TBG + "]";
	}
	
	
}

	