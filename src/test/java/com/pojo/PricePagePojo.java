package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class PricePagePojo extends LibGlobal
{
    public PricePagePojo()
		{
			 PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement pricetxt ;
	@FindBy(id = "radiobutton_0")
	private WebElement radiobtn ;
	@FindBy(id = "continue")
	private WebElement ctnuebtn ;
	public WebElement getPricetxt() {
		return pricetxt;
	}
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getCtnuebtn() {
		return ctnuebtn;
	}
	
	
	
	
	
	
	
	
	
}
