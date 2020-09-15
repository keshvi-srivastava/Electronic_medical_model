package com.ask.be.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.ask.be.configuration.vitaminMedicalReport;
import com.ask.be.dao.mongoRetrieve;
import com.mongodb.DBObject;

public class vitaminReportHandler {

	private final static Logger LOGGER = Logger.getLogger(vitaminReportHandler.class.getName());
	static vitaminMedicalReport vmr;
		
	public static ArrayList<vitaminMedicalReport> getDetails() throws IOException
	{	 
		ArrayList<vitaminMedicalReport> report = new ArrayList();
		try {
			
			List<DBObject> obj = mongoRetrieve.retrieve("MedicalReport", "Vitamin" , "id", "345678");
			LOGGER.info(obj.toString());
			
				vmr = new vitaminMedicalReport(obj.get(0).get("id").toString(), obj.get(0).get("reportType").toString(), 
						Integer.parseInt(obj.get(0).get("age").toString()), obj.get(0).get("gender").toString(),
						Double.parseDouble(obj.get(0).get("vitaminB12").toString()), 
						Double.parseDouble(obj.get(0).get("vitaminD").toString()));
						
				report.add(vmr);
			}	
		
		catch (Exception e) {		
			System.out.println("Error in code");
			e.printStackTrace();
		}
		return report;
	}
}
