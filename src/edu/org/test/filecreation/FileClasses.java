package edu.org.test.filecreation;

import java.io.File;

public class FileClasses 
{
	public static void main(String[] args) 
	{
		
	

	 File f = new File("C:\\Users\\LOGAN\\Desktop\\java\\selenium");
	
	f.mkdirs();
	File f2 = new File("C:\\Users\\LOGAN\\Desktop\\java\\selenium\\chrome.Xlsx");
	try
	{
	f2.createNewFile();
	}catch (Exception e)
	{
		
	}
	
	File f3 = new File("C:\\Users\\LOGAN\\Desktop\\java\\selenium\\firefox.Xlsx");
	f2.renameTo(f3);  
	
		
	
	
     System.out.println(f3.canExecute());
     System.out.println(f3.canRead());
     System.out.println(f3.canWrite());
	
	
	
	}
}
