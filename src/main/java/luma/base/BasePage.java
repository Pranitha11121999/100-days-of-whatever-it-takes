package luma.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.log4j.Logger;

import com.aventstack.extentreports.ExtentTest;

import luma.utils.SeleniumDriver;

public class BasePage {

	public static WebDriver driver;
	public BasePage() {
		
		driver = SeleniumDriver.getDriver();
	}
	

	// Common Keywords
	public static void click(String locator) {

		if (locator.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).click();
		} else if (locator.endsWith("_XPATH")) {

			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).click();
		} else if (locator.endsWith("_ID")) {

			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).click();
		}
		SeleniumDriver.log.info("Clicking on Element :" + locator);
	}

	public static void type(String locator, String value) {

		if (locator.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_XPATH")) {

			driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_ID")) {

			driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).sendKeys(value);
		}
		SeleniumDriver.log.info("Typing in an Element :" + locator + "Entered value as :" + value);
	}

	static WebElement dropdown;

	public void select(String locator, String value) {

		if (locator.endsWith("_CSS")) {
			dropdown = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator)));

		} else if (locator.endsWith("_XPATH")) {

			dropdown = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator)));
		} else if (locator.endsWith("_ID")) {

			dropdown = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator)));
		}

		Select select = Select(dropdown);
		select.selectByVisibleText(value);
		SeleniumDriver.log.info("Selecting from an element :" + locator + "entered value as :" + value);

	}

	private Select Select(WebElement dropdown2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getText(String locator) {

		if (locator.endsWith("_XPATH")) {

			locator = driver.findElement(By.xpath(SeleniumDriver.OR.getProperty(locator))).getText();
		} else if (locator.endsWith("_CSS")) {

			locator = driver.findElement(By.cssSelector(SeleniumDriver.OR.getProperty(locator))).getText();
		} else if (locator.endsWith("_ID")) {

			locator = driver.findElement(By.id(SeleniumDriver.OR.getProperty(locator))).getText();
		}
		return locator;
	}
}
