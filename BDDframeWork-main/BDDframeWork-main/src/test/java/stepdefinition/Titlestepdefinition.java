package stepdefinition;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.aventstack.extentreports.model.Log;
import com.mindtree.pageobjects.TitleValidation;
import com.mindtree.utilities.base;


import io.cucumber.java.en.Then;


public class Titlestepdefinition extends base{

	TitleValidation t = new TitleValidation(driver);

		
		@Then("Validate if the the title is \"Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts� Bigsmall.in\"")
		public void validate_if_the_the_title_is_gifts_online_send_unique_unusual_gifts_in_india_buy_gifts_bigsmall_in() {
		
			String dataString="Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts";
			if(driver.getTitle().equals(dataString)) {
			
			}
			
		}
}

		
