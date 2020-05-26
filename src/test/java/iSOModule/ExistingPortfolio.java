package iSOModule;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.NoSuchElementException;
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
public class ExistingPortfolio extends BasePage {
	
	@FindBy(xpath = "//*[@title='Add']")
	WebElement AddBankDetailsButton;
	
	@FindBy(xpath = "//a[text()='Existing Portfolio']")
	WebElement ExistingPortfolioTab;

	@FindBy(xpath = "//*[@ng-reflect-name='bank_account_type']")
	WebElement BankAccountTypeDD;

	@FindBy(xpath = "//*[@ng-reflect-name='bank_type']")
	WebElement BankTypeDD;
	
	@FindBy(xpath = "//*[@ng-reflect-name='bank_type']//following::span[1]")
	WebElement BankTypeDDError;

	@FindBy(xpath = "//*[@ng-reflect-name='bank_account_number']")
	WebElement BankAccountNumber;

	@FindBy(xpath = "//*[@ng-reflect-name='confirm_bank_account_number']")
	WebElement ConfirmBankAccountNumber;
	
	@FindBy(xpath = "//*[@class='fa fa-edit']")
	WebElement EditButton;
	
	@FindBy(xpath = "//label[text()='Bank Name']/following::label[1]")
	WebElement GetBankName;
	
	@FindBy(xpath = "//label[text()='Expected Dollars Per Month']/following::p[1]")
	WebElement GetExpectedDollarsPerMonthError;
	
	@FindBy(xpath = "//*[@id='hideMe']")
	WebElement GetSuccessMessage;
	
	@FindBy(xpath = "//*[contains(text(),'Billing Email Address')]/following::label[2]")
	WebElement GetBillingEmailAddress;
	
	@FindBy(xpath = "//*[contains(text(),'Manager Email')]/following::label[2]")
	WebElement GetManagerEmail;
	
	@FindBy(xpath = "//*[@ng-reflect-name='expected_amount_per_month']")
	WebElement ExpectedAmountPerMonth;
	
	@FindBy(xpath = "//*[@id='websiteUrlId']")
	WebElement WebsiteUrlId;

	@FindBy(xpath = "//*[@id='state']")
	WebElement StateDD;
	
	@FindBy(xpath = "//*[@class='form-control']")
	WebElement SelectNoteDD;
	
	@FindBy(xpath = "//*[@id='saveContact']")
	WebElement SaveButton;
	
	@FindBy(xpath = "//*[@class='savegreen']")
	WebElement SaveExistingPortfolio;
	
	@FindBy(xpath = "//*[@ng-reflect-name='routing_number']")
	WebElement RoutingNum;
	
	@FindBy(xpath = "//*[@data-original-title='View']")
	WebElement ViewBankDetails;
	
	@FindBy(xpath = "//*[contains(text(),'Billing Email Address')]/a[@data-original-title='View']")
	WebElement ViewBillingEmailAddress;
	
	@FindBy(xpath = "//*[contains(text(),'Manager Email')]/a[@data-original-title='View']")
	WebElement ViewManagerEmail;
	
	@FindBy(xpath = "//*[@id='zipcode']")
	WebElement ZipCode;


	
	
	public ExistingPortfolio(WebDriver driver, AutoLogger handler) {
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}

	@When("^Entered Bank Account Number And Confirm Bank Account Number")
	public void enterBankAccountNumberAndConfirmBankAccountNumber(String AccountNumber, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(BankAccountNumber, 60);
		actions.sendKeys(this.BankAccountNumber, AccountNumber);
		Reporter.log("Bank Account Number name entered as:- " + AccountNumber);
		child.log(LogStatus.INFO, "Bank Account Number name entered as:- " + AccountNumber);
		
		actions.waitForElementToBeClickable(ConfirmBankAccountNumber, 60);
		actions.sendKeys(this.ConfirmBankAccountNumber, AccountNumber);
		Reporter.log("Confirm Bank Account Number entered as:- " + AccountNumber);
		child.log(LogStatus.INFO, "Confirm Bank Account Number entered as:- " + AccountNumber);
	}

	@When("^Entered Bank Routing number ")
	public void enterRoutingNumber(String Routing, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(RoutingNum, 60);
		actions.sendKeys(this.RoutingNum, Routing);
		Reporter.log("Routing number entered as:- " + Routing);
		child.log(LogStatus.INFO, "Routing number entered as:- " + Routing);
	}

	@When("^Entered Nick Name")
	public void enterExpectedAmountPerMonth(String Amount, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(ExpectedAmountPerMonth, 60);
		ExpectedAmountPerMonth.clear();
		actions.waitForElementToBeClickable(ExpectedAmountPerMonth, 60);
		actions.sendKeys(this.ExpectedAmountPerMonth, Amount);
		Reporter.log("Expected Amount Per Month entered as:- " + Amount);
		child.log(LogStatus.INFO, "Expected Amount Per Month entered as:- " + Amount);
	}
	
	@When("^Click And Select Account type field DD")
	public void clickAndSelectAccountType(String AccountType, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(BankAccountTypeDD, 60);
		actions.selectDropdownByVisibleText(BankAccountTypeDD, AccountType);
		Reporter.log("Selected Customer AccountType as:- " + AccountType);
		child.log(LogStatus.INFO, "Selected Customer AccountType as:- " + AccountType);
	}
	
	@When("^Click And Select Account type field DD")
	public void clickAndSelectBankTypeDD(String AccountType, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(BankTypeDD, 60);
		actions.selectDropdownByVisibleText(BankTypeDD, AccountType);
		Reporter.log("Selected Customer Bank Type as:- " + AccountType);
		child.log(LogStatus.INFO, "Selected Customer Bank Type as:- " + AccountType);
	}
	
