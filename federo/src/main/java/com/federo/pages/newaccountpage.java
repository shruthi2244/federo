package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class newaccountpage {
	@FindBy(xpath="//input[@value=\"New Account\"]") private WebElement acctab;
	public newaccountpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickaccnewtab() {
		acctab.click();
	}

}
