package Project_6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Project_6 {
WebDriver driver;
@BeforeMethod
public void Beforeclass()
{
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
		
}
@Test
public void activity_menu()
{
	WebElement ele1=driver.findElement(By.id("user_name"));
	WebElement Pass1=driver.findElement(By.id("username_password"));
	ele1.sendKeys("admin");
	Pass1.sendKeys("pa$$w0rd");
	driver.findElement(By.id("bigbutton")).click();
	//driver.switchTo().frame(0);
	Boolean class1=driver.findElement(By.xpath("//a[@id='grouptab_3']")).isDisplayed();
	System.out.println("Boolean value="+class1);
	if (class1==true)
	{driver.close();}
	
	
	}


}
