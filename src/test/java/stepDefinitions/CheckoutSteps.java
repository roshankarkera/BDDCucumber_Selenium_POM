package stepDefinitions;



import java.sql.Driver;

import org.testng.Assert;

import PageObjects.Checkout;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContext;

public class CheckoutSteps {
	
	public TestContext testContext;
	private Checkout checkout;
	
	public CheckoutSteps(TestContext testContext) {
		this.testContext=testContext;
		checkout = new Checkout(testContext.driver);
	}
	
	
	@Then("Verify added product showing in cart")
	public void verify_added_product_showing_in_cart() {
		
		checkout.verifyProductInCartPage(testContext.productName);
		checkout.goToCheckoutPage();
	    
	    
	}
	
	@Then("Verify user is able to proceed to checkout and place order successfully")
	public void verify_user_is_able_to_proceed_to_checkout_and_place_order_successfully() {
	    
		checkout.completeCheckout();
		String msg = checkout.verifyOrderCompletion();
		Assert.assertEquals(msg,"Thank you for your order!");
		testContext.driver.close();

}
	


}
