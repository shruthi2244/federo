package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class dashboardpage {
	@FindBy(xpath="//a[text()='Dashboards']") private WebElement dashbtn;
	public dashboardpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickdashboardpage() {
		dashbtn.click();
	}
}
