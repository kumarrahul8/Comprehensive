package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishList {

	public WebDriver driver;

	By searchitem =By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	By selectitem =By.xpath("//*[@id=\"snize-product-2098509381720\"]/a/div/span/span[1]");
	By wishlist=By.xpath("//*[@id=\"ProductSection-2098509381720\"]/div/div/div[1]/div[2]/div/div[1]/div[1]/div/button/span");
    
	
	public WishList(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement SearchItem()
	{
		return driver.findElement(searchitem);
	}
	
	public WebElement ChooseItem()
	{
		return driver.findElement(selectitem);
	}
	
	public WebElement AddtoWishList()
	{
		return driver.findElement(wishlist);
	}
}
