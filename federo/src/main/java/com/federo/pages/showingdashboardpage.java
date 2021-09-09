package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class showingdashboardpage {
	@FindBy(xpath="(//a[text()='Edit'])[2]") private WebElement editbtn;
	public showingdashboardpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
public void clickeditbtn() {
	editbtn.click();
}
}
