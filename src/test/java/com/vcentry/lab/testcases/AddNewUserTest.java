package com.vcentry.lab.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vcentry.lab.testBase.BaseClass;
import com.vcentry.lab.utils.FileHandling;

public class AddNewUserTest extends BaseClass{

@Test(priority = 2)
public void navigatetoUsersinAdminTab() {
	homePage.navigateToUser();
	users.verifyUserPage();
}

@Test(dataProvider = "newUserData",priority = 3)
public void addNewUser(String role,String empName,String userName, String status, String password) throws InterruptedException {
	users.clickAddButton();
	users.addNewUsers(role,empName,userName,status,password);
     Thread.sleep(20000);
}
@DataProvider(name="newUserData")
public Object[][] getLoginData() throws IOException {
	return FileHandling.getExcelData("src//test//resources//datasheet.xlsx", "newuser");

}

}
