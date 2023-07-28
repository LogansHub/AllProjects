package edu.org.test.filecreation;

import java.io.File;
import java.io.FileReader;

public class Filewrite 
{

	public static void main(String[] args)
	{
		
		File f = new File("\\Users\\LOGAN\\Desktop\\java\\Logan\\Kumar\\kumarsnewfiles.txt");
		try {
		FileReader fr = new  FileReader("\\Users\\LOGAN\\Desktop\\java\\Logan\\Kumar\\kumarsnewfiles.txt");
		   char  lengths[] = new  char[(int)f.length()];
		   System.out.println(lengths.length);
		   
		  
		
	   
		} catch (Exception e)
		{
			System.out.println("Exception occr");
		}
		
			
			
			
			
				
	}
}
