package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinearOrangeTest1 {
	
	WebDriver driver;
	
	@Test
	public void testOrangeHR() {
	
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", List.of("--disable-infobar", "enable-automation"));
		opt.addArguments("--start-maximized");
		opt.addArguments("--incognito");
		driver = new ChromeDriver(opt);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String dashLabel = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals("Dashboard", dashLabel);
		
		driver.quit();

	}
	
}
