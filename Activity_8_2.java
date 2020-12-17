package Activity_8_2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_8_2 {
	public static void main(String args[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		List<WebElement> cols=driver.findElements(By.xpath("//table[@id ='sortableTable']/thead/tr/th"));
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println("Columsn="+cols.size());
		System.out.println("Rows="+rows.size());
		WebElement Cellvalue=driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("CellValue=------"+Cellvalue.getText());
	}

}
