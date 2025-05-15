package com.demoqa.Elementspage.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utilities.demoqa.AppUtils;

public class Links {

	
		WebDriver driver;
		AppUtils au = new AppUtils();

		public Links (WebDriver driver) {
			this.driver = driver;
		}
		String linkIcon="//span[contains(text(),'Links')]";
		String link="//a[@id='simpleLink']";
		
		public void linkText() {
			
			au.iClick(driver, linkIcon);
			

			
			WebElement linkselect=driver.findElement(By.xpath(link));
			String actualText = linkselect.getText();
			String expectedText = "Home";
			Assert.assertEquals(actualText, expectedText, "Link text does not match!");
			au.iClick(driver, link);
		}
}

		