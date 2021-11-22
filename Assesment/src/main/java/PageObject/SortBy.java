package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortBy {

	public WebDriver driver;
	
	By clicktop50 =By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[6]/a");
    By sortby =By.id("sortBy");
    
    public SortBy(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}

	public WebElement getTop50()
    {
    	return driver.findElement(clicktop50);
    }
    
    public WebElement getSortBy()
    {
    	return driver.findElement(sortby);
    }
}
