package exception;

public class TryCatchFinally 
{

	public static void main(String[] args) 
	{
		int a=99,b=0,res;
		
		try
		{
			res=a/b;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("This is an arithmetic exception");
		}
		
		finally
		{
			int c=a+b;
			System.out.println("Value of c is: "+c);
		}
	}

}
