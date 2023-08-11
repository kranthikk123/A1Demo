package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.PageObjects.ALogin_Page;
import pages.PageObjects.BDashBoardPage;

public class LoginTestCase extends A_ABase {

	WebDriver driver;

	@Test
	public void logintesting() throws InterruptedException, IOException {
		driver = LaunchBrowser();
		ALogin_Page loginpage = new ALogin_Page(driver);
		loginpage.enterusername("Admin");
		loginpage.enterpassword("admin123");
		loginpage.clicklogin();
		BDashBoardPage dashboardpage = new BDashBoardPage(driver);
		dashboardpage.clickuserdropdown();
		dashboardpage.waitforsomeSeconds(driver, 5);
		dashboardpage.takeprint(driver);
		System.out.println(driver.getTitle());
		dashboardpage.clicklogout();

	}
}
