package com.federo.home;

import org.testng.annotations.Test;

import com.federo.pages.LoginPage;
import com.federo.pages.homehomepage;
import com.federo.pages.homepage;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;

public class hometest extends BaseTest{
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
		ha.clickhometab();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homepage"), "home page");
		homehomepage hh=new homehomepage();
		hh.clickradiobtn();
}
}
