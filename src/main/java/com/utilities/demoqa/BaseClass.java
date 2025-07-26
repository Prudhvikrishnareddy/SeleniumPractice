package com.utilities.demoqa;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

    WebDriver driver;

    // Set the system property for ChromeDriver
    public WebDriver getDriver() {
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mprud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        
        // Use a reasonable timeout value (10 or 15 seconds is typically enough)
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Validate the page title
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("DEMOQA")) {
            System.out.println("Opened application is correct");
        } else {
            System.out.println("Application not opened success");
        }

        return driver;
    }
    
    // Optional: Method to close the browser and cleanup resources
     }

