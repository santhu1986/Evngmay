package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleNG 
{

	WebDriver driver;
	@Test(priority=0)
	public void xyz()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	 @Test(priority=1)
	public void abc() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.get("http://122.175.8.158/ranford2");
	}
	@Test(priority=2)
	public void pqr() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
