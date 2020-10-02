package com.MMT.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class HotelDetails extends TestBase {
	
	//Object Repository or OR Properties
	
	@FindBy(xpath="//*[@id='detpg_book_combo_btn']")
    WebElement ClickComboButton;
	
	public HotelDetails()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateHotelDetails()
	{
		Set<String> handles = driver.getWindowHandles();
	    for(String handle : handles)
	    {
	    System.out.println("Switching to window - > " + handle);
	    driver.switchTo().window(handle);
	    }
	    
	 // Scroll By()
	  
	  	 JavascriptExecutor jse = (JavascriptExecutor) driver; 
	  			 //Typecast to Driver object
	  	 jse.executeScript("window.scrollBy(0,1000)");
		ClickComboButton.click();
		

	}

}
