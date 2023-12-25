package tests;

import org.testng.annotations.Test;

import pages.AdminPage;
import pages.BaseClass;

public class AdminTest extends BaseClass{
	
	AdminPage obj3;
	
	@Test
	public void adminTest() {
		
		obj3 = new AdminPage(driver);
		
		System.out.println("Admin page start");
		
		obj3.verifyAdminHeading();		
		
		System.out.println("Admin page stop");
	}

}
