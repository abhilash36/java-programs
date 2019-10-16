package arrays;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args)
	{
		 Scanner s=new Scanner(System.in);
		  System.out.println("Enter the array size");
		  int size=s.nextInt();
		  int a[]=new int[size];
		  
		  System.out.println("Enter the array elements");
		  for(int i=0;i<a.length;i++)
		  {
			  a[i]=s.nextInt();
		  }
		  
		  int max=a[0];
		  
		  for(int i=0;i<a.length;i++)
		  {
			  if(a[i]>max)
			  {
				  max=a[i];
			  }
		  }
		  System.out.println("Largest number in an array is: "+max);
	}

}
