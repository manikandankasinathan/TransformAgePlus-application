package com.taplus.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.taplus.qa.base.TestBase;
import com.taplus.qa.pages.HomePage;
import com.taplus.qa.pages.PassionPage;

public class HomePageTest extends TestBase {
	HomePage homepage;
	PassionPage passionpage;

	/*
	 * public HomePageTest() { super(); }
	 */

	@BeforeClass
	public void setup() {
		initilization();
		/*
		 * homepage = new HomePage(); passionpage = new PassionPage();
		 */

	}

	@Test
	public void titleofpage() {
		String title = homepage.homepagetitle();
		System.out.println(title);
	}

	@Test
	public void starthere() {
		homepage = new HomePage();
		passionpage = homepage.onstartclick();
	}

	
	
	/* @AfterClass public void teardown() { driver.quit(); } */
	 
  
  
  }
 
