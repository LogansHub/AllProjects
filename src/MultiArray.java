import java.util.Scanner;

public class MultiArray 
{

	public static void main(String[] args)
	{
		
		int a[][] = new int[2][3];
		
		
		 for (int i = 0; i < a.length; i++) 
		 {
			for(int j = 0; j<a.length + 1; j++)
			{	
			
				Scanner s = new Scanner(System.in);
				System.out.println("Enter numbers for multidimesional Array");
				int intt = s.nextInt();
				a[i][j]= intt;
				
		    } 
		 
		 }
		
		 for (int i = 0; i < a.length; i++) 
		 {
			for(int j = 0; j<a.length + 1; j++)
			{	
			
				System.out.println(a[i][j]);
		 
			}}
	}
	
}
