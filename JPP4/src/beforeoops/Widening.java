package beforeoops;

public class Widening 
{
	public static void main(String[] args) 
	{
		byte b=97;
		short s=(short) b;
		char c=(char) s;
		int i=(int) c;
		float f=(float)i;
		double d=(double)f;
		long l=(long)d;
		
		System.out.println("value of byte is: "+b);
		System.out.println("value of short is: "+s);
		System.out.println("value of charecter is: "+c);
		System.out.println("value of integer is: "+i);
		System.out.println("value of float is: "+f);
		System.out.println("value of double is: "+d);
		System.out.println("value of long is: "+l);
	}

}
