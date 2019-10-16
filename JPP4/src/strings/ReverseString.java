package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		System.out.println("Entered statement is: "+S1);
		
		String rev="";
		
		for(int i=S1.length()-1;i>=0;i--)
		{
			rev=rev+S1.charAt(i);
		}
     System.out.println("Reverse of the given string is: "+rev);
	}

}
