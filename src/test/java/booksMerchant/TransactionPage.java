package booksMerchant;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
public class TransactionPage extends BasePage {

	@FindBy(xpath = "//*[@formcontrolname='amount']")
	WebElement Amount;
	
	@FindBy(xpath = "//*[@formcontrolname='addenda']")
	WebElement Addenda;
	
	@FindBy(xpath = "//a[text()='Bank Details']")
	WebElement BankDetailsTab;
	
	@FindBy(xpath = "//*[@formcontrolname='account_number']")
	WebElement BankAccountNumber;
	
	@FindBy(xpath = "//*[@ng-reflect-name='bank_type']//following::span[1]")
	WebElement BankTypeDDError;

	@FindBy(xpath = "//a[@routerlink='add']")
	WebElement CreateTransactionButton;
	
	@FindBy(xpath = "//*[@class='newcancel']")
	WebElement CancelButton;

	@FindBy(xpath = "//*[@formcontrolname='check_number']")
	WebElement CheckNumber;

	@FindBy(xpath = "//*[@formcontrolname='check_image_front']")
	WebElement CheckImageFront;

	@FindBy(xpath = "//*[@id='backCheckImg']")
	WebElement CheckImageBack;
	
	@FindBy(xpath = "//*[@formcontrolname='city']")
	WebElement City;
	
	@FindBy(xpath = "//label[text()='Savings']/following::label[1]")
	WebElement CheckingAccountType;
	
	@FindBy(xpath = "//*[@formcontrolname='description']")
	WebElement Description;

	@FindBy(xpath = "//*[@formcontrolname='email']")
	WebElement Email;
	
	@FindBy(xpath = "//*[@formcontrolname='id']")
	WebElement ExistingCustomerDD;
	
	@FindBy(xpath = "//*[@formcontrolname='item_research_number']")
	WebElement ItemResearchNumber ;
	
	@FindBy(xpath = "//*[@formcontrolname='standard_entry_class']")
	WebElement StandardEntryClassDD;

	@FindBy(xpath = "//*[@formcontrolname='transaction_type']")
	WebElement TransactionTypeDD;

	@FindBy(xpath = "//label[text()='Savings']/following::label[3]")
	WebElement GLAccountType;

	@FindBy(xpath = "//*[@formcontrolname='amount']/following::span[3]")
	WebElement GetAmountErrorMessage;
	
	@FindBy(xpath = "//*[@class='row headingacl newpadclass']/div[1]")
	WebElement GetSuccessfullyMessage;
	
	@FindBy(xpath = "//*[@class='row headingacl newpadclass']/div[2]")
	WebElement GetAlertMessage;
	
	@FindBy(xpath = "//*[@role='alert']/li")
	WebElement GetServerErrorMessage;
	
	@FindBy(xpath = "//label[text()='Savings']/following::label[2]")
	WebElement LoanAccountType;

	@FindBy(xpath = "//*[@formcontrolname='process_control_field']")
	WebElement ProcessControl ;
	
	@FindBy(xpath = "//*[@formcontrolname='routing_number']")
	WebElement RoutingNumber;

	@FindBy(xpath = "//label[text()='Savings']")
	WebElement SavingsAccountType;

	@FindBy(xpath = "//*[@class='savegreen']")
	WebElement SubmitButton;
	
	@FindBy(xpath = "//*[@formcontrolname='state']")
	WebElement State;
	
	@FindBy(xpath = "//*[@id='span_transactions']")
	WebElement TransactionTab;
	
	@FindBy(xpath = "//*[@formcontrolname='terminal_identification_code']")
	WebElement TerminalIdentificationCode;

	@FindBy(xpath = "//*[@formcontrolname='terminal_location']")
	WebElement TerminalLocation;
	
	@FindBy(xpath = "//*[@formcontrolname='transaction_serial_number']")
	WebElement TransactionSerialNumber;
	
	@FindBy(xpath = "//*[@formcontrolname='card_transaction_type_code']")
	WebElement TransactionTypeCode;

	public TransactionPage(WebDriver driver, AutoLogger handler) {
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}

