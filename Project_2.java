package Project_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Project_2 {
	WebDriver driver;
	@BeforeClass
	public void beforeMethod()
	{
		driver=new FirefoxDriver();
		driver.get("http://alchemy.hguy.co/crm");
	}
	@Test
	public void  url_method()
	{
		String  dr=driver.findElement(By.xpath("//a[@title='SuiteCRM']")).getAttribute("href");
		System.out.println(dr);
		String dr1=driver.findElement(By.xpath("//div[@class='companylogo']/img")).getAttribute("src");
		System.out.println(dr1);
	}

}
