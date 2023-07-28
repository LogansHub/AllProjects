package org.green.test.allanotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasses
{
     static WebDriver driver; 
	public static WebDriver lauchbrowser() 
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
        return driver;
	}
	
	public void loadurl(String url) 
	{
	    driver.get(url);
    }
	public String currentPageUrl() 
	{
		String currentUrl = driver.getCurrentUrl();
        return  currentUrl;
	}
	
	public String currentPageTitle()
	{
	     String title = driver.getTitle();
	     return title;

	}
	public void waitingTime() 
	{
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	public void SendValues(WebElement element,String value)
	{
	    element.sendKeys(value);

	}
	public void button(WebElement btn) 
	{
		btn.click();
       
	}
	
	public void closeBrowser() 
	{
	  	driver.close();

	}
	
	public  String getExcelData(String loc ,String sheetname, int rownum , int cellnum) throws IOException 
	{
		 String value=null;
	     
		File f = new File(loc);
		FileInputStream fin = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fin);
        Sheet sheet = wb.getSheet(sheetname);
        Row row = sheet.getRow(rownum);
        Cell cell = row.getCell(cellnum);
        int cellType = cell.getCellType();
        if(cellType==1)
        {
        	  value = cell.getStringCellValue();
        }
		if(cellType==0)
		{
			if(DateUtil.isCellDateFormatted(cell))
			{
				 Date dateCellValue = cell.getDateCellValue();
				 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/year");
				 value = sdf.format(sdf);
			}
			else
			{
				double numericCellValue = cell.getNumericCellValue();
				long l =(long)numericCellValue;
				 value = String.valueOf(l);
			}
		}
		return value;
		
	}}		
		
		
		
		
	
	
	
	
	
	
	

