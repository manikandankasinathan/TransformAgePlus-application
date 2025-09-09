package com.taplus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.taplus.qa.actiondriver.Action;
import com.taplus.qa.base.TestBase;

public class PassionPage extends TestBase {
	Action action = new Action();
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-d6w9um']")
	WebElement Pheader;
	@FindBy(xpath = "//*[@id='driver-popover-content']//button")
	WebElement closepopup;
	@FindBy(xpath="//*[@id='driver-popover-content']/footer/span[2]/button[2]")
	WebElement nextbtn;
	
	@FindBy(xpath="//*[@id='game']//div[@id='overlay']")
	WebElement intCarddeck;
	
	
	
	public PassionPage() {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public void nextbtn() { action.click(driver, nextbtn); }
	 */

	
	  public void closebutton() {
	  
		action.explicitWait(driver, closepopup, 10);
		closepopup.click();
	  
	  
	  }
	
	public void pageHeader() {
		boolean head = action.isDisplayed(driver, Pheader);
		System.out.println(head);
	}
	public void interestcarddeck() {
		action.explicitWait(driver, intCarddeck, 10);
		action.click(driver, intCarddeck);
	}

}
