package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;



public class LoginPage {
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath="//input[@title=\"Sign In\"]") private WebElement loginBtn;
 public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	
	}
 	public void loginToApp(String un, String pwd)
 	{
	untb.sendKeys(un);
	pwtb.sendKeys(pwd);
	loginBtn.click();
 	}

}
