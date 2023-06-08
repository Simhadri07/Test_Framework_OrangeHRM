package TestCaseRepo;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtility.BaseClassOHrM;

public class TC_04 extends BaseClassOHrM {
	@Test
public void TestCase() throws Exception{
	driver.findElement(By.xpath("//button[@title='Apply Leave']")).click();
	Thread.sleep(3000);
}
}
