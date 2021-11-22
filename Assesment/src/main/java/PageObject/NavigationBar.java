package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBar {
	
	public WebDriver driver;
	
	By navigation =By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul");
	
	
	public NavigationBar(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement checkNavigation()
	{
		return driver.findElement(navigation);
	}
}
