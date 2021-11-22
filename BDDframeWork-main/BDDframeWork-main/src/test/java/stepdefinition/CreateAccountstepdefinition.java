package stepdefinition;

import com.mindtree.pageobjects.CreateAccount;
import com.mindtree.utilities.base;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateAccountstepdefinition extends base {

	CreateAccount ca = new CreateAccount(driver);

    @Given("^user land on the Homes page$")
    public void user_land_on_the_homes_page() throws Throwable {
       driver.get(url);
    }

    @And("^click on signin$")
    public void click_on_signin() throws Throwable {
    	ca.signIn().click();
    }

    @Then("^user go for create account$")
    public void user_go_for_create_account() throws Throwable {
    	ca.clickCreateAccount().click();
    }

    @And("^user fill all the details$")
    public void user_fill_all_the_details() throws Throwable {
    	ca.userFName().sendKeys("Rahul");
		ca.userLname().sendKeys("Jha");
		ca.userEmail().sendKeys("abc@gmail.com");
	    ca.userPass().sendKeys("qwerty@123");
		
    }
    
    @And("^click on submit$")
    public void click_on_submit() throws Throwable {
    	ca.submit().click();
    }

}

