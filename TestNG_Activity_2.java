package TestNG_Activity_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestNG_Activity_2 {
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("activity-content")));
		
		
	}
	
	@Test
	public void test_1()
	
	{
		WebDriverWait wait=new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("activity-content")));
		String title =driver.getTitle();
		System.out.println("Title is "+title);
		Assert.assertEquals(title, "Target Practice");
		
	}
	@Test
	public void test_2()
	
	{
		WebElement button=driver.findElement(By.cssSelector("button.black"));
		Assert.assertTrue(button.isDisplayed());
		Assert.assertEquals(button.getText(),"black");
		
	}
	@Test(enabled =false)
	public void test_3()
	{
		String subHeading=driver.findElement(By.className("sub")).getText();
		Assert.assertTrue(subHeading.contains("Practice"));
		
	}
	@Test
	public void test_4()
	{
		throw new SkipException("Skipping Test case");
	}
	
	@AfterTest
	public void afterMethod()
	{
		driver.close();
	}
}
