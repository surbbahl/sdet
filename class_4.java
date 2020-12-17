package Selenium_activity_4;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class class_4 {
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("Titile for the page is "+title);
		driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
		System.out.println("Titile for the button is "+driver.getTitle());
		driver.close();
	}
	
	

}

