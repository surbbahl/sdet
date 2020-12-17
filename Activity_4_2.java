package Activity_4_2;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity_4_2 {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title=driver.getTitle();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Surbhi");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bahl");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("surbhi1.bahl@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("6284062711");
		driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");
		driver.findElement(By.xpath("//input[contains(@class,'green')]")).click();
		driver.close();
	}

}
