package utils;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.WebDriver;

public class TestContext {
	
	public WebDriver driver;
	public String productName;
	
	public TestContext() {
		
		DriverManager driverManager = new DriverManager();
		this.driver = driverManager.WebDriverManager();
		
		
	}

}
