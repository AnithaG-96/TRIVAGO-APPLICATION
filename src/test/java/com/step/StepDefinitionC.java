package com.step;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionC {
WebDriver driver;
@Given("The user should be in travigo login page")
public void the_user_should_be_in_travigo_login_page() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.trivago.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@When("The user has to fill the location")
public void the_user_has_to_fill_the_location() throws InterruptedException {
	Actions a=new Actions(driver);
	WebElement checkin = driver.findElement(By.id("input-auto-complete"));
	a.sendKeys("Mumbai").perform();
	Thread.sleep(2000);
	WebElement area = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
	a.moveToElement(area).click().perform();

}

@When("The user has to select in checkin and checkout date")
public void the_user_has_to_select_in_checkin_and_checkout_date() {
	WebElement checkin = driver.findElement(By.xpath("//span[text()='16']"));
	checkin.click();
	WebElement checkout = driver.findElement(By.xpath("//span[text()='17']"));
	checkout.click();

}

@When("The user has to select option as adults and rooms")
public void the_user_has_to_select_option_as_adults_and_rooms() {
	WebElement adults = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
	adults.click();
	WebElement rooms = driver.findElement(By.xpath("//span[text()='Apply']"));
	rooms.click();
}

@When("The user has to click the search button")
public void the_user_has_to_click_the_search_button() {
	WebElement search = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	search.click();

}

@When("The user has to select rating only option and checkout the prices")
public void the_user_has_to_select_rating_only_option_and_checkout_the_prices() throws InterruptedException {
	Thread.sleep(4000);
	WebElement rating = driver.findElement(By.id("sorting-selector"));
	Select s=new Select(rating);
	s.selectByVisibleText("Rating only");
	Thread.sleep(6000);
	
	List<WebElement> price = driver.findElements(By.xpath("//p[@data-testid='recommended-price']"));
	List<String>l=new ArrayList<String>();	
	for(int i=0;i<price.size();i++) {
		 WebElement we = price.get(i);
		 String text = we.getText();
		 String ss = text.substring(1);
		 String a="";
		 if(ss.contains(",")) {
			 a=ss.replace(",", "");
			 Integer.parseInt(a);
		 }
		 l.add(a);
		Collections.sort(l);
		System.out.println("sort prices"+l);
}}


@Then("The user should navigate to the booking page")
public void the_user_should_navigate_to_the_booking_page() throws InterruptedException {
	
driver.quit();

}}
