package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddGiftCard {
	
	public WebDriver driver;
	
	By gift =By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[4]/div/div/a[3]/span");
	By price =By.xpath("//*[@id=\"ProductSelect-738195636312-option-0\"]/div[4]/label");
	By addcart=By.name("add");
	
	
	public AddGiftCard(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement addGiftcard()
	{
		return driver.findElement(gift);
	}
	
	public WebElement selectAmount()
	{
		return driver.findElement(price);
	}
	
	public WebElement addtoCart()
	{
		return driver.findElement(addcart);
	}
}
