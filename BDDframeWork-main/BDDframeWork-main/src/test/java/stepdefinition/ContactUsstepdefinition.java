package stepdefinition;


import com.mindtree.pageobjects.ContactUs;
import com.mindtree.utilities.base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsstepdefinition extends base{ 

	
	ContactUs c = new ContactUs(driver);

		@Given("user on home page")
		public void user_on_home_page() {
			driver.get(url);
			test.info("landed on home page");
		}
	    
		@When("click on contactUs")
		public void click_on_contact_us() {
			c.getContactUs().click();
			
			test.info("clicked on contactUs");
		}
		
		@When("user fills the contactUs form with name {string} email {string} msg {string}")
		public void user_fills_the_contact_us_form_with_name_email_msg(String string, String string2, String string3) {
			
			
			c.getEmail().sendKeys(string);
			c.getName().sendKeys(string2);
			c.getMessage().sendKeys(string3);
			
			test.info("sending details");
		}

		@When("submit the contact form")
		public void submit_the_contact_form() {
			
			c.getSendButton().click();
			test.info("sending send successfully");
		}

		@Then("success message should be displayed")
		public void success_message_should_be_displayed() {
	        
			//Log.info(c.successMsg().getText());
			//test.info(c.successMsg().getText());
			test.info("sending send successfully");
	        test.info("browser closed");
		}
	}

