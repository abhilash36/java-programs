package beforeoops;

class members 
{
  static int i=10;
  int j=20;
  
  public static void display1()
  {
	  System.out.println("This is static display1 method");
  }
  
  public void display2()
  {
	  System.out.println("This is non-static display2 method");
  }
  
  public void display3()
  {
	  System.out.println("-------Accessing static members inside nonstatic method------");
	  System.out.println("value of i is: "+i);
	  display1();
	  
	  System.out.println("-------Accessing non-static members inside nonstatic method------");
	  System.out.println("value of j is: "+j);
	  display2();
  }
}
public class AccessingStatAndNonStat
{
	public static void main(String[] args) 
	{
		System.out.println("-------Accessing static members inside static method------");
		System.out.println("value of i is: "+members.i);
		members.display1();
		
		
		System.out.println("-------Accessing non-static members inside nonstatic method------");
		members m=new members();
	    System.out.println("value of j is: "+m.j);
		m.display2();
		m.display3();
	}
}