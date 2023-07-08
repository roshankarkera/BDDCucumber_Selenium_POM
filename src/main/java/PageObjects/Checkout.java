package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
	public WebDriver driver;

	public Checkout(WebDriver driver) {
		this.driver = driver;
	}

	By items = By.cssSelector(".cart_item");
	By checkoutBtn = By.id("checkout");

	By firstName = By.id("first-name");
	By lastName = By.id("last-name");
	By zipCode = By.id("postal-code");
	By continueBtn = By.id("continue");
	By finishBtn = By.id("finish");

	By orderConfTxt = By.cssSelector(".complete-header");

	public void verifyProductInCartPage(String productName) {

		List<WebElement> cartItems = driver.findElements(items);

		for (WebElement cartItem : cartItems) {
			if (cartItem.findElement(By.cssSelector("a div")).getText().equalsIgnoreCase(productName)) {
				System.out.println("Product is added to cart");
			}
		}
	}

	public void goToCheckoutPage() {
		driver.findElement(checkoutBtn).click();

	}

	public void completeCheckout() {
		driver.findElement(firstName).sendKeys("Auto1");
		driver.findElement(lastName).sendKeys("Auto1");
		driver.findElement(zipCode).sendKeys("12345");
		driver.findElement(continueBtn).click();
		driver.findElement(finishBtn).click();

	}

	public String verifyOrderCompletion() {
		return driver.findElement(orderConfTxt).getText();
	}
}
