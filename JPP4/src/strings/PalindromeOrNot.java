package strings;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		
		String rev="";
		
		for(int i=S1.length()-1;i>=0;i--)
		{
			rev=rev+S1.charAt(i);
		}
		
		if(rev.equals(S1))
		System.out.println("Given string is palindrome");
		else
	    System.out.println("Given string is not a palindrome");

	}

}
