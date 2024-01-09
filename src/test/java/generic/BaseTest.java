package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		driver=new ChromeDriver();
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}
}