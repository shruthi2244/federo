package com.federo.cases;

import org.testng.annotations.Test;

import com.federo.pages.LoginPage;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;

public class casestest extends BaseTest{
	@Test

	public void compaign() throws Throwable
	{
		//BaseTest bt=new BaseTest();
		FileLib flib=new FileLib();
		
		WebDriverCommonLib wlib =new WebDriverCommonLib();
		//bt.openBrowser();
		LoginPage lp=new LoginPage();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "hometitle"), "home page");
}
}
