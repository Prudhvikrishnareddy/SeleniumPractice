package com.demoqa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoqa.Elementspage.classes.Buttons;
import com.demoqa.Elementspage.classes.CheckBox;
import com.demoqa.Elementspage.classes.HomePage;
import com.demoqa.Elementspage.classes.Links;
import com.demoqa.Elementspage.classes.TextBox;
import com.utilities.demoqa.BaseClass;

public class FunctionalTest extends BaseClass {

	private WebDriver driver;
	private TextBox textBox;
	private CheckBox checkBox;
	private Buttons buttons;
	private Links links;

	@BeforeMethod
	public void setUp() {
		driver = getDriver();
		textBox = new TextBox(driver);
		checkBox = new CheckBox(driver);
		buttons = new Buttons(driver);
		links = new Links(driver);
	}

	@Test(dataProvider = "eMailtextBox")
	public void testButton(String emailTextbox) {

		textBox.selectElements(emailTextbox);
	}
	
	@DataProvider(name = "eMailtextBox")
	public Object[] emailtextbox() {
		Object[] data = new Object[3];
		data[0] = "prudhviraj";
		data[1] = "prudhvirajreddy";
		data[2] = "mprudhviraj818@gmail.com";
		return data;
	}

@Test
public void checkBoxButton() {

		checkBox.checkBoxes();
//		// button.ButtonsSelect();
	}
//
	@Test
	public void linkButton() {
		links.linkText();
	}

}
