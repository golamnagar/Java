package iOSNativeApp;

public class Demo {
	
	private int intVal;
	static int sInt;
	public Demo()
	{
		this.intVal = 10;
	}
	
	public Demo(int inputVal)
	{
		this.intVal = inputVal;
	}
	
	public int getIntVal()
	{
		return this.intVal;
	}
	
	public void setIntVal(int inputVal)
	{
		this.intVal = inputVal;
	}
	
	public String toString()
	{
		return intVal+" test";
	}
	
	public static void main(String[]args)
	{
		Demo test = new Demo(123);
		System.out.println(test);
		test.setIntVal(456);
		System.out.println(test);
		System.out.println("Sols");
	}
}
