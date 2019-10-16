package wrapperclasses;

public class PrimitiveToNon 
{
	public static void main(String[] args) 
	{
		byte b =97;
		Short s=90;
		char c='A';
		int a=10;
		long l=80;
		float f=70.89f;
		double d=90.09;
		
		System.out.println("Byte value is: "+Byte.valueOf(b));
		System.out.println("Short value is: "+Short.valueOf(s));
		System.out.println("Character value is: "+Character.valueOf(c));
		System.out.println("Integer value is: "+Integer.valueOf(a));
		System.out.println("Long value is: "+Long.valueOf(l));
		System.out.println("Float value is: "+Float.valueOf(f));
		System.out.println("Double value is: "+Double.valueOf(d));
	}
}
