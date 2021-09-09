package com.federo.dashboards;

import org.testng.annotations.Test;

import com.federo.pages.LoginPage;
import com.federo.pages.finishdashboardpage;
import com.federo.pages.homepage;
import com.federo.pages.selectdashboardpage;
import com.federo.pages.showingdashboardpage;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;

public class createdashboardtest extends BaseTest{
	@Test
	public void dashboard() throws Throwable
	{
		//BaseTest bt=new BaseTest();
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib =new WebDriverCommonLib();
		//bt.openBrowser();
		LoginPage lp=new LoginPage();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "hometitle"), "home page");
		homepage hp=new homepage();
		hp.clickdashbtn();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "dashboardtitle"), "dashboard page");
		showingdashboardpage sb=new showingdashboardpage();
		sb.clickeditbtn();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "selectdashboardpage"), "select dashboardpage");
		selectdashboardpage sp=new selectdashboardpage();
		sp.selectpage();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "selectdashboardpage"), "select dashboardpage");
		finishdashboardpage fd=new finishdashboardpage();
		fd.clickfinishbtn();
	}

}
