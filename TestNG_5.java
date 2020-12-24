package TestNG_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestNG_5 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass()
	{ 
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	
	}
	@Test(groups= {"HeaderTests","ButtonTests"})
	public void title_class()
	
	{
		WebDriverWait wait=new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='ui sizer vertical segment']")));
		String text1=driver.getTitle();
		
		
		System.out.println("Title of the page is "+text1);
	}
	@Test(dependsOnMethods= {"title_class"},groups= {"HeaderTests"})
	public void Header_test()
	{ 
		String st=driver.findElement(By.id("third-header")).getText();
		Assert.assertEquals(st, "Third header");
		
	}
	@Test(dependsOnMethods= {"title_class"},groups= {"HeaderTests"})
	public void Header_test1()
	{
		WebElement bu=driver.findElement(By.id("third-header"));
		System.out.println(bu.getCssValue("color"));
	}
	
	@Test(dependsOnMethods= {"title_class"},groups= {"ButtonTests"})
	public void Button_test1()
	{ 
		String st1=driver.findElement(By.xpath("//button[text()='Olive']")).getText();
		System.out.println(st1);
		Assert.assertEquals(st1, "Olive");
	}
	@Test(dependsOnMethods= {"title_class"},groups= {"ButtonTests"})
	public void Button_test2()
	{
		WebElement bu=driver.findElement(By.xpath("//button[text()='brown']"));
		String bu1=bu.getCssValue("color");
		System.out.println(bu1);
		Assert.assertEquals(bu1, "rgb(255,255,255)");
		
	}
	@AfterClass()
	public void aftermethod()
    {
		driver.close();}
	
	}

