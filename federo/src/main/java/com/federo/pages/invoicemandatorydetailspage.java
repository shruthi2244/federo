package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class invoicemandatorydetailspage {
	@FindBy(xpath="//input[@id=\"customviewname\"]") private WebElement viewnametb;
	public  invoicemandatorydetailspage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void clickcreatemandatorydetails(String customname) {
		
		viewnametb.sendKeys(customname);
		
		
	}

}
