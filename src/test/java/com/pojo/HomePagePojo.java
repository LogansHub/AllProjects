package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class HomePagePojo extends LibGlobal
{
     
	public HomePagePojo()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='_3704LK']")
	private WebElement search;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbutton;
	public WebElement getSearch()
	{
		return search;
	}
	public WebElement getSearchbutton()
	{
		return searchbutton;
	}
	
}
