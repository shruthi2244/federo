package com.federo.quotes;

import org.testng.annotations.Test;

import com.federo.pages.LoginPage;
import com.federo.pages.createquotepage;
import com.federo.pages.homepage;
import com.federo.pages.quotedetailspage;
import com.federo.pages.scrollrightquotespage;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;

public class createquotestest extends BaseTest {
	@Test
	public void quotetest() throws Throwable {
	BaseTest bt = new BaseTest();
	FileLib flib=new FileLib();
	bt.openBrowser();
	LoginPage lp=new LoginPage();
	lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
	WebDriverCommonLib wlib =new WebDriverCommonLib();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "hometitle"), "Home Page");
	scrollrightquotespage scr=new scrollrightquotespage();
	scr.scrollright();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "hometitle"), "home page");
	homepage hp=new homepage();
	hp.clickqtsbtn();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "createquote"), "create quote page");
	createquotepage cp=new createquotepage();
	cp.clicknewquote();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "createquote"), "create quote page");
	quotedetailspage qtp=new quotedetailspage();
	qtp.createwithmandatorydetails(flib.readExcelData(EXCEL_PATH, "quotes", 1, 0),
			flib.readExcelData(EXCEL_PATH, "quotes", 1, 1),flib.readExcelData(EXCEL_PATH, "quotes", 1, 2),
			"3","43000");
	
}
}