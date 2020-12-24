package Project_9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Project_9 {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod()
	{
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
	}
	@Test
	public void leads_10() throws InterruptedException
	{ 
		WebElement ele1=driver.findElement(By.id("user_name"));
		WebElement Pass1=driver.findElement(By.id("username_password"));
		ele1.sendKeys("admin");
		Pass1.sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		//Thread.sleep(10000);
		Actions action1=new Actions(driver);
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Sales']"));
		action1.moveToElement(accounts).moveToElement(driver.findElement(By.xpath("//a[@id='moduleTab_9_Leads']"))).click().build().perform();
		Thread.sleep(5000);
		for (int i=1;i<=10;i++)
		{
		WebElement e=driver.findElement(By.xpath("//table[contains(@class,'responsive')]/tbody/tr["+i+"]/td[3]"));
		System.out.println("Name====="+e.getText());
		WebElement e1=driver.findElement(By.xpath("//table[contains(@class,'responsive')]/tbody/tr[1]/td[8]"));
		System.out.println("User======"+e1.getText());
		}
		
	}
	

}
