package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;
import com.federoGenericLib.WebDriverCommonLib;

public class selectdashboardpage {
	@FindBy(xpath="(//select[@class=\"select\"])[3]") private WebElement selectbtn;
	@FindBy(xpath="//input[@value=\"Next\"]") private WebElement nextbtn;
	public selectdashboardpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	public void selectpage() {
		wlib.selectoption(selectbtn, 7);
		selectbtn.click();
		nextbtn.click();
		
	}

}
