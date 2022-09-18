package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class SearchHotelPojo extends LibGlobal

{

	public SearchHotelPojo()
	{
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Welcome to Adactin Group of Hotels']")
	private WebElement welecometxt;
	@FindBy(id = "location")
	private WebElement locat;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement roomty;
	@FindBy(id = "room_nos")
	private WebElement roomnu;
	@FindBy(id = "datepick_in")
	private WebElement datecheckin;
	@FindBy(id = "datepick_out")
	private WebElement datecheckout;
	@FindBy(id = "adult_room")
	private WebElement adultcount;
	@FindBy(id = "child_room")
	private WebElement childcount;
	public WebElement getWelecometxt() {
		return welecometxt;
	}
	public WebElement getLocat() {
		return locat;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomty() {
		return roomty;
	}
	public WebElement getRoomnu() {
		return roomnu;
	}
	public WebElement getDatecheckin() {
		return datecheckin;
	}
	public WebElement getDatecheckout() {
		return datecheckout;
	}
	public WebElement getAdultcount() {
		return adultcount;
	}
	public WebElement getChildcount() {
		return childcount;
	}
	public WebElement getSubmitbtn() {
		return Submitbtn;
	}
	@FindBy(id = "Submit")
	private WebElement Submitbtn;
	
	
	
}
