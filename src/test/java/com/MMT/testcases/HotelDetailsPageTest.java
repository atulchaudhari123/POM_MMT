package com.MMT.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.HotelDetails;
import com.MMT.pages.HotelSearch;
import com.MMT.pages.HotelSearchResult;
import com.MMT.testbase.TestBase;

public class HotelDetailsPageTest extends TestBase{
	
	HotelSearchResult hotelSearchResult;
	HotelSearch hotelSearch;
	HotelDetails hotelDetails;
	
	public HotelDetailsPageTest()
	{
		super();
	}

	@BeforeMethod
	
	public void applicationSetup()
	{   
		initialization();
		hotelSearch = new HotelSearch();
		hotelSearchResult = new HotelSearchResult();
		hotelDetails = new HotelDetails();
	}
	
	@Test (dataProvider="getData")
	public void verifyHotelSearchResult(String HotelName ) throws InterruptedException
	
	{
		hotelSearch.hotelsearchfields(HotelName);
		hotelSearchResult.validateHotelSearchResult();
		hotelDetails.validateHotelDetails();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] TestData = new Object[1][1];
		TestData [0][0]="Delhi";
		return TestData;
	}
	
}



