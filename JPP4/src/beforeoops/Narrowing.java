package beforeoops;

public class Narrowing {

	public static void main(String[] args) 
	{
     double d=20.59;
     float f=(float)d;
     long l=(long)f; 
     int i=(int) l;
     char c=(char)i;
     short s=(short) c;
     byte b=(byte) s;
     
     System.out.println("value of double is:"+d);
     System.out.println("value of float is:"+f);
     System.out.println("value of long is:"+l);
     System.out.println("value of int is:"+i);
     System.out.println("value of char is:"+c);
     System.out.println("value of short is:"+s);
     System.out.println("value of byte is:"+b);
	}

}
