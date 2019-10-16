package beforeoops;

public class GlobalVar 
{
 int a;
 float b=6.7f;
 
 public static void main(String[] args) 
 {
	 GlobalVar g=new GlobalVar();
     System.out.println("Value of global variable a is: "+g.a);
     System.out.println("Value of global variable b is: "+g.b);
 }
}
