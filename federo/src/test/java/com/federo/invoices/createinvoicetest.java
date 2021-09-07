package com.federo.invoices;

import org.testng.annotations.Test;

import com.federo.pages.LoginPage;
import com.federo.pages.invoicecreatepage;
import com.federo.pages.invoicemandatorydetailspage;
import com.federo.pages.invoicepage;
import com.federo.pages.scrollinvoice;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;

public class createinvoicetest extends BaseTest{
	@Test
	public void invoice() throws Throwable {
		//BaseTest bt=new BaseTest();
				FileLib flib=new FileLib();
				WebDriverCommonLib wlib =new WebDriverCommonLib();
				//bt.openBrowser();
				LoginPage lp=new LoginPage();
	lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), 
			flib.readPropertyData(PROP_PATH, "password"));
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "hometitle"), 
			"home page");
	scrollinvoice si=new scrollinvoice();
	si.clickinvoicepage();
	invoicepage ip=new invoicepage();
	ip.clickinvoicepage();
	wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customtitle"),
			"custom page");
	invoicecreatepage icp=new invoicecreatepage();
			icp.clickcreate();
			wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customtitle"),
					"custom view page");
			invoicemandatorydetailspage imd =new invoicemandatorydetailspage();
			imd.clickcreatemandatorydetails(flib.readExcelData(EXCEL_PATH, "Sheet1", 0, 1));
	}

}
