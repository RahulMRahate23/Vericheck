/*package stepDefination;

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
public class CustomersPage extends BasePage {
	
	@FindBy(xpath = "//*[text()=' Active ']")
	WebElement ActiveCheckBox;
	
	@FindBy(xpath = "//*[@formcontrolname='accountNumber']")
	WebElement AccountNumber;
	
	@FindBy(xpath = "//*[text()=' Create Customer ']")
	WebElement CreateCustomer;
	
	@FindBy(xpath = "//*[text()='Checking']")
	public WebElement CheckingAccountType;
	
	@FindBy(xpath = "//*[@formcontrolname='name']")
	WebElement CustomerName;
	
	@FindBy(xpath = "//*[contains(text(),'Customers')]")
	WebElement CustomerTab;

	@FindBy(xpath = "//*[@class='nextbtn']")
	WebElement OKButton;
	
	@FindBy(xpath = "//*[text()='Cancel']")
	WebElement CancelButton;
	
	@FindBy(xpath = "//*[@mask='999-999-9999']")
	WebElement Phone;
	
	@FindBy(xpath = "//*[@mask='999999999']")
	WebElement RoutingNumber;

	@FindBy(xpath = "//*[text()='Save']")
	WebElement SaveButton;
	
	@FindBy(xpath = "//*[text()='Savings']")
	public WebElement SavingsAccountType;
	
	@FindBy(xpath = "//*[@id='selectEntityId']")
	WebElement SelectEntity;
	
	@FindBy(xpath = "//*[@formcontrolname='email']")
	WebElement yourEmailAddress;

	public CustomersPage(WebDriver driver, AutoLogger handler) {
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}

	   @When("^Select Entity")
	    public void SelectEntity(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(SelectEntity, 60);
			actions.selectDropdownByVisibleText(SelectEntity, "Sandbox-Merchant");
			Reporter.log("Customer switch to Sandbox-Merchant");
			child.log(LogStatus.INFO, "Customer switch to Sandbox-Merchant");
	    }   
	   
	   @When("^Click And Select Customer AccountType")
	    public void clickOnOKButton(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(OKButton, 60);
			OKButton.click();
			Reporter.log("Click on OK button and You are switching the account.");
			child.log(LogStatus.INFO, "Click on OK button and You are switching the account.");
	    }
	
	   @When("^Click on Customer Tab")
	    public void clickOnCustomerTab(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(CustomerTab, 60);
			CustomerTab.click();
			Thread.sleep(5000);
			Reporter.log("Click on OK button and You are switching the account.");
			child.log(LogStatus.INFO, "Click on OK button and You are switching the account.");
	    }
	   
	@When("^Entered Customer Name")
	    public void enterCostomerName(String Customer, ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(CustomerName, 60);
	    	actions.sendKeys(this.CustomerName, Customer);
			Reporter.log("Customer Name entered as:- "+ Customer);
			child.log(LogStatus.INFO, "Customer Name entered as:- "+ Customer);
	    }
	    
	    @When("^Click Create Customer link")
	    public void clickCreateCustomerLink(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(CreateCustomer, 60);
	    	CreateCustomer.click();
			Reporter.log("Click on Create Customer link.");
			child.log(LogStatus.INFO, "Click on Create Customer link.");
	    }
	    
	    @When("^Entered Customer Routing Number")
	    public void enterRoutingNumber(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(RoutingNumber, 60);
	    	actions.sendKeys(this.RoutingNumber, "011001276");
			Reporter.log("Routing Number entered as:- "+ 011001276);
			child.log(LogStatus.INFO, "Routing Number entered as:- "+ CustomerName);
	    }
	    
	    @When("^Entered Customer Account number")
	    public void enterAccountNumber(String Account, ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(AccountNumber, 60);
	    	actions.sendKeys(this.AccountNumber, Account);
			Reporter.log("Account Number entered as:- "+ Account);
			child.log(LogStatus.INFO, "Account Number entered as:- "+ Account);
	    }
	    
	    @When("^Entered Customer Email Address")
	    public void enterEmail(String Email, ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(yourEmailAddress, 60);
	    	actions.sendKeys(this.yourEmailAddress, Email);
			Reporter.log("Email Address entered as:- "+ Email);
			child.log(LogStatus.INFO, "Email Address entered as:- "+ Email);
	    }
	    
	    @When("^Entered Customer Phone number")
	    public void enterPhoneNumber(String PhoneNumber, ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(Phone, 60);
	    	actions.sendKeys(this.Phone, PhoneNumber);
			Reporter.log("Phone number entered as:- "+ PhoneNumber);
			child.log(LogStatus.INFO, "Phone number entered as:- "+ PhoneNumber);
	    }
	    
	    @When("^Click And Select Customer AccountType")
	    public void clickAndSelectAccountType( WebElement AccountType,ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(AccountType, 60);
	    	AccountType.click();
			Reporter.log("Selected Customer AccountType as:- "+ AccountType.getText());
			child.log(LogStatus.INFO, "Selected Customer AccountType as:- "+ AccountType.getText());
	    }
	    
	    @When("^Click on Active Check Box")
	    public void clickOnActiveCheckBox(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(ActiveCheckBox, 60);
	    	ActiveCheckBox.click();
			Reporter.log("Click on Active Check Box.");
			child.log(LogStatus.INFO, "Click on Active Check Box.");
	    }
	    
	    @When("^Click on Save Button")
	    public void clickOnSaveButton(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(SaveButton, 60);
	    	SaveButton.click();
			Reporter.log("Click on Save button.");
			child.log(LogStatus.INFO, "Click on Save button.");
	    }
	    
	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    System.out.println("Home Page");
	    }

	    @And("^Cads are display$")
	    public void cads_are_display() throws Throwable {
	    	System.out.println("Card Display ");
	    }
}
*/