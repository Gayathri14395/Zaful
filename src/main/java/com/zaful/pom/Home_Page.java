package com.zaful.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@class='newuser-coupon-close js-close-newuser-coupon-layer logsss_event_cl'])[1]")
	private WebElement popup;
	
	@FindBy(xpath = "//*[@id=\"js-topAccount\"]/a")
	private WebElement sigin;

	public Home_Page(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPopup() {
		return popup;
	}

	public WebElement getSigin() {
		return sigin;
	}
	
	

}
