package com.MMT.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MMT.pages.HotelDetails;
import com.MMT.pages.HotelReview;
import com.MMT.pages.HotelSearch;
import com.MMT.pages.HotelSearchResult;
import com.MMT.testbase.TestBase;
import com.MMT.util.TestUtil;

public class HotelReviewTestPage extends TestBase {
	

	HotelSearchResult hotelSearchResult;
	HotelSearch hotelSearch;
	HotelDetails hotelDetails;
	HotelReview hotelReview;
	
	public HotelReviewTestPage()
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
		hotelReview = new HotelReview();
	}
	
	@Test (dataProvider="getData")
	public void verifyHotelSearchResult(String HotelName, String FirstName, String LastName, String HotelEmail, String HotelMobNo) throws InterruptedException
	
	{
		hotelSearch.hotelsearchfields(HotelName);
		hotelSearchResult.validateHotelSearchResult();
		hotelDetails.validateHotelDetails();
		hotelReview.validateHotelReview(FirstName, LastName, HotelEmail,HotelMobNo);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] TestData = TestUtil.getData("HotelReviewTestPage");
//		Object[][] TestData = new Object[1][5];
//		TestData [0][0] = "Delhi";
//		TestData [0][1] = "Rahul";
//		TestData [0][2] = "Patil";
//		TestData [0][3] = "rahul123@gmail.com";
//		TestData [0][4] = "9835467373";
		return TestData;
	}
	
}

