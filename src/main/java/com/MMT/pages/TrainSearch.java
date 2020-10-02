package com.MMT.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class TrainSearch extends TestBase{
	
	//Page Repository - OR Properties
	
	@FindBy(xpath="//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[5]/a/span[1]")
	WebElement TrainLogo;
	
	@FindBy(xpath="//*[@id='fromCity']")
	WebElement From_City;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input")
	WebElement FromCity_Name;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/div/p[1]/span")
	WebElement Select_FromCity;
	
//	@FindBy(xpath="//*[@id='toCity']")
//	WebElement To_City;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/input")
	WebElement ToCity_Name;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/div/p[2]/span")
	WebElement Select_ToCity;
	
//	@FindBy(xpath="//*[@id='travelDate']")
//	WebElement TravelDate;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[5]")
	WebElement Select_TravelDate;
	
//	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[4]/label")
//	WebElement Class;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[4]/ul/li[5]")
	WebElement Select_Class;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div/div[2]/p/a")
	WebElement ApplyButton;
	
	public TrainSearch()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String ValidateTrainSearchPageTitle()
	{   TrainLogo.click();
		return driver.getTitle();	
	}
	
	public boolean ValidateTrainLogoIcon()
	{
		TrainLogo.click();
		return TrainLogo.isDisplayed();
	}
	
	public void ValidateTrainSearch(String TrainFromCity, String TrainToCity) throws InterruptedException
	{
		TrainLogo.click();
		From_City.click();
		FromCity_Name.click();
		FromCity_Name.sendKeys(TrainFromCity);
		Thread.sleep(3000);
		Select_FromCity.click();
		ToCity_Name.sendKeys(TrainToCity);
		Thread.sleep(3000);
		Select_ToCity.click();
		Select_TravelDate.click();
		Thread.sleep(2000);
		Select_Class.click();
		ApplyButton.click();
	}
	
	

}
