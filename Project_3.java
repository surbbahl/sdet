import static org.testng.Assert.assertEquals;

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
public class Project_3 {
	@Test
	public void calc() throws InterruptedException,IOException
	{ 
		WebDriverWait wait;
		DesiredCapabilities cap=new DesiredCapabilities();
		DesiredCapabilities cap1=new DesiredCapabilities();
		AppiumDriver<MobileElement> driver=null;
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
        driver.findElementByXPath("//android.widget.TextView[@content-desc='Single-column view']").click();
        driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView").click();
        driver.findElementByXPath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]").click();
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Open navigation drawer']").click();
        String st1 =driver.findElementByXPath("//android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView").getText();
        System.out.println(st1);
        assertEquals(st,"Tomorrow, 8:00 AM");
}
	
}
