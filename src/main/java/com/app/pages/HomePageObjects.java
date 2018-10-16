package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageObjects extends BasePage{

	BasePage bp = new BasePage();
	
	     //* Verify Menu WDT Tabs *//
	
    @FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[1]/a[@title='Women']")
    private WebElement Women;
	


    @FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[2]/a[@title='Dresses']")
	private WebElement Dress;
	
    
    
	@FindBy(xpath = "//ul[contains(@class,'menu-content')]/li[3]/a[@title='T-shirts']")
	private WebElement Tshirt;
	

	public boolean verifyMenuTab()
	{
		return (Displaycheck(Women) && Displaycheck(Dress)  && Displaycheck(Tshirt));
	}
	
	//* Page Navigation *//
	
    public HomePageObjects() {
		PageFactory.initElements(driver, this);
}
	
	public void Clickwomen(){
	   Women.click();
   }
   
   public void Clickdress()
	{
		Dress.click();
	}   
   
   public void Clicktshirt(){
	   
	  Tshirt.click(); 
   }
   
       //* Verify valid email in Newsletter *//
   
   @FindBy(xpath = "//input[@id='newsletter-input']")
   private WebElement Subscribemail;
   
   @FindBy(xpath = "//button[@name='submitNewsletter']")
   private WebElement Submitbutton;
   
   @FindBy(xpath = "//p[@class='alert alert-success']")
   private WebElement Mailalert;
   
   public void Newslettermail(String email){
		 
		 setText (Subscribemail, email);
		  Submitbutton.click();
		  }
   
  public boolean Successalert(){
	   
	   return (Displaycheck(Mailalert));
   }
	
	
   
   
	
	
	
	
	
	
	
	
	
	
}