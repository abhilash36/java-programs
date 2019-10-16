package oopsconcept;

interface I1
{
	abstract public void display1();
}

interface I2
{
	abstract public void display2();
}

class C1 implements I1,I2
{
	public void display1()
	{
		System.out.println("This is display1 method");
	}
	
	public void display2()
	{
		System.out.println("This is display2 method");
	}
}

public class MultiInterface 
{
	public static void main(String[] args) 
	{
		C1 c=new C1();
		c.display1();
		c.display2();

	}

}
