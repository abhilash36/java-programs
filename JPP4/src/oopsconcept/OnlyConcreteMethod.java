package oopsconcept;

abstract class mobiles
{
	public void keypad()
	{
		System.out.println("This is a keypad mobile concrete method");
	}
}

class advmobiles extends mobiles
{
	public void smartphones()
	{
		System.out.println("This is a smart phone concrete method");
	}
}


public class OnlyConcreteMethod 
{
	public static void main(String[] args) 
	{
		mobiles m=new advmobiles();
		m.keypad();
	}
}
