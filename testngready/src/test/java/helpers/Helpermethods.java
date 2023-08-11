package helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helpermethods {
	// WebDriver driver;

	public void takeprint(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File s = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(s, new File("C:\\Users\\User\\Desktop\\python\\a.jpeg"));
	}

	public void waitforsomeSeconds(WebDriver driver, int a) throws InterruptedException {
		Thread.sleep(a * 1000);
	}

	public void scrollingdown(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}