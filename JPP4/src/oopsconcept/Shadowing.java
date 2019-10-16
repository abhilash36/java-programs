package oopsconcept;

class shadow1
{
	public static void laptop()
	{
		System.out.println("This is parent class");
	}
}

class shadow2 extends shadow1
{
	public static void laptop()
	{
		System.out.println("This is child class");
	}
}
public class Shadowing 
{
 public static void main(String[] args) 
 {
   shadow2 s=new shadow2();
   s.laptop();
 }
}
