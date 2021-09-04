package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class scrollrightquotespage {
	@FindBy(xpath="//img[@id=\"scrollright\"]") private WebElement scrightbtn;
	
	public scrollrightquotespage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void scrollright() {
		for(int i=1;i<=30;i++) {
			scrightbtn.click();
			
		}
	}
}
