package com.federo.leads;

import org.testng.annotations.Test;
import com.federo.pages.LoginPage;
import com.federo.pages.createleadpage;
import com.federo.pages.customviewpage;
import com.federo.pages.homepage;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;

public class createleadtest extends BaseTest {
	@Test 
	public void leadtest() throws Throwable {
	
	//BaseTest bt = new BaseTest();
	FileLib flib=new FileLib();
	//bt.openBrowser();
	LoginPage lp=new LoginPage();
	lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	WebDriverCommonLib wlib =new WebDriverCommonLib();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Home Page");
	homepage hp=new homepage();
	hp.clickleads();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customviewtitle"), "custom view page");
	customviewpage cv=new customviewpage();
	cv.clickleadstab();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "createleadtitle"), "create lead page");
	createleadpage cl=new createleadpage();
	     cl.createleadwithmandatorydetails(flib.readExcelData(EXCEL_PATH3, "Sheet1", 0, 1),
			flib.readExcelData(EXCEL_PATH3, "Sheet1", 1,1));
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "leaddetailstitle"), "lead deatils page");
	}

}
