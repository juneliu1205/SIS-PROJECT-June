package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StudentsPageElements extends CommonMethods {
	
	@FindBy(id="bAdd")
	public WebElement addNew;
	
	@FindBy(id="tStateId")
	public WebElement StuID;
	
	@FindBy(id="tLastName")
	public WebElement LName;
	
	@FindBy(id="tFirstName")
	public WebElement FName;
	
	@FindBy(id="tEmail")
	public WebElement email;
	 
	@FindBy(id="tBirthDay")
	public WebElement Bday;
	
	@FindBy(id="gender_list")
	public WebElement gender;
	
	@FindBy(id="lunchType")
	public WebElement lunch;
	
	@FindBy(id="ddEthnicity_list")
	public WebElement ethnicity;
	
	@FindBy(id="ddRaceNew")
	public WebElement race;
	
	@FindBy(id="cGradeLevel_list")
	public WebElement gLevel;
	
	@FindBy(id="tPassword")
	public WebElement password;
	
	@FindBy(id="tParent")
	public WebElement parent;
	
	@FindBy(id="tAddress")
	public WebElement addRess;
	
	@FindBy(id="tCity")
	public WebElement city;
	
	@FindBy(id="tState")
	public WebElement state;
	
	@FindBy(id="tZip")
	public WebElement zip;
	
	@FindBy(xpath="//input[@id='tHomePhone']")
	public WebElement phoneNum;
	
	@FindBy(id="photoChange")
	public WebElement photo;
	
	@FindBy(id="fileUpload")
	public WebElement fileUpload;
	
	@FindBy(id="bSubmit")
	public WebElement photosubmit;
	
	@FindBy(id="bSubmit")
	public WebElement submit;
	
	@FindBy(id="students_students")
	public WebElement checkstudent;
	
	@FindBy(id="lblLocalId")
	public WebElement showpage;
	
	
	public StudentsPageElements() {
		PageFactory.initElements(driver, this);
	}
	

}