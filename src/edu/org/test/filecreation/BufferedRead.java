package edu.org.test.filecreation;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedRead
{

	public static void main(String[] args)
	{
	 String readLines ;
	 
	
		
		try {
		FileReader f = new FileReader("C:\\Users\\LOGAN\\Desktop\\java\\Logan\\Kumar\\kumarsfiles.txt");
		BufferedReader br = new BufferedReader(f);
		
		readLines = br.readLine();
		int i = 0;
		do
		{
			i++;
			System.out.println(readLines);
			readLines = br.readLine();
		}while( readLines!= null);
		System.out.println(i);
		
		}catch (Exception e)
		{
			
		}
		
	}
}
