package com.testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageFile extends LocatorsFile implements DataFile{

	public WebDriver driver;
	public WebDriverWait wait;
	public String browser;
	
	public void openBrowser() throws IOException, InterruptedException {
		
		//Get Browser details from Property File
		FileInputStream fs = new FileInputStream("C:/Selenium_Workspace/project_ATS/Project_Data/prop.properties");
		Properties prop = new Properties();
		prop.load(fs);
		
		browser = prop.getProperty("browser"); 
		
		//Opening Browser
		if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Selenium_Workspace/project_ATS/Project_Data/chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium_Workspace\\project_ATS\\Project_Data\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		}
		
		//Setup Driver Property
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		wait = new WebDriverWait(driver,100);
		
		PageFactory.initElements(driver, this);	

	}
	
	public void closeBrowser() {		
		driver.quit();
	}
	
	public void openURL() throws Exception {	
		
		driver.get(URL);	//opening any URL
		Thread.sleep(2000);
		
	}
	
	public void createProject() throws InterruptedException {
		
		Thread.sleep(1000);
		
		//Creating New Project
		wait.until(ExpectedConditions.visibilityOf(newProjectButton)).click();
		
		//Enter Internal Number
		wait.until(ExpectedConditions.visibilityOf(internalNo)).click();
		wait.until(ExpectedConditions.visibilityOf(internalNoTextField)).sendKeys(testInternalNumber);
		
		//Enter Project Name
		wait.until(ExpectedConditions.visibilityOf(projectName)).click();
		wait.until(ExpectedConditions.visibilityOf(projectNameTextField)).sendKeys(testProjectName);
		
		//Enter & Select Country
		wait.until(ExpectedConditions.visibilityOf(country)).click();
		wait.until(ExpectedConditions.visibilityOf(countryTextField)).sendKeys(testCountryName);
		wait.until(ExpectedConditions.visibilityOf(selectedCountry)).click();
		
		//Enter & Select Province
		wait.until(ExpectedConditions.visibilityOf(province)).click();
		wait.until(ExpectedConditions.visibilityOf(provinceTextField)).sendKeys(testProvinceName);
		wait.until(ExpectedConditions.visibilityOf(selectedProvince)).click();
		
		//Enter & Select City
		wait.until(ExpectedConditions.visibilityOf(city)).click();
		wait.until(ExpectedConditions.visibilityOf(cityTextField)).sendKeys(testCityName);
		wait.until(ExpectedConditions.visibilityOf(selectedCity)).click();
		
		Thread.sleep(1000);
		
		//Enter Address
		wait.until(ExpectedConditions.visibilityOf(address)).click();
		wait.until(ExpectedConditions.visibilityOf(addressTextField)).sendKeys(testAddress);
		
		//Select Bid Date
		wait.until(ExpectedConditions.visibilityOf(bidDate)).click();	//Click on Date Selector
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOf(okButtonForselectedBidDate)).click();
		
		Thread.sleep(1000);
		
		//Enter Area
		wait.until(ExpectedConditions.visibilityOf(area)).click();
		wait.until(ExpectedConditions.visibilityOf(areaTextField)).sendKeys(testArea);
		
		
		Thread.sleep(2000);
		
		//Click on NEXT Button of Section One
		wait.until(ExpectedConditions.visibilityOf(nextButtonPartOne)).click();
		
		
		//Select Commercial Buidling Class & Type 
		wait.until(ExpectedConditions.visibilityOf(commercialBuildingClass)).click();
		wait.until(ExpectedConditions.visibilityOf(commercialBuildingType)).click();
		
		//Click on NEXT Button of Section Two
		wait.until(ExpectedConditions.visibilityOf(nextButtonPartTwo)).click();
		
		
		Thread.sleep(2000);
		
		//Click on FINISH Button
		wait.until(ExpectedConditions.visibilityOf(finishButton)).click();

	}
	
	public void loginWithValidCredentials() throws InterruptedException {
		
		//Login with given valid Credentials
		wait.until(ExpectedConditions.visibilityOf(usernameTextField)).sendKeys(username);
		wait.until(ExpectedConditions.visibilityOf(passwordTextField)).sendKeys(password);
		wait.until(ExpectedConditions.visibilityOf(loginButton)).click();
		
		Thread.sleep(2000);
	}
	
	
	
}
