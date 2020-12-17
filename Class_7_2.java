package Package7_2;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class_7_2 {
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("surbhi");
		driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("bahl1234");
		driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("bahl1234");;
		driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input")).sendKeys("Sb1@gmail.com");;
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		String text=driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("Text="+text);
	}
	

}
