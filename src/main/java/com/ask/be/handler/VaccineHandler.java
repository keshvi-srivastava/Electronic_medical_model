package com.ask.be.handler;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.ask.be.configuration.VaccineCard;
import com.ask.be.dao.mongoCreateDB;
import com.google.gson.Gson;

public class VaccineHandler {

	private final static Logger LOGGER = Logger.getLogger(VaccineHandler.class.getName());
	private static final String [] FILE_HEADER_MAPPING = {"id", "Vaccine","Age","due date","date given","weigth","heigth","BMI","Healthcare professional/Clinic name"};
	static VaccineCard cvc;
	private static final String ID = "id";
	private static final String VACCINE = "Vaccine";
	private static final String AGE = "Age";
	private static final String DUE_DATE = "due date";
	private static final String DATE_GIVEN = "date given";
	private static final String WEIGTH = "weigth";
	private static final String HEIGTH = "heigth";
	private static final String BMI = "BMI";
	private static final String DOCTOR_INFO = "Healthcare professional/Clinic name";
	
	public static ArrayList<VaccineCard> getDetails() throws IOException
	{
			
			String path = "C:\\Users\\Srivastava\\Downloads\\BeProject\\src\\main\\resources\\keshviVC.csv";
			FileReader fileReader = null;
			CSVParser csvFileParser = null;
			CSVFormat csvFileFormat = CSVFormat.DEFAULT.withHeader(FILE_HEADER_MAPPING);
			
			ArrayList<VaccineCard> vaccineData = new ArrayList();
			try {
				
				fileReader = new FileReader(path);
				csvFileParser = new CSVParser(fileReader, csvFileFormat);
				List csvRecords = csvFileParser.getRecords();
				for(int i=1; i< csvRecords.size();i++)
				{
					CSVRecord record = (CSVRecord) csvRecords.get(i);
					cvc = new VaccineCard(record.get(ID), record.get(DUE_DATE), record.get(DATE_GIVEN), record.get(VACCINE), record.get(AGE), 
							Float.parseFloat(record.get(WEIGTH)), Float.parseFloat(record.get(HEIGTH)), 
							Float.parseFloat(record.get(BMI)), record.get(DOCTOR_INFO));
					vaccineData.add(cvc);
					Gson gson = new Gson();
					LOGGER.info(gson.toJson(cvc).toString()); 
					//mongoCreateDB.store(gson.toJson(cvc).toString(), "Personal", "VaccinationCard");
				}	
			}
			catch (Exception e) {		
				System.out.println("Error in CsvFileReader !!!");
				e.printStackTrace();
			}
			return vaccineData;
	}
}
