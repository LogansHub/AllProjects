package org.lang;

public class StateDetails 
{
	
	private void southIndia() 
	{

		System.out.println("yes i am from south");
	}
	private void northIndia()
	{
		System.out.println("yes i am from north");

	}
	public static void main(String[] args)
	{
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
		LanguageInfo L = new LanguageInfo();
		L.tamilLanguage();
		L.englishLanguage();
		L.hindiLanguage(); }}
			
	
	


