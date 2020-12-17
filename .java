package Activity_5_3;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Class3 {
	public static void main (String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		boolean bl= driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled();
		
		System.out.println ("Button status now"+bl);
		if (bl==false)
				{
					driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
				
				}
		boolean b2= driver.findElement(By.xpath("//input[@id='input-text']")).isEnabled();
		System.out.println ("Button status now"+b2);
	}

}
