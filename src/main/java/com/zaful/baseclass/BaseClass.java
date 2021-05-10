package com.zaful.baseclass;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	 
	
	public static void toClick(WebElement element)
	{
		element.click();
	}
	
	public static void toClear(WebElement element)
	{
		element.clear();
	}
	
	public static void toNavigateBack()
	{
		driver.navigate().back();
	}
	
	public static void toNavigateForward()
	{
		driver.navigate().forward();
		
	}
	
	public static void toNavigate(String s)
	{
		driver.navigate().to(s);
	}
	
	public static void toRefresh()
	{
		driver.navigate().refresh();
	}

	public static void toEnterInput(WebElement element, String s)
	{
		element.sendKeys(s);
	}
	
	public static void toQuit()
	{
		driver.quit();
	}
	
	public static void toClose()
	{
		driver.close();
	}
	
//	public static void toMaximize()
//	{
//		driver.manage().window().maximize();
//	}
	
	public static void toLaunchUrl(String s)
	{
		driver.get(s);
	}
	
	public static void toGetUrl()
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void toGetTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void toCheckIsEnabled(WebElement element)
	{
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	
	public static void toCheckIsDisplayed(WebElement element)
	{
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	
	public static void toCheckIsSelected(WebElement element)
	{
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	public static void toGetOptions(WebElement element)
	{
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		
		for (WebElement list : options) 
		{
			System.out.println(list);
		}
	}
	
public static void toGetAllSelectedOptions(WebElement element)
	{
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		
		for (WebElement list : allSelectedOptions) {
			System.out.println(list);
		}
	}
	
	
	public static void toGetText(WebElement element)
	{
	String text = element.getText();	
	System.out.println(text);
	}
	
	public static void toGetListSize(WebElement element)
	{
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (WebElement list : allSelectedOptions) {
			System.out.println(list);
			
		}
		 int size = allSelectedOptions.size();
		 System.out.println(size);
		
	}
	
		
	public static void toSelectByValue(WebElement element, String s1)
	{
		Select s = new Select(element);
		s.selectByValue(s1);
	}
	
	public static void toSelectByIndex(WebElement element, int i)
	{
		Select s = new Select(element);
		s.selectByIndex(i);
	}
	
	public static void toSelectByVisibleText(WebElement element, String s1)
	{
		Select s = new Select(element);
		s.selectByVisibleText(s1);
	}
	
	public static void toDeselectByValue(WebElement element, String s1)
	{
		Select s = new Select(element);
		s.deselectByValue(s1);
	}
	
	public static void toDeselectByIndex(WebElement element, int i)
	{
		Select s = new Select(element);
		s.deselectByIndex(i);
	}
	
	public static void toDeselectByVisibleText(WebElement element, String s1)
	{
		Select s = new Select(element);
		s.deselectByVisibleText(s1);
	}
	
	public static void toDeselectAll(WebElement element)
	{
		Select s = new Select(element);
		s.deselectAll();
	}
	
	public static void toCheckIsMultiple(WebElement element)
	{
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	
	public static void toSleep() throws Throwable
	{
		
		Thread.sleep(5000);
	}
	
	public static  WebDriver toLaunchBrowser(String type)
	{
		if (type.equalsIgnoreCase("chrome")) 
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if (type.equalsIgnoreCase("gecko")) 
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		else if (type.equalsIgnoreCase("ie")) 
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Driver//internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();	
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
//	public static void toFindElementByXPath(String string)
//	{
//		WebElement element = driver.findElement(By.xpath(string));
//		element.click();
//		
//	}
//	
//	public static void toFindElementById(WebElement element)
//	{
//		driver.findElement(By.id(null));
//	}
//	
//	public static void toFindElementByName(WebElement element)
//	{
//		driver.findElement(By.name(null));
//	}
//	
	public  static void toTakeScreenshot1(WebDriver driver) throws Throwable
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destiny = new File("C:\\Users\\welcome\\eclipse-workspace\\Adactin_Final_Project\\Screenshot\\ss.png");
		FileUtils.copyFile(screenshotAs, destiny);
		
		
	}
	
	public  static void toTakeScreenshot2(WebDriver driver) throws Throwable
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destiny = new File("C:\\Users\\welcome\\eclipse-workspace\\Mini_Project\\src\\com\\automation\\practice\\Screenshot\\sss.png");
		FileUtils.copyFile(screenshotAs, destiny);
		
		
	}
	
	public static void toHandleAlert(WebElement element) throws InterruptedException
	{
		element.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
	}
	
	public static void toHandleConfirmAlert(WebElement element, WebElement element2) throws Throwable
	{
		element.click();
		Thread.sleep(4000);
		element2.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
	}
	
	public static void toHandlePromptAlert(WebElement element, WebElement element2, String s) throws Throwable
	{
		element.click();
		Thread.sleep(4000);
		element2.click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys(s);
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
	}
	
	public static void toClickMouse(WebElement element)
	{
		Actions a = new Actions(driver);
		a.click(element).build().perform();
		
	}
	
	public static void toMoveToElement(WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	
	public static void toDoubleClick(WebElement element)
	{
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}
	
	public static void toRightClick(WebElement element)
	{
		Actions a = new Actions(driver);
		a.contextClick(element);
	}
	
	public static void toSwitchToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public static void toScroll(WebElement element) throws Throwable
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		toSleep();
	}
}
	


