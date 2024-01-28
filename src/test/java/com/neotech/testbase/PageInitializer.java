package com.neotech.testbase;

import com.neotech.pages.HomePageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.StudentsPageElements;

public class PageInitializer extends BaseClass {

		// initialize pages
	
		public static LoginPageElements login;
		public static HomePageElements homepage;
		public static StudentsPageElements student;
		
		
		
		public static void initialize() {
			login = new LoginPageElements();
			homepage = new HomePageElements();
			student = new StudentsPageElements();
	}

		

}