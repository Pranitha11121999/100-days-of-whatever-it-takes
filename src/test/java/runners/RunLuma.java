package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/resources/features/SignIn.feature",glue= {"stepDefinations"},tags="@SignIn",plugin= {"html:target/cucumber-reports/cucumber-html-report.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class RunLuma extends AbstractTestNGCucumberTests {

}
