package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BaseClass {

	@FindBy(how = How.XPATH, using = ("//h6[text()='User Management']"))
	WebElement pageHeading;

	public AdminPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void verifyAdminHeading() {

		String adminHeader = pageHeading.getText();
		System.out.println("Header on admin page is - " + adminHeader);
	}

}
