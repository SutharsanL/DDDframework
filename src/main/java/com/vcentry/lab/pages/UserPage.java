package com.vcentry.lab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vcentry.lab.testBase.BaseClass;

public class UserPage extends BaseClass{
WebDriver driver;

@FindBy(id="btnAdd")
private WebElement addButton;

@FindBy(id="systemUser_userType")
private WebElement userType;

@FindBy(id="systemUser_employeeName_empName")
private WebElement emp_Name;

@FindBy(id="systemUser_userName")
private WebElement empUserName;

@FindBy(id="systemUser_status")
private WebElement empStatus;

@FindBy(id="systemUser_password")
private WebElement empPassword;

@FindBy(id="systemUser_confirmPassword")
private WebElement confirmPassword;

@FindBy(id="btnSave")
private WebElement saveUser;

public UserPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
public void clickAddButton() {
	addButton.click();
}

public void verifyUserPage() {
	validateTest(addButton.isDisplayed());
}

public void addNewUsers(String role,String empName,String userName, String status, String password) throws InterruptedException {
	selectVisibleText(role, userType);
	emp_Name.sendKeys(empName);
	empUserName.sendKeys(userName);
	selectVisibleText(status, empStatus);
	empPassword.sendKeys(password);
	Thread.sleep(5000);
	confirmPassword.sendKeys(password);
	Thread.sleep(5000);
	saveUser.click();
}
	
}
