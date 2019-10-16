package oopsconcept;

class constchain1
{
	constchain1()
	{
		System.out.println("This is default constructor");
	}
}

class constchain2 extends constchain1
{
	int x;
	constchain2(int a)
	{
		super();
		x=a;
		System.out.println("This is a integer constructor");
	}
}

class constchain3 extends constchain2
{
	double y;
	constchain3(double b)
	{
		super(10);
		y=b;
		System.out.println("This is a double constructor");
	}
}


public class ConstChaining 
{
	public static void main(String[] args) 
	{
		constchain3 c=new constchain3(19.89);
	}

}
