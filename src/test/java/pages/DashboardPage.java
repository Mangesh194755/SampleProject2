package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BaseClass {

	@FindBy(how = How.XPATH, using = "//h6[text()='Dashboard']")
	public WebElement dashboardLabel;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Admin']")
	public WebElement adminMenu;
	
	public DashboardPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public AdminPage verifyDashLabel(WebDriver driver) throws Exception{

		System.out.println("Dashboard page start");
		/* if i keep only System.out.println these methods
		 * then the flow works
		 */
		String dashLabel =  dashboardLabel.getText();
		System.out.println("This label is from verifyDashLabel - " + dashLabel);
		System.out.println("Dashboard page stop");
		
		adminMenu.click();
		
		return new AdminPage(driver);
		
	}

}
