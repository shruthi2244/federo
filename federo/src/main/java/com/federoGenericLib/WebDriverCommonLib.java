package com.federoGenericLib;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.io.Files;

import junit.framework.Assert;

public class WebDriverCommonLib {
	public String getPageTitle(){
		String pageTitle=BaseTest.driver.getTitle();
		return pageTitle;
	}
	public void verify(String actual,String expected, String page) {
		if(actual.equals(expected)) {
			System.out.println(page +"is displayed, pass" );
		}
		else {
			System.out.println(page +"is not displayed, fail" );	
		}
	}
	public void selectoption(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public void selectoption(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	public void selectoption(String text, WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void mouseHover(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.moveToElement(element).perform();
	}
	public void rightClick(WebElement element)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.contextClick(element).perform();
	}
	public void dragAndDropElement(WebElement source, WebElement target)
	{
		Actions ac=new Actions(BaseTest.driver);
		ac.dragAndDrop(source, target).perform();
	}
	public void switchToFrame(int index)
	{
		BaseTest.driver.switchTo().frame(index);
	}
	public void switchToFrame(String value)
	{
		BaseTest.driver.switchTo().frame(value);
	}
	public void switchToFrame(WebElement element)
	{
		BaseTest.driver.switchTo().frame(element);
	}
	public void getElementScreenshot(String screenshotpath) throws Throwable
	{
		TakesScreenshot ts=(TakesScreenshot) BaseTest.driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(screenshotpath);
		Files.copy(src, dest);
	}
	public void getElementScreenshot(WebElement element, String screenshotpath) throws Throwable
	{
		File src=element.getScreenshotAs(OutputType.FILE);
		File dest=new File(screenshotpath);
		Files.copy(src, dest);
	}
	public void WaitForPageTitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(BaseTest.driver, 30);
		wait.until(ExpectedConditions.titleContains(title));
	}
	/**public void dropdownenabled(WebElement element, String elementname)
	{
		if(element.isEnabled()) {
			Assert.assertTrue(true);
			Reporter.log(elementname+"is enabled", true);
		}
		else {
			
			Reporter.log(elementname+"is disabled",true);
		}**/
	public void scrolldown(WebElement element) {
		Point loc=element.getLocation();
		JavascriptExecutor jse=(JavascriptExecutor)BaseTest.driver;
		jse.executeScript("window.scrollBy"+loc);
		
		
	}
}

		
	
	






