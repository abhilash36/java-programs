package strings;

import java.util.Scanner;

public class LastCharOfString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		System.out.println("Last character of the given string is: "+S1.charAt(S1.length()-1));
	}

}
