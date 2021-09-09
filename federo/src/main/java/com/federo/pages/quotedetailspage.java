package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class quotedetailspage {
	@FindBy(xpath="//input[@name=\"property(Subject)\"]") private WebElement sbjname;
	@FindBy(xpath="//input[@name=\"property(Account Name)\"]") private WebElement accname;
	@FindBy(xpath="//input[@id=\"txtProduct1\"]") private WebElement pdtname;
	@FindBy(xpath="//input[@name=\"property(txtQty1)\"]") private WebElement qtname;
	@FindBy(xpath="(//input[@value=\"Save\"])[1]") private WebElement savebtn;
	public quotedetailspage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void createwithmandatorydetails(String Subject, String AccountName, String productname, String qtyname, String string) {
		sbjname.sendKeys(Subject);
		accname.sendKeys(AccountName);
		pdtname.sendKeys(productname);
		qtname.sendKeys(qtyname);
		savebtn.click();
	}
}
//input[@name="property(txtQty1)"]