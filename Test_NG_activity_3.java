package Test_NG_activity_3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Test_NG_activity_3 {
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	@Test
	public void test_procedure()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String text1=driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(text1);
		Assert.assertEquals("Welcome Back, admin", text1);
		String text2=driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(text2);
		Assert.assertEquals(text2,"Welcome Back, admin");
	}
	@AfterMethod()
	public void after_method()
	{
		driver.close();
	}
	

}
