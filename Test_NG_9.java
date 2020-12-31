package Test_NG_9;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_NG_9 {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new FirefoxDriver();
		Reporter.log("Starting test!!!");
		driver.get("https://www.training-support.net/selenium/javascript-alets");
		Reporter.log("Opened Broswer!!1");
		Reporter.log("Page Title is "+driver.getTitle());
		
	}
	@BeforeMethod
	public void beforeMethod()
	{
	Reporter.log("TestCases setup started");
	driver.switchTo().defaultContent();
	}
	@Test(priority=0)
	public void simpleAlertTestCase()
	{
		Reporter.log("Test cases Setup started");
		driver.findElement(By.id("simple")).click();
		Reporter.log("Simple alert opened");
		Alert alert=driver.switchTo().alert();
		String alerttext=alert.getText();
		Reporter.log("ALert text is "+alerttext);
		Assert.assertEquals("This is a JavaScript ALert!", alerttext);
		alert.accept();
		Reporter.log("Alert cloased");
		Reporter.log("Test case ended ");
		
		
	}
	
	@Test(priority=1)
	public void confirmAlert()
	{
		Reporter.log("Confirm test cases");
		driver.findElement(By.id("confirm")).click();
		Reporter.log("Confirm alert opened");
		Alert confirmalert=driver.switchTo().alert();
		Reporter.log("switched focus to alert");
		String alertText=confirmalert.getText();
		Reporter.log("Alert text is :"+alertText);
		confirmalert.accept();
		Reporter.log("Alert closed");
		
		
	}
	@Test(priority=2)
	public void promptalert()
	{
		Reporter.log("prompt alert test cases ");
		driver.findElement(By.id("prompt")).click();
		Reporter.log("Confirm alert opened");
		Alert pa=driver.switchTo().alert();
		Reporter.log("Switched focus to alert");
		String alertText=pa.getText();
		Reporter.log("Alert text is "+alertText);
		pa.sendKeys("Awesome!");
		Assert.assertEquals("This is a JavaScript prompt! ",alertText);
		pa.accept();
		Reporter.log("Alert closed");
		Reporter.log("Test Case ended");
		
		
	}
	@AfterClass
	public void tearDown()
	{
		Reporter.log("Ending test");
		driver.close();
	}
	

}
