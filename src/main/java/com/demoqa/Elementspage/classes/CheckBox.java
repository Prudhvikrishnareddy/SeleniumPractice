package com.demoqa.Elementspage.classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.utilities.demoqa.AppUtils;

public class CheckBox {

	WebDriver driver;
	AppUtils au = new AppUtils();

	public CheckBox(WebDriver driver) {
		this.driver = driver;
	}

	String checkBoxIcon = "//span[contains(text(),'Check Box')]";
	String chckBoxHome = "//span[contains(text(),'Home')]";

	public void checkBoxes() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//		driver.findElement(By.xpath(checkBoxIcon)).click();
		au.iClick(driver, checkBoxIcon);
		driver.findElement(By.xpath(chckBoxHome)).isSelected();
	 System.out.println("checkbox is not selected");
		au.iClick(driver, chckBoxHome);
//		driver.findElement(By.xpath(chckBoxHome)).click();

	}
	


}
