package arrays;

import java.util.Scanner;

public class PrintNumBtwMaxAndMin {

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
		  
          int min=a[0];
		  
		  for(int i=0;i<a.length;i++)
		  {
			  if(a[i]<min)
			  {
				  min=a[i];
			  }
		  }
		  
		  System.out.println("Numbers between maximum & minimum numbers in an array are:");
		  for(int i=0;i<a.length;i++)
		  {
		   if(a[i]!=max && a[i]!=min)
		    {
			  System.out.println(a[i]);
		    }
		  }
	}  

}
