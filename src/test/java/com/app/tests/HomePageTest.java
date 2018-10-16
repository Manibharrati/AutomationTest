package com.app.tests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.DressPageObjects;
import com.app.pages.HomePageObjects;

public class HomePageTest {
	HomePageObjects homepage;
	BasePage bp;
	DressPageObjects dresspage;

	public HomePageTest() {
		homepage = new HomePageObjects();
		bp = new BasePage();
		dresspage = new DressPageObjects();
	}

	@Test
	public void VerifyMenuWDT() {

		Assert.assertTrue(homepage.verifyMenuTab());
	}

	@Test
	public void VerifyPageNavigation() {
		homepage.Clickdress();
		Assert.assertEquals(dresspage.getTitle(), "DRESSES ");
		homepage.Clicktshirt();
		Assert.assertEquals(dresspage.getTitle(), "T-SHIRTS ");
		homepage.Clickwomen();
		Assert.assertEquals(dresspage.getTitle(), "WOMEN ");

	}

	@Test
	public void VerifyNewsletter() {
		int value = new Random().nextInt(50000);
		String email = "Bharrati" + value + "@gmail.com";
		homepage.Newslettermail(email);
		Assert.assertTrue(homepage.Successalert());
	}

}
