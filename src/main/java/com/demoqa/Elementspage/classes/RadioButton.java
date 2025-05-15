package com.demoqa.Elementspage.classes;

import org.openqa.selenium.WebDriver;

import com.utilities.demoqa.AppUtils;

public class RadioButton {
	WebDriver driver;
	AppUtils au = new AppUtils();

	public RadioButton(WebDriver driver) {
		this.driver = driver;
	}
	String radioButtonIcon="//span[contains(text(),'Radio Button')]";
	

}
