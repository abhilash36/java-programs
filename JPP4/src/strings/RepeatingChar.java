package strings;

import java.util.Scanner;

public class RepeatingChar {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String S1=s.nextLine();
		
		
		
		char[] ch=S1.toCharArray();
		
		System.out.println("Duplicate characters present in the given String are: ");
		
		for(int i=0;i<ch.length;i++)
		{
			boolean duplicate=false;
			
            //to check if the selected character is already present and it is counted			
		   	  for(int j=i-1;j>=0;j--)
		//    for(int j=0;j<=i-1;j++)
			{	
				if(ch[j]==ch[i])
				{
				  duplicate=true;
				  break;
				}
			}
			
			
			if(!duplicate) 
			{
		    int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
		 
			if(count>1)
			{
				System.out.println(ch[i]);
			}
		}
    
	 }
	}
}	
		
	

