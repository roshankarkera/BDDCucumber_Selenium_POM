package stepDefinitions;

import PageObjects.ProductInventory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContext;

public class ProductInventorySteps {

	public TestContext testContext;
	private ProductInventory productInventory;

	public ProductInventorySteps(TestContext testContext) {
		this.testContext = testContext;
		productInventory = new ProductInventory(testContext.driver);
	}

	@When("^User add product (.+) to cart$")
	public void user_add_product_to_cart(String productName) {
		productInventory.addProductToCart(productName);

		testContext.productName = productName.trim();

	}

	@When("User proceed to cart page")
	public void user_proceed_to_cart_page() {

		productInventory.goToCartPage();
	}

}
