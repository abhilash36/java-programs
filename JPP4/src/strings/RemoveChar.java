package strings;

import java.util.Scanner;

public class RemoveChar 
{
  public static String removeChar(String str,int pos)
  {
	  return str.substring(0,pos)+str.substring(1+pos);
  }
  
  public static void main(String[] args) 
  {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		
		System.out.println("Enter the position of the string that needs to remove");
		int pos=s.nextInt();
		
		String res=removeChar(S1,pos);
		
		System.out.println("Result is: "+res);
  }
}
