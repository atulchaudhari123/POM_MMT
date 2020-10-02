package com.MMT.pages;



import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class FlightReview extends TestBase {

	//Page Repository - OR Properties
	
	 @FindBy(xpath="//*[@id='insurance-section']/div/div[3]/label[1]/span[1]/span")
	 WebElement termcondition;
	
	 @FindBy(xpath="//*[@id='review-continue']")
	 WebElement reviewcontinue;
	
	
	
	
	public FlightReview()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void reviewFlightbooking() throws InterruptedException
	{   
		
	Thread.sleep(3000);	

	Set<String> handles = driver.getWindowHandles();
	for(String handle : handles )
	{
		System.out.println("Window swith to " +handle);
		driver.switchTo().window(handle);
	}
	Thread.sleep(6000);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,1200)");
	
	termcondition.click();
	Thread.sleep(2000);
	reviewcontinue.click();
	
}
}