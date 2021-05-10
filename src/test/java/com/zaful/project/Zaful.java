package com.zaful.project;

import java.util.Base64;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zaful.baseclass.BaseClass;
import com.zaful.pom.Home_Page;

public class Zaful extends BaseClass{
	
	public static WebDriver driver;
	
	Home_Page hp = new Home_Page(driver);
	
	@BeforeSuite
	private void browser() throws InterruptedException {

		toLaunchBrowser("chrome");
		Thread.sleep(4000);
				
	}
	
	@BeforeTest
	private void url() throws InterruptedException {

		toLaunchUrl("https://www.zaful.com/");
		Thread.sleep(4000);
	}
	
	
	@BeforeClass
	private void refresh() throws InterruptedException {

		driver.navigate().refresh();
		Thread.sleep(4000);
		
	}
	
	@BeforeMethod
	private void login() throws InterruptedException {

	toClickMouse(hp.getPopup());
	Thread.sleep(4000);

	}
	

	@Test
	private void account() throws InterruptedException {
toClick(hp.getSigin());
Thread.sleep(4000);

	}
	
	
}
