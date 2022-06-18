package com.vcentry.lab.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vcentry.lab.testBase.BaseClass;
import com.vcentry.lab.utils.FileHandling;

public class LoginTest extends BaseClass{

	@Test(dataProvider = "loginData",priority = 1)
	public void login(String uName,String pwd) {
		loginPage.enterUsername(uName);
		loginPage.enterPassword(pwd);
		loginPage.clickLogin();
		if(uName.equals("Admin")&&pwd.equals("admin123")) {
			validateTest(driver.getCurrentUrl().contains("dashboard"));
		}
	}
	@DataProvider(name="loginData")
    public Object[][] getLoginData() throws IOException {
		return FileHandling.getExcelData("src//test//resources//datasheet.xlsx", "login");
	}
}
