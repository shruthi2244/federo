package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;
import com.federoGenericLib.WebDriverCommonLib;


public class homehomepage {
	@FindBy(xpath="(//input[@name=\"chk\"])[15]")  private WebElement chkbox;
	@FindBy(xpath="//a[text()='Todays Sales']") private WebElement tsbtn;
	
 public homehomepage() {
	 PageFactory.initElements(BaseTest.driver, this);
 }
 	public void clickradiobtn() {
 		chkbox.click();
 	}
 	WebDriverCommonLib wlib=new WebDriverCommonLib();
 	public void clicktodaysales() {
 		wlib.scrolldown(tsbtn);
 		tsbtn.click();
 	}
}
