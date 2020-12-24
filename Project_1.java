package Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Project_1 {
	WebDriver driver;
	@BeforeMethod
	
	public void Website_title()
	{
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm");
	}
	
	@Test
	public void title_match()
	{
		String Title =driver.getTitle();
		System.out.println("Title="+Title);
		boolean bul=driver.getTitle().equalsIgnoreCase("SuiteCRM");
		if (bul==true)
				{
			driver.close();
				}
	}
	@AfterMethod
	public void Website_close()
	{
		System.out.println("Closing the test ");
	}
}
