import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTwoD 
{

	public static void main(String[] args) 
	{
	
		List<LinkedList<String>> lout = new ArrayList<LinkedList<String>>();
		
		LinkedList<String> s = new LinkedList<String>();
		s.add("Hai");
		s.add("logan");
		s.add("cbe");
		
		
		LinkedList<String> s2 = new  LinkedList<String>();
		s2.add("bye");
		s2.add("yogan");
		s2.add("vellakovil");
		
		lout.add(s);
		lout.add(s2);
		
		LinkedList<String> lo = lout.get(0);
		lo.get(1);
		System.out.println(lo.get(1));
		
		
		
		
	}
	
	
	
	
}
