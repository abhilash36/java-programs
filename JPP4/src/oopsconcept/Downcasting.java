package oopsconcept;

class Qspiders1
{
	public void test()
	{
		System.out.println("This is a testing training institute");
	}
}

class Jspiders1 extends Qspiders1
{
	public void dev()
	{
		System.out.println("This is development training institute ");
	}
}

class TY1 extends Jspiders1
{
	public void company()
	{
		System.out.println("This is a software company");
	}
}

public class Downcasting 
{
	public static void main(String[] args) 
	{
		Jspiders1 j=new TY1();
		TY1 t=(TY1) j;
		t.test();
		t.dev();
		t.company();
	}

}
