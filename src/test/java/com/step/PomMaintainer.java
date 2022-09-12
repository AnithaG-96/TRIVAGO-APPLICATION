package com.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomMaintainer {
	public static WebDriver driver;
	public PomMaintainer() {
		PageFactory.initElements(driver, this);
			}
	@FindBy(id="input-auto-complete")
	private WebElement location;	
	
	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement locationSelect;

	@FindBy(xpath="//span[text()='16']")
	private WebElement checkinDate;	
	
	@FindBy(xpath="//span[text()='17']")
    private WebElement checkDate;
	
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement adults;	
	
	@FindBy(xpath="//span[text()='Apply']")
	private WebElement rooms;	

	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement searchButton;	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		PomMaintainer.driver = driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getLocationSelect() {
		return locationSelect;
	}

	public void setLocationSelect(WebElement locationSelect) {
		this.locationSelect = locationSelect;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(WebElement checkinDate) {
		this.checkinDate = checkinDate;
	}

	public WebElement getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(WebElement checkDate) {
		this.checkDate = checkDate;
	}

	public WebElement getAdults() {
		return adults;
	}

	public void setAdults(WebElement adults) {
		this.adults = adults;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public void setRooms(WebElement rooms) {
		this.rooms = rooms;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getRatingOption() {
		return ratingOption;
	}

	public void setRatingOption(WebElement ratingOption) {
		this.ratingOption = ratingOption;
	}
	@FindBy()
	private WebElement ratingOption;	






	
}
