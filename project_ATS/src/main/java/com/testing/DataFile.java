package com.testing;

public interface DataFile {

	Xls_Reader d = new Xls_Reader("C:/Selenium_Workspace/project_ATS/Project_Data/testData.xlsx");
	
	public String URL = d.getCellData("URL", 1, 1);
	
	public String username = d.getCellData("Login", 1, 1);
	public String password = d.getCellData("Login", 1, 2);
	
	public String testInternalNumber = d.getCellData("Inputs", 1, 1);
	public String testProjectName = d.getCellData("Inputs", 1, 2);
	public String testCountryName = d.getCellData("Inputs", 1, 3);
	public String testProvinceName = d.getCellData("Inputs", 1, 4);
	public String testCityName = d.getCellData("Inputs", 1, 5);
	public String testAddress = d.getCellData("Inputs", 1, 6);
	public String testArea = d.getCellData("Inputs", 1, 7);
	
}
