package pages.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.Helpermethods;


public class ALogin_Page extends Helpermethods {

	WebDriver driver;
	// pagefactory locators
	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[@class='oxd-form-actions orangehrm-login-action']")
	private WebElement button;

	// Actions to be performed

	public void enterusername(String u) {
		username.sendKeys(u);
	}

	public void enterpassword(String p) {
		password.sendKeys(p);
	}

	public void clicklogin() {
		button.click();
	}

	public ALogin_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
