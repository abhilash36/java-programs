package wrapperclasses;

public class StringToPrimitive 
{
	public static void main(String[] args) 
	{
		String s="99";
		
		System.out.println("String to byte:"+Byte.parseByte(s));
		System.out.println("String to short:"+Short.parseShort(s));
	    System.out.println("String to int:"+Integer.parseInt(s));
	    System.out.println("String to long:"+Long.parseLong(s));
	    System.out.println("String to float:"+Float.parseFloat(s));
	    System.out.println("String to double:"+Double.parseDouble(s));
	}

}
