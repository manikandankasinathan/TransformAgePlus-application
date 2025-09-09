package com.taplus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.taplus.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//p[@id='Purpose' and text()='Start Here']/parent::div/parent::div/parent::button")
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
		/*
		 * Actions act = new Actions(driver); act.moveToElement(startherecard).click();
		 */
    	startherecard.click();
		return new PassionPage();
	}

}
