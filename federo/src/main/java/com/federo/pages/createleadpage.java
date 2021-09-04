package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class createleadpage {
	@FindBy(xpath="//input[@name=\"property(Company)\"]") private WebElement cmpnytb;
	@FindBy(xpath="//input[@name=\"property(Last Name)\"]") private WebElement lsttb;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement svebtn;
	public createleadpage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void createleadwithmandatorydetails(String companyName, String ln) {
		cmpnytb.sendKeys(companyName);
		lsttb.sendKeys(ln);
		svebtn.click();
	}

}
