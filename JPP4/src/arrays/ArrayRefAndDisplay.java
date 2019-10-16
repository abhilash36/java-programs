package arrays;

import java.util.Scanner;

public class ArrayRefAndDisplay 
{
 public static void display(int[] a)
 {
	 System.out.println("Numbers in an array are: ");
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println(a[i]);
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
	  
	}
}
