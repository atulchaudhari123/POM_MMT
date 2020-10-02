package com.MMT.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MMT.testbase.TestBase;

public class CabSearch extends TestBase{
	
	//Object Repository - OR Properties
	
	@FindBy(xpath="//*[@id='SW']/div[1]/div[2]/div/div/nav/ul/li[8]/a/span[1]")
	WebElement CabLogo;
	
	@FindBy(xpath="//*[@id='fromCity']")
	WebElement From_City;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	WebElement FromCity_Value;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/p/span")
	WebElement Select_FromCity;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")
	WebElement ToCity_Value;
	
	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/p/span")
	WebElement Select_ToCity;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[4]")
	WebElement DepartureDate;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div/div[4]/label")
	WebElement returndate;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[6]/div[2]")
	WebElement  SelectReturnDate;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[5]/ul/li[16]")
	WebElement PickupTime;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[6]/ul/li[37]")
	WebElement DropTime;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div/div[2]/p/a")
	WebElement SearchButton;
	
	public CabSearch()
	{
		PageFactory.initElements(driver, this);
	}

	
	public String validatePageTitle()
	
	{   CabLogo.click();
		return driver.getTitle();
	}
	
	public boolean validateCabLogo()
	{  CabLogo.click();
	   return CabLogo.isDisplayed();
		
	}
	public void validateCabSearch(String CabFromCity, String CabToCity) throws InterruptedException
	{
		CabLogo.click();
		From_City.click();
		FromCity_Value.click();
		FromCity_Value.sendKeys(CabFromCity);
		Thread.sleep(3000);
		Select_FromCity.click();
		ToCity_Value.sendKeys(CabToCity);
		Thread.sleep(3000);
		Select_ToCity.click();
		DepartureDate.click();
//		returndate.click();
//		SelectReturnDate.click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div/div[5]/ul")); 
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
		PickupTime.click();
//		DropTime.click();
		SearchButton.click();	
		
	}
	
	
}
