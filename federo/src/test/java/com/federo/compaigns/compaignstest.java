package com.federo.compaigns;

import org.testng.annotations.Test;

import com.federo.pages.LoginPage;
import com.federo.pages.compaignpage;
import com.federo.pages.compaigntaskpage;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;

public class compaignstest extends BaseTest{
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
		compaignpage cp=new compaignpage();
		cp.clickcompaignpage();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customtitle"), "custom page");
		compaigntaskpage ctp=new compaigntaskpage();
		ctp.clicktaskpage(flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 0));
		
}
}
