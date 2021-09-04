package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class savereportpage {
	@FindBy(xpath="//input[@name=\"reportName\"]") private WebElement svrppage;
	public savereportpage() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}
public void clicksavereportpage( String reportname) {
	svrppage.sendKeys(reportname);
}
}
