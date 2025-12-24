package com.demoqa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoqa.Elementspage.classes.Buttons;
import com.demoqa.Elementspage.classes.CheckBox;
import com.demoqa.Elementspage.classes.HomePage;
import com.utilities.demoqa.BaseClass;

public class FunctionalTest extends BaseClass {

	private WebDriver driver;
	
	private CheckBox checkBox;
	private Buttons buttons;
	
	@Test
	public void setUp() {
		driver = getDriver();
		
		checkBox = new CheckBox(driver);
		buttons = new Buttons(driver);
		
	}

	
	

//public void checkBoxButton() {

		//checkBox.checkBoxes();
      // buttons.ButtonsSelect();
	}
//
	


