package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author simhadri
 */

public class PomLogin {
@FindBy(xpath="//input[@placeholder='Username']")
private WebElement username;

@FindBy(xpath="//input[@placeholder='Password']")
private WebElement password;

@FindBy(xpath="//button[@type='submit']")
private WebElement LoginBtn;

public PomLogin(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginBtn() {
	return LoginBtn;
}


/**
 * This is a business class for POM Class login 
 * @param Username
 * @param Password
 */
public void loginOperations(String Username, String Password) {
	getUsername().sendKeys(Username);
	getPassword().sendKeys(Password);
	getLoginBtn().click();
}
}
