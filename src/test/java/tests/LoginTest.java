package tests;

import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage;

public class LoginTest extends BaseClass {

	LoginPage obj1;
	
	@Test
	public void loginTest() throws Exception {
		
		obj1 = new LoginPage(driver);

		obj1.login(driver, "Admin", "admin123");

		Thread.sleep(3000);

		System.out.println("Done with LoginTest");

	}

}