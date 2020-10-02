package com.MMT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class HotelSearchResult extends TestBase {
	
	//Object Repository or OR properties
	@FindBy(xpath="//p[@id='hlistpg_hotel_name']//span")
	WebElement hotelclick;
	
	public HotelSearchResult()
	
	{
		PageFactory.initElements(driver, this);
	}

	
	public void validateHotelSearchResult()
	{
		hotelclick.click();
	}
}
