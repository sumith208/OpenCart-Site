package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class TC001_Account_Registration_Test {
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://localhost/opencartsite/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
//		driver.quit();
	}
	
	@Test
	public void verifyAccountRegister() {
		try {
			HomePage homePage = new HomePage(driver);
			RegisterPage registerPage = new RegisterPage(driver);
			homePage.clickbtnMyAccount();
			homePage.clickbtnRegister();
			registerPage.setinputFirstName("Sumith");
			registerPage.setinputlastName("Amin");
			registerPage.setinputEmail("sumithamin123@gmail.com");
			registerPage.setinputTelephone("8438827282");
			registerPage.setinputPassword("12345");
			registerPage.setinputConfirmPassword("12345");
			registerPage.setchckBoxPrivacy();
			registerPage.clickbtnContinue();
			String expMsg = "Your Account Has Been Created!";
			String ActualMsg = registerPage.gettxtConfirmMessage();
			
			Assert.assertEquals(ActualMsg,expMsg);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
