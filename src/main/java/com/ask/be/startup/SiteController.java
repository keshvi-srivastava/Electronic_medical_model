package com.ask.be.startup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SiteController {

	    @RequestMapping(value = "/HomePage", method = RequestMethod.GET, produces = "text/html")
	    public String greeting() {
	        return "docHome";
	    }
	    
	    @RequestMapping(value = "/Report", method = RequestMethod.GET, produces = "text/html")
	    public String one() {
	        return "reports";
	    }
	    
	    @RequestMapping(value = "/Vaccination", method = RequestMethod.GET, produces = "text/html")
	    public String one2() {
	        return "vc";
	    }
	    
	    @RequestMapping(value = "/EmergencyPage", method = RequestMethod.GET, produces = "text/html")
	    public String one3() {
	        return "emergencyy";
	    }
	    
	    @RequestMapping(value = "/VaccineDoc", method = RequestMethod.GET, produces = "text/html")
	    public String one4() {
	        return "vcDoc";
	    }
	    
	    @RequestMapping(value = "/Testing", method = RequestMethod.GET, produces = "text/html")
	    public String one5() {
	        return "testing";
	    }
	    
	        
}
