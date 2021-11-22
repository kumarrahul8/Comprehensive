package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

		WebDriver driver;
		
	public CreateAccount(WebDriver rdriver) {
		
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}


	By signIn = By.xpath("//*[@id=\"myheader\"]/div[1]/header/div[2]/div[2]/div[4]/div/div/a[1]/span");
    By link = By.id("customer_register_link");
    By fname = By.id("FirstName");
	By lname = By.id("LastName");
    By email = By.id("Email");
	By pass = By.id("CreatePassword");
	By submit = By.xpath("//input[@type='submit']");
    By accountElement = By.xpath("//div[@class='grid__item medium-up--one-third']//p[@class='h5']");
    By myAccount = By.xpath("\"//a[@class='site-nav_link site-nav_link--icon signinlink']\"");

	public WebElement signIn() {
		return driver.findElement(signIn);
	}

	public WebElement clickCreateAccount() {
		return driver.findElement(link);
	}

	public WebElement userFName() {
		return driver.findElement(fname);
	}

	public WebElement userLname() {
		return driver.findElement(lname);
	}

	public WebElement userEmail() {
		return driver.findElement(email);
	}

	public WebElement userPass() {
		return driver.findElement(pass);
	}


	public WebElement submit() {
		return driver.findElement(submit);
	}

	public WebElement myAccount() {
		return driver.findElement(accountElement);
	}


	public WebElement account() {
		return driver.findElement(myAccount);
	}
}


