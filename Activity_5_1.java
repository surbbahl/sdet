package Activity_5_1;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity_5_1 {
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		String title=driver.getTitle();
		boolean bl=driver.findElement(By.id("dynamicCheckbox")).isDisplayed();
		System.out.println(bl);
		driver.findElement(By.id("toggleCheckbox")).click();
		boolean bl2=driver.findElement(By.id("dynamicCheckbox")).isDisplayed();
		System.out.println(bl2);
		driver.close();
		
		
	}	
}
