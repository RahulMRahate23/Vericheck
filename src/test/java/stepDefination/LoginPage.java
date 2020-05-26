package stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common.AutoLogger;
import common.BasePage;

@RunWith(Cucumber.class)
public class LoginPage extends BasePage {
	
	@FindBy(xpath = "//*[@id='logonIdentifier']")
	WebElement username;

	@FindBy(xpath = "//*[@id='password']")
	WebElement password;

	@FindBy(xpath = "//*[@id='next']")
	WebElement loginBtn;

	@FindBy(linkText = "Worklist")
	WebElement worklistsLink;

	@FindBy(xpath = "//*[@id='UR003']")
	WebElement yourEmailAddress;

	@FindBy(xpath = "//*[@id='RM002']")
	WebElement fullName;
	
	@FindBy(xpath = "//*[@id='UR005']")
	WebElement passwordM;
	
	@FindBy(xpath = "//*[@id='UR005']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@id='recaptcha-anchor']")
	WebElement imNotRobot;
	
	@FindBy(xpath = "//*[@class='registerbtn']")
	WebElement registerButton;
	
	public LoginPage(WebDriver driver, AutoLogger handler) {
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}

	    @When("^User login into appliction with username and password$")
	    public void user_login_into_appliction_with_username_and_password(String username, String password, ExtentTest child) throws Throwable {
	    	actions.sendKeys(this.username, username);
			Reporter.log("Username entered.");
			child.log(LogStatus.INFO, "Username entered.");

			actions.sendKeys(this.password, password);
			Reporter.log("Password entered.");
			child.log(LogStatus.INFO, "Password entered.");

			loginBtn.click();
			Reporter.log("Click on Login Button.");
			child.log(LogStatus.INFO, "Click on Login Button.");
			Thread.sleep(5000);
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    System.out.println("Home Page");
	    }

	    @And("^Cads are display$")
	    public void cads_are_display() throws Throwable {
	    	System.out.println("Card Display ");
	    }
	
	/*	
	 * This method is used to register Merchant
	 * @param username, password
	 * @return Nothing
	 * @exception InterruptedException.
	 */
	public void registerMerchant(String username, String password, ExtentTest child) throws InterruptedException {
		actions.sendKeys(this.username, username);
		Reporter.log("Username entered.");
		child.log(LogStatus.INFO, "Username entered.");

		actions.sendKeys(this.password, password);
		Reporter.log("Step 1: Password entered.");
		child.log(LogStatus.INFO, "Password entered.");

		loginBtn.click();
		child.log(LogStatus.INFO, "Click on Login Button.");
	}
}
