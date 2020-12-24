package Test_NG_7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_NG_7 {
WebDriver driver;
		
		@BeforeClass
		public void beforeclass()
		{
			driver=new FirefoxDriver();
			driver.get("https://www.training-support.net/selenium/login-form");
		}
		
		@DataProvider(name="authentication")
		public static Object[][]credentials()
		{
			return  new Object[][] {{"admin","password"}};
		}
		@Test(dataProvider="authentication")
		public void parameter_class(String username,String password)
		{
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			//Assert.assertEquals("Welcome Back, admin", text1);
			String text2=driver.findElement(By.id("action-confirmation")).getText();
			System.out.println(text2);
			Assert.assertEquals(text2,"Welcome Back, admin");
			
			
			
		}

	}


