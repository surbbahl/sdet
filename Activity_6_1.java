package Activity_6_1;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_6_1 {
	public static void main (String[] args)

	{
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		WebElement checkbox=driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
		WebElement togglecheckbox=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		boolean b1= togglecheckbox.isDisplayed();
		System.out.println("b1*******"+b1);
		togglecheckbox.click();
		
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		System.out.println("printing*******");
		togglecheckbox.click();
		
		
	}
}
