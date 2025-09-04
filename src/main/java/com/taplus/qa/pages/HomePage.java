package com.taplus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.taplus.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//p[ @id='Purpose' and text()='Start Here']/parent::div")
	WebElement startherecard;
	
	 public HomePage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	public static String homepagetitle()
	{
		return driver.getTitle();
	}
	public PassionPage onstartclick()
	{
		startherecard.click();
		return new PassionPage();
	}

}
