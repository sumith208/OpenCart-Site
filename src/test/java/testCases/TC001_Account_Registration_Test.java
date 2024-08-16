package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;

import pageObjects.HomePage;
import pageObjects.RegisterPage;
import testBase.BaseClass;

public class TC001_Account_Registration_Test extends BaseClass {
	
	
	
	@Test
	public void verifyAccountRegister() {
		try {
			logger.info("Starting Account Registration");
			HomePage homePage = new HomePage(driver);
			RegisterPage registerPage = new RegisterPage(driver);
			homePage.clickbtnMyAccount();
			homePage.clickbtnRegister();
			registerPage.setinputFirstName(randomString());
			logger.info("Entered first name");
			registerPage.setinputlastName(randomString());
			logger.info("Entered last name");
			registerPage.setinputEmail(randomString()+"@gmail.com");
			logger.info("Entered email");
			registerPage.setinputTelephone(randomNumber());
			logger.info("Entered Tel phno");
			String pwd = randomAlpNumber();
			registerPage.setinputPassword(pwd);
			logger.info("Entered pwd");
			registerPage.setinputConfirmPassword(pwd);
			logger.info("Entered confirm pwd");
			registerPage.setchckBoxPrivacy();
			logger.info("checked privcy and policy chckbox");
			registerPage.clickbtnContinue();
			String expMsg = "Your Account Has Been Created!";
			String ActualMsg = registerPage.gettxtConfirmMessage();
			
			Assert.assertEquals(ActualMsg,expMsg);
			logger.info("Validated Sucessfully");

		}
		catch (Exception e) {
//			System.out.println(e.getMessage());
			logger.error("Failed");
		}	
	}
	
	

}
