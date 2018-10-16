package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;

import com.app.pages.ProductPageObjects;

public class ProductPageTest {

	ProductPageObjects productpage;
	BasePage bp;
	
	public ProductPageTest(){
		productpage = new ProductPageObjects();
		bp = new BasePage();
		}
   
   @Test
   public void VerifyTweetshare(){
	    productpage.Clickproduct();
	    Assert.assertTrue(productpage.Tweet());
	    Assert.assertTrue(productpage.Share());
   }
   
   @Test
   public void Verifydescription(){
	   Assert.assertTrue(productpage.Prodescription());
	}
	


}

