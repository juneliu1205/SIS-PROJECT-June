package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.Duration;

public class StudentFunctionality extends CommonMethods {
	
	
	
	@When("User will be able to see and click the add new tab")
	public void user_will_be_able_to_see_and_click_the_add_new_tab() {
		student.addNew.click();
	}

	
	@When("User fill up detail")
	public void user_will_filled_up_details() {
	    sendText(student.StuID, "12586");
	    wait(1);
	    sendText(student.LName, "Mccallister");
	    wait(1);
	    sendText(student.FName, "Kevin");
	    wait(3);
	    sendText(student.email, "kevin123@gmail.com");
	    wait(1);
	    sendText(student.Bday, "11/11/2008");
	    wait(1);
	    selectDropdown(student.gender, "Male");
	    wait(1);
	    selectDropdown(student.lunch, 1);
	    wait(1);
	    selectDropdown(student.ethnicity, 4);
	    wait(3);
	    selectDropdown(student.gLevel, 12);
	    wait(2);
	    sendText(student.password, "kevin123");
	    wait(2);
	    
	    click(student.submit);
	    wait(1);
	    
	    acceptAlert();
	    click(student.photo);
	    
	    switchToChildWindow();
	    
	    String filePath = System.getProperty("user.dir")+"/screenshot/SIS/Kevin.jpg";
	    sendText(student.fileUpload, filePath);
	    click(student.photosubmit);
	    acceptAlert();
	    switchToChildWindow();
	    wait(2);
	
	}
	    
	@Then("Validate student is created success message is displayed")
	public void validate_student_is_created_success_message_is_displayed() {
		
		 waitForVisibility(student.checkstudent);
		 
		String studentName = student.checkstudent.getText();
		Assert.assertTrue("Contains Invalid Characters!", studentName.contains("Mccallister Kevin"));
		 
	
		    
	}
}
