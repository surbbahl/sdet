package Test_NG_6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_NG_6 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	@Test
	@Parameters({"username","password"})
	public void parameter_class(String username,String password)
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String text2=driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(text2);
		Assert.assertEquals(text2,"Welcome Back, admin");
		
	}

}
