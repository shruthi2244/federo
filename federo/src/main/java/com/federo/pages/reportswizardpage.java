package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;

public class reportswizardpage extends BaseTest{
	@FindBy(xpath="//a[text()='Columns']") private WebElement clmntab;
	@FindBy(xpath="//select[@id=\"availList\"]") private WebElement optontab;
	@FindBy(xpath="//input[@value=\"Add\"]") private WebElement addtab;
	@FindBy(xpath="//input[@value=\"Run\"]") private WebElement runtab;
	public reportswizardpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	
	public void cliclreportswizardpage() throws Throwable {
		clmntab.click();
		wlib.selectoption(optontab, 3);
		addtab.click();
		runtab.click();
	FileLib flib = new FileLib();
		wlib.getwindowhandle(flib.readPropertyData(PROP_PATH,"targetwindowtitle"), addtab);
	}
}
