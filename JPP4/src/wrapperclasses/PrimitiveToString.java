package wrapperclasses;

public class PrimitiveToString 
{

	public static void main(String[] args) 
	{
		byte b =97;
		Short s=98;
		char c='A';
		int a=100;
		long l=99;
		float f=102.00f;
		double d=105.00;
		
		System.out.println("Byte to String is: "+String.valueOf(b));
		System.out.println("Short to String is: "+String.valueOf(s));
		System.out.println("Char to String is: "+String.valueOf(c));
		System.out.println("int to String is: "+String.valueOf(a));
		System.out.println("long to String is: "+String.valueOf(l));
		System.out.println("float to String is: "+String.valueOf(f));
		System.out.println("double to String is: "+String.valueOf(d));
	}

}
