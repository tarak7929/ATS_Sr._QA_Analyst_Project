package com.testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorsFile {

	@FindBy(xpath = "//*[@name=\"username\"]") public WebElement usernameTextField;
	@FindBy(xpath = "//*[@name=\"password\"]") public WebElement passwordTextField;
	@FindBy(xpath = "//*[@type=\"submit\"]") public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id=\"root\"]/div[17]/div/div[2]/div/div/div[3]/div[3]/div/div/main/div/span/div/div/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div[4]/a") public WebElement newProjectButton;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[1]/div/div") public WebElement internalNo;
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[1]/div/div/div/input") public WebElement internalNoTextField;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[2]/div/div") public WebElement projectName;
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[2]/div/div/div/input") public WebElement projectNameTextField;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[3]/div/div") public WebElement country;
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[3]/div/div/div/input") public WebElement countryTextField;
	@FindBy(xpath = "//*[@data-suggestion-index=\"0\"]") public WebElement selectedCountry;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[4]/div/div") public WebElement province;
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[4]/div/div/div/input") public WebElement provinceTextField;
	@FindBy(xpath = "//*[@data-suggestion-index=\"0\"]") public WebElement selectedProvince;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[5]/div/div") public WebElement city;
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[5]/div/div/div/input") public WebElement cityTextField;
	@FindBy(xpath = "//*[@data-suggestion-index=\"0\"]") public WebElement selectedCity;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[6]/div/div") public WebElement address;
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[6]/div/div/div/textarea[1]") public WebElement addressTextField;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[7]/div/div/div/div/button") public WebElement bidDate;
	@FindBy(xpath = "//*[@role=\"dialog\"][2]/div[3]/div/div[2]/button[3]") public WebElement okButtonForselectedBidDate;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[8]/div/div") public WebElement area;
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/div[1]/div[8]/div/div/div/input") public WebElement areaTextField;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[1]/div/div/div/div/div/div/form/button") public WebElement nextButtonPartOne;

	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[3]/div/div/div/div/div/div/form/div[2]/div[2]") public WebElement commercialBuildingClass;
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[3]/div/div/div/div/div/div/form/div[3]/div/div/div[1]") public WebElement commercialBuildingType;
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[3]/div/div/div/div/div/div/form/div[4]/button[2]") public WebElement nextButtonPartTwo;
	
	@FindBy(xpath = "//*[@role=\"document\"]/div/div[2]/div/div[5]/div/div/div/div/div/form/button[2]") public WebElement finishButton;
	
}
