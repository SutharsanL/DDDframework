package com.vcentry.lab.pages;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vcentry.lab.testBase.BaseClass;

public class LoginPage {
	WebDriver driver; //global variable

	@FindBy(name="txtUsername")
	private WebElement username;
	
	@FindBy(name="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement login;
	
	public LoginPage(WebDriver driver) { //assign value to global variable(WebDriver driver) 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String uName) {
            username.sendKeys(uName);
           }
	
	public void enterPassword(String pwd) {
		   password.sendKeys(pwd);
		  }
	
	public void clickLogin() {
		   login.click();
		   }
}
