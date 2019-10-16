package strings;

import java.util.Scanner;

public class MethodForMultiSpaceString 
{
  public static int count(String s)
  {
	  int count=1;
		
		char[] ch=s.trim().toCharArray();  //trim() method trims the extra space present before the word in the given string
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ' && ch[i+1]!=' ')
			{
				count++;
			}
		}
		
      return count;
	}
  
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=s1.nextLine();
		int count=count(s);
		System.out.println("Count of the words present in the given string is: "+count);
	}

}
