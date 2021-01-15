import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.*;
public class Project_4 {
	@Test
	public void project_4() throws InterruptedException,IOException
	{ 
		WebDriverWait wait;
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("devicename", "Pixel 4_surbhi");
		cap.setCapability("platformName", "Android");
        cap.setCapability("appPackage", "com.android.chrome");
        cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        cap.setCapability("noReset", true);
        AppiumDriver<MobileElement> driver=null;
        driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //driver.findElementById("terms_accept").click();
        driver.get("https://www.training-support.net/selenium");
        Thread.sleep(10000);
        //driver.findElementByXPath("\\hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[2]\r\n").click();
        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(5).scrollIntoView(new UiSelector().textContains(\"To-Do List\").instance(0))")).click();
        //driver.findElementById("taskInput").sendKeys("Surbhi1");
        driver.findElementByXPath("//android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Surbhi1");
        driver.findElementByXPath("//android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
        //driver.findElementByXPath("//android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Surbhi2");
        //driver.findElementByXPath("//android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
        
        List<MobileElement> st=driver.findElementsByXPath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]");
        int size1=st.size();
        System.out.println(size1);
        Thread.sleep(100);
        driver.findElementByXPath("//android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]").click();
       // driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).getChildByText(UiSelector().className(\"android.view.View\"), \"To-Do List\")")).click();
        //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).getChildByText(UiSelector().className(\"android.view.View\"), \"To-Do List"\)")).click();
        //wait = new WebDriverWait(driver, 200);
        //String pageTitle = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
        //System.out.println("Title on Homepage: " + pageTitle);
        //driver.findElementById("terms_accept").click();
        //driver.findElementById("next_button").click();
        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //driver.findElementById("negative_button").click();
       // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //System.out.println("Executed till here ");
        //String U_title=driver.getTitle();
       // System.out.println("Tittle of the Page "+U_title);
      
        //driver.findElementById("about-link").click();
        
        
        
        
	}

}

