package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	public WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@name='password']")
	public WebElement password;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public WebElement submitButton;


	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public DashboardPage login(WebDriver driver, String uname, String pwd) throws Exception {

		username.sendKeys(uname);
		password.sendKeys(pwd);
		Thread.sleep(3000);
		submitButton.click();
		
		System.out.println("User has logged in");
		
		return new DashboardPage(driver);

	}

}