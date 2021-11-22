package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TitleValidation {
	
	public WebDriver driver;
	
	By title =By.xpath("//*[@id=\"shopify-section-1598476309369\"]/div/a/div/button");
	
	
	public TitleValidation(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getTitle1()
	{
		return driver.findElement(title);
	}
}
