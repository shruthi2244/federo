package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class scrollinvoice {
	@FindBy(xpath="//img[@id=\"scrollright\"]") private WebElement scrlbtn;

	public  scrollinvoice() {
		PageFactory.initElements(BaseTest.driver, this);
	}
		public void clickinvoicepage() {
			for(int i=1;i<=40;i++) {
				scrlbtn.click();
			
			}
		}
}
