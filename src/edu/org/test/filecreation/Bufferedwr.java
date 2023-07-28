package edu.org.test.filecreation;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Bufferedwr 
{

	public static void main(String[] args)
	{
		try {
		 FileWriter f = new FileWriter("C:\\Users\\LOGAN\\Desktop\\java\\Logan\\Kumar\\kumarsfiles.txt");
		 BufferedWriter br = new BufferedWriter(f);
		 br.write("Logan");
		 br.newLine();
		 br.write("kumar");
		 br.newLine();
		 br.write("mogan");
		 br.flush();
		 br.close();
		} catch (Exception e)
		{
			
		}
		
	}
}
