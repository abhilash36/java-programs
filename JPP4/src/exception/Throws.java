package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws 
{
  public static FileOutputStream CreateFile(String str) throws FileNotFoundException
  {
	  return new FileOutputStream(str);
  }
  
  public static void main(String[] args) 
  {
	try
	{
		FileOutputStream fout=CreateFile("E://I.txt");
		System.out.println("File created successfully");
	}
	
	catch(FileNotFoundException e)
	{
		System.out.println("File is not found");
	}
  }
}
