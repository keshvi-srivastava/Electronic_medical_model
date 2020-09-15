package com.ask.be.handler;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Logger;

import com.ask.be.configuration.emergencyDetail;
import com.ask.be.configuration.personalInfo;
import com.ask.be.dao.mongoCreateDB;
import com.google.gson.Gson;

public class emergencyDetailHandler {

	private final static Logger LOGGER = Logger.getLogger(emergencyDetailHandler.class.getName());
	static emergencyDetail ed = new emergencyDetail();
	static personalInfo pinfo;
	
	public static emergencyDetail getDetails() throws IOException
	{
		Gson gson = new Gson();
		String path = "C:\\Users\\Srivastava\\Desktop\\sem 7\\BE PROJECT\\aarohiPersonalInfo.json";
		try(Reader reader = new FileReader(path))
		{
			pinfo = gson.fromJson(reader, personalInfo.class);
			ed.setId(pinfo.getId());
			ed.setAadharCard(pinfo.getAadharCard());
			ed.setBloodGroup(pinfo.getBloodGroup());
			ed.setContact1(pinfo.getContact1());
			ed.setContact2(pinfo.getContact2());
			ed.setDOB(pinfo.getDOB());
			ed.setGender(pinfo.getGender());
			
			//mongoCreateDB.store(gson.toJson(ed).toString(), "Emergency", "Details");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return ed;
	}
	
}
