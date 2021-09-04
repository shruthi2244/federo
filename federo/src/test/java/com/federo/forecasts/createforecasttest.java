package com.federo.forecasts;

import org.testng.annotations.Test;

import com.federo.pages.LoginPage;
import com.federo.pages.createforecastpage;
import com.federo.pages.forecastpage;
import com.federoGenericLib.BaseTest;
import com.federoGenericLib.FileLib;
import com.federoGenericLib.WebDriverCommonLib;

public class createforecasttest extends BaseTest{
		@Test 
		public void forecast() throws Throwable {
		//BaseTest bt = new BaseTest();
		FileLib flib=new FileLib();
		//bt.openBrowser();
		LoginPage lp=new LoginPage();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		WebDriverCommonLib wlib =new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "customviewpage"), "custom view Page");
		forecastpage fp=new forecastpage();
		fp.clickforecast();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "create forecast"), "create forecast page");
		createforecastpage cf=new createforecastpage();
		cf.selectforecastoption();
		
}
}
