package com.bac.step;

import org.junit.Assert;
import com.bac.csd.bean.RideBean;

import cucumber.api.java.en.Given;

public class CustomCucumberStep {
	
	RideBean rideBean;
	
	@Given("^employee enter FirstName as \"([^\"]*)\", lastName as \"([^\"]*)\"$")
	public void employee_enter_FirstName_as_lastName_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setFirstName("Shahnawaz");
		
		Assert.assertEquals(arg1, rideBean.getFirstName());
	}

	@Given("^employee enter email as \"([^\"]*)\",$")
	public void employee_enter_email_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setEmail("sonu.kumar@bankofamerica.com");	    
	}

}
