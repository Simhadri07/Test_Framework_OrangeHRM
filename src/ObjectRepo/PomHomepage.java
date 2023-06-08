package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHomepage {
@FindBy(xpath="//a[@href='/web/index.php/time/viewTimeModule']")
private WebElement leave;
@FindBy(xpath="//div[@id='container_reports']")
private WebElement Reports;
@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
private WebElement Users;
@FindBy(xpath="//a[text()='Logout']")
private WebElement Logout;
public PomHomepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getleave() {
	return leave;
}

public WebElement getReports() {
	return Reports;
}

public WebElement getUsers() {
	return Users;
}

public WebElement getLogout() {
	return Logout;
}

/**
 * This is business library for Tasks
 */
public void clickleave() {
	getleave().click();
}
/**
 * This is business library for Reports
 */
public void clickReports(){
	getReports().click();
}
/**
 * This is business library for users
*/
	public void clickUsers() {
		getUsers().click();
	}
	/**
	 * This is business library for logoutBtn
	 */
	public void clickLogout() {
		getLogout().click();
	}
}