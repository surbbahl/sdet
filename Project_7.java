package Project_7;
import java.util.List;

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

public class Project_7 {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod()
	{
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
	}
	@Test
	public void sales_leads() throws InterruptedException
	{ 
		WebElement ele1=driver.findElement(By.id("user_name"));
		WebElement Pass1=driver.findElement(By.id("username_password"));
		ele1.sendKeys("admin");
		Pass1.sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		//Thread.sleep(10000);
		Actions action1=new Actions(driver);
		WebElement sales_1=driver.findElement(By.xpath("//a[text()='Sales']"));
		Thread.sleep(10000);
		action1.click(sales_1);
		
		System.out.println(sales_1.isSelected());
		System.out.println(sales_1.getText());
		action1.moveToElement(sales_1).moveToElement(driver.findElement(By.xpath("//*[@class='dropdown-menu']//li//a[@id='moduleTab_9_Leads']"))).click().build().perform();
		Thread.sleep(5000);
		System.out.println("Page loaded");
		WebElement addinfo=driver.findElement(By.xpath("//table[contains(@class,'responsive')]/tbody/tr[1]/td[10]/span/span[contains(@title,'Additional')]"));
		//Thread.sleep(1000);
		Actions action2=new Actions(driver);
		//System.out.println(addinfo.getClass());
				// "/tbody/tr[2]/td[10]/span/span[contains(@title,'Additional')]"));
		action2.moveToElement(addinfo).click().build().perform();
		Thread.sleep(5000);
		String phone_number=driver.findElement(By.xpath("//div[@class='open ui-dialog-content ui-widget-content']/span[@class='phone']")).getText();
		System.out.println(phone_number);
	}
	
@AfterClass()
public void afterclass()
{
	driver.close();
	}

		
       
}

