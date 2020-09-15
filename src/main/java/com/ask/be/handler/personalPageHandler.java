package com.ask.be.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.ask.be.configuration.VaccineCard;
import com.ask.be.configuration.personalInfo;
import com.ask.be.configuration.personalPage;

public class personalPageHandler {

	private final static Logger LOGGER = Logger.getLogger(personalPageHandler.class.getName());
	static personalInfo pinfo;
	static ArrayList<VaccineCard> vc;
	static personalPage pp = new personalPage();
	
	public static personalPage getDetails() throws IOException
	{
		pp.setPi(personalInfoHandler.getDetails());
		pp.setVc(VaccineHandler.getDetails());
		
		return pp;
	}
}
