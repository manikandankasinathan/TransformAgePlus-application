package com.taplus.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.taplus.qa.base.TestBase;
import com.taplus.qa.pages.HomePage;
import com.taplus.qa.pages.PassionPage;

public class HomePageTest extends TestBase{
	HomePage homepage;
	PassionPage passionpage;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup() {
		initilization();
		
	}
	@Test
	public void titleofpage()
	{
		String title=homepage.homepagetitle();
		System.out.println(title);
	}
	
	/*
	 * @Test public void homepageclick() { passionpage=homepage.onstartclick();
	 * 
	 * }
	 */
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
