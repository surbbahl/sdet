

package Selenium_activity_3;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class3   {
public static void main (String[] args ) throws InterruptedException
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.training-support.net/selenium/simple-form");
	String title=driver.getTitle();
	WebElement idLocator_f=driver.findElement(By.id("firstName"));
	idLocator_f.sendKeys("Surbhi");
	WebElement idLocator_l=driver.findElement(By.id("lastName"));
	idLocator_l.sendKeys("BAhl");
	WebElement idLocator_e=driver.findElement(By.id("email"));
	idLocator_e.sendKeys("surbhi1.bahl@gmail.com");
	WebElement idLocator_N=driver.findElement(By.id("number"));
	idLocator_N.sendKeys("6284062711");
	WebElement idLocator_b=driver.findElement(By.cssSelector(".ui.green.button"));
	Thread.sleep(5000);
	idLocator_b.click();

	
	
	
	
	
	
	
	
	
	}

}
