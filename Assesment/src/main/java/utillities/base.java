package utillities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.aventstack.extentreports.ExtentTest;

public class base {
// set webdriver to public to intialize it by all	
public static WebDriver driver;

public String url;

public static ExtentTest test;

Properties prop= new Properties();

public WebDriver initializeDriver() throws IOException {
	
	//create a file and give some properties in it
		FileInputStream fis = new FileInputStream("C:\\Users\\gaura\\Desktop\\Assesment\\src\\main\\java\\utillities\\data.properties");
	
		prop.load(fis);	
		String browserName = prop.getProperty("browser");
		url = prop.getProperty("url");
		 ChromeOptions options=new ChromeOptions();
		    options.addArguments("disable-infobars");
		    
		    if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver(options);
			}
		
		// Wait for 10 second before fails
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		return driver;
			
		}
		public static String getScreenshot(String result) throws IOException {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String path =System.getProperty("user.dir")+"\\Screenshots\\"+System.currentTimeMillis()+result+".png";
			FileUtils.copyFile(src,new File(path));
			return path;
		}

		       }
		
	




