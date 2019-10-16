package strings;

import java.util.Scanner;

public class ReverseOnlyCharNotWords 
{
  static String reverse(String S3)
  {
	  String rev="";
	  
	  for(int i=S3.length()-1;i>=0;i--)
	  {
		  rev=rev+S3.charAt(i);
	  }
	  return rev;
  }
  
  public static void main(String[] args) 
  {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		String[] S2=S1.split(" ");
		
		String r="";
		
		for(int i=0;i<S2.length;i++)
		{
			r=r+reverse(S2[i]);
		}
		
		System.out.println("Output is: "+r);
  }
}
