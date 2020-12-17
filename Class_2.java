package Selenium_activity2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Class_2 {
	public static void main (String[] args)
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title=driver.getTitle();
		System.out.println("Title os the page is "+title);
		WebElement idLocator=driver.findElement(By.id("about-link"));
		System.out.println("Text in element by id  "+idLocator.getText());
		WebElement Classnameloca= driver.findElement(By.className("green"));
		System.out.println("Text in element by class name "+Classnameloca.getText());
		
		WebElement csslocator=driver.findElement(By.cssSelector(".green"));
		System.out.println("Text in element by cs selector "+csslocator.getText());
		
		WebElement linktext1=driver.findElement(By.linkText("About Us"));
	    System.out.println("Text in element by link text "+linktext1.getText());
	    driver.close();
		
	}

}
