package oopsconcept;

class desktop
{
  	public void assemble()
  	{
  		System.out.println("This is parent class");
  	}
}

class pc extends desktop
{
	public void dell()
	{
		System.out.println("This is child class");
	}
}

 public class NonStaticInheritance 
  {
    public static void main(String[] args) 
    {
        pc p=new pc();
        p.assemble();
        p.dell();
	}
}
