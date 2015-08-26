package iOSNativeApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.JavascriptExecutor;

public class QASols2 {

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
    wd.findElement(By.name("Create Profile")).click();
    wd.switchTo().alert().accept();
    wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys(rand + "");
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[2]")).sendKeys(rand + "_last");
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[3]")).sendKeys(rand + "@sols.com");
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[4]")).sendKeys(rand + "@sols.com");
	wd.findElement(By.name("Return")).click();
	
	// How to select the date of Birth
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
    wd.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();

    wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("10");
    wd.findElements(By.className("UIAPickerWheel")).get(2).sendKeys("1991");
    wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("December");

    
	wd.findElement(By.name("Done")).click();
	
	wd.findElement(By.name("Male")).click();
	wd.findElement(By.name("Create Profile")).click();
	
	
	
	// Enter Patient Profile 
	// Height
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
	wd.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]")).click();
	
	wd.findElement(By.name("0\"")).click();
    wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[2]/UIATableCell[7]")).click();
    // Weight 
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATextField[1]")).sendKeys("170");
    wd.findElement(By.name("Return")).click();
	
	//Left Foot Length
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[3]")).click();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[3]/UIATableCell[4]")).click();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[4]/UIATableCell[3]")).click();

//	//Right Foot Length
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[5]/UIATableCell[1]/UIAStaticText[1]")).click();
	

	
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[6]")).click();
	
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[6]/UIATableCell[1]/UIAStaticText[1]")).click();
	// Shoe Size
	
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[7]")).click();
	
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[7]/UIATableCell[3]/UIAStaticText[1]")).click();

	// Ethnicity
	
// wd.findElement(By.name("Unspecified")).click();
	
 // Activity Level
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[9]")).click();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[8]/UIATableCell[5]/UIAStaticText[1]")).click();
	//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[9]/UIATableCell[5]/UIAStaticText[1]")).click();
	// Forefoot Flexibility
	
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[10]")).click();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[9]/UIATableCell[3]/UIAStaticText[1]")).click();

	wd.findElement(By.name("Update Information")).click();
	
	wd.switchTo().alert().accept();

//	wd.close();


	}

}
