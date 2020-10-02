package com.MMT.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class FlightSummary extends TestBase {
	
	//Object Repository or OR Properties
	
	@FindBy(xpath="//*[@id='Mobile No']/div/input")
	WebElement MobileNo;
	
	@FindBy(xpath="//*[@id='Email']/div/input")
	WebElement EmailId;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div[2]/div/div[1]/form/div[7]/div/div/button")
	WebElement ContinuewButton;
	
	public FlightSummary()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateFightSummary(String FlightMobile, String FlightEmail) throws InterruptedException
	{
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.ScrollBy(0,1000");
		MobileNo.sendKeys(FlightMobile);
		EmailId.sendKeys(FlightEmail);
		ContinuewButton.click();
	}
	
	

}
