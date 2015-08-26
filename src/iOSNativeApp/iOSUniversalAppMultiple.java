package iOSNativeApp;

public class iOSUniversalAppMultiple {

	public static void main(String[] args) throws Exception {
		
		int count = 0;
		int totalTrials = 250;
		while (count < totalTrials) 
		{
			iOSUniversalApp.main(args);
			String strI = Integer.toString(count+1);
			System.out.println(strI +" Order Successfully Completed");
			count++;
		}
//		
//		Thread.sleep(2000);
//		iOSUniversalApp.main(args);
//		System.out.println("First Order Successfully Completed");
//		Thread.sleep(2000);
//		iOSUniversalApp.main(args);
//		System.out.println("First Order Successfully Completed");
//		Thread.sleep(2000);
//		iOSUniversalApp.main(args);
//		System.out.println("First Order Successfully Completed");
//		Thread.sleep(2000);
	}

}
