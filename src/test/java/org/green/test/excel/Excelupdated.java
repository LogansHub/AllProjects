package org.green.test.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelupdated
{

	public static void main(String[] args) throws IOException 
	{
	
	
		FileInputStream in = new FileInputStream("C:\\Users\\LOGAN\\eclipse-workspace\\MavenProjects\\TestData\\TestDataupdated.xlsx");
		Workbook wb = new XSSFWorkbook(in);
		Sheet s = wb.getSheet("TestDataupdated");
		
		
		for (int i = 0; i<s.getPhysicalNumberOfRows(); i++)
		{
		      Row r = s.getRow(i);
			
			for (int j = 0; j<r.getPhysicalNumberOfCells(); j++)
			{
			
				Cell c = r.getCell(j);
				 int cellType = c.getCellType();
				// System.out.println(cellType);
				  if(cellType==1)
				  {
					  String stringCellValue = c.getStringCellValue();
					  System.out.println(stringCellValue);
				  }
				   else if(cellType == 0)
				   {
					   if(DateUtil.isCellDateFormatted(c))
					   {
						   Date dt = c.getDateCellValue();
						   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						    String string = sdf.format(dt);
						    System.out.println(string);
					   }
					   else
					   {
						    double  d = c.getNumericCellValue();
						    //System.out.println(d);
						    long l = (long)d;
						    String val = String.valueOf(l);
                            System.out.println(val);						    
					   }
						   
						   
					   
					    
					   
					    
					
			    	}
				  
			}
			
		}
		
		
		
		
		
	}
}
