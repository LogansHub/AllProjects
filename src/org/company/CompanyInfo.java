package org.company;

public class CompanyInfo 
{
	private void companyName()
	{
		
		System.out.println("GreensTechnology");
		
	}
	private void companyId() 
	{
		System.out.println("12345");
		
	}
	private void companyAddress()
	{
		
		System.out.println("Thooraipakam");

	}
	public static void main(String[] args)
	{
		
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
		
	}
	
}
