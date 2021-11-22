package stepdefinition;


import com.mindtree.pageobjects.AddGiftCard;
import com.mindtree.utilities.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GiftCardstepdefinition extends base {

	AddGiftCard g = new AddGiftCard(driver);

    @Given("^User lands on Front Page$")
    public void user_lands_on_front_page() throws Throwable {
       driver.get(url);
    }


    @Then("^User clicks on Gift Card$")
    public void user_clicks_on_gift_card() throws Throwable {
        g.addGiftcard().click();
    }

    @And("^User select the amount of gift card$")
    public void user_select_the_amount_of_gift_card() throws Throwable {
    	g.selectAmount().click();
	
    }

    @Then("^User Proceed to checkout$")
    public void user_proceed_to_checkout() throws Throwable {
    	g.addtoCart().click();
    }

}
