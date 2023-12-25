package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.DashboardPage;

public class DashboardTest extends BaseClass {
	
	DashboardPage obj2;
	
	@Test
	public WebDriver dashboardTest() throws Exception {
		
		obj2 = new DashboardPage(driver);
		
		System.out.println("Dashboardtest page start");
		String dashTitle = driver.getTitle();
		
		System.out.println("Dashboard page title is - "+ dashTitle);
		
		Thread.sleep(3000);
		
		System.out.println("Done with DashboardTest");
		
		obj2.verifyDashLabel(driver);
		
		System.out.println("Dashboardtest page stop");
		Thread.sleep(3000);
		
		return driver;

	}
	
	

}
