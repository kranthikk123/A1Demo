package pages.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.Helpermethods;

public class BDashBoardPage extends Helpermethods {

	WebDriver driver;
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement userdropdown;

	@FindBy(linkText = "Logout")
	private WebElement logout;

	@FindBy(linkText = "OrangeHRM, Inc")
	private WebElement OrangeHRM;

	public void clickuserdropdown() {
		userdropdown.click();
	}

	public void clicklogout() {
		logout.click();
	}

	public void clickonOrangeHRM() {
		OrangeHRM.click();
	}

	public BDashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
