package arrays;

import java.util.Scanner;

public class DeleteAnArrayElement 
{
	public static void display(int[] a)
	 {
		 System.out.println("Numbers in an array are: ");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
	 }
	
	public static int[] delete(int[] a,int in)
	{
		if(in<0 && in>a.length)
		{
			System.out.println("Invalid index");
		    return a;
		}
		
		else
			
		{
			int na[]=new int[a.length-1];
			
			for(int i=0;i<in;i++)
			{
				na[i]=a[i];
			}
			
			for(int i=in;i<na.length;i++)
			{
				na[i]=a[i+1];
			}
			
			return na;
		}
	}
	
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
		  
		  display(a);
		  
		  System.out.println("Enter the position of an element that needs to delete");
		  int in=s.nextInt();
		  
		  a=delete(a,in);
		  
		  System.out.println("After deleting, updated array is: ");
		  
		  for(int i=0;i<a.length;i++)
			 {
				 System.out.println(a[i]);
			 }
	}
}
