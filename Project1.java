import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.*;
public class Project1 {
	@Test
	public void calc() throws InterruptedException,IOException
	{ 
		WebDriverWait wait;
		DesiredCapabilities cap=new DesiredCapabilities();
		DesiredCapabilities cap1=new DesiredCapabilities();
		/*cap.setCapability("devicename", "Pixel 4_surbhi");
		cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.google.android.apps.tasks");
        cap.setCapability("appActivity", "com.google.android.apps.tasks.ui.TaskListsActivity");
        //cap.setCapability("appWaitPackage", "package.android");
        //cap.setCapability("appWaitActivity", "com.google.android.apps.tasks.ui.taskListsActivity");
        //cap.setCapability("appWaitDuration", 10000);
        cap.setCapability("noReset", true);*/
        AppiumDriver<MobileElement> driver=null;
       // driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        //driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
        //wait = new WebDriverWait(driver, 10);
        /*driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        driver.findElementById("tasks_fab").click();
        driver.findElementById("add_task_title").sendKeys("Surbhi");
        driver.findElementById("add_task_done").click();*/
        cap1.setCapability("devicename", "Pixel 4_surbhi");
		cap1.setCapability("platformName", "Android");
        cap1.setCapability("appPackage", "com.google.android.keep");
        cap1.setCapability("appActivity", "com.google.android.keep.activities.BrowseActivity");
        cap.setCapability("noReset", true);
        
        driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap1);
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        driver.findElementById("new_note_button").click();
        
        String st = driver.findElementById("index_note_title").getText();
        System.out.println(st);
        //driver.findElementByXPath("//androidx.cardview.widget.CardView[@content-desc=\". \"])[1]/android.widget.LinearLayout/android.widget.LinearLayout").sendKeys("Surbhi");
        driver.findElementById("edit_note_text").sendKeys("BAhl");
        
       
        
        
       
        
        
	}

}










