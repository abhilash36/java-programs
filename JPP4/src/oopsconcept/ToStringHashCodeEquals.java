package oopsconcept;

public class ToStringHashCodeEquals 
{
  String name;
  int age;
  
  ToStringHashCodeEquals()
  {
	  
  }
  
  ToStringHashCodeEquals(String name,int age)
  {
	  this.name=name;
	  this.age=age;
  }
  
  public String toString()
  {
	return "(name: "+name+"age: "+age+")";  
  }
  
  public boolean equals(Object obj)  
  {
	  return this.name==((ToStringHashCodeEquals)obj).name &&
	         this.age==((ToStringHashCodeEquals)obj).age;
  }
  
  public int hashCode()
  {
	  int hc=0;
	  hc=hc+name.hashCode();
	  hc=hc+age;
	  return hc;
  }
  
  public static void main(String[] args) 
  {
	  ToStringHashCodeEquals t1=new ToStringHashCodeEquals("sharath",25);
	  ToStringHashCodeEquals t2=new ToStringHashCodeEquals("kiran",26);
	  ToStringHashCodeEquals t3=new ToStringHashCodeEquals("sharath",25);
	  
	  System.out.println("ToString value of t1 is: "+t1.toString());
	  System.out.println("ToString value of t3 is: "+t3.toString());
	  System.out.println("Result of comparision operator is: "+t1.toString()==t3.toString());
	  System.out.println("Result of equals operator are: "+(t1.toString()).equals(t3.toString()));
	  System.out.println("-----------------------------------------------------------");
	  
	  
	  System.out.println("Result of equals operator is:"+ (t1==t3));
	  System.out.println("Result of equals operator is: "+t1.equals(t3));
	  System.out.println("-----------------------------------------------------------");
	  
	  
	  System.out.println("ToString value of t1 is: "+t1.hashCode());
	  System.out.println("ToString value of t3 is: "+t3.hashCode());
	  System.out.println("Result of comparision operator is: "+(t1.hashCode()==t3.hashCode()));
  }
}
