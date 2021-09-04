package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class homepagereports {
	@FindBy(xpath="//a[text()='Reports']") private WebElement reporttab;
	@FindBy(xpath="//input[@value=\"Create New Report\"]") private WebElement createnewreport;
	public homepagereports() {
		PageFactory.initElements(BaseTest.driver, this);
	}
   public void clickhomepagereports() {
	   reporttab.click();
	   createnewreport.click();
   }
}
