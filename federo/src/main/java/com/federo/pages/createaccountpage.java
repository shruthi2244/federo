package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class createaccountpage {
   @FindBy(xpath="//input[@name=\"property(Account Name)\"]") private WebElement accname;
   @FindBy(xpath="(//input[@value=\"Save\"])[1]")   private WebElement svebtn;
   public createaccountpage() {
	   PageFactory.initElements(BaseTest.driver, this);
	   
		   
	   }
   
public void createaccwithmandatorydetails(String accountname) {
	accname.sendKeys(accountname);
	svebtn.click();
      
}

}
