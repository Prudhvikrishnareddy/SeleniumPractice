package com.demoqa.Elementspage.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utilities.demoqa.AppUtils;

public class Buttons {
	WebDriver driver;
	AppUtils au = new AppUtils();
	
	public Buttons(WebDriver driver) {
		this.driver = driver;
	
	}
	String buttonsIcon="//span[contains(text(),'Buttons')]";
String doubleCLick="//button[@id='doubleClickBtn']";
String rightClick="//button[@id='rightClickBtn']";
String clickMe="//button[@id='uFz6W']";


public void ButtonsSelectupdated() {
	au.iClick(driver, buttonsIcon);

	Actions actions = new Actions(driver);
	actions.contextClick(driver.findElement(By.xpath("rightClick"))).perform();


	Actions actions1 = new Actions(driver);
	actions1.doubleClick(driver.findElement(By.xpath("doubleCLick"))).perform();

	au.iClick(driver, clickMe);
}
}


