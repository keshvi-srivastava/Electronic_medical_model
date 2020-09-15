package com.ask.be.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.ask.be.configuration.diabetesMedicalReport;
import com.ask.be.dao.mongoRetrieve;
import com.mongodb.DBObject;

public class diabetesReportHandler {

	private final static Logger LOGGER = Logger.getLogger(diabetesReportHandler.class.getName());
	static diabetesMedicalReport dmr;
	
	public static ArrayList<diabetesMedicalReport> getDetails() throws IOException
	{
		ArrayList<diabetesMedicalReport> report = new ArrayList();
		try {
				List<DBObject> obj = mongoRetrieve.retrieve("MedicalReport", "Diabetes" , "id", "123456");
				LOGGER.info(obj.toString());
				dmr = new diabetesMedicalReport(obj.get(0).get("id").toString(), obj.get(0).get("reportType").toString(), 
						Integer.parseInt(obj.get(0).get("age").toString()), 
						obj.get(0).get("gender").toString(), Double.parseDouble(obj.get(0).get("Glucose").toString()));
				report.add(dmr);
}	
		
		catch (Exception e) {		
			System.out.println("Error in code");
			e.printStackTrace();
		}
		return report;
	}

}