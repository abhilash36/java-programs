package oopsconcept;

interface I3
{
  abstract public void display3();	
}

class c2 implements I3
{
	public void display3()
	{
		System.out.println("This is display3 method");
	}
}

class c3 implements I3
{
	public void display3()
	{
		System.out.println("This is display3 method");
	}
}

public class MultiClasses 
{
	public static void main(String[] args) 
	{
		c2 ca=new c2();
		ca.display3();
		System.out.println("------------------------");
		c3 cb=new c3();
		cb.display3();
	}

}
