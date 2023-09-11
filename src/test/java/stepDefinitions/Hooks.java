package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

/**
 * @author Maicon Fang
 * @version 1.0
 * @Description: This class, named Hooks, is responsible for managing hooks in a
 *               Cucumber test framework. Hooks are actions that are executed
 *               before or after specific scenarios or steps. Here's a brief
 *               summary of what this class does:
 * 
 *               It handles the setup and teardown of the test environment
 *               before and after scenarios. In the @After hook, it quits the
 *               WebDriver to clean up resources after each scenario. In
 *               the @AfterStep hook, it captures a screenshot of the web page
 *               if a scenario fails and attaches it to the report. Overall,
 *               this class helps ensure the proper setup and cleanup of
 *               resources for Cucumber scenarios, and it provides screenshot
 *               capture functionality to aid in debugging and reporting when
 *               scenarios fail.
 */
public class Hooks {
	TestContextSetup testContextSetup;

	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@After
	public void AfterScenario() throws IOException {
		testContextSetup.testBase.WebDriverManager().quit();
	}

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver = testContextSetup.testBase.WebDriverManager();
		if (scenario.isFailed()) {
			// screenshot
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");

		}

	}

}
