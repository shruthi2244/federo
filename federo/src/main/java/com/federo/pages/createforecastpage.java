package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;
import com.federoGenericLib.WebDriverCommonLib;

public class createforecastpage {
	@FindBy(xpath="//select[@id=\"forecastYear\"]") private WebElement fcoption;
	@FindBy(xpath="//select[@name=\"forecastQuarter\"]") private WebElement fqoption;
	@FindBy(xpath="//input[@value=\"Next\"]") private WebElement nextbtn;
	@FindBy(xpath="(//input[@value=\"Save\"])[1]") private WebElement savebtn;
	public createforecastpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	public void selectforecastoption() {
		wlib.selectoption(fcoption, 5);
		fcoption.click();
		wlib.selectoption(fcoption, 3);
		fqoption.click();
		nextbtn.click();
		savebtn.click();
	}

}
