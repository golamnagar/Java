package iOSNativeApp;

public class iOSUniversalAppSixPlusMultiple {

	public static void main(String[] args) throws Exception {
		
		int count = 0;
		
		int totalTrail = 10;
		
		while (count < totalTrail)
		{
			iOSUniversalAppSixPlus.main(args);
			
			String StrI = Integer.toString(count+1);
			
			System.out.println(StrI+"   Order Successfully Completed");
			count ++;
			
		}
		
		
		/*
		iOSUniversalAppSixPlus.main(args);
		System.out.println("First Order Successfully Submitted");
		iOSUniversalAppSixPlus.main(args);
		System.out.println("Second Order Successfully Submitted");
		iOSUniversalAppSixPlus.main(args);
		System.out.println("Third Order Successfully Submitted");
		iOSUniversalAppSixPlus.main(args);
		System.out.println("Forth Order Successfully Submitted");
		
		*/

	}

}
