package com.demoqa.Elementspage.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.utilities.demoqa.BaseClass;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	String btn = "//path[contains(@d, 'M16 132h416')]";

	public void selectElements() {
		WebElement icon = driver.findElement( By.xpath(btn));
		icon.click();

	}

}
