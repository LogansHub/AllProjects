package ed.rg.reg.ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx
{
 
	 public static void main(String[] args)
	
	 {
		
	    String s = "logan and logan and mogan and kumar and logan@!#$%" ;
	    
	    Pattern p = Pattern.compile("[^a-zA-Z]" );
	    Matcher m = p.matcher(s);
	    while(m.find())
	    {
	    System.out.println(m.group());
	  
	    }
   	 }

} 
