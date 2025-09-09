package com.taplus.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.taplus.qa.actiondriver.Action;
import com.taplus.qa.base.TestBase;
import com.taplus.qa.pages.HomePage;
import com.taplus.qa.pages.PassionPage;

public class PassionPageTest extends TestBase {

	HomePage homepage = new HomePage();
	PassionPage passionpage = new PassionPage();
	
	@BeforeClass
	public void setup() {
		initilization();
		  homepage = new HomePage();
		  homepage.onstartclick();	
	}

	 @Test
	  public void closeXbutton() {
	 passionpage= new PassionPage();
	  passionpage.closebutton();
		 passionpage.pageHeader();
		 passionpage.interestcarddeck(); 
	  
	  }
	/*
	 * @Test public void headerofpage() { passionpage.pageHeader();
	 * 
	 * 
	 * }
	 * 
	 * @Test public void clickintercarddeck() { passionpage.interestcarddeck(); }
	 */
	 
	/*
	 * @Test public void clicknextbtn() { passionpage.nextbtn(); }
	 */


	
	/* @AfterClass public void teardown() { driver.quit(); } */
	 

}
