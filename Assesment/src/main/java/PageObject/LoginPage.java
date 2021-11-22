package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By signin = By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]/span");
	By email =By.id("CustomerEmail");
	By password =By.name("customer[password]");
	By login =By.xpath("//*[@id=\"customer_login\"]/p[1]/input");
	
    public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
    
    public WebElement clickSignin() 
    {
	    return driver.findElement(signin);
    }

    public WebElement getEmail() 
    {
	    return driver.findElement(email);
    }

    public WebElement getPssw()
    {
	    return driver.findElement(password);
    }

    public WebElement clickLogin()
    {
	    return driver.findElement(login);
    }
}
