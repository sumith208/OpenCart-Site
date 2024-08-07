package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	public WebElement btnRegister;
	
	@FindBy(xpath = "//span[text()=\"My Account\"]")
	public WebElement btnMyAccount;
	
	public void clickbtnRegister() {
		btnRegister.click();
	}
	
	public void clickbtnMyAccount() {
		btnMyAccount.click();
	}
	
	

}
