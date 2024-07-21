package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import luma.utils.SeleniumDriver;

public class Hooks {

	@Before()
	public static void setUp() {
		
		System.out.println("@Before hook - Launching Browser :");
		SeleniumDriver.setUpDriver();
	}
	
	@After
	public static void tearDown(Scenario scenario) {
		
		System.out.println("@After hook - Closing Browser");
		
		WebDriver driver = SeleniumDriver.getDriver();
		if (scenario.isFailed()) {
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotBytes, "image/png", "screenshot");

		}
		SeleniumDriver.tearDown();
	}
}
