package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class invoicepage {
	
	@FindBy(xpath="//a[text()='Invoices']") private WebElement invoicebtn;
	public  invoicepage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
		public void clickinvoicepage() {
				invoicebtn.click();
			}
		}


