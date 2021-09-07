package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;
import com.federoGenericLib.WebDriverCommonLib;

public class compaigntaskpage {
	@FindBy(xpath="//input[@name=\"property(subject)\"]") private WebElement sbtxtbox;
	//@FindBy(xpath="//img[@src=\"/crm/images/cal.gif\"]") private WebElement calbtn;
	@FindBy(xpath="(//select[@class=\"select\"])[4]") private WebElement statustb;
	@FindBy(xpath="//select[@name=\"property(priority)\"]") private WebElement pttb;
	@FindBy(xpath="//input[@value=\"Save\"]") private WebElement svbtn;
	public compaigntaskpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	public void clicktaskpage(String subjectname) {
		sbtxtbox.sendKeys(subjectname);
		//calbtn.click();
		wlib.selectoption(statustb, 1);
		statustb.click();
		wlib.selectoption(pttb, 3);
		pttb.click();
		svbtn.click();
	}
}
