package iOSNativeApp;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;


public class Safaritest2 {
	
	public static IOSDriver driver;

	public static void main(String[] args) throws MalformedURLException{
		

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "iPhone Simulator");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "8.1");
		capabilities.setCapability("browserName", "safari");
		
		
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
	
		driver.get("http://qa.sols.co/");
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("GET SOLS").click();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		driver.findElementsById("zip_code_search").clear();
		driver.findElementsById("zip_code_search").get(0).sendKeys("07522");
		driver.findElementsById("form_zip_code_search").get(0).click();
		driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();
	
	}

}
