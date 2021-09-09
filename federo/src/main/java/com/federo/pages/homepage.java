package com.federo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;

public class homepage {
	@FindBy(xpath="//a[text()='Accounts']") private WebElement accounttab;
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement cmpbtn;
	@FindBy(xpath="(//input[@name=\"chk\"])[8]") private WebElement chkbox;
	@FindBy(xpath="//input[@value=\"Create Task\"]") private WebElement ctbtn;
	@FindBy(xpath="//a[text()='Dashboards']") private WebElement dashbtn;
	@FindBy(xpath="//a[text()='Forecasts']") private WebElement forecasttab;
	@FindBy(xpath="//input[@value=\"New Forecast\"]") private WebElement newforecastbtn;
	@FindBy(xpath="//a[text()='Invoices']") private WebElement invoicebtn;
	@FindBy(xpath="//a[text()='Reports']") private WebElement reporttab;
	@FindBy(xpath="//input[@value=\"Create New Report\"]") private WebElement createnewreport;
	@FindBy(xpath="//a[text()='Quotes']") private WebElement qtsbtn;
	@FindBy(xpath="//a[text()='Leads']") private WebElement leadstab;
	@FindBy(xpath="//a[text()='Home']") private WebElement hometab;
	
	public  homepage() {
		PageFactory.initElements(BaseTest.driver, this);	
	}
	public void clickhometab() {
		hometab.click();
	}
	public void clickaccounttab() {
		accounttab.click();
	}
		public void clickcmpgn() {
		cmpbtn.click();
		}
		/**chkbox.click();
		ctbtn.click();**/
		public void clickdashbtn(){
		dashbtn.click();
		}
		public void clickforbtn() {
			
		forecasttab.click();
		newforecastbtn.click();
		}
			public void clickreport() {
			reporttab.click();
			createnewreport.click();
			}
			public void clickqtsbtn() {
			  qtsbtn.click();
			}
			   public void  clickleads() {
			   leadstab.click();
			   }
			public void clickinvoice() {
				invoicebtn.click();
				}
			}

	