	@When("^Click And Select Account type field DD")
	public void clickOnExistingPortfolioTab(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(ExistingPortfolioTab, 60);
		ExistingPortfolioTab.click();
		Reporter.log("Click on Existing Portfolio Tab.");
		child.log(LogStatus.INFO, "Click on Existing Portfolio Tab.");
	}
	
	@When("^Click And Select Account type field DD")
	public void clickOnAddBankDetailsButton(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(AddBankDetailsButton, 60);
		AddBankDetailsButton.click();
		Reporter.log("Click on Add Bank Details Button.");
		child.log(LogStatus.INFO, "Click on Add Bank Details Button.");
	}
	
	  @When("^Click on View Bank Details button.")
	    public void clickOnViewBankDetails(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(ViewBankDetails, 60);
			ViewBankDetails.click();
			Reporter.log("Click on View Bank Details button.");
			child.log(LogStatus.INFO, "Click on View Bank Details button.");
	    }

	  @When("^Click on View Bank Details button.")
	    public void clickOnEditButton(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(EditButton, 60);
			EditButton.click();
			Reporter.log("Click on Edit Button.");
			child.log(LogStatus.INFO, "Click on Edit Button");
	    }
	  
		@When("^Click And Select Account type field DD")
		public void clickAndSelectSelect(String Note, ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(SelectNoteDD, 60);
			actions.selectDropdownByVisibleText(SelectNoteDD, Note);
			Reporter.log("Selected Note as:- " + Note);
			child.log(LogStatus.INFO, "Selected Note as:- " + Note);
		}
	  

	@Then("^Click on view to open Legal Business Name details page. 7999")
	public boolean VerifExpectedDollarsPerMonth(ExtentTest child) throws Throwable {
		String input = "1213245666666,10000000000,Southee,1000000000";
		String ExpectedError1 ="Expected dollars per month field accepts only number with 2 decimals. (Err Code: CP005)";
		String ExpectedError2 ="Expected dollars per month field should be less than 10000000000.00. (Err Code: CP005)";
		String ExpectedError3 ="Portfolio details updated successfully!";

		String[] Expected = input.split(",");
		clickOnExistingPortfolioTab(child);
		clickOnEditButton(child);
		for (int i = 0; i < Expected.length; i++) {

			String ExpectedResult = Expected[i];
			Thread.sleep(2000);
		
			try {
				enterExpectedAmountPerMonth(ExpectedResult, child);
				Thread.sleep(2000);
				clickAndSelectSelect("Note RR", child);
				clickOnSaveExistingPortfolio(child);
				if(GetSuccessMessage.isDisplayed()) {
					actions.waitForElementToBeClickable(GetSuccessMessage, 60);
					String ActulResult1 = GetSuccessMessage.getText();
				if (ExpectedError3.equals(ActulResult1.trim())) {
					Reporter.log("Verify Expected Dollars Per Month with : - " + ExpectedResult + " and getting  " + ActulResult1);
					child.log(LogStatus.INFO, "Verify Expected Dollars Per Month with: - " + ExpectedResult + "getting  " + ActulResult1);
				} else {
					Reporter.log("Match Not found for:- " + ExpectedResult);
					child.log(LogStatus.INFO, "Match Not found for: -" + ExpectedResult);
					return false;
				}}
			}

			catch (NoSuchElementException e) {
				Thread.sleep(2000);
				String ActulResult = GetExpectedDollarsPerMonthError.getText();
				if (ExpectedError1.equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Verify Expected Dollars Per Month with : - " + ExpectedResult + " and getting  " + ActulResult);
					child.log(LogStatus.INFO, "Verify Expected Dollars Per Month with : - " + ExpectedResult + " and getting  " + ActulResult);
				} else if (ExpectedError2.equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Verify Expected Dollars Per Month with : - " + ExpectedResult + " and getting  " + ActulResult);
					child.log(LogStatus.INFO, "Verify Expected Dollars Per Month with : - " + ExpectedResult + " and getting  " + ActulResult);
				} else {
					Reporter.log("Match Not found for:- " + ExpectedResult);
					child.log(LogStatus.INFO, "Match Not found for: -" + ExpectedResult);
					return false;
				}
			}
		}
		return true;
	}

	   @When("^Click on Save Button")
	    public void clickOnSaveButton(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(SaveButton, 60);
	    	SaveButton.click();
			Reporter.log("Click on Save button.");
			child.log(LogStatus.INFO, "Click on Save button.");
	    }
	   
	   @When("^Click on Save Button")
	    public void clickOnSaveExistingPortfolio(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(SaveExistingPortfolio, 60);
			SaveExistingPortfolio.click();
			Reporter.log("Click on Update Existing Portfolio.");
			child.log(LogStatus.INFO, "Click on Update Existing Portfolio.");
			Thread.sleep(5000);
	    }
	   
	   @When("^Click on View Billing Email Address")
	    public void clickOnViewBillingEmailAddress(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(ViewBillingEmailAddress, 60);
			ViewBillingEmailAddress.click();
			Reporter.log("Click on Click on View Billing Email Address.");
			child.log(LogStatus.INFO, "Click on View Billing Email Address.");
			Thread.sleep(2000);
	    }
	   
	   @When("^Click on View Manager Email.")
	    public void clickOnViewManagerEmail(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(ViewManagerEmail, 60);
			ViewManagerEmail.click();
			Reporter.log("Click on View Manager Email.");
			child.log(LogStatus.INFO, "Click on View Manager Email.");
			Thread.sleep(5000);
	    }
	   
	
	@And("^Cads are display$")
	public void cads_are_display() throws Throwable {
		System.out.println("Card Display ");
	}
}
