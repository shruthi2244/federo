package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class forecastpage {
	@FindBy(xpath="//a[text()='Forecasts']") private WebElement forecasttab;
	@FindBy(xpath="//input[@value=\"New Forecast\"]") private WebElement newforecastbtn;
	
	public forecastpage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickforecast() {
		forecasttab.click();
		newforecastbtn.click();
	}
}