	@When("^Entered Bank Account Number")
	public void enterBankAccountNumber(String AccountNumber, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(BankAccountNumber, 60);
		actions.sendKeys(this.BankAccountNumber, AccountNumber);
		Reporter.log("Bank Account Number name entered as:- " + AccountNumber);
		child.log(LogStatus.INFO, "Bank Account Number name entered as:- " + AccountNumber);
	}
	
	@When("^Entered Amount")
	public void enterAmount(String Amounts, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(Amount, 60);
		actions.sendKeys(this.Amount, Amounts);
		Reporter.log("Amount entered as:- " + Amounts);
		child.log(LogStatus.INFO, "Amount entered as:- " + Amounts);
	}

	@When("^Entered Addenda")
	public void enterAddenda(String addenda, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(Addenda, 60);
		actions.sendKeys(this.Addenda, addenda);
		Reporter.log("Addenda entered as:- " + addenda);
		child.log(LogStatus.INFO, "Addenda entered as:- " + addenda);
	}	
	
	
	@When("^Entered Bank Routing number ")
	public void enterRoutingNumber(String Routing, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(RoutingNumber, 60);
		actions.sendKeys(this.RoutingNumber, Routing);
		Reporter.log("Routing number entered as:- " + Routing);
		child.log(LogStatus.INFO, "Routing number entered as:- " + Routing);
	}

	@When("^Entered Email id")
	public void enterEmail(String Emailid, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(Email, 60);
		actions.sendKeys(this.Email, Emailid);
		Reporter.log("Entered Email id as:- " + Emailid);
		child.log(LogStatus.INFO, "Entered Email id as:- " + Emailid);
	}
	
	@When("^Entered Item Research Number")
	public void enterItemResearchNumber(String IRN, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(ItemResearchNumber, 60);
		actions.sendKeys(this.ItemResearchNumber, IRN);
		Reporter.log("Entered Item Research Number id as:- " + IRN);
		child.log(LogStatus.INFO, "Entered Item Research Number id as:- " + IRN);
	}
	
	@When("^Entered Process Control")
	public void enterProcessControl(String IRN, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(ProcessControl, 60);
		actions.sendKeys(this.ProcessControl, IRN);
		Reporter.log("Entered Process Control id as:- " + IRN);
		child.log(LogStatus.INFO, "Entered Process Control as:- " + IRN);
	}
	
	@When("^Click on Savings Account Type")
	public void clickOnSavingsAccountType(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(SavingsAccountType, 60);
		SavingsAccountType.click();
		Reporter.log("Click on Savings Account Type.");
		child.log(LogStatus.INFO, "Click on Savings Account Type");
	}

	@When("^Click on Checking Account Type.")
	public void clickOnCheckingAccountType(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(CheckingAccountType, 60);
		CheckingAccountType.click();
		Reporter.log("Click on Checking Account Type.");
		child.log(LogStatus.INFO, "Click on Checking Account Type.");
	}

	@When("^Click on Loan Account Type.")
	public void clickOnLoanAccountType(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(LoanAccountType, 60);
		LoanAccountType.click();
		Reporter.log("Click on Loan Account Type");
		child.log(LogStatus.INFO, "Click on Loan Account Type.");
	}

	@When("^Click on GL Account Type")
	public void clickOnGLAccountType(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(SavingsAccountType, 60);
		SavingsAccountType.click();
		Reporter.log("Click on GL Account Type.");
		child.log(LogStatus.INFO, "Click on GL Account Type.");
	}

	@When("^Entered Description")
	public void enterDescription(String Des, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(Description, 60);
		actions.sendKeys(this.Description, Des);
		Reporter.log("Description entered as:- " + Des);
		child.log(LogStatus.INFO, "Description entered as:-" + Des);
	}
	
	@When("^Entered City")
	public void enterCity(String city, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(City, 60);
		actions.sendKeys(this.City, city);
		Reporter.log("City entered as:- " + city);
		child.log(LogStatus.INFO, "City entered as:-" + city);
	}
	
