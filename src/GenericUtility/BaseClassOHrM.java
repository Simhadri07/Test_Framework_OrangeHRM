package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepo.PomHomepage;
import ObjectRepo.PomLogin;

public class BaseClassOHrM {
	public WebDriver driver=null;
	public PropertiesUtilityOhrm P_Util=new PropertiesUtilityOhrm();
	public ExcelUtilityOhrm E_Util=new ExcelUtilityOhrm();
	public JavaUtilityOhrm J_Util=new JavaUtilityOhrm();
	
	@BeforeSuite
	public void DbConnectionsEstablished()
	{
		System.out.println("Db Connections Succesfully!!");
	}
	
	@BeforeClass
	public void LaunchingBrowser() throws Exception
	{
		String URL=P_Util.GetdataFromProperties("url");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("Browser Launched successfully!!");
		
	}
	
	@BeforeMethod
	public void LoginOperation() throws Exception
	{
		String USERNAME=P_Util.GetdataFromProperties("username");
		String PASSWORD=P_Util.GetdataFromProperties("password");
		PomLogin pomLogin = new PomLogin(driver);
		pomLogin.loginOperations(USERNAME, PASSWORD); // POM class for login
		System.out.println("Login Done Successfully!!");
	}
	
	@AfterMethod
	public void LogoutOperation()
	{
		
		PomHomepage Hpage = new PomHomepage(driver);
		Hpage.clickUsers();
		Hpage.clickLogout();
		System.out.println("Logout done successfully!!");
	}
	
	@AfterClass
	public void ClassBrowser()
	{
		driver.close();
		System.out.println("Browser closed successfully!!");
	}
		
	}