package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class HomePageElements extends CommonMethods {
	
	@FindBy(xpath="//img[@id='Header1_imgSchoolLogo']")
	public WebElement MainLogo;
	
	@FindBy(xpath="//table[@class='blockMid']/tbody/tr/td/span")
	public WebElement announcements	;
	
	
	@FindBy(xpath="//*[@id='form1']//tr[1]/td[1]//td[6]/a")
	public WebElement students	;
	
	@FindBy(xpath="//span[text()='Personal']")
	public  WebElement personaltab;
	
	@FindBy(xpath="//a[@class='subMenuItem']")
	public  List<WebElement> subtab;
	
	
	public HomePageElements() {
		PageFactory.initElements(driver, this);
	}
	

}