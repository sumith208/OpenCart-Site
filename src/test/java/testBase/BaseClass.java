package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
public WebDriver driver;
public Logger logger  ;
	
	
	@BeforeClass
	public void setup() {
		logger = LogManager.getLogger(this.getClass());
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://localhost/opencartsite/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	public String randomString() {
//		it will genrate the random string
		String str = RandomStringUtils.randomAlphabetic(5);
		return str;
	}
	
	public String randomNumber() {
//		it will genrate the random number
		String str = RandomStringUtils.randomNumeric(10);
		return str;
	}
	
	public String randomAlpNumber() {
//		it will genrate the random string
		String str = RandomStringUtils.randomAlphanumeric(5);
		return str;
	}
	

}
