import java.util.Scanner;

public class SingleArray
{
 
	 public static void main(String[] args)
	   {
		
		 int a[] = new int[5];
		 
		 for(int i = 0; i<a.length; i++)
		 {		 
		 
			 Scanner s = new Scanner(System.in);
			 System.out.println("Enter the array values");
			 int intt = s.nextInt();
			 a[i] = intt;
			
		 }
		 
		   
		  
		 for(int i = 0; i<a.length; i++)
		 {
			 
			 System.out.println(a[i]);
		 }}}
	
		 
	   


