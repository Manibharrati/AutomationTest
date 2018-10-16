package com.app.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.HomePageObjects;
import com.app.pages.BasePage;
import com.app.pages.DressPageObjects;

public class DressPageTests {
	
 
   DressPageObjects dresspage;
   BasePage bp;
   HomePageObjects homepage;
   
   public DressPageTests(){
	   dresspage = new DressPageObjects();
       bp = new BasePage();
       homepage = new HomePageObjects();
   }
  /* @BeforeMethod
   public void beforeMethod(){
	   homepage.Clickdress();
	   System.out.println("Before method from all test");
   } */
   
  /* @AfterClass
   public void afterClass(){
	   bp.quitDriver();
	   System.out.println("Browser closed");
   }*/
   
  @Test
   public void VerifySMLtab(){
	  // homepage.Clickdress();
	   Assert.assertTrue(dresspage.Verifylargetab(), "Failed");
	   Assert.assertTrue(dresspage.Verifymediumtab(), "Failed");
	   Assert.assertTrue(dresspage.Verifysmalltab(), "Failed");
   }
  
   @Test
   public void VerifyProductcount(){
 	 //  homepage.Clickdress();
	 Assert.assertEquals(dresspage.getHeaderproductcount(),dresspage.getTotalproductcount(), "Failed: Count mismatched");
   } 

  @Test
  public void VerifyAddtocart(){
	//  homepage.Clickdress();
	  Assert.assertTrue(dresspage.Addtocart(),"Failed");
	  dresspage.Clickclose();
	  
  }
  @Test
   public void VerifyProductPrices(){
	 // homepage.Clickdress();
	  dresspage.Selectdropdown("price:asc");
	  List<Double> productPrices = dresspage.getProductPrices();
	  for(int i=0; i<productPrices.size()-1; i++ ){
		  Double first = productPrices.get(i);
		  Double second = productPrices.get(i+1);
	  Assert.assertTrue(first<second, "Failed :Its not in ascending order" );
	  
	  }
	} 
   @Test
   public void VerifyProductName(){
	   homepage.Clickdress();
	   dresspage.Selectdropdown("name:asc");
       List<String> productName = dresspage.getProductname();
       for(int i=0; i<productName.size()-1; i++){
    	   String first = productName.get(i);
    	   String second = productName.get(i+1);
    Assert.assertTrue(first.compareTo(second)<=0, "Failed :Its not in ascending order" );
    
     }
   }

   @Test
   public void VerifyDiscountamount(){
	   dresspage.checkDiscount();
	
   }

   



}  
   
   

