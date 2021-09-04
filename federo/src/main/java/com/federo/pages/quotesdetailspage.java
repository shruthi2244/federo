package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class quotesdetailspage {
	@FindBy(xpath="//a[text()='Quotes']") private WebElement qtsbtn;
	public quotesdetailspage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void quotesdetails() {
			qtsbtn.click();

}
}