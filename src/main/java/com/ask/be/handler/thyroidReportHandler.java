package com.ask.be.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.ask.be.configuration.thyroidMedicalReport;
import com.ask.be.dao.mongoRetrieve;
import com.mongodb.DBObject;

public class thyroidReportHandler {
	
	private final static Logger LOGGER = Logger.getLogger(thyroidReportHandler.class.getName());
	static thyroidMedicalReport tmr;
	
	public static ArrayList<thyroidMedicalReport> getDetails() throws IOException
	{
 
		ArrayList<thyroidMedicalReport> report = new ArrayList();
		try {
			

				List<DBObject> obj = mongoRetrieve.retrieve("MedicalReport", "Thyroid" , "id", "234567");
				LOGGER.info(obj.toString());
				tmr = new thyroidMedicalReport(obj.get(0).get("id").toString(), obj.get(0).get("reportType").toString(), 
						Integer.parseInt(obj.get(0).get("age").toString()), obj.get(0).get("gender").toString(), 
						Boolean.parseBoolean(obj.get(0).get("onThyroxine").toString()), Boolean.parseBoolean(obj.get(0).get("onAntiThyroideMed").toString()), 
						Boolean.parseBoolean(obj.get(0).get("sick").toString()), Boolean.parseBoolean(obj.get(0).get("pregnant").toString()),
						Boolean.parseBoolean(obj.get(0).get("recentThryoidSurgery").toString()), Boolean.parseBoolean(obj.get(0).get("I131Treatment").toString()), 
						Boolean.parseBoolean(obj.get(0).get("lithium").toString()), Boolean.parseBoolean(obj.get(0).get("goitre").toString()),
						Boolean.parseBoolean(obj.get(0).get("tumor").toString()), Boolean.parseBoolean(obj.get(0).get("hypopituitary").toString()), 
						Double.parseDouble(obj.get(0).get("TSH").toString()),Double.parseDouble(obj.get(0).get("T3").toString()), 
						Double.parseDouble(obj.get(0).get("TT4").toString()), 
						Double.parseDouble(obj.get(0).get("T4U").toString()), Double.parseDouble(obj.get(0).get("FTI").toString()), 
						Double.parseDouble(obj.get(0).get("TBG").toString()));
				report.add(tmr);
			}	
		
		catch (Exception e) {		
			System.out.println("Error in code");
			e.printStackTrace();
		}
		return report;
	}

}
