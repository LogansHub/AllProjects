import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Maptwod

{
 
	public static void main(String[] args) 
	{
	
		List<LinkedHashMap<String,String>> li = new ArrayList<LinkedHashMap<String,String>>();
		
		LinkedHashMap<String,String> ls = new LinkedHashMap<>();
		ls.put("Course", "java");
		ls.put("name", "logan");
		
		LinkedHashMap<String,String> ls2 = new LinkedHashMap<>();
		ls2.put("Course", "python");
		ls2.put("name", "kumar"); 
		
		
		li.add(ls);
		li.add(ls2);
		
		LinkedHashMap<String,String> linkedHashMap = li.get(1);
		String string = linkedHashMap.get("name");
		System.out.println(string);
		
		
		
		
		
		
	}
	
	
	
}
