package arrays;

import java.util.Scanner;

public class InsertAnArrayElement 
{
	public static void display(int[] a)
	 {
		 System.out.println("Numbers in an array are: ");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
	 }
	
	public static int[] Insert(int[] a,int in,int num)
	{
		if(in<0 && in>a.length)
		{
			System.out.println("Invalid index");
		    return a;
		}
		
		else
			
		{
			int na[]=new int[a.length+1];
			
			for(int i=0;i<in;i++)
			{
				na[i]=a[i];
			}
			
			na[in]=num;
			
			for(int i=in;i<a.length;i++)
			{
				na[i+1]=a[i];
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
		  
		  System.out.println("Enter the position of an element that needs to Inserted");
		  int in=s.nextInt();
		  
		  System.out.println("Enter the number that needs to be inserted");
		  int num=s.nextInt();
		  
		  a=Insert(a,in,num);
		  
		  System.out.println("After Inserting, updated array is: ");
		  
		  for(int i=0;i<a.length;i++)
			 {
				 System.out.println(a[i]);
			 }
	}
}

