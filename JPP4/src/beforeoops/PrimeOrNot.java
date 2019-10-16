package beforeoops;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		int n=13;
		boolean isPrime=false;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=true;
				break;
			}
		}
      
		if(isPrime)
		 System.out.println("Not a prime number");
		else
	     System.out.println("Prime number");
	}

}
