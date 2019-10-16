package oopsconcept;

class coverload
{
	int x;
	coverload(int a)
	{ 
		x=a;
		System.out.println("Value of integer is: "+x);
	}
	
	float y;
	coverload(float b)
	{
		y=b;
		System.out.println("Value of float is: "+y);
	}
	
	
	double z;
	coverload(double d)
	{
		z=d;
		System.out.println("Value of double is: "+z);
	}
}

public class ConstOverld {

	public static void main(String[] args) 
	{
		coverload c1=new coverload(5);
		coverload c2=new coverload(5.34f);
		coverload c3=new coverload(5.5);
	}

}
