package arrays;

import java.util.Scanner;

public class SwapAllNumUsingTemp {

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
			  int temp=a[i];
			  a[i]=a[a.length-i-1];
			  a[a.length-i-1]=temp;
		  }
		  
        System.out.println("Array elements after swapping are: ");
		  
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]);
		  }
		  
      }
  }	