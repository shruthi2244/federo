package com.federo.reports;

import org.testng.annotations.Test;

import com.federo.pages.LoginPage;
import com.federo.pages.createreportpage;
import com.federo.pages.homepagereports;
import com.federo.pages.reportswizardpage;
import com.federo.pages.savereportpage;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;


public class createreporttest extends BaseTest{
	@Test
		public void reporttest() throws Throwable {
		//BaseTest bt = new BaseTest();
		FileLib flib=new FileLib();
		//bt.openBrowser();
		LoginPage lp=new LoginPage();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		WebDriverCommonLib wlib =new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Home Page");
		homepagereports hp = new homepagereports();
		hp.clickhomepagereports();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "showingreportlist"), "showing reports list page");
		createreportpage cp=new createreportpage();
		cp.clickcraetereportpage();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "reportswizard "), "reports wizard page");
		reportswizardpage rw=new reportswizardpage();
		rw.cliclreportswizardpage();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "reportswizard "), "reports wizard page");
		Thread.sleep(3000);
		savereportpage sr=new savereportpage();
		sr.clicksavereportpage(flib.readExcelData(EXCEL_PATH, "Sheet1", 1, 0));

	}
}
