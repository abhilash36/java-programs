package oopsconcept;

class studies
{
  int sroll=001;
  String sname="abhilash";
  double smarks=79.90;
  
  public int getRollNum()
  {
	  return sroll;
  }
  
  public void setName(String name)
  {
	  sname=name;
  }
  
  public String getName() 
  {
	return sname;  
  }
  
  public void setMarks(double marks)
  {
	  smarks=marks;
  }
  
  public double getMarks()
  {
	  return smarks;
  }
}

public class Encapsulation 
{

	public static void main(String[] args) 
	{
		studies s=new studies();
		System.out.println("Student Roll number is: "+s.getRollNum());
		s.setName("Surya");
		System.out.println("Student name is: "+s.getName());
		s.setMarks(90);
		System.out.println("Student marks is: "+s.getMarks());
	}
}
