package com.ask.be.startup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.json.JSONException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ask.be.configuration.VaccineCard;
import com.ask.be.configuration.diabetesMedicalReport;
import com.ask.be.configuration.emergencyDetail;
import com.ask.be.configuration.insurance;
import com.ask.be.configuration.personalInfo;
import com.ask.be.configuration.personalPage;
import com.ask.be.configuration.thyroidMedicalReport;
import com.ask.be.configuration.vitaminMedicalReport;
import com.ask.be.handler.DocVaccineHandler;
import com.ask.be.handler.VaccineHandler;
import com.ask.be.handler.diabetesReportHandler;
import com.ask.be.handler.emergencyDetailHandler;
import com.ask.be.handler.insuranceHandler;
import com.ask.be.handler.personalInfoHandler;
import com.ask.be.handler.personalPageHandler;
import com.ask.be.handler.thyroidReportHandler;
import com.ask.be.handler.vitaminReportHandler;
import com.mongodb.util.JSON;

@CrossOrigin(origins = "http://localhost", maxAge = 3600)
@RestController
@RequestMapping(value="/")
public class WebController{
 
	private final static Logger LOGGER = Logger.getLogger(WebController.class.getName());

	
	
   @RequestMapping(value="/Vaccine",method = RequestMethod.POST, produces = "application/JSON")
   public ArrayList<VaccineCard> getVaccinationDetail() throws IOException{
      return VaccineHandler.getDetails();
   }
   
   @RequestMapping(
		    value = "/DocVaccine", 
		    method=RequestMethod.POST, headers = "Accept=*/*",
		    produces = "application/json", consumes="application/json")
		public void UpdateVaccineCard(@RequestBody String p1) throws IOException {
	   		
				try {
					DocVaccineHandler.updateData(p1);
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		    LOGGER.info(p1);
		}
   
   @RequestMapping(value="/vitaminReport",method = RequestMethod.POST, produces = "application/JSON")
   public ArrayList<vitaminMedicalReport> getVitaminDetails() throws IOException{
      return vitaminReportHandler.getDetails();
   } 
   
   @RequestMapping(value="/diabetesReport",method = RequestMethod.POST, produces = "application/JSON")
   public ArrayList<diabetesMedicalReport> getDiabetesDetails() throws IOException{
      return diabetesReportHandler.getDetails();
   }
   
   @RequestMapping(value="/thyroidReport",method = RequestMethod.POST, produces = "application/JSON")
   public ArrayList<thyroidMedicalReport> getThyroidDetails() throws IOException{
      return thyroidReportHandler.getDetails();
   } 
   
   @CrossOrigin
   @RequestMapping(value="/Emergency",method = RequestMethod.POST, produces = "application/JSON")
   public emergencyDetail getEmergencyDetail() throws IOException{
      return emergencyDetailHandler.getDetails();
   }
   
   @RequestMapping(value="/PersonalPage",method = RequestMethod.GET)
   public personalPage getPersonalPage() throws IOException{
      return personalPageHandler.getDetails();
   }
   
   @RequestMapping(value="/PersonalInfo",method = RequestMethod.GET)
   public personalInfo getPersonalInfo() throws IOException{
      return personalInfoHandler.getDetails();
   }
   
}