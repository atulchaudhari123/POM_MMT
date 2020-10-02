package com.MMT.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.HotelSearch;
import com.MMT.pages.HotelSearchResult;
import com.MMT.testbase.TestBase;

public class HotelSearchResultPageTest extends TestBase {
	 
	HotelSearchResult hotelSearchResult;
	HotelSearch hotelSearch;
	
	public HotelSearchResultPageTest()
	{
		super();
	}

	@BeforeMethod
	
	public void applicationSetup()
	{   
		initialization();
		hotelSearch = new HotelSearch();
		hotelSearchResult = new HotelSearchResult();
	}
	
	@Test(dataProvider="getData")
	public void verifyHotelSearchResult(String HotelName) throws InterruptedException
	
	{
		hotelSearch.hotelsearchfields(HotelName);
		hotelSearchResult.validateHotelSearchResult();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] TestData = new Object[1][1];
		TestData [0][0]="Delhi";
		return TestData;
	}
}
