package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageObjects extends BasePage{

	BasePage bp = new BasePage();
	
	@FindBy(xpath = "//img[@title='Printed Chiffon Dress']")
	private WebElement Product;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-twitter']")
	private WebElement Twitter;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-facebook']")
	private WebElement Facebookshare;
	
	@FindBy (xpath = "//p[@id='product_condition']//span")
	private WebElement Productdescription;
	
	public ProductPageObjects(){
		PageFactory.initElements(driver, this);
	}
	
	public void Clickproduct(){
		Product.click();
	}
	
	public boolean Tweet(){
		bp.Explicitwait(Twitter);
		bp.iFrame(Twitter);
	 return	bp.Displaycheck(Twitter);  
	}
	
	public boolean Share(){
		bp.Explicitwait(Facebookshare);
		return bp.Displaycheck(Facebookshare);
	}
	
	public boolean Prodescription(){
		return bp.Displaycheck(Productdescription);
		}
	
	
}
