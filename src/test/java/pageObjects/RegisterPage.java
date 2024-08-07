package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id=\"input-firstname\"]")
	public WebElement inputFirstName;
	
	@FindBy(xpath = "//input[@id=\"input-lastname\"]")
	public WebElement inputlastName;
	
	@FindBy(xpath = "//input[@id=\"input-email\"]")
	public WebElement inputEmail;
	
	@FindBy(xpath = "//input[@id=\"input-telephone\"]")
	public WebElement inputTelephone;
	
	@FindBy(xpath = "//input[@id=\"input-country\"]")
	public WebElement drpDownCountry;
	
	@FindBy(xpath = "//input[@id=\"input-password\"]")
	public WebElement inputPassword;
	
	@FindBy(xpath = "//input[@id=\"input-confirm\"]")
	public WebElement inputConfirmPassword;
	
	@FindBy(xpath = "//input[@type=\"checkbox\"]")
	public WebElement chckBoxPrivacy;
	
	@FindBy(xpath = "//input[@value=\"Continue\"]")
	public WebElement btnContinue;
	
	@FindBy(xpath = "//div[@id=\"content\"]/h1[text()=\"Your Account Has Been Created!\"]")
	public WebElement txtConfirmMessage;
	
	
	public void setinputFirstName(String name) {
		inputFirstName.sendKeys(name);
	}
	
	public void setinputlastName(String name) {
		inputlastName.sendKeys(name);
	}
	
	public void setinputEmail(String email) {
		inputEmail.sendKeys(email);
	}
	
	public void setinputTelephone(String email) {
		inputTelephone.sendKeys(email);
	}
	
	public void setinputPassword(String pwd) {
		inputPassword.sendKeys(pwd);
	}
	
	public void setinputConfirmPassword(String pwd) {
		inputConfirmPassword.sendKeys(pwd);
	}
	
	public void setchckBoxPrivacy() {
		chckBoxPrivacy.click();
	}
	
	public void clickbtnContinue() {
		btnContinue.click();
	}
	
	
	
	public String gettxtConfirmMessage() {
		try {
			return txtConfirmMessage.getText();
		}
		catch (Exception e) {
			// TODO: handle exception
			return e.getMessage();
		}
		
	}
	
//	inputPassword
	
	

}
