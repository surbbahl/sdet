package Activity_4_3;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {
	
	public static void main (String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		String title=driver.getTitle();
		String text1=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("text1======="+text1);
		String text2=driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println("text2======="+text2);
		String text3=driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
		System.out.println("text3======="+text3);
		String text4=driver.findElement(By.xpath("//button[@class='ui grey button']")).getText();
		System.out.println("Printing********************");
		
		
		
		System.out.println("text4======="+text4);
		
		
		
	}

}
