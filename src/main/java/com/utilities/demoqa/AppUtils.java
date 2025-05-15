package com.utilities.demoqa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppUtils {

//	public void enterText(WebElement textbox, String text) throws Exception {
//		try {
//			Thread.sleep(500);
//			if (textbox.isDisplayed()) {
//				System.out.println("given is Displayed.");
//				textbox.sendKeys(text);
//			} else {  
//				System.out.println("given is not displayed.");
//			}
//		}catch(NoSuchElementException ex) {
//			throw new Exception("element is not displayed");
//		}catch(Exception ex) {
//			throw new Exception("Exception occurred: " + ex.getMessage());
//		}
//	}
//	
//	public void buttonSelect(WebElement button) throws Exception {
//		try {
//
//			if (button.isDisplayed()) {
//				System.out.println("given is Displayed.");
//				button.click();
//			} else {  
//				System.out.println("given is not displayed.");
//			}
//		}catch(NoSuchElementException ex) {
//			throw new Exception("element is not displayed");
//		}catch(Exception ex) {
//			throw new Exception("Exception occurred: " + ex.getMessage());
//		}
//	}

	public void iClick(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		try {

			((JavascriptExecutor) driver)
					.executeScript("let el = document.getElementById('fixedban'); if (el) el.style.display='none';");

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

			WebElement element = driver.findElement(By.xpath(xpath));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

			element.click();
			System.out.println("Given element with xpath--> " + xpath + " is clicked");

		} catch (ElementClickInterceptedException e) {

			WebElement element = driver.findElement(By.xpath(xpath));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			System.out.println("Clicked using JS due to interception on element with xpath--> " + xpath);
		}
	}

	public void iSendKeys(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).sendKeys();

	}
}