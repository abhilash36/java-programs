package beforeoops;

public class ThisKeyword 
{
  int i=10;
  
  public void test()
  {
	  int i=20;
	  System.out.println("Value of Global variable i is :"+this.i);
	  System.out.println("Value of local variable i is :"+i);
  }
  
  public static void main(String[] args) 
  {
	  ThisKeyword t=new ThisKeyword();
	  t.test();
  }
}