	@When("^Entered State")
	public void enterState(String state, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(State, 60);
		actions.sendKeys(this.State, state);
		Reporter.log("State entered as:- " + state);
		child.log(LogStatus.INFO, "State entered as:-" + state);
	}
	

	@When("^Click And Select Standard Entry Class")
	public void clickAndSelectStandardEntryClassDD(String SSCType, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(StandardEntryClassDD, 60);
		actions.selectDropdownByVisibleText(StandardEntryClassDD, SSCType);
		Reporter.log("Selected Standard Entry Class as:- " + SSCType);
		child.log(LogStatus.INFO, "Selected Standard Entry Class as:- " + SSCType);
	}

	@When("^Click And Select Existing Customer")
	public void clickAndSelectExistingCustomerDD(String ExistingCustomer, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(ExistingCustomerDD, 60);
		actions.selectDropdownByValue(ExistingCustomerDD, ExistingCustomer);
		Thread.sleep(3000);
		Reporter.log("Selected Existing Customer as:- " + ExistingCustomer);
		child.log(LogStatus.INFO, "Selected Existing Customer as:- " + ExistingCustomer);
	}
	
	@When("^Click And Select Existing Customer")
	public void clickAndSelectExistingCustomerDDIndex(String index, ExtentTest child) throws Throwable {
		
		try {
		actions.waitForElementToBeClickable(ExistingCustomerDD, 60);
		actions.selectDropdownByVisibleText(ExistingCustomerDD, index);
		Thread.sleep(3000);
		Reporter.log("Selected Existing Customer as:- " + index );
		child.log(LogStatus.INFO, "Selected Existing Customer as:- " + index );
		}
		 catch (NoSuchElementException e) {
			 actions.waitForElementToBeClickable(ExistingCustomerDD, 60);
				actions.selectDropdownByIndex(ExistingCustomerDD, 1);
				Thread.sleep(3000);
				Reporter.log("Selected Existing Customer as:- " + index);
				child.log(LogStatus.INFO, "Selected Existing Customer as:- " + index);
			}
	}

