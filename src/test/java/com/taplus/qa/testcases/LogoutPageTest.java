package com.taplus.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.taplus.qa.base.TestBase;
import com.taplus.qa.pages.HomePage;
import com.taplus.qa.pages.Logout;
import com.taplus.qa.pages.PassionPage;

public class LogoutPageTest extends TestBase {
	HomePage homepage = new HomePage();
	PassionPage passionpage = new PassionPage();
	Logout logoutpage = new Logout();
	
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
	  
	  }
	 

	@Test
	public void logoutusericon() {
		logoutpage=new Logout();
		 logoutpage.headicon(); 
		 logoutpage.clogoutbtn();
		
		
	}

	
	/* @AfterClass public void teardown() { driver.quit(); } */
	 

}


