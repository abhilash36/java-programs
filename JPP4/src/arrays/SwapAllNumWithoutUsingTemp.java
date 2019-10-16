package arrays;

import java.util.Scanner;

public class SwapAllNumWithoutUsingTemp 
{
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
		  
		  System.out.println("Array elements before swapping are: ");
		  
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]);
		  }
		  
		  for(int i=0;i<a.length/2;i++)
		  {
			  a[i]=a[i]+a[a.length-1-i];
			  a[a.length-1-i]=a[i]-a[a.length-1-i];
			  a[i]=a[i]-a[a.length-1-i];
		  }
		  
        System.out.println("Array elements after swapping are: ");
		  
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]);
		  }
		  
      }
}
