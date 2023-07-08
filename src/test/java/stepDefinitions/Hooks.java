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
import utils.TestContext;


public class Hooks {
TestContext testContext;

	public Hooks(TestContext testContext) {
		this.testContext=testContext;
	}
	
	@After
	public void AfterScenario() throws IOException {
		testContext.driverManager.WebDriverManager().quit();
	}
}
