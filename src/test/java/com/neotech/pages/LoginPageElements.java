package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class LoginPageElements extends CommonMethods {

	@FindBy(id = "tUsername")
	public WebElement username;

	@FindBy(id = "tPassword")
	public WebElement password;

	@FindBy(id = "dAcademicYear_list")
	public WebElement Acadyear;
	
	@FindBy(id ="bLogin")
	public WebElement loginButton;
	
	@FindBy(id ="Body")
	public WebElement Msg;
	
	
	public LoginPageElements() {
		PageFactory.initElements(driver, this);

	}
	
	
}
