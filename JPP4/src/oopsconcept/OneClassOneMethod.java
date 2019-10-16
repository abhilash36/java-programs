package oopsconcept;

interface i4
{
  abstract void display4();
}

class c4 implements i4
{
	public void display4()
	{
		System.out.println("This is display4 method");
	}
}

public class OneClassOneMethod 
{
	public static void main(String[] args) 
	{
		c4 c=new c4();
		c.display4();
	}
}
