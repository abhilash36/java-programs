package oopsconcept;

abstract class Qsp
{
	abstract public void javatrainer();
	
	public void seleniumtrainer()
	{
		System.out.println("Sunil is a selenium trainer");
	}
}

class trainers extends Qsp
{
	public void javatrainer() 
	{
		System.out.println("Dixit is a java trainer");
	}
}

class AbstAndConcrete 
{
	public static void main(String[] args) 
	{
		Qsp q=new trainers();
	    q.javatrainer();
	    q.seleniumtrainer();
	}
}
