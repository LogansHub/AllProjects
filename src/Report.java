

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report
{
   public static void getGenratedReport(String jsonFile) 
   {
  
	   File f = new File(System.getProperty("user.dir") + "\\target");
	   Configuration c = new Configuration(f,"clientname");
	   c.addClassifications("platform", "windows");
	   c.addClassifications("platformversion", "10.N");
	   c.addClassifications("Buildnumber", "1234567");
	   c.addClassifications("Sprint", "one");
	   List<String> jsonFiles = new ArrayList<String>();
	   jsonFiles.add(jsonFile);
	   
	   ReportBuilder rp = new ReportBuilder(jsonFiles, c);
        rp.generateReports();
        
   }
	
}
