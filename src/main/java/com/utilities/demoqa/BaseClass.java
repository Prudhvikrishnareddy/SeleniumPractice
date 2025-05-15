package com.utilities.demoqa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	

	WebDriver driver;
	

	public WebDriver getDriver() {
		driver = new EdgeDriver();

		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		String actual_tile = driver.getTitle();

		if (actual_tile.equals("DEMOQA")) {
			System.out.println("Opened application is correct");
		} else {
			System.out.println("Application not opened");
		}
		return driver;

	}

}
