package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import PageObjects.LandingPage;
import io.cucumber.java.en.Given;
import utils.TestContext;

public class LandingPageSteps {

	TestContext testContext;

	public LandingPageSteps(TestContext testContext) {
		this.testContext = testContext;
	}

	@Given("^User login with (.+) and (.+), and redirect to product inventory page$")
	public void user_login_with_and_and_redirect_to_product_inventory_page(String username, String password) {

		LandingPage landingPage = new LandingPage(testContext.driver);
		landingPage.login(username, password);

	}

}
