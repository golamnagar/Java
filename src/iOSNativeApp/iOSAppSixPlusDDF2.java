package iOSNativeApp;

public class iOSAppSixPlusDDF2 {

	public static void main(String[] args) throws Exception {
		
		int count = 0;
		
		int totalTrail = 10;
		
		while (count < totalTrail)
		{
			iOSAppSixPlusDDF.main(args);
			
			String StrI = Integer.toString(count+1);
			
			System.out.println(StrI+"   Order Successfully Completed");
			count ++;
			
		}
	}

}
