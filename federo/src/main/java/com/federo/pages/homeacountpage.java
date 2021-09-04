package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class homeacountpage {
	@FindBy(xpath="//a[text()='Accounts']") private WebElement accounttab;
	public  homeacountpage() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public void clickaccounttab() {
		accounttab.click();
	}


}
