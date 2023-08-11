package testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.PageObjects.ALogin_Page;
import pages.PageObjects.BDashBoardPage;

public class LoginTestCaseScroll extends A_ABase {

	WebDriver driver;

	@Test
	public void LoginscrollTest() throws InterruptedException, IOException {
		driver = LaunchBrowser();
		ALogin_Page loginpage = new ALogin_Page(driver);
		loginpage.enterusername("Admin");
		loginpage.enterpassword("admin123");
		loginpage.clicklogin();
		loginpage.waitforsomeSeconds(driver, 5);
		loginpage.scrollingdown(driver);
		loginpage.waitforsomeSeconds(driver, 10);
		String currentwindow = driver.getWindowHandle();
		BDashBoardPage dashboardpage = new BDashBoardPage(driver);
		dashboardpage.clickonOrangeHRM();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> it = wh.iterator();
		while (it.hasNext()) {
			String sw = it.next();
			if (!currentwindow.equalsIgnoreCase(sw)) {
				driver.switchTo().window(sw);
				System.out.print(driver.getTitle());
				driver.close();
			}
		}
	}
}
