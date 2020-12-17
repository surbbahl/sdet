package Activity_5_2;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity_5_2 {
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		String title=driver.getTitle();
		boolean bl=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(bl);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean bl2=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(bl2);
		driver.close();
}
}