package oopsconcept;

abstract class theater
{
  	abstract public void movie();
}

class TV extends theater
{
	public void movie()
	{
		System.out.println("Movie will also get telecasted in TV");
	}
}

public class OnlyAbstractMethod 
{
 	public static void main(String[] args) 
 	{
		theater t=new TV();
		t.movie();
	}

}
