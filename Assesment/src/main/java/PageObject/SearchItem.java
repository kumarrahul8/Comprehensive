package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchItem {
	
	public WebDriver driver;
	
	By searchitem =By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[3]/form/input[2]");
	By selectitem =By.xpath("//*[@id=\"snize-product-4786153979992\"]/a/div/span/span[1]");
	By addcart=By.xpath("//*[@id=\"AddToCartForm-4786153979992\"]/button");
    
	
	public SearchItem(WebDriver driver) {
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
	
	public WebElement AddtoCart()
	{
		return driver.findElement(addcart);
	}
}
