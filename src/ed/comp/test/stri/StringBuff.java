package ed.comp.test.stri;

public class StringBuff
{

	public static void main(String[] args)
	{
		
	
	StringBuffer s = new StringBuffer("Hai");
	System.out.println(s);
	s.hashCode();
	System.out.println(s.hashCode());
	s.append("Logan");
	System.out.println(s);
	s.hashCode();
	System.out.println(s.hashCode());
	s.insert(0, "Hey");
	System.out.println(s);
	s.delete(0, 3);
	System.out.println(s);
	s.replace(0, 2, "hey");
	System.out.println(s);
	
	s.length();
	System.out.println(s);
	
	int in = s.indexOf("L");
	System.out.println(in);
	
	
	
	
}}
