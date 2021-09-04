package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class finishdashboardpage {
	@FindBy(xpath="//input[@value=\"Finish\"]") private WebElement finishbtn;
	public finishdashboardpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickfinishbtn() {
		finishbtn.click();
	}
}
