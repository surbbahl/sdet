package Project_8;
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

public class Project_8 {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod()
	{
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
	}
	@Test
	public void Accounts() throws InterruptedException
	{ 
		WebElement ele1=driver.findElement(By.id("user_name"));
		WebElement Pass1=driver.findElement(By.id("username_password"));
		ele1.sendKeys("admin");
		Pass1.sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		//Thread.sleep(10000);
		Actions action1=new Actions(driver);
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Sales']"));
		action1.moveToElement(accounts).moveToElement(driver.findElement(By.xpath("//a[@id='moduleTab_9_Accounts']"))).click().build().perform();
		Thread.sleep(5000);
		System.out.println("Loaded");
		System.out.println("Name of the members are :-");
		WebElement e=driver.findElement(By.xpath("//table[contains(@class,'responsive')]/tbody/tr[1]/td[7]"));
		System.out.println(e.getText());
		WebElement e1=driver.findElement(By.xpath("//table[contains(@class,'responsive')]/tbody/tr[3]/td[7]"));
		System.out.println(e1.getText());
		WebElement e2=driver.findElement(By.xpath("//table[contains(@class,'responsive')]/tbody/tr[5]/td[7]"));
		System.out.println(e2.getText());
		WebElement e3=driver.findElement(By.xpath("//table[contains(@class,'responsive')]/tbody/tr[7]/td[7]"));
		System.out.println(e.getText());
		WebElement e4=driver.findElement(By.xpath("//table[contains(@class,'responsive')]/tbody/tr[9]/td[7]"));
		System.out.println(e4.getText());
}		
}
