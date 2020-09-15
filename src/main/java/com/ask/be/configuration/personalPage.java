package com.ask.be.configuration;

import java.util.ArrayList;

public class personalPage {
	
	ArrayList<VaccineCard> vc;
	personalInfo pi;
	public ArrayList<VaccineCard> getVc() {
		return vc;
	}
	public void setVc(ArrayList<VaccineCard> vc) {
		this.vc = vc;
	}
	public personalInfo getPi() {
		return pi;
	}
	public void setPi(personalInfo pi) {
		this.pi = pi;
	}
	@Override
	public String toString() {
		return "personalPage [vc=" + vc + ", pi=" + pi + "]";
	}
	
	

}
