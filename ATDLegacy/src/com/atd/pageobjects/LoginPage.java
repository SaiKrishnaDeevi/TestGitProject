package com.atd.pageobjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	LoginPage loginPage;
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// identify all the web elements

	 @FindBy(id="f_userid")
	 private WebElement userName;
	 
	 @FindBy(id="f_password")
	 
	 private WebElement password;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement login;
	 
	 // Identify all the operations that need to be performed on these webelements
	 public void loginAtdLegacy(String name, String pwd){
		 userName.sendKeys(name);
		 password.sendKeys(pwd);
		 login.click();
		 System.out.println("dgfgfsfsdf");
		 
	 }

}
