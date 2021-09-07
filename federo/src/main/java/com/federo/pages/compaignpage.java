package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class compaignpage {
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement cmpbtn;
	@FindBy(xpath="(//input[@name=\"chk\"])[8]") private WebElement chkbox;
	@FindBy(xpath="//input[@value=\"Create Task\"]") private WebElement ctbtn;
	public compaignpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickcompaignpage() {
		cmpbtn.click();
		chkbox.click();
		ctbtn.click();
	}
}
