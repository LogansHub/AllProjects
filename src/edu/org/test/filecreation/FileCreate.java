package edu.org.test.filecreation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCreate
{
     public static void main(String[] args) {
		
	
	 File f1 = new File("C:\\Users\\LOGAN\\Desktop\\java");
	 boolean exists = f1.exists();
	
       f1.mkdir();
	  
	
	 File f2 = new File("C:\\Users\\LOGAN\\Desktop\\java\\Logan\\Kumar");
	 f2.mkdirs();
	
	 File f3 = new File("C:\\Users\\LOGAN\\Desktop\\java\\Logan\\Kumar\\kumarsfiles.txt");
	try {
	 f3.createNewFile();
	}catch (Exception e)
	{ 
		e.printStackTrace();
	} 
    	
    	 File f4 = new File("C:\\Users\\LOGAN\\Desktop\\java\\Logan\\Kumar\\kumarsnewfiles.txt");
    	 f3.renameTo(f4);
    	 
    	 String name = f4.getName();
    	 System.out.println(name);
	          System.out.println( f4.canExecute());
              System.out.println( f4.canRead());
              System.out.println(f4.canWrite());
              
         	 File f5 = new File("C:\\Users\\LOGAN\\Desktop");
         	  File[] strlists = f5.listFiles();
         	 for (File filess : strlists) 
         	 {
				
         		 if(filess.isFile())
         		 {
         			 String name2 = filess.getName();
         			 int lastIndexOf = name2.lastIndexOf(".");
         			  String substrings = name2.substring(lastIndexOf + 1);  
         			
         			  if(substrings.equals("pdf"))
         			  {
         				 
         				  System.out.println(name2);
         			
         			  }}
         			  
         			  
         			  
         			  
         		 try {
         		FileWriter fw = new  FileWriter("C:\\Users\\LOGAN\\Desktop\\java\\Logan\\Kumar\\kumarsnewfiles.txt");
         		 fw.write("Logan kumar ");
         		 fw.flush();
         		 fw.close();
         		 } catch (Exception e)
         		 {
         			 
         		 }
         		
			}
         	 
         	 
     }
}

    		
