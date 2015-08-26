package iOSNativeApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class QASols3 {

	/**
	 * @param args
	 */

	public static AppiumDriver wd;

	public static void setupWebDriver() throws Exception {
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
		
	}

	public static void createAccountPageAutomation() throws Exception {
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
	//	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]/UIAPicker[1]")).click();

		wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1");
		wd.findElements(By.className("UIAPickerWheel")).get(2).sendKeys("2001");
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("March");


		wd.findElement(By.name("Done")).click();

		wd.findElement(By.name("Male")).click();
		wd.findElement(By.name("Create Profile")).click();
		Thread.sleep(3000);
	}

	public static void createProfilePageAutomation() throws Exception {
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

		Thread.sleep(3000);
	}

	public static void takingImages() throws Exception{

		// Patient Information: Images
		// Negative test without taking any image user clicks on Update information Button
		wd.findElement(By.name("Update Information")).click();
		wd.switchTo().alert().accept();

		// L1

		wd.findElement(By.name("placeholder-photo-left-bottom")).click();
		// Test for the Alert: For the first time use of the camera utility
		//wd.findElement(By.name("Line up the bottom of the foot with this line.")).click();
		// Code for X Close button
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();

		// R1
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.findElement(By.name("placeholder-photo-right-bottom")).click();
		// Test for the Alert: For the first time use of the camera utility
		//wd.findElement(By.name("Line up the bottom of the foot with this line.")).click();
		// Code for X Close button
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();


		// L2
		wd.findElement(By.name("placeholder-photo-left-back")).click();
		// Test for the Alert: For the first time use of the camera utility
		//wd.findElement(By.name("Line up the bottom of the foot with this line.")).click();
		// Code for X Close button
		/*
		WebElement someElement = wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[6]"));
		if(someElement != null)	{
			someElement.click();
		}
		*/
		//Code for X Close button
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[7]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();



		// R2
		wd.findElement(By.name("placeholder-photo-right-back")).click();
		// Test for the Alert: For the first time use of the camera utility
		//Code for X Close button
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[6]")).click();
		//Code for X Close button
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[7]")).click();
		
		
		/*
		someElement = wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]"));
		
		if (someElement != null){
			someElement.click();
		}
		
		someElement = wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]"));
		
		if (someElement!=null){
			someElement.click();
		}
        */
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		
		// L3
		wd.findElement(By.name("placeholder-photo-left-arch")).click();
		// Test for the Alert: For the first time use of the camera utility
		//Code for X Close button
		//wd.findElement(By.name("x close")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// R3
		wd.findElement(By.name("placeholder-photo-right-arch")).click();
		// Test for the Alert: For the first time use of the camera utility
		//Code for X Close button
		/*
		someElement = wd.findElement(By.name("x close"));
		if(someElement != null)	{
			someElement.click();
		}
		*/
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(20000);
		//User clicks on the Update Information button to direct to order page
		wd.findElement(By.name("Update Information")).click();
		Thread.sleep(10000);
		/*
		Alert alert = wd.switchTo().alert();
		while(alert != null) {
			alert.accept();
			wd.findElement(By.name("Update Information")).click();
			Thread.sleep(3000);
		}
		*/
		
	}

	public static void orderPage() throws Exception{

		// Order page
		// Heel format
		wd.findElement(By.name("Rounded Heel - Shallow Cup")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATableView[1]/UIATableCell[3]")).click();

		//Treatment
		wd.findElement(By.name("Arch Adjustment")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATableView[2]/UIATableCell[1]/UIAStaticText[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAButton[3]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATableView[3]/UIATableCell[2]")).click();


		// Product Length
		wd.findElement(By.name("Full Length")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATableView[4]/UIATableCell[1]/UIAStaticText[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAButton[5]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATableView[5]/UIATableCell[2]/UIAStaticText[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAButton[6]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATableView[6]/UIATableCell[1]/UIAStaticText[1]")).click();

		/*

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAButton[7]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIAButton[8]")).click();

(JavascriptExecutor)wd.executeScript("mobile: swipe", new HashMap<String, Double>() {{ put("touchCount", 1); put("startX", 882); put("startY", 211); put("endX", 877); put("endY", 511); put("duration", 1.997363); }});
		wd.findElement(By.name("(null)")).click();
(JavascriptExecutor)wd.executeScript("mobile: swipe", new HashMap<String, Double>() {{ put("touchCount", 1); put("startX", 863); put("startY", 631); put("endX", 898); put("endY", 235); put("duration", 2); }});


		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[2]/UIATableView[7]/UIATableCell[5]")).click();

		 */
		// Review Order
		wd.findElement(By.name("REVIEW ORDER")).click();
		// Submit order
		wd.findElement(By.name("SUBMIT ORDER")).click();

		Thread.sleep(4000);
		// Confirm order Pop up
		wd.switchTo().alert().accept();
	}

	public static void main(String[] args) throws Exception {
		QASols3.setupWebDriver();

		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.findElement(By.name("Add A Patient")).click();

		QASols3.createAccountPageAutomation();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		QASols3.createProfilePageAutomation();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		QASols3.takingImages();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		QASols3.orderPage();



		//	wd.close();


	}

}
