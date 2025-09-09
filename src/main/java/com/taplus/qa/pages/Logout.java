package com.taplus.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.taplus.qa.actiondriver.Action;
import com.taplus.qa.base.TestBase;

public class Logout extends TestBase{
	Action action= new Action();
	@FindBy(xpath="//button[@aria-controls='menu-appbar']")
	WebElement usericon;
	
	@FindBy(xpath="//*[@id='menu-appbar']/div[3]/ul/li[2]")
	WebElement logout;
	
	public Logout()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void headicon()
	{
		action.explicitWait(driver, usericon, 10);
		/* usericon.click(); */
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", usericon);
	}
	public void clogoutbtn()
	{
		  action.explicitWait(driver, usericon, 10);
		 
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logout);
		/* logout.click(); */
	}

}
