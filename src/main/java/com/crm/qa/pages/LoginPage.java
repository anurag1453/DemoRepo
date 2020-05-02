package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	//page Factory
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[contains(@class, 'ui fluid large blue submit button')]")
	WebElement submitBtn;
	
	@FindBy(xpath="//a[contains(text(), 'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//span[contains(text(), 'Log In')]")
	WebElement logIn;
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd)
	{
		logIn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		submitBtn.click();
		
		return new HomePage();
	}
	
	
	
}
