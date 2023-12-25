package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import pages.BaseClass;

public class BrowserLibrary extends BaseClass {

	public static WebDriver selectBrowser(WebDriver driver, String browserName, String appUrl) {

		if (browserName.equals("chrome")) {

			ChromeOptions opt1 = new ChromeOptions();
			opt1.setExperimentalOption("excludeSwitches", List.of("--disable-infobar", "enable-automation"));
			opt1.addArguments("--start-maximized");
			opt1.addArguments("--incognito");
			driver = new ChromeDriver(opt1);

		} else if (browserName.equals("firefox")) {
			FirefoxOptions opt2 = new FirefoxOptions();
			opt2.addArguments("--disable-infobar");
			opt2.addArguments("enable-automation");
			opt2.addArguments("--start-maximized");
			opt2.addArguments("--incognito");
			driver = new FirefoxDriver(opt2);

		} else if (browserName.equals("edge")) {
			EdgeOptions opt3 = new EdgeOptions();
			opt3.setExperimentalOption("excludeSwitches", List.of("--disable-infobar", "enable-automation"));
			opt3.addArguments("--start-maximized");
			opt3.addArguments("--incognito");
			driver = new EdgeDriver(opt3);

		} else if (browserName.equals("brave")) {
			ChromeOptions opt4 = new ChromeOptions();
			opt4.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
			opt4.setExperimentalOption("excludeSwitches", List.of("--disable-infobar", "enable-automation"));
			opt4.addArguments("--start-maximized");
			opt4.addArguments("--incognito");
			driver = new ChromeDriver(opt4);

		} else {
			System.out.println("Incorrect browser input provided");
		}

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		return driver;

	}

	public static WebDriver quitBrowser(WebDriver driver) {
		driver.quit();
		return driver;
	}
}
