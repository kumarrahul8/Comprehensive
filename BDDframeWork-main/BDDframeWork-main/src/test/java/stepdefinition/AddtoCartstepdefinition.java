package stepdefinition;

import org.openqa.selenium.Keys;

import com.mindtree.pageobjects.SearchItem;
import com.mindtree.utilities.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddtoCartstepdefinition extends base {
	
	SearchItem s = new SearchItem(driver);
	

    @Given("^User lands on Home Page$")
    public void user_lands_on_home_page() throws Throwable {
       driver.get(url); 
    }


    @And("^User pass the input into search box and press Enter$")
    public void user_pass_the_input_into_search_box_and_press_enter() throws Throwable {
        s.SearchItem().sendKeys("bootles",Keys.ENTER);
    }


    @Then("^The relevant products should be displayed and user click on it$")
    public void the_relevant_products_should_be_displayed_and_user_click_on_it() throws Throwable {
      s.ChooseItem().click();
    }
    
    @And("^user add the product to cart$")
    public void user_add_the_product_to_cart() throws Throwable {
        s.AddtoCart().click();
    }

}

