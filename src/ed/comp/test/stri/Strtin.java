package ed.comp.test.stri;

public class Strtin {

	public static void main(String[] args) {
	
		String str = "LOGAN KUMAR";
		String str2 =   "logan kumar";
		
		int L = str.length();
		System.out.println(L);
		boolean b = str.isEmpty();
		System.out.println(b);
		
		char ch = str.charAt(5);
		System.out.println(ch);
		
          int che = str.indexOf('A');
         System.out.println(che);
         
         int intt = str.indexOf('z');
         
         System.out.println(intt);
         
         int la = str.lastIndexOf('A');
         System.out.println(la);
         
          String lowerCas = str.toLowerCase();
          System.out.println(lowerCas);
	
	      String small = "logan kumar";
	      System.out.println(small.toUpperCase());
	      
	      boolean isit = str.startsWith("LOG");
	      System.out.println(isit);
	      
	      boolean issitt = str.endsWith("MAR");
	      System.out.println(issitt);
	      
	      boolean containn = str.contains("GAN");
	      System.out.println(containn);
	      
	      String replacee = str.replace('A', '*');
	      System.out.println(replacee); 
	      
	      String  strr = str.replaceAll(str, "logan kumar");
	      System.out.println(strr);
	      
	      boolean equalss = str.equals(strr);
	      System.out.println(equalss);
	      
	      boolean equalsIgnoreCase = str.equalsIgnoreCase(str2);
	      System.out.println(equalsIgnoreCase);
	      
	      String substrings = str.substring(3);
	      System.out.println(substrings);
	      
	      String substringss = str.substring(3, 5);
	      System.out.println(substringss);
	      
	      int hashCodes = str.hashCode();
	      System.out.println(hashCodes);
}}
