package PageObjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By usern = By.id("user-name");
	By passwrd = By.id("password");
	By loginBtn = By.id("login-button");

	public ProductInventory login(String username, String password) {
		driver.findElement(usern).sendKeys(username);
		driver.findElement(passwrd).sendKeys(password);
		driver.findElement(loginBtn).click();
		return new ProductInventory(driver);
	}

}
