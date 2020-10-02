package com.MMT.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class FlightSearchResult extends TestBase{
	
	//Page Repository - OR Properties
	
	 @FindBy(xpath="//button[text()='View Prices']")
	 WebElement ViewPrice;
	 
	 @FindBy(xpath="//button[contains(@class,'btn fli_primary_btn')]")
	 WebElement bookFlight;
	 
	 
	public FlightSearchResult()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void bookFlight() throws InterruptedException
	{   
		Thread.sleep(4000);
	    ViewPrice.click();
	    Thread.sleep(3000);
		bookFlight.click();
		
	}}


