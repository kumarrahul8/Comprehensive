package stepdefinition;

import org.openqa.selenium.Keys;

import com.mindtree.pageobjects.WishList;
import com.mindtree.utilities.base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WishListstepdefinition extends base{

WishList w = new WishList(driver);
	
    @Given("^user land on website main page$")
    public void user_land_on_website_main_page() throws Throwable {
        driver.get(url);
    }
    @And("^user pass the input in the search bar and press enter$")
    public void user_pass_the_input_in_the_search_bar_and_press_enter() throws Throwable {
      w.SearchItem().sendKeys("Keys", Keys.ENTER);
    }
    
    @Then("^the relevant product should be displayed and user click on it$")
    public void the_relevant_product_should_be_displayed_and_user_click_on_it() throws Throwable {
      w.ChooseItem().click();
    }
    
    @And("^user add the product to wishlist$")
    public void user_add_the_product_to_wishlist() throws Throwable {
       w.AddtoWishList().click();
    }

}

