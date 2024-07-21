package luma.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import luma.base.BasePage;


public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger(BasePage.class);

	public static String browser;
	private static WebDriverWait wait;
	public final static int TIMEOUT = 10;

	private SeleniumDriver() {

		

			// to read both config and OR properties file
			try {
				fis = new FileInputStream("./src/main/resources/properties/Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			log.info("Config file loaded !!!");

			try {
				fis = new FileInputStream("./src/main/resources/properties/OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				OR.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			log.info(" OR file is loaded!!!");

			// to reach browser name provided
			if (config.getProperty("browser").equals("safari")) {

				driver = new SafariDriver();
			} else if (config.getProperty("browser").equals("chrome")) {

				driver = new ChromeDriver();
			}

			// to reach testsite url
//			driver.get(config.getProperty("testsiteurl"));
//			log.info("Navigated to : " + config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			// defining waits
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
			wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));

		}
	

	public static void openPage(String url) {

		// System.out.println(url);
//		System.out.println(driver);
//		driver.get(config.getProperty("testsiteurl"));
//		log.info("Navigated to : " + config.getProperty("testsiteurl"));
		driver.get(url);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setUpDriver() {
		if (seleniumDriver == null)
			seleniumDriver = new SeleniumDriver();

	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}

	public static void waitForPageToLoad() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
