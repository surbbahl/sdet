package Project_3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Project_3 {
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
		String st=driver.findElement(By.id("admin_options")).getText();
		System.out.println("test on the console ="+st);
		
	}
	@AfterMethod
	public void Website_close()
	{
		System.out.println("Closing the test ");
	}
}



