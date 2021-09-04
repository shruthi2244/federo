package com.federo.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.federoGenericLib.BaseTest;



public class goiboipage {
	@FindBy(xpath="//h4[text()='India']") private WebElement radiobtn;
	@FindBy(xpath="//input[@placeholder=\"e.g. - Area, Landmark or Hotel Name\"]") private WebElement dropdwn;
	
	@FindBy(xpath="//h4[text()='Sep 2, 2021']") private WebElement datechekin;
	@FindBy(xpath="//h4[text()='Sep 3, 2021']") private WebElement	datechkout;
	@FindBy(xpath="//div[text()='1 Night']") private WebElement checkNight;
	@FindBy(xpath="(//span[text()='+'])[1]") private WebElement rooms;
	@FindBy(xpath="(//span[text()='+'])[2]") private WebElement roomsadults;
	@FindBy(xpath="(//span[text()='+'])[3]") private WebElement roomschildrens;
	@FindBy(xpath="(//span[@class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV\"])[7]") private WebElement childage1;
	@FindBy(xpath="(//span[@class=\"PaxWidgetstyles__ContentActionIconWrapperSpan-sc-gv3w6r-8 dxKRvV\"])[8]") private WebElement childage2;
	@FindBy(xpath="//button[text()='Done']") private WebElement done;
	@FindBy(xpath="//button[text()='Search Hotels']") private WebElement srchhtls;
	

	public goiboipage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
 public String clickgoiboipage(String loc) throws Throwable {
	
	 radiobtn.click();
	 Thread.sleep(1000);
	dropdwn.sendKeys(loc);
	dropdwn.sendKeys(Keys.DOWN);
	dropdwn.sendKeys(Keys.ENTER);
	 return loc;
	 
	 
 }
	
 }

	


	

	
	
	

