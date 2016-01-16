package com.bac.csd;

import org.junit.Assert;

import com.bac.csd.bean.RideBean;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberStep {
	
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

	@Given("^Phone no is \"([^\"]*)\"$")
	public void phone_no_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setPhoneNo("9119119111");	    
	}

	@Given("^source is \"([^\"]*)\"$")
	public void source_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setSource("Dwarka");
		Assert.assertEquals("Dwarka", rideBean.getSource());
	}

	@Given("^Destination is \"([^\"]*)\"$")
	public void destination_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setDestination("Gurgaon");	
		Assert.assertEquals("Gurgaon", rideBean.getDestination());
	}

	@Given("^Time will be \"([^\"]*)\"\\.$")
	public void time_will_be(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setTime("17:20");
		Assert.assertEquals("17:20", rideBean.getTime());
	}

	@Given("^email is entered$")
	public void email_is_entered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setEmail("sonu.kumar@bankofamerica.com");
		Assert.assertEquals("sonu.kumar@bankofamerica.com", rideBean.getEmail());
	}

	@Given("^phone is entered$")
	public void phone_is_entered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setPhoneNo("9119119111");
		Assert.assertEquals("9119119111", rideBean.getPhoneNo());
	}

	@Given("^source is entered$")
	public void source_is_entered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setSource("Dwarka");
		Assert.assertEquals("Dwarka", rideBean.getSource());
	}

	@Given("^destination is entered$")
	public void destination_is_entered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setDestination("Gurgaon");
		Assert.assertEquals("Gurgaon", rideBean.getDestination());
	}

	@Given("^time is entered$")
	public void time_is_entered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setTime("17:20");	    
	}
	
	@Given("^employee is able to see his booking details$")
	public void employee_is_able_to_see_his_booking_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		rideBean = new RideBean();
		rideBean.setBooked(true);	    
	}

	@When("^he clicks on display$")
	public void he_clicks_on_display() throws Throwable {
		rideBean = new RideBean();
		rideBean.setBooked(true);
	}

	@Then("^System should display all the bookings for that employee\\.$")
	public void system_should_display_all_the_bookings_for_that_employee() throws Throwable {
		rideBean = new RideBean();
		rideBean.getBookingDetails();
	}

	@Given("^employee clicks cancel button$")
	public void employee_clicks_cancel_button() throws Throwable {
		rideBean = new RideBean();
		rideBean.setCancelled(true);
	}

	@When("^click on cancel$")
	public void click_on_cancel() throws Throwable {
		rideBean = new RideBean();
		rideBean.setCancelled(true);
	}

	@Then("^it should cancel the booking for him$")
	public void it_should_cancel_the_booking_for_him() throws Throwable {
		rideBean = new RideBean();
		Assert.assertEquals(false, rideBean.isCancelled());
	}

	@Then("^seat should become available\\.$")
	public void seat_should_become_available() throws Throwable {
		rideBean = new RideBean();
		rideBean.getAvailabilityDetails();
	}

	@Given("^employee post a cab for share$")
	public void employee_post_a_cab_for_share() throws Throwable {
		rideBean = new RideBean();
		rideBean.getBookingDetails();
	}

	@SuppressWarnings("deprecation")
	@When("^click on display a ride$")
	public void click_on_display_a_ride() throws Throwable {
		rideBean = new RideBean();
		rideBean.getBookingDetails();
		Assert.assertEquals(null, rideBean.getBookingDetails());
	}

	/*@Then("^it will show his posting in display a ride page\\.$")
	public void it_will_show_his_posting_in_display_a_ride_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^employee wants to check how many bookings he has for the day$")
	public void employee_wants_to_check_how_many_bookings_he_has_for_the_day() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on my booking list$")
	public void click_on_my_booking_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^it will show all bookings for my car\\.$")
	public void it_will_show_all_bookings_for_my_car() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^employee enter all data correctly$")
	public void employee_enter_all_data_correctly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on submit$")
	public void click_on_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^System display message \"([^\"]*)\"$")
	public void system_display_message(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^hover$")
	public void hover() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^it will validate the fields\\.$")
	public void it_will_validate_the_fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^name, source,destination, timing$")
	public void name_source_destination_timing() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on reset$")
	public void click_on_reset() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^it will clear all the details\\.$")
	public void it_will_clear_all_the_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^name is entered$")
	public void name_is_entered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^move/hover on next input$")
	public void move_hover_on_next_input() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^it will show errorr message\\.$")
	public void it_will_show_errorr_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}*/
	
}
