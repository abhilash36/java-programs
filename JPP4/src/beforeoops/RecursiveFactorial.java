package beforeoops;

public class RecursiveFactorial 
{
  public static int factorial(int n)
  {
	  if(n==1)
	  {
		  return 1;
	  }
	  return n*factorial(n-1);
  }
  
	public static void main(String[] args) 
	{
		int res=factorial(5);
		System.out.println("factorial of 5 is: "+res);

	}

}
