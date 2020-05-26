package common;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class BrowserActions {
	WebDriver driver;

	public BrowserActions(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isDisplayed(WebElement element) {
		waitForElementToBeClickable(element);
		return element.isDisplayed();
	}

	public boolean isEnable(WebElement element) {
		waitForElementToBeClickable(element);
		return element.isEnabled();
	}

	public void sendKeys(WebElement element, String text) {
		waitForElementToBeClickable(element);
		element.sendKeys(text);
	}

	public String getDefaultOptionSelected(WebElement element){
		return new Select(element).getFirstSelectedOption().getText();
	}
	
	public List<WebElement> getOptionsFromSelectDropDown(WebElement element) {
		return new Select(element).getOptions();
	}
	
	public void selectDropdownByVisibleText(WebElement element, String text) {
		waitForElementToBeClickable(element);
		new Select(element).selectByVisibleText(text);
	}

	public void selectDropdownByIndex(WebElement element, int index) {
		waitForElementToBeClickable(element);
		new Select(element).selectByIndex(index);
	}

	public void selectDropdownByValue(WebElement element, String value) {
		waitForElementToBeClickable(element);
		new Select(element).selectByValue(value);
	}

	public void waitForElementToBeClickable(WebElement element) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForElementToBeClickable(WebElement element,int timeInSeconds) {
		new WebDriverWait(driver, timeInSeconds).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForVisibilityOfElement(WebElement element,int timeInSeconds) {
		new WebDriverWait(driver, timeInSeconds).until(ExpectedConditions.visibilityOf(element));
	}

	public WebElement waitForElementRefreshed(WebDriver driver, WebElement element, int secondsToWait) {
		try {
			this.waitForJavaScriptAndJqueryToLoad(driver, secondsToWait);
			element = getWebElementReInitialized(driver, element);
		}

		catch (Exception st) {
		}
		return element;
	}

	public void waitForJavaScriptAndJqueryToLoad(WebDriver driver, long timeInSeconds) {
		new WebDriverWait(driver, timeInSeconds).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return isJavaScriptRunning(driver);
			}
		});
	}

	public WebElement getWebElementReInitialized(WebDriver driver, WebElement element) {
		return driver.findElement(this.decomposeWebElement(element));
	}

	public Boolean isJavaScriptRunning(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return (Boolean) js.executeScript("return jQuery.active == 0");
	}

	public By decomposeWebElement(WebElement element) {

		By byObject;
		String locator = this.getLocator(element);
		String selector = this.getSelector(element);

		switch (locator.toLowerCase()) {
		case "id":
			byObject = By.id(selector);
			break;
		case "css":
			byObject = By.cssSelector(selector);
			break;
		case "classname":
			byObject = By.className(selector);
			break;
		case "linktext":
			byObject = By.linkText(selector);
			break;
		case "tagname":
			byObject = By.tagName(selector);
			break;
		case "xpath":
			byObject = By.xpath(selector);
			break;
		case "partiallinktext":
			byObject = By.partialLinkText(selector);
			break;
		case "name":
			byObject = By.name(selector);
			break;
		default:
			throw new NoSuchElementException(
					"No action defined for this type of web element or web element is incorrect");
		}

		return byObject;
	}

	public String getLocator(WebElement el) {
		String[] thirdSplit = this.extractor(el)[0].split(" ");
		return thirdSplit[1].trim();
	}

	public String getSelector(WebElement el) {
		return removeLastCharFromString(this.extractor(el)[1].trim());
	}

	public String[] extractor(WebElement el) {
		String[] firstSplit = el.toString().split("->");
		String[] secondSplit = firstSplit[1].split(": ");
		return secondSplit;
	}

	public String removeLastCharFromString(String str) {
		if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == ']') {
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}

	public void waitForElementToBeInVisible(WebElement element) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.invisibilityOf(element));
	}
	public void waitForElementToBeInVisible(WebElement element,int timeInSeconds) {
		new WebDriverWait(driver, timeInSeconds).until(ExpectedConditions.visibilityOf(element));
		new WebDriverWait(driver, timeInSeconds).until(ExpectedConditions.invisibilityOf(element));
	}
	public boolean isWebelementVisible(WebElement element) {
		return element.isDisplayed();
	}

	// Method can resolve issue: Element not clickable
	public void clickOnElementWhenElementNotClickable(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
	}

	public void waitForElement(int secondsToWait) throws InterruptedException {
		Thread.sleep(secondsToWait);
	}

	// to verify if screen/grid is scrollable and if has scroll, go to last
	// element visible after scroll
	public void setScrollBottomOfPage(WebElement element) throws InterruptedException {
		String JS_ELEMENT_IS_SCROLLABLE = "return arguments[0].scrollHeight > arguments[0].offsetHeight;";
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Boolean isScrollable = (Boolean) jse.executeScript(JS_ELEMENT_IS_SCROLLABLE, element);

		if (isScrollable) {
			jse.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", element);
			waitForElement(2000);
		}
	}

	//to verify if element is present and to avoid exceptions if element is not present
	public boolean isElementPresent(WebElement element) {
		try {
			if (element.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception ex) {
			return false;
		}
	}
	
	public void refreshPDPData( ExtentTest child)throws InterruptedException {
		try
		{	
			waitForElement(3000);
			String[] urlSplits=driver.getCurrentUrl().split("#");
			driver.navigate().to(urlSplits[0]+"?showReset#"+urlSplits[1]);
			waitForElement(5000);
			Reporter.log("Loading Reset URL to reset PDP data.");
			child.log(LogStatus.INFO,"Loading Reset URL to reset PDP data.");
			driver.findElement(By.cssSelector("div[class='reset-icon']")).click();
			Reporter.log("Clicked on Reset button to reset PDP data.");
			child.log(LogStatus.INFO,"Clicked on Reset button to reset PDP data.");
			waitForElement(10000);
		}
		catch (Exception ex) {
			Reporter.log("Exception : " + ex.getMessage());
			child.log(LogStatus.ERROR, ex.getMessage());
		}
	}
	
	public boolean clickWorklistTab (ExtentTest child,WebElement element, String Tab) throws InterruptedException {
		element.click();
		Reporter.log("Click on Worklist Tab.");
		child.log(LogStatus.INFO, "Click on "+ Tab +" Tab.");
		return true;
		}
}
