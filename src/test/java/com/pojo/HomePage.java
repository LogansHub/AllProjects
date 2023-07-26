package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class HomePage extends LibGlobal
{

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//*[text()='Welcome LOGAN'])[2]")
	private WebElement welcome;
	public WebElement getWelcome() 
	{
		return welcome;
	}
	@FindBy(xpath="(//*[@class='headerSearch_spyglass '])[1]")
	private WebElement searchbtn;
	public WebElement getSearchbtn() 
	{
		return searchbtn;
	}
	
	@FindBy(xpath="//*[@aria-label='More Filters']")
	private WebElement filter;
	public WebElement getFilter() {
		return filter;
	}
	
	@FindBy(id="header-search-input")
	private WebElement searchbox;
	public WebElement getSearchbox()
	{
		return searchbox;
	}
	@FindBy(xpath="//*[@class='responsiveEmptySearchResult_listItem']")
	private WebElement Errormsg;
	public WebElement getErrormsg() 
	{
		return Errormsg;
	}
	@FindBy(xpath="//*[text()='Search Suggestions']")
	private WebElement Suggestionbox;
	public WebElement getSuggestionbox() 
	{
		return Suggestionbox;
	}
   @FindBy(id="header-search-input")
   private WebElement searchboxagain;
   public WebElement getSearchboxagain() 
   {
	return searchboxagain;
   }
   @FindBy(xpath="(//*[@class='productBlock_image'])[1]")
	private WebElement imgclick;
    public WebElement getImgclick() {
	return imgclick;
    }
	@FindBy(xpath="(//*[@class='productBlock_image'])[1]")
	private WebElement description;
	public WebElement getDescription() {
		return description;
	}
	@FindBy(xpath="(//*[@type='button'])[16]")
	private WebElement sizeclick;
	
	@FindBy(xpath="//*[@aria-label='Add to Bag']")
	private WebElement addbag;
	
	@FindBy(xpath="//*[@class=\"athenaAddedToBasketModal_viewBasketButton js-e2e-quickView-basket\"]")
	private WebElement viewbasket;

	@FindBy(xpath="(//*[@type=\"submit\"])[2]")
	private WebElement checkout;
	public WebElement getSizeclick() 
	{
		return sizeclick;
	}

	public WebElement getAddbag() {
		return addbag;
	}

	public WebElement getViewbasket() {
		return viewbasket;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	
}
   
			

	
	
	
	
	
	
	

