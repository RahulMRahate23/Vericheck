package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected BrowserActions actions;
	protected WebDriver driver;
	protected AutoLogger handler;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		actions = new BrowserActions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
