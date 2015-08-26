package iOSNativeApp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class iOSUniversalApp8_2 {


	public static AppiumDriver wd;

	public static void setupWebDriver() throws Exception {
		//		File appDir = new File(System.getProperty("user.dir"), "/apps/");
		//	    File app = new File(appDir, "co.sols.appDev");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad");
		capabilities.setCapability(MobileCapabilityType.APP, "co.sols.SOLSAppStore");


		//	    capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("udid","7cb91383dea10cc42f7ed3384f0380fed86af12d");

		wd = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[2]")).click();
	}

	public static void signInPage() throws Exception{
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).clear();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).sendKeys("golam");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIASecureTextField[1]")).clear();
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
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).sendKeys(currentTime + "");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).clear();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).sendKeys(currentTime + "_last");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).sendKeys(currentTime + "@sols.com");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")).sendKeys(currentTime + "@sols.com");
		// How to select the date of Birth
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();
		wd.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1");
		wd.findElements(By.className("UIAPickerWheel")).get(2).sendKeys("1969");
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("April");
		wd.findElement(By.name("Done")).click();

		//	Select Sex
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[6]")).click();
		wd.findElement(By.name("Done")).click();
		wd.findElement(By.name("CONTINUE")).click();
	}

	public static void patientsProfile() {


		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("6'");
		wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("5\"");
		wd.findElement(By.name("Done")).click();
		//Weight
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).sendKeys("178");
		// Ethnicity
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("White");
		wd.findElement(By.name("Done")).click();
		//Length of Left Foot
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("9\"");
		wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1/2");
		wd.findElement(By.name("Done")).click();
		//Length of Right Foot
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("9\"");
		wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1/2");
		wd.findElement(By.name("Done")).click();
		// Level of Activity
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[6]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Medium: Moderately Active");
		//wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1/2");
		wd.findElement(By.name("Done")).click();
		// Forefoot Flexibility Level
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[7]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Rigid");
		//wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("1/2");
		wd.findElement(By.name("Done")).click();

		wd.findElement(By.name("CONTINUE")).click();


	}


	public static void patientsPhotosPage() throws Exception{

		wd.findElement(By.name("CONTINUE")).click();
		wd.switchTo().alert().accept();


		// Left Foot
		wd.findElement(By.name("imageL1")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		wd.findElement(By.name("imageL2")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();
		wd.findElement(By.name("imageL3")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).click();

		// Right Foot
		wd.findElement(By.name("imageR3")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();
		wd.findElement(By.name("imageR2")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();
		wd.findElement(By.name("imageR1")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[5]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();

		wd.findElement(By.name("CONTINUE")).click();
		Thread.sleep(2000);


	}

	public static void patientsInsert(){

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Arch Adjustment");
		wd.findElement(By.name("Done")).click();

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Rounded Heel - Shallow Cup");
		wd.findElement(By.name("Done")).click();

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Right");
		wd.findElements(By.className("UIAPickerWheel")).get(1).sendKeys("3.0mm");
		wd.findElement(By.name("Done")).click();
		//Sols Length
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[4]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Full Length");
		wd.findElement(By.name("Done")).click();
		// ForeFoot Posting
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[5]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Yes");
		wd.findElement(By.name("Done")).click();
		// MetPad

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[6]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Small Firm");
		wd.findElement(By.name("Done")).click();
		// First Ray Drop-Out
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[7]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Yes");
		wd.findElement(By.name("Done")).click();

		wd.findElement(By.name("CONTINUE")).click();
	}
	public static void patientsShoe(){
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("8");
		wd.findElement(By.name("Done")).click();

		wd.findElement(By.name("CONTINUE")).click();
	}
	public static void patientsMaterials(){

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Merino Wool");
		wd.findElement(By.name("Done")).click();

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[2]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Oatmeal");
		wd.findElement(By.name("Done")).click();

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[3]")).click();
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAPopover[1]")).click();
		wd.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("Yes");
		wd.findElement(By.name("Done")).click();

		wd.findElement(By.name("CONTINUE")).click();

	}
	public static void shippingAddress(){

		wd.findElement(By.name("CONTINUE")).click();

	}
	public static void orderSummary() throws Exception{

		wd.findElement(By.name("SUBMIT ORDER")).click();
		Thread.sleep(20000);

	}

	public  static boolean sendMail(String userName,
			String passWord,
			String host,
			String port,
			String starttls,
			String auth,
			boolean debug,
			String socketFactoryClass,
			String fallback,
			String[] to,
			String[] cc,
			String[] bcc,
			String subject,
			String text){


		Properties props = new Properties();

		props.put("mail.smtp.user", userName);
		props.put("mail.smtp.host", host);

		if(!"".equals(port))
			props.put("mail.smtp.port", port);

		if(!"".equals(starttls))
			props.put("mail.smtp.starttls.enable",starttls);

		props.put("mail.smtp.auth", auth);
		// props.put("mail.smtps.auth", "true");

		if(debug) {
			props.put("mail.smtp.debug", "true");
		}
		else {
			props.put("mail.smtp.debug", "false");         
		}

		if(!"".equals(port))
			props.put("mail.smtp.socketFactory.port", port);

		if(!"".equals(socketFactoryClass))
			props.put("mail.smtp.socketFactory.class",socketFactoryClass);

		if(!"".equals(fallback))
			props.put("mail.smtp.socketFactory.fallback", fallback);

		try
		{
			Session session = Session.getDefaultInstance(props, null);

			session.setDebug(debug);

			MimeMessage msg = new MimeMessage(session);

			msg.setText(text);

			msg.setSubject(subject);

			msg.setFrom(new InternetAddress("golam@sols.co"));

			for(int i=0;i<to.length;i++) {
				msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to[i]));
			}

			for(int i=0;i<cc.length;i++) {
				msg.addRecipient(Message.RecipientType.CC, new InternetAddress(cc[i]));
			}

			for(int i=0;i<bcc.length;i++) {
				msg.addRecipient(Message.RecipientType.BCC, new InternetAddress(bcc[i]));
			}

			msg.saveChanges();

			Transport transport = session.getTransport("smtp");
			transport.connect(host, userName, passWord);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();

			return true;

		}

		catch (Exception mex) {
			mex.printStackTrace();
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
	
			iOSUniversalApp8_2.setupWebDriver();
			//iOSUniversalApp2.signInPage();
			iOSUniversalApp8_2.AddNewOrderPage();
			Thread.sleep(10000);
			iOSUniversalApp8_2.createAccountPage();
			Thread.sleep(10000);
			iOSUniversalApp8_2.patientsProfile();
			Thread.sleep(20000);
			iOSUniversalApp8_2.patientsPhotosPage();
			iOSUniversalApp8_2.patientsInsert();
			iOSUniversalApp8_2.patientsShoe();
			iOSUniversalApp8_2.patientsMaterials();
			iOSUniversalApp8_2.shippingAddress();
			Thread.sleep(20000);
			iOSUniversalApp8_2.orderSummary();
			Thread.sleep(20000);
			wd.switchTo().alert().accept();

			//wd.close();
			wd.quit();
	}
	

}
		
		



	


  