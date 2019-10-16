package strings;

import java.util.Scanner;

public class MultiSpacesString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		
		String[] s2=S1.split(" ");
		
		System.out.println("Words present in the statemet is: ");
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}

	}

}
