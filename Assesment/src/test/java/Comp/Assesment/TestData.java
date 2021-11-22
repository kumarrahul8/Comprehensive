package Comp.Assesment;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.SearchItem;
import PageObject.SortBy;
import PageObject.AddGiftCard;
import PageObject.ContactUs;
import PageObject.CreateAccount;
import PageObject.HoverAction;
import utillities.XSFFworkbook;
import utillities.base;
import PageObject.TitleValidation;
import PageObject.LoginPage;
import PageObject.NavigationBar;
import PageObject.WishList;

// we want to initialize our base class properties, so for that we use inheritance properties
public class TestData extends base{
	
	public static Logger Log= LogManager.getLogger(base.class.getName());
	
	@Test(dataProvider = "loginData")
	
	public void basepageNavigation(String username, String password) throws IOException
	{
		driver=initializeDriver();
		Log.info("Driver is initialized");
		
		driver.manage().window().maximize();
		driver.get(url);
		Log.info("url passed");
		
        LoginPage l = new LoginPage(driver);
		l.clickSignin().click();
		l.getEmail().sendKeys(username);
		l.getPssw().sendKeys(password);
		l.clickLogin().click();
		Log.info("Sucessfully Login");
		
	}
	
	@Test
	
	public void search() throws IOException
	{
	   driver=initializeDriver();
	   driver.manage().window().maximize();
       driver.get(url);
		
	   SearchItem s = new SearchItem(driver);
	   s.SearchItem().sendKeys("bottles",Keys.ENTER);
	   s.ChooseItem().click();
	   s.AddtoCart().click();
	   Log.info("Product added succesfully");
	}
	
	@Test
	
	public void validateTitle() throws IOException
	{
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		TitleValidation t = new TitleValidation(driver);
		//compare the test from the browser with actual text : for that we use Assertion(actual,expected):-
		String dataString="Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts";
	if(driver.getTitle().equals(dataString))
		Log.info("Title matched");
	}
	
	@Test
	
	public void checkNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		NavigationBar n = new NavigationBar(driver);
		//check whether navigation bar is displayed or not by using Assertion(assert true(boolean condition)):-
		Assert.assertTrue(n.checkNavigation().isDisplayed());
		Assert.assertFalse(false);
	}
	
	@Test
	
	public void addGift() throws IOException
	{
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		AddGiftCard g = new AddGiftCard(driver);
		g.addGiftcard().click();
		g.selectAmount().click();
		g.addtoCart().click();
		Log.info("Gift added sucessfully");
	}
	
	@Test
	
	public void contact() throws IOException
	{
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		ContactUs c = new ContactUs(driver);
		c.getContactUs().click();
		c.getEmail().sendKeys("abc@gmail.com");
		c.getName().sendKeys("Rahul");
		c.getMessage().sendKeys("Message");
		c.getSendButton().click();
	}
	
	@Test
	
	public void sortBy() throws IOException
	{
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		SortBy sb = new SortBy(driver);
		sb.getTop50().click();
		sb.getSortBy().click();
		sb.getSortBy().sendKeys(Keys.ARROW_DOWN);
		sb.getSortBy().sendKeys(Keys.ENTER);
	}
	@Test
	
	public void createAccount() throws IOException
	{
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		CreateAccount ca = new CreateAccount(driver);
		
			ca.signIn().click();
			ca.clickCreateAccount().click();
			
		    ca.userFName().sendKeys("Rahul");
			Log.info("First name entered in the text box");
		
			ca.userLname().sendKeys("Jha");
			Log.info("Last name entered");
		
			ca.userEmail().sendKeys("abc@gmail.com");
			Log.info("Email enterd");
			
			ca.userPass().sendKeys("qwerty@123");
			Log.info("pssw entred");
			
			ca.submit().click();
			Log.info("Submitted");
			
			
			
		
	}
	
	@Test
	
public void Hover() throws IOException, InterruptedException{
		
		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		HoverAction ha=new HoverAction(driver);
		
		Actions a=new Actions(driver);
		WebElement move=ha.Hover_select();
		
		a.moveToElement(move).build().perform();
		Log.info("Hover performed successfully");
		//test.info("Hover performed successfully");
		Thread.sleep(3000);
		ha.Select_Item().click();
		Thread.sleep(3000);
		Assert.assertTrue(ha.Page_Loaded().isDisplayed());
		Log.info("desired page loaded successfully");
		//test.info("desired page loaded successfully");
  }
	
	@Test
	
	public void WishList() throws IOException
	{

		driver=initializeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		 WishList w = new  WishList(driver);
		 
		 w.SearchItem().sendKeys("Keys", Keys.ENTER);
		 w.ChooseItem().click();
		 w.AddtoWishList().click();
	}

	
	@DataProvider(name="loginData")
	String[][] getData() throws IOException{

		String pathString="C:\\Users\\gaura\\Desktop\\Assesment\\src\\main\\java\\utillities\\demodata.xlsx";

		int rowCount=XSFFworkbook.getRowCount(pathString,"Sheet1");
		int cellCount=XSFFworkbook.getCellCount(pathString,"Sheet1", rowCount);

		String logindata[][]=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				logindata[i-1][j]=XSFFworkbook.getCellData(pathString,"Sheet1", i, j);
			}
		}
		return logindata;
	}
}