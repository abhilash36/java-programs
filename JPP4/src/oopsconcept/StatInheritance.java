package oopsconcept;

class Animals
{
	static int i=10;
	
	public static void dog()
	{
		System.out.println("This is parent class");
	}
	
}

class LandAnimals extends Animals
{	
	public static void puppy()
	{
		System.out.println("This is child class");
	}
}


public class StatInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("value of i is: "+LandAnimals.i);
		LandAnimals.dog();
		LandAnimals.puppy();
	}
}
