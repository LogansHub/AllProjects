package org.phone;

public class PhoneInfo

{
	private void phoneName() 
	{

		System.out.println("samsung");
		
	}
	private void phoneMieiNum() 
	{

		System.out.println("111222333");
	}
	private void camera() 
	{

		 System.out.println("12 pixel");
		 
	}
	private void storage()
	{

		System.out.println("128 mb");
	}
	private void osName()
	{
	
		  System.out.println("Android 11");

	}
	public static void main(String[] args)
	{
		
		
		PhoneInfo p = new PhoneInfo();
		
		p.phoneName();
		p.phoneMieiNum();
		p.camera();
		p.storage();
		p.osName();
	}
	
	
}
