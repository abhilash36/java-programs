package strings;

import java.util.Scanner;

public class ReverseOnlyWords 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		
		String[] S2=S1.split(" ");
		
		String rev="";
		for(int i=S2.length-1;i>=0;i--)
		{
			rev=rev+S2[i];
		}
      System.out.println("Result is: "+rev);
	}
}
