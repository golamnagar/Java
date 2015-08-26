package iOSNativeApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class iOSUniversalAppSixPlus {
	
	
			
	public static AppiumDriver wd;
	
	public static void setupWebDriver() throws Exception {
		//		File appDir = new File(System.getProperty("user.dir"), "/apps/");
		//	    File app = new File(appDir, "co.sols.appDev");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6 Plus");
		capabilities.setCapability(MobileCapabilityType.APP, "com.sols.solsapp");


		//	    capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("udid","2657dd889636115ce4a12a2834c9a4ca0105da9c");
         // f01e3eec0164ba2efaea4363d7140d6abc4bdb98
		//2657dd889636115ce4a12a2834c9a4ca0105da9c
		wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[2]")).click();
	}
	
	public static void signInPage() throws Exception{
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).clear();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).sendKeys("golam");
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).clear();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1000);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("sols1sols1");
		Thread.sleep(2000);
		wd.findElement(By.name("Hide keyboard")).click();
		Thread.sleep(2000);
		wd.findElement(By.name("SIGN IN")).click();
		Thread.sleep(3000);
	}
	
    public static void AddNewOrderPage(){
        	wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    		wd.findElement(By.name("Header Logout Icon")).click();
    		wd.switchTo().alert().dismiss();
    		wd.findElement(By.name("ADD NEW ORDER")).click();
	 
 }
	
    public static void createAccountPage(){
	wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	long currentTime = System.currentTimeMillis();
	wd.findElement(By.name("CONTINUE")).click();
	wd.switchTo().alert().accept();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).clear();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).sendKeys("QA"+ currentTime);
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).clear();
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).sendKeys("QA_last"+ currentTime);
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).sendKeys("QA"+currentTime + "@sols.com");
	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")).sendKeys("QA"+currentTime + "@sols.com");
	// How to select the date of Birth
	wd.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
	wd.findElement(By.name("Next")).click();
	        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();
	        wd.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
			//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
			wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1");
			wd.findElements(By.className("UIAPickerWheel")).get(2).sendKeys("1972");
			wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("April");
			wd.findElement(By.name("Done")).click();
			
		//	Select Sex
	        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[6]")).click();
	        wd.findElement(By.name("Done")).click();
	        wd.findElement(By.name("CONTINUE")).click();
}
    
    public static void patientsProfile() {
    
    	
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("6'");
		wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("5\"");
		wd.findElement(By.name("Done")).click();
		//Weight
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).sendKeys("178");
		// Ethnicity
		wd.findElement(By.name("Next")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("White");
		wd.findElement(By.name("Done")).click();
		//Length of Left Foot
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("9\"");
		wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1/2");
		wd.findElement(By.name("Done")).click();
		//Length of Right Foot
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();
	//	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("9\"");
		wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1/2");
		wd.findElement(By.name("Done")).click();
		// Level of Activity
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[6]")).click();
	//	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Medium: Moderately Active");
		//wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1/2");
		wd.findElement(By.name("Done")).click();
		// Forefoot Flexibility Level
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[7]")).click();
	//	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Rigid");
		//wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1/2");
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.name("CONTINUE")).click();
		
		
    }

    
    public static void patientsPhotosPage() throws Exception{
    	
    	wd.findElement(By.name("CONTINUE")).click();
    	Thread.sleep(2000);
    	wd.switchTo().alert().accept();
        Thread.sleep(8000);
    	// Left Foot
    	wd.findElement(By.name("imageL1")).click();
    	Thread.sleep(2000);
    	wd.findElement(By.name("Close Button")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(8000);
		wd.findElement(By.name("imageL2")).click();
		Thread.sleep(2000);
		wd.findElement(By.name("Close Button")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(5000);
		wd.findElement(By.name("imageL3")).click();
		Thread.sleep(2000);
		wd.findElement(By.name("Close Button")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(5000);
		// Right Foot
		wd.findElement(By.name("imageR3")).click();
		Thread.sleep(2000);
		wd.findElement(By.name("Close Button")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(10000);
		wd.findElement(By.name("imageR2")).click();
		Thread.sleep(2000);
		wd.findElement(By.name("Close Button")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(10000);
		wd.findElement(By.name("imageR1")).click();
		Thread.sleep(2000);
		wd.findElement(By.name("Close Button")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(20000);
		wd.findElement(By.name("CONTINUE")).click();
		Thread.sleep(2000);


    }

    public static void patientsInsert(){
    	
    	//wd.findElement(By.name("CONTINUE")).click();
    	//wd.switchTo().alert().accept();
    	
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Arch Adjustment");
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Rounded Heel - Shallow Cup");
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Left 1.5mm");
		//wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("3.0mm");
		wd.findElement(By.name("Done")).click();
		//Sols Length
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Full Length");
		wd.findElement(By.name("Done")).click();
		/*
		// ForeFoot Posting
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Yes");
		wd.findElement(By.name("Done")).click();
		
		*/
		// MetPad
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[6]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Small Firm");
		wd.findElement(By.name("Done")).click();
		// First Ray Drop-Out
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[7]")).click();
	//	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Yes");
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.name("CONTINUE")).click();
    	
    }
    public static void patientsShoe() throws Exception{
    	Thread.sleep(5000);
    	wd.findElement(By.name("CONTINUE")).click();
    	wd.switchTo().alert().accept();
    	Thread.sleep(2000);
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("8");
		wd.findElement(By.name("Done")).click();
		Thread.sleep(2000);
		wd.findElement(By.name("Dress Shoe")).click();
		
    	wd.findElement(By.name("CONTINUE")).click();
    }
    public static void patientsMaterials(){
    	
    	wd.findElement(By.name("CONTINUE")).click();
    	wd.switchTo().alert().accept();
    	
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
	//	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
	//	wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Merino Wool");
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		//wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Oatmeal");
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Yes");
		wd.findElement(By.name("Done")).click();
    	
    	wd.findElement(By.name("CONTINUE")).click();
    	
    }
    public static void shippingAddress() throws Exception{
    	
    	Thread.sleep(5000);
    	/*
    	wd.findElement(By.name("CONTINUE")).click();
    	wd.switchTo().alert().accept();
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();
		wd.findElement(By.name("Done")).click();
		*/
    	wd.findElement(By.name("CONTINUE")).click();
    	
    }
    public static void orderSummary() throws Exception{
    	Thread.sleep(10000);
    	wd.findElement(By.name("SUBMIT ORDER")).click();
    	
    	
    	
    }
public static void main(String[] args) throws Exception {
		
	iOSUniversalAppSixPlus.setupWebDriver();
		//iOSUniversalApp.signInPage();
		
		Thread.sleep(5000);
		iOSUniversalAppSixPlus.AddNewOrderPage();
		Thread.sleep(5000);
		iOSUniversalAppSixPlus.createAccountPage();
		Thread.sleep(10000);
		iOSUniversalAppSixPlus.patientsProfile();
		Thread.sleep(20000);
		iOSUniversalAppSixPlus.patientsPhotosPage();
		iOSUniversalAppSixPlus.patientsInsert();
		iOSUniversalAppSixPlus.patientsShoe();
		iOSUniversalAppSixPlus.patientsMaterials();
		iOSUniversalAppSixPlus.shippingAddress();
		Thread.sleep(20000);
		iOSUniversalAppSixPlus.orderSummary();
		Thread.sleep(30000);
	//	wd.switchTo().alert().accept();
		
		
		//wd.close();
		wd.quit();
		
	}

}
