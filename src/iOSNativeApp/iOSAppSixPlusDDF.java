package iOSNativeApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class iOSAppSixPlusDDF {
	//String vTreatment,String vHFormat, String vHRaise, String vFLength, String vMPad, String vFRDropout, vSWidth, vMaterial, vCoushion	
	static String vTreatment;
	static String vHFormat;
	static String vHRaise;
	static String vFLength;
	static String vMPad;
	static String vFRDropout;
	static String vSWidth;
	static String vTMaterial;
	static String vCoushion;
	
	static String[] orderFeatureList = new String[9];
	
	public static AppiumDriver wd;
	
	public static void setupWebDriver() throws Exception {
//		for (int orderRow = 0; orderRow < orderData.size(); orderRow++) {
//			String[] aOrder = orderData.get(orderRow);
//			for (int aOrderFeature = 0; aOrderFeature < aOrder.length; aOrderFeature++) {
//				orderFeatureList[aOrderFeature] = aOrder[aOrderFeature];
//				System.out.println("setting field " + aOrderFeature + " to: " + aOrder[aOrderFeature]);
//			}
//		}
//		System.out.println("order data is: " + orderData);
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
		capabilities.setCapability(MobileCapabilityType.APP, "com.sols.solsapp");

//      For simulator
//        File classpathRoot = new File(System.getProperty("user.home"));        
//        File appDir = new File(classpathRoot, "Library/Developer/Xcode/DerivedData/SolsReseller-acvygysoqimjgbapxnhoxwazczft/Build/Products/Debug-iphonesimulator/");
//        File app = new File(appDir, "SOLSAppStore.app");
//        System.out.println("app dir is: " + app.getAbsolutePath());
//		capabilities.setCapability("app", app.getAbsolutePath());
		
		wd = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[2]")).click();
	}
	
	public static void signInPage() throws Exception{
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).clear();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).sendKeys("golam");
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).clear();
//		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).sendKeys("sols1sols1");
		Thread.sleep(2000);
//		wd.findElement(By.name("Hide keyboard")).click();
//		Thread.sleep(2000);
		wd.findElement(By.name("SIGN IN")).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Thread.sleep(3000);
	}
	
    public static void AddNewOrderPage() throws Exception{
        	wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    		wd.findElement(By.name("Header Logout Icon")).click();
    		wd.switchTo().alert().dismiss();
    		Thread.sleep(1500);
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
			wd.findElements(By.className("UIAPickerWheel")).get(2).sendKeys("1971");
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
    	Thread.sleep(1500);
    	wd.switchTo().alert().accept();
        Thread.sleep(1500);
    	// Left Foot
    	wd.findElement(By.name("imageL1")).click();
    	Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.name("imageL2")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.name("imageL3")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		// Right Foot
		wd.findElement(By.name("imageR3")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.name("imageR2")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.name("imageR1")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		Thread.sleep(1500);
		wd.findElement(By.name("CONTINUE")).click();
		Thread.sleep(1500);


    }

    public static void patientsInsert(String vTreatment,String vHFormat, String vHRaise, String vFLength, String vMPad, String vFRDropout ){
    	
    	//wd.findElement(By.name("CONTINUE")).click();
    	//wd.switchTo().alert().accept();
    	
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(vTreatment);
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(vHFormat);
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(vHRaise);
		//wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("3.0mm");
		wd.findElement(By.name("Done")).click();
		//Sols Length
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(vFLength);
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
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(vMPad);
		wd.findElement(By.name("Done")).click();
		// First Ray Drop-Out
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[7]")).click();
	//	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(vFRDropout);
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.name("CONTINUE")).click();
    	
    }
    public static void patientsShoe(String vSWidth) throws Exception{
    	Thread.sleep(1500);
    	wd.findElement(By.name("CONTINUE")).click();
    	wd.switchTo().alert().accept();
    	Thread.sleep(1500);
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("8");
		wd.findElement(By.name("Done")).click();
		Thread.sleep(1500);
		wd.findElement(By.name(vSWidth)).click();
		
    	wd.findElement(By.name("CONTINUE")).click();
    }
    public static void patientsMaterials(String vTMaterial, String vCoushion){
    	
    	wd.findElement(By.name("CONTINUE")).click();
    	wd.switchTo().alert().accept();
    	
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
	//	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
	//	wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(vTMaterial);
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		//wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Oatmeal");
		wd.findElement(By.name("Done")).click();
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).click();
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys(vCoushion);
		wd.findElement(By.name("Done")).click();
    	
    	wd.findElement(By.name("CONTINUE")).click();
    	
    }
    public static void shippingAddress() throws Exception{
    	
    	Thread.sleep(1500);
    	/*
    	wd.findElement(By.name("CONTINUE")).click();
    	wd.switchTo().alert().accept();
    	wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();
		wd.findElement(By.name("Done")).click();
		*/
    	wd.findElement(By.name("CONTINUE")).click();
    	
    }
    public static void orderSummary() throws Exception{
    	Thread.sleep(3000);
    	wd.findElement(By.name("SUBMIT ORDER")).click();
    	
    	
    	
    }
public static void main(String[] args) throws Exception {
	
	File classpathRoot = new File(System.getProperty("user.home"));        
	File testDataDir = new File(classpathRoot, "Documents/Insert.csv");
	ArrayList<String[]> orderData = ReadCSV.run(testDataDir.getAbsolutePath());
	//iOSAppSixPlusDDF.setupWebDriver();

	for (int orderCount = 0; orderCount < orderData.size(); orderCount++) {
		String[] rawOrderData = orderData.get(orderCount);
		for (int aOrderFeature = 0; aOrderFeature < rawOrderData.length; aOrderFeature++) {
			orderFeatureList[aOrderFeature] = rawOrderData[aOrderFeature];
	//		System.out.println("setting field " + aOrderFeature + " to: " + rawOrderData[aOrderFeature]);
			System.out.println("order data for field " + aOrderFeature + " is: " + orderFeatureList[aOrderFeature]);
		}		
		//iOSUniversalApp.signInPage();
		System.out.println((orderCount+1) +"   Order started");
		iOSAppSixPlusDDF.setupWebDriver();
//		Thread.sleep(5000);
//		iOSAppSixPlusDDF.signInPage();
		Thread.sleep(1500);
		iOSAppSixPlusDDF.AddNewOrderPage();
		Thread.sleep(1500);
		iOSAppSixPlusDDF.createAccountPage();
		Thread.sleep(1500);
		iOSAppSixPlusDDF.patientsProfile();
		Thread.sleep(1500);
		iOSAppSixPlusDDF.patientsPhotosPage();
		iOSAppSixPlusDDF.patientsInsert(orderFeatureList[0], orderFeatureList[1], orderFeatureList[2], orderFeatureList[3], orderFeatureList[4], orderFeatureList[5]);
		iOSAppSixPlusDDF.patientsShoe(orderFeatureList[6]);
		iOSAppSixPlusDDF.patientsMaterials(orderFeatureList[7], orderFeatureList[8]);
		iOSAppSixPlusDDF.shippingAddress();
		Thread.sleep(1500);
		iOSAppSixPlusDDF.orderSummary();
		Thread.sleep(30000);
	//	wd.switchTo().alert().accept();
		
		//wd.close();
		wd.quit();
		System.out.println((orderCount+1) +"   Order Successfully Completed");

	}
	
	System.out.println(orderData.size());
			
	}

}

