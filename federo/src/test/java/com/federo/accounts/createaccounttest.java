package com.federo.accounts;

import org.testng.annotations.Test;
import com.federo.pages.LoginPage;
import com.federo.pages.createaccountpage;
import com.federo.pages.homepage;
import com.federo.pages.newaccountpage;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;


public class createaccounttest extends BaseTest {
	@Test
	public void accounttest() throws Throwable {
	//BaseTest bt = new BaseTest();
	FileLib flib=new FileLib();
	//bt.openBrowser();
	LoginPage lp=new LoginPage();
	lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	WebDriverCommonLib wlib =new WebDriverCommonLib();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Home Page");
	homepage ha=new homepage();
	ha.clickaccounttab();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customviewtitle"), "custom view title page");
	newaccountpage ac=new newaccountpage();
	ac.clickaccnewtab();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "createaccount"),"create account page");
	createaccountpage ca=new createaccountpage();
	ca.createaccwithmandatorydetails(flib.readExcelData(EXCEL_PATH6, "accounts" , 1, 0));
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "create account"), "create account page");
			
	
}
}