	@When("^Click And Select Transaction Type field DD")
	public void clickAndSelectTransactionTypeDD(String TT, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TransactionTypeDD, 60);
		actions.selectDropdownByVisibleText(TransactionTypeDD, TT);
		Reporter.log("Selected Transaction Type as:- " + TT);
		child.log(LogStatus.INFO, "Selected Transaction Type as:- " + TT);
	}

	@When("^Click And Select Account type field DD")
	public void clickOnBankDetailsTab(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(BankDetailsTab, 60);
		BankDetailsTab.click();
		Reporter.log("Click on Bank Details Tab.");
		child.log(LogStatus.INFO, "Click on Bank Details Tab.");
	}

	@When("^Click on Create Transaction Button.")
	public void clickOnCreateTransactionButton(ExtentTest child) throws Throwable {
		try {
		actions.waitForElementToBeClickable(CreateTransactionButton, 180);
		CreateTransactionButton.click();
		Reporter.log("Click on Create Transaction Button.");
		child.log(LogStatus.INFO, "Click on Create Transaction Button.");
		Thread.sleep(5000);
		}
		 catch (NoSuchElementException e) {
				Reporter.log("Error No Such Element Exception.");
				child.log(LogStatus.INFO, "Error No Such Element Exception.");
			}
	}

	@When("^Entered Terminal Identification Code")
	public void enterTerminalIdentificationCode(String CheckNum, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TerminalIdentificationCode, 60);
		actions.sendKeys(this.TerminalIdentificationCode, CheckNum);
		Reporter.log("Terminal Identification Code entered as:- " + CheckNum);
		child.log(LogStatus.INFO, "Terminal Identification Code entered as:-" + CheckNum);
	}
	
	@When("^Entered Check Number")
	public void enterCheckNumber(String CheckNum, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(CheckNumber, 60);
		actions.sendKeys(this.CheckNumber, CheckNum);
		Reporter.log("Check Number entered as:- " + CheckNum);
		child.log(LogStatus.INFO, "Check Number entered as:-" + CheckNum);
	}
	
	@When("^Entered Terminal Location")
	public void enterTerminalLocation(String CheckNum, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TerminalLocation, 60);
		actions.sendKeys(this.TerminalLocation, CheckNum);
		Reporter.log("Terminal Location entered as:- " + CheckNum);
		child.log(LogStatus.INFO, "Terminal Location entered as:-" + CheckNum);
	}
	
	@When("^Entered Transaction Serial Number")
	public void enterTransactionSerialNumber(String CheckNum, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TransactionSerialNumber, 60);
		actions.sendKeys(this.TransactionSerialNumber, CheckNum);
		Reporter.log("Transaction Serial Number entered as:- " + CheckNum);
		child.log(LogStatus.INFO, "Transaction Serial Number entered as:-" + CheckNum);
	}
	@When("^Entered Transaction Type Code")
	public void enterTransactionTypeCode(String CheckNum, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TransactionTypeCode, 60);
		actions.sendKeys(this.TransactionTypeCode, CheckNum);
		Reporter.log("Transaction Type Code entered as:- " + CheckNum);
		child.log(LogStatus.INFO, "Transaction Type Code entered as:-" + CheckNum);
	}
	
	@When("^Click and upload Check Image Front.")
	public void clickOnCheckImageFront(String image ,ExtentTest child) throws Throwable {
		Thread.sleep(2000);
		CheckImageFront.sendKeys("D:\\VericheckPro\\Vericheck\\TestData\\" + image +".jpg");
		Thread.sleep(2000);
		Reporter.log("Click and upload Check Image Front.");
		child.log(LogStatus.INFO, "Click and upload Check Image Front.");
	}

	@When("^Click and upload Check Image Back.")
	public void clickOnCheckImageBack(String image, ExtentTest child) throws Throwable {
		Thread.sleep(2000);
		CheckImageBack.sendKeys("D:\\VericheckPro\\Vericheck\\TestData\\" + image +".jpg");
		Thread.sleep(2000);
		Reporter.log("Click and upload Check Image Back.");
		child.log(LogStatus.INFO, "Click and upload Check Image Back.");
	}

	@When("^Click on Submit Button")
	public void clickOnSubmitButton(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(SubmitButton, 60);
		SubmitButton.click();
		Reporter.log("Click on Submit Button.");
		child.log(LogStatus.INFO, "Click on Submit Button.");
	}

	@When("^Click on Cancel Button")
	public void clickOnCancelButton(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(CancelButton, 60);
		CancelButton.click();
		Reporter.log("Click on Cancel Button.");
		child.log(LogStatus.INFO, "Click on Cancel Button.");
		Thread.sleep(5000);
	}
	
	@When("^Click on Transaction Tab")
	public void clickOnTransactionTab(ExtentTest child) throws Throwable {
		try {
		actions.waitForElementToBeClickable(TransactionTab, 60);
		Thread.sleep(5000);
		TransactionTab.click();
		Reporter.log("Click on Transaction Tab.");
		child.log(LogStatus.INFO, "Click on Transaction Tab.");
		Thread.sleep(5000);
		}
		catch (NoSuchElementException e) {
			Reporter.log("Error No Such Element Exception.");
			child.log(LogStatus.INFO, "Error No Such Element Exception.");
		}
	}
	
	@Then("^Transaction - validation- Verify Amount is mandatory.")
	public boolean VerifAmountIsMandatoryField(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(GetAmountErrorMessage, 6000);
		try {
			if (GetAmountErrorMessage.isDisplayed()) {
				String ActulResult = GetAmountErrorMessage.getText();
				String ExpectedResult = "Amount field is required. (Err Code: TN160)";
				if (ExpectedResult.equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Transaction - validation- Verify Amount is mandatory : - " + ActulResult);
					child.log(LogStatus.INFO,"Transaction - validation- Verify Amount is mandatory : -" + ActulResult);
					return true;
				}
			} else {
				Reporter.log("Error Message Not Display.");
				child.log(LogStatus.INFO, "Error Message Not Display.");
				return false;
			}
		} catch (NoSuchElementException e) {
			Reporter.log("Error Message Not Display.");
			child.log(LogStatus.INFO, "Error Message Not Display.");
			return false;
		}
		return false;
	}
	
	@Then("^Transaction - validation- Verify with Amount =0.")
	public boolean verifAmountvalidationas0(ExtentTest child) throws Throwable {
		try {
			actions.waitForElementToBeClickable(GetServerErrorMessage, 6000);
			if (GetServerErrorMessage.isDisplayed()) {
				String ActulResult = GetServerErrorMessage.getText();
				String ExpectedResult = "For 0 dollar transaction transaction type should be prenote (Err Code. TN021)";
				if (ExpectedResult.trim().equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Transaction - validation- Verify with Amount =0 : - " + ActulResult);
					child.log(LogStatus.INFO,"Transaction - validation- Verify with Amount =0 : -" + ActulResult);
					return true;
				}
				
			} else {
				Reporter.log("Error Message Not Display.");
				child.log(LogStatus.INFO, "Error Message Not Display.");
				return false;
			}
		} catch (NoSuchElementException e) {
			Reporter.log("Error Message Not Display.");
			child.log(LogStatus.INFO, "Error Message Not Display.");
			return false;
		}
		
		
		return false;
	}
	
	@Then("^Transaction - validation- Verify with Amount.")
	public boolean verifAmountvalidation(ExtentTest child) throws Throwable {
		try {
			actions.waitForElementToBeClickable(GetAmountErrorMessage, 6000);
			if (GetAmountErrorMessage.isDisplayed()) {
				String ActulResult = GetAmountErrorMessage.getText();
				String ExpectedResult = "Amount field must be less than or equal to 99999999.99. (Err Code: TN160)";
				String ExpectedResult1 = "Amount field accepts only positive and decimal number up to 2 places.(Err Code: TN160)";
				if (ExpectedResult.trim().equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Transaction - validation- Verify with Amount =7,988,888,888 : - " + ActulResult);
					child.log(LogStatus.INFO,"Transaction - validation- Verify with Amount =7,988,888,888 : -" + ActulResult);
					return true;
				}
				
				else if (ExpectedResult1.trim().equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Transaction - validation- Verify with Amount =23.7889 : - " + ActulResult);
					child.log(LogStatus.INFO,"Transaction - validation- Verify with Amount =23.7889 : -" + ActulResult);
					return true;
				}
			} else {
				Reporter.log("Error Message Not Display.");
				child.log(LogStatus.INFO, "Error Message Not Display.");
				return false;
			}
		} catch (NoSuchElementException e) {
			Reporter.log("Error Message Not Display.");
			child.log(LogStatus.INFO, "Error Message Not Display.");
			return false;
		}
		return false;
	}
	
	@Then("^Transaction - Transaction created successfully.")
	public boolean verifTransactionCreatedSuccessfully(ExtentTest child) throws Throwable {
		try {
			actions.waitForElementToBeClickable(GetSuccessfullyMessage, 6000);
			if (GetSuccessfullyMessage.isDisplayed()) {
				String ActulResult = GetSuccessfullyMessage.getText();
				String ActulAlert= GetSuccessfullyMessage.getText();
				String ExpectedResult = "Transaction created successfully.";
				String ExpectedResult1 = "Sorry! unable to process your request. Please contact administrator.";
				if (ExpectedResult.trim().equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Transaction -Valid Amount- Verify Transaction created successfully : - " + ActulResult);
					child.log(LogStatus.INFO,"Transaction -Valid Amount- Verify Transaction created successfully : -" + ActulResult);
				}
				
				else if (ExpectedResult1.trim().equals(ActulAlert.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Transaction - Getting Error as : - " + ActulResult);
					child.log(LogStatus.INFO,"Transaction - Getting Error as : -" + ActulResult);
					return false;
				}
			} else {
				Reporter.log("Error Message Not Display.");
				child.log(LogStatus.INFO, "Error Message Not Display.");
				return false;
			}
		} catch (NoSuchElementException e) {
			Reporter.log("Error Message Not Display.");
			child.log(LogStatus.INFO, "Error Message Not Display.");
			return false;
		}
		return true;
	}
}
