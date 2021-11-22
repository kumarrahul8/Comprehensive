package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {
	
	public WebDriver driver;
	
	By contactUs = By.xpath("//ul[@class='footertoggle']//li/a");
	By email = By.xpath("//input[@name='contact[email]']");
	By name = By.xpath("//input[@name='contact[name]']");
	By message = By.xpath("//textarea[@name='contact[body]']");
	By sendButton = By.xpath("//button[@class='btn']");
	By sending_confirmation = By.xpath("//p[@class='note note--success']");
	

	public ContactUs(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getContactUs() {
		return driver.findElement(contactUs);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getName() {
		return driver.findElement(name);
	}

	public WebElement getMessage() {
		return driver.findElement(message);
	}

	public WebElement getSendButton() {
		return driver.findElement(sendButton);
	}

}
