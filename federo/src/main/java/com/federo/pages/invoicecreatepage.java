package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;
import com.federoGenericLib.WebDriverCommonLib;

public class invoicecreatepage {
	@FindBy(xpath="//select[@name=\"cvid\"]") private WebElement slctname;
	@FindBy(xpath="//a[text()='Create View']") private WebElement createbtn;
	@FindBy(xpath="//input[@id=\"customviewname\"]") private WebElement viewnametb;
	public invoicecreatepage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	public void clickcreate() {
		wlib.selectoption(slctname, 1);
		slctname.click();
		createbtn.click();
		
		
		
	}
}
