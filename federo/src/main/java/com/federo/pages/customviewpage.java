package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class customviewpage {
	@FindBy(xpath="//input[@value=\"New Lead\"]") private WebElement leadstab;
	public customviewpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
public void clickleadstab() {
	leadstab.click();
}
}
