package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class Homepageleads{
	
	
	@FindBy(xpath="//a[text()='Leads']") private WebElement leadstab;
	public Homepageleads() {
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public void clickLeadstab() {
		leadstab.click();
	}

}
