package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;
import com.federoGenericLib.WebDriverCommonLib;

public class createreportpage {
	@FindBy(xpath="//select[@id=\"primarymodule\"]") private WebElement reportpage;
	@FindBy(xpath="//input[@value=\"Continue\"]") private WebElement continuebtn;
	public createreportpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	WebDriverCommonLib wlib=new WebDriverCommonLib();
public void clickcraetereportpage() {
	wlib.selectoption(reportpage, 4);
	continuebtn.click();
	
}
}
