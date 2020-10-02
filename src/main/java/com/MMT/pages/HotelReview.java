package com.MMT.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class HotelReview extends TestBase {

	
	//Object Repository or OR Properties
	@FindBy(xpath="//*[@id='fName']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id='lName']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='mNo']")
	WebElement mobileNo;
	@FindBy(xpath="//*[@id='root']/div/div[3]/div/div[2]/div/div[2]/div[1]/div/a")
	WebElement payNowbutton;
		
		
		public HotelReview()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void validateHotelReview(String FirstName, String LastName, String HotelEmail, String HotelMobNo)
		{

			firstName.sendKeys(FirstName);
			lastName.sendKeys(LastName);
			email.sendKeys(HotelEmail);
			mobileNo.sendKeys(HotelMobNo);
			payNowbutton.click();
		}

	}


