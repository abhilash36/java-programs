package strings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		
		int count=1;
		
		for(int i=0;i<S1.length();i++)
		{
		  if(S1.charAt(i)==' ')
		  {
		   count++;  
		  }
		} 	
     System.out.println("Number of words present in the given string is: "+count);
	}

}
