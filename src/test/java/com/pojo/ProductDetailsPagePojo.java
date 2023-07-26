package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class ProductDetailsPagePojo extends LibGlobal
{
	public ProductDetailsPagePojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//div[text()='SAMSUNG Galaxy F23 5G (Copper Blush, 128 GB)'])[1]")
	private WebElement product;
	

	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement cart;
	
	@FindBy(xpath="(//button[text()='Change'])[2]")
	private WebElement address;
	
	@FindBy(xpath="//button[text()='Deliver Here']")
	private WebElement deliverbtn;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	private WebElement continuebtn;
	
	@FindBy(xpath="//button[text()='Accept & Continue']")
	private WebElement accptbtn;
	
	@FindBy(xpath="(//div[@class='_1XFPmK'])[5]")
	private WebElement netbnking;
	
	@FindBy(xpath="//div[text()='Remove']")
	private WebElement removebtn;
	
	@FindBy(xpath="(//div[text()='Remove'])[2]")
	private WebElement rmvebtn;
	
	@FindBy(xpath="//div[text()='Your cart is empty!']")
	private WebElement  cartempty;
	
	@FindBy(xpath="//form[@method='post']//child::button")
	private WebElement placeorder;
	
	public WebElement getAddress() {
		return address;
	}
	public WebElement getDeliverbtn() {
		return deliverbtn;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	public WebElement getAccptbtn() {
		return accptbtn;
	}
	public WebElement getNetbnking() {
		return netbnking;
	}
	public WebElement getRemovebtn() {
		return removebtn;
	}
	public WebElement getRmvebtn() {
		return rmvebtn;
	}
	public WebElement getCartempty() {
		return cartempty;
	}
	public WebElement getProduct() {
		return product;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getPlaceorder() 
	{
		return cart;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
