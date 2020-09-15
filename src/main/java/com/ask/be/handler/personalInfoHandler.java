package com.ask.be.handler;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Logger;

import com.ask.be.configuration.personalInfo;
import com.ask.be.dao.mongoCreateDB;
import com.google.gson.Gson;

public class personalInfoHandler {

	private final static Logger LOGGER = Logger.getLogger(personalInfoHandler.class.getName());
	static personalInfo pinfo;
	
	public static personalInfo getDetails() throws IOException
	{
		Gson gson = new Gson();
		String path = "C:\\Users\\Srivastava\\Desktop\\sem 7\\BE PROJECT\\sakshiPersonalInfo.json";
		try(Reader reader = new FileReader(path))
		{
			pinfo = gson.fromJson(reader, personalInfo.class);
			LOGGER.info(pinfo.toString());	
			//mongoCreateDB.store(gson.toJson(pinfo).toString(), "Personal", "Details");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return pinfo;
	}
}
