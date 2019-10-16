package arrays;

import java.util.Scanner;

public class InsertOnlyEvenNum {

	public static void main(String[] args) 
	{
		  Scanner s=new Scanner(System.in);
		  System.out.println("Enter the array size");
		  int size=s.nextInt();
		  int a[]=new int[size];
		  
		  System.out.println("Enter the number from where to start inserting");
		  int num=s.nextInt();
		  
          for(int i=0,j=num;i<a.length;j++)
          {
        	  if(j%2==0)
        	  {
        	    a[i]=j;
        	    i++;
        	  }
          }
          
          System.out.println("Array elements are: ");
          for(int i=0;i<a.length;i++)
          {
        	  System.out.println(a[i]);
          }
	}

}
