package beforeoops;

public class ElseIfLadder 
{
  public static void main(String[] args) 
  {
	int a=20,b=30,c=5,d=25;
	
	if(a>b && a>c && a>d)
		System.out.println("a is greater");
	
	else if(b>a && b>c && b>d)
		System.out.println("b is greater");
	
	else if(c>a && c>b && c>d)
		System.out.println("c is greater");
	else
		System.out.println("D is greater");
  }
}
