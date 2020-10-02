package com.MMT.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.HotelSearch;
import com.MMT.testbase.TestBase;



public class HotelSearchPageTest extends TestBase {
	
	
	
HotelSearch hotelSearch;
	
	public HotelSearchPageTest ()
	{
		super();
	}
	
	@BeforeMethod
	
	public void applicationSetup()
	{
		initialization();
		
		hotelSearch = new HotelSearch();
	}

	
//	@Test (priority=1)
//	public void HotelSearchPageTitleTest()
//	{
//		String title = hotelSearch.ValidateHotelSearchPageTitle();
//		System.out.println("Page Title is = "+title);
//		Assert.assertEquals(title, "MakeMyTrip.com: Save upto 60% on Hotel Booking 4,442,00+ Hotels Worldwide");
//	}
//	
//	@Test (priority=2)
//	public void ValidateHotelImageTest()
//	{
//		boolean flag = hotelSearch.ValidateHotelIcon();
//		Assert.assertTrue(true);
//	}
	

	@Test (priority=3, dataProvider="getData")
	public void hotelsearchFieldTest(String HotelName) throws InterruptedException 
	{
		hotelSearch.hotelsearchfields(HotelName);
	}
	
//	@AfterMethod
//	
//	public void applicationkill()
//	{
//		driver.quit();
//	}
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] TestData = new Object[1][1];
		TestData [0][0]	="Delhi";
		return TestData;
	}
	
}



