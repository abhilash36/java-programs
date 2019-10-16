package beforeoops;

public class EvenNumCountBtwRange {

	public static void main(String[] args) 
	{
		int count=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
      System.out.println("Total even numbers present between the range are: "+count);
	}

}
