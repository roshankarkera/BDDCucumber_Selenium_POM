package PageObjects;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductInventory {
	
	public WebDriver driver;
	
	public ProductInventory(WebDriver driver) {
		this.driver = driver;
	}
	
	By productItems = By.cssSelector("div[class='inventory_item'] ");
	By shopping_cart_link = By.className("shopping_cart_link");
	
	
	public void addProductToCart(String productName) {
		
		List<WebElement> products = driver.findElements(productItems);
		for(WebElement product : products) {
			if(product.findElement(By.cssSelector("div div a div")).getText().equalsIgnoreCase(productName.trim())) {
				product.findElement(By.cssSelector("button")).click();
			}
		}
	}
		
		public void goToCartPage() {
			driver.findElement(shopping_cart_link).click();
			
		}
		
}


