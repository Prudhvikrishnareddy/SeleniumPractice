package com.demoqa.Elementspage.classes;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class TextBox {

	WebDriver driver;

	public TextBox(WebDriver driver) {
		this.driver = driver;
	}

	String textBox = "//span[contains(text(),'Text Box')]";
	String fullNametext = "//input[@placeholder='Full Name']";
	String eMailText = "//input[@type='email']";
	String addressText = "//textarea[@id='currentAddress']";
	String permanentAddressText = "//textarea[@id='permanentAddress']";
	String submitBtn = "//button[@class='btn btn-primary']";

	@DataProvider(name = "eMailtextBox")
	public void emailtextbox() {
		Object[] data = new Object[2];
		data[0] = "prudhviraj";
		data[1] = "prudhvirajreddy";
		data[2] = "mprudhviraj818@gmail.com";
	}

	public void selectElements(String emailTextbox) {

		WebElement textBoxicon = driver.findElement(By.xpath(textBox));
		textBoxicon.click();
		WebElement fullName = driver.findElement(By.xpath(fullNametext));
		fullName.sendKeys("Prudhvi Raj Reddy");
		WebElement eMail = driver.findElement(By.xpath(eMailText));
		eMail.sendKeys(emailTextbox);
		WebElement address = driver.findElement(By.xpath(addressText));
		address.sendKeys("1-10, Manganellore Village, Sullurupeta Mandal, TirupathiDist, 524121");
		WebElement permanentAddress = driver.findElement(By.xpath(permanentAddressText));
		permanentAddress.sendKeys("1-10, Manganellore Village, Sullurupeta Mandal,Tirupathi Dist, 524121");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement submitButton = driver.findElement(By.xpath(submitBtn));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
		wait.until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButton.click();

	}

}
