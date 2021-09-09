package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class compaignpage {
	@FindBy(xpath="(//input[@name=\"chk\"])[8]")  private WebElement chkbtn;
	@FindBy(xpath="//input[@value=\"Create Task\"]") private WebElement ctbtn;
	public compaignpage() {
		PageFactory.initElements(BaseTest.driver, this);
	
	}
	public void clickcompage() {
		chkbtn.click();
		ctbtn.click();
		
		
	}
}
