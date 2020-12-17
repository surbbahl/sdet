package package_activity_8;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Activity_8_1 {
	public static void main(String args[])

	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));---doubt
		List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		System.out.println("no of colns are"+cols.size());
		System.out.println("no of rows are "+rows.size());
		List<WebElement> third_rows=driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));---doubt
		for (WebElement cellvalue:third_rows)
		{
			System.out.println("Cell value"+cellvalue.getText());
		}
	
	}
}

