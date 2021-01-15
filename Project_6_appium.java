import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.*;
public class Project_6_appium  {
	@Test
	public void project_6() throws InterruptedException,IOException

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
	        Thread.sleep(1000);
	        //driver.findElementByXPath("//android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button").click();
	        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(10).scrollIntoView(new UiSelector().textContains(\"Popups\").instance(0))")).click();
	       //sign in //
	        driver.findElementByXPath("//android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.widget.Button").click();
	       // username 
	        driver.findElementByXPath("// android.view.View[2]/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	        //password
	        driver.findElementByXPath("//android.view.View[2]/android.view.View/android.widget.EditText[2]").sendKeys("password");
	        				
	        				//login
	        driver.findElementByXPath("//android.view.View/android.view.View[2]/android.view.View/android.widget.Button").click();
	        String st =driver.findElementByXPath("//android.webkit.WebView/android.view.View[1]/android.view.View[4]").getText();
	        System.out.println(st);
	        assertEquals(st,"Welcome Back, admin");
	        //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Popups\").instance(0))")).click();
	        //driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector()).getChildByText(UiSelector().className(\"android.view.View\"), \"To-Do List  Elements get added at run time\")")).click();
	       
	        /*driver.findElementByXPath("//android.view.View[3]/android.view.View/android.widget.EditText[1]").sendKeys("admin");
	        driver.findElementByXPath("//android.view.View/android.view.View[3]/android.view.View/android.widget.EditText[2]").sendKeys("password");
	        driver.findElementByXPath("//android.view.View/android.view.View[3]/android.view.View/android.widget.Button").click();
	        List<MobileElement> st =driver.findElementsByXPath("//android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]");
	        String s=st.get(0).getText();
	        System.out.println(s);
	        String E="You tried to login using invalid credentials. Please try ag
	        ain.";
	        assertEquals(s,E);
	        //android.view.View/android.view.View[3]/android.view.View/android.widget.EditText[2]*/
	        
	}
	@Test
	public void project_6_1() throws InterruptedException,IOException

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
	        Thread.sleep(1000);
	        //driver.findElementByXPath("//android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button").click();
	        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).flingToEnd(10).scrollIntoView(new UiSelector().textContains(\"Popups\").instance(0))")).click();
	       //sign in //
	        driver.findElementByXPath("//android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.widget.Button").click();
	       // username 
	        driver.findElementByXPath("// android.view.View[2]/android.view.View/android.widget.EditText[1]").sendKeys("surbhi");
	        //password
	        driver.findElementByXPath("//android.view.View[2]/android.view.View/android.widget.EditText[2]").sendKeys("bahl");
	        				
	        				//login
	        driver.findElementByXPath("//android.view.View/android.view.View[2]/android.view.View/android.widget.Button").click();
	
}
}

