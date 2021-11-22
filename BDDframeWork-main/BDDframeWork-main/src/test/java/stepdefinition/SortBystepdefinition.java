package stepdefinition;

import org.openqa.selenium.Keys;

import com.mindtree.pageobjects.SortBy;
import com.mindtree.utilities.base;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SortBystepdefinition extends base{
	SortBy sb = new SortBy(driver);
	  @Given("^User land on the website Landings Page$")
	    public void user_land_on_the_website_landings_page() throws Throwable {
	 driver.get(url);
	    }

	    @Then("^click on NavigationBar Top50$")
	    public void click_on_navigationbar_top50() throws Throwable {
	    	sb.getTop50().click();
			
	    }

	    @Then("^click on SortBy$")
	    public void click_on_SortBy() throws Throwable {
	    	sb.getSortBy().click();
	    }
			
	    @And("^choose New and click $")
	    public void choose_new_and_click() throws Throwable {
			sb.getSortBy().sendKeys(Keys.ARROW_DOWN);
			sb.getSortBy().sendKeys(Keys.ENTER);
	    }

	}

