package com.atd.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atd.pageobjects.LoginPage;

public class LoginTest {
	
	private WebDriver driver;
	private String URL="http://qa.atdonline.com/";
	private LoginPage loginPage;
	
	
	@BeforeTest
	public void setUp(){
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\E002299\\Downloads\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
		
		//loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
		
	}
	
//	@Test(priority=1)
//	public void loginValidUser(){
//		
//		String userName="legacy1151";
//		String pwd="legacy1151";
//		loginPage=new LoginPage(driver);
//		loginPage.loginAtdLegacy(userName, pwd);
//					
//		
//	}
//	
//	@Test(priority=2)
//	public void loginInvalidUserValidPwd(){
//		
//	}
//	
//	@Test
//	public void loginValidUserInvalidPwd(){
//		
//	}
//	
//	@Test
//	public void loginInvalidUserAndPwd(){
//		
//	}

}
