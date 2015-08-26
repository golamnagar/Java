package iOSNativeApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


public class QASols1 {

	/**
	 * @param args
	 */
	
	public static AppiumDriver wd;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		

//		File appDir = new File(System.getProperty("user.dir"), "/apps/");
//	    File app = new File(appDir, "co.sols.appDev");
	    
	    DesiredCapabilities capabilities = new DesiredCapabilities();
//	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "iOS");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad");
	    capabilities.setCapability(MobileCapabilityType.APP, "co.sols.appDev");
	    
	    
//	    capabilities.setCapability("automationName", "Appium");
	   capabilities.setCapability("udid","7cb91383dea10cc42f7ed3384f0380fed86af12d");

	    wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
   
    wd.findElement(By.name("Add A Patient")).click();
    long rand = System.currentTimeMillis();
    wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys(rand + "");
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[2]")).sendKeys(rand + "_last");
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[3]")).sendKeys(rand + "@sols.com");
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[4]")).sendKeys(rand + "@sols.com");
	wd.findElement(By.name("Return")).click();
	//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
	// How to select the date of Birth
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]/UIAPicker[1]/UIAPickerWheel[1]")).click();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]/UIAPicker[1]/UIAPickerWheel[2]")).click();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]/UIAPicker[1]/UIAPickerWheel[3]")).click();
	
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
//	((JavascriptExecutor)wd).executeScript("mobile: swipe", new HashMap<String, Double>() {{ put("touchCount", 1); put("startX", 444); put("startY", 225); put("endX", 497); put("endY", 219); put("duration", 0.8477539); }});
	wd.findElement(By.name("Done")).click();
	
	wd.findElement(By.name("Male")).click();
	wd.findElement(By.name("Create Profile")).click();
	wd.close();


	}

}
