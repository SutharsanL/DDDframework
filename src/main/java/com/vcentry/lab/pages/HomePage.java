package com.vcentry.lab.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;

@FindBy(id="menu_admin_viewAdminModule")
private WebElement admin;

@FindBy(id="menu_admin_UserManagement")
private WebElement userManagement;

@FindBy(id="menu_admin_viewSystemUsers")
private WebElement user;

	public HomePage(WebDriver driver) { //assign value to global variable(WebDriver driver) 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void navigateToUser() {
		Actions a =new Actions(driver);
		a.moveToElement(admin).moveToElement(userManagement).click(user).build().perform();
	}

}
