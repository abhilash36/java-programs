package oopsconcept;

class Qspiders
{
	public void test()
	{
		System.out.println("This is a testing training institute");
	}
}

class Jspiders extends Qspiders
{
	public void dev()
	{
		System.out.println("This is development training institute ");
	}
}

class TY extends Jspiders
{
	public void company()
	{
		System.out.println("This is a software company");
	}
}

public class Upcasting 
{
  public static void main(String[] args) 
  {
	Jspiders j=(Jspiders) new TY();
	j.test();
	j.dev();
  }
}
