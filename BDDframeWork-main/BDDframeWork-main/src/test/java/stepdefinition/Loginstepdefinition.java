package stepdefinition;

import com.mindtree.pageobjects.LoginPage;
import com.mindtree.utilities.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Loginstepdefinition extends base{

	LoginPage l = new LoginPage(driver);
	
    @Given("^User lands on main Page$")
    public void user_lands_on_main_page() throws Throwable {
    driver.get(url);
    }

    @And("^Clicks on sign in$")
    public void clicks_on_sign_in() throws Throwable {
    	
    	l.clickSignin().click();
    }
    
    @Then("^User enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
    	
    	l.getEmail().sendKeys("username");
    	l.getPssw().sendKeys("password");
    }


    @And("^Click on submit$")
    public void click_on_submit() throws Throwable {
    
    	l.clickLogin().click();
    }

}

