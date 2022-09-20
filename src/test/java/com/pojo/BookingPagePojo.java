package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class BookingPagePojo extends LibGlobal
{

	public BookingPagePojo()
	{
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement bookpagetxt;
	@FindBy(id="first_name")
	private WebElement firstnme;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(xpath = "//textarea[@rows='4']")
	private WebElement adress;
	@FindBy(id = "cc_num")
	private WebElement creditcarddetails;
	@FindBy(id = "cc_type")
	private WebElement cctype;
	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvnum;
	@FindBy(id = "book_now")
	private WebElement bookbtn;
	public WebElement getBookpagetxt() {
		return bookpagetxt;
	}
	public WebElement getFirstnme() {
		return firstnme;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAdress() {
		return adress;
	}
	public WebElement getCreditcarddetails() {
		return creditcarddetails;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvvnum() {
		return cvvnum;
	}
	public WebElement getBookbtn() {
		return bookbtn;
	}
	public WebElement getOrdernum() {
		return ordernum;
	}
	@FindBy(id = "order_no")
	private WebElement ordernum;
	
	
	
	
	
	
	
	
}
