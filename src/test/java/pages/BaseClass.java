package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.BrowserLibrary;

public class BaseClass {

	public WebDriver driver;

	@BeforeSuite
	public void startApp() {

		driver = BrowserLibrary.selectBrowser(driver, "brave",
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@AfterSuite
	public void stopApp() {

		BrowserLibrary.quitBrowser(driver);

	}

}
