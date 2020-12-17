package Activity_7_1;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity_7_1 {
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		driver.findElement(By.xpath("//input[contains(@class,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@class,'password')]")).sendKeys("password");
		driver.findElement(By.xpath("//button[(@class='ui button')]")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back, admin"));
				
		String text =driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Text after login is "+text);
		driver.close();
	}

}
