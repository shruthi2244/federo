package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class createquotepage {
	@FindBy(xpath="//input[@value=\"New Quote\"]") private WebElement newquotetab;
	public createquotepage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
public void clicknewquote() {
	newquotetab.click();
}
}
