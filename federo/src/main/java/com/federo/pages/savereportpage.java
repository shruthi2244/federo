package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;



public class savereportpage {
	@FindBy(xpath="//input[@name=\"reportName\"]") private WebElement svrppage;
	@FindBy(xpath="//input[@name=\"Button\"]") private WebElement svebtn;
	
	public savereportpage() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}
public void clicksavereportpage(String reponm) throws Throwable {
	
	svrppage.sendKeys(reponm);
	svebtn.click();
	
}
}
