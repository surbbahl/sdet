package Project_4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


	
public class Project_4 {
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
			WebElement ele1=driver.findElement(By.id("user_name"));
			WebElement Pass1=driver.findElement(By.id("username_password"));
			ele1.sendKeys("admin");
			Pass1.sendKeys("pa$$w0rd");
			driver.findElement(By.id("bigbutton")).click();
			String class_1=driver.findElement(By.className("yui3-js-enabled")).getAttribute("lang");
			if (class_1 =="en_us" )
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






