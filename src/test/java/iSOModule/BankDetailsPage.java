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
public class BankDetailsPage extends BasePage {
	
	@FindBy(xpath = "//*[@title='Add']")
	WebElement AddBankDetailsButton;
	
	@FindBy(xpath = "//a[text()='Bank Details']")
	WebElement BankDetailsTab;

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
	
	@FindBy(xpath = "//label[text()='Nick Name']/following::label[1]")
	WebElement GetNickName;
	
	@FindBy(xpath = "//*[contains(text(),'Billing Email Address')]/following::label[2]")
	WebElement GetBillingEmailAddress;
	
	@FindBy(xpath = "//*[contains(text(),'Manager Email')]/following::label[2]")
	WebElement GetManagerEmail;
	
	@FindBy(xpath = "//*[@id='hideMe']")
	WebElement GetSuccessMessage;
	
	@FindBy(xpath = "//*[@id='server-error']")
	WebElement GetServerError;
	
	@FindBy(xpath = "//*[@ng-reflect-name='nick_name']")
	WebElement NickName;
	
	@FindBy(xpath = "//*[@id='websiteUrlId']")
	WebElement WebsiteUrlId;

	@FindBy(xpath = "//*[@id='state']")
	WebElement StateDD;
	
	@FindBy(xpath = "//*[@class='form-control']")
	WebElement SelectNoteDD;
	
	@FindBy(xpath = "//*[@id='saveContact']")
	WebElement SaveButton;
	
	@FindBy(xpath = "//*[@id='updateContact']")
	WebElement SaveUpdateContact;
	
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

	
	public BankDetailsPage(WebDriver driver, AutoLogger handler) {
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
	public void enterNickName(String Name, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(NickName, 60);
		NickName.clear();
		actions.waitForElementToBeClickable(NickName, 60);
		actions.sendKeys(this.NickName, Name);
		Reporter.log("Nick Name entered as:- " + Name);
		child.log(LogStatus.INFO, "Nick Name entered as:- " + Name);
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
	public void clickOnBankDetailsTab(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(BankDetailsTab, 60);
		BankDetailsTab.click();
		Reporter.log("Click on Bank Details Tab.");
		child.log(LogStatus.INFO, "Click on Bank Details Tab.");
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
	  
	   @When("^Click on Save Button")
	    public void clickOnSaveButton(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(SaveButton, 60);
	    	SaveButton.click();
			Reporter.log("Click on Save button.");
			child.log(LogStatus.INFO, "Click on Save button.");
	    }
	   
	   @When("^Click on Save Button")
	    public void clickOnUpdateBankDetails(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(SaveUpdateContact, 60);
			SaveUpdateContact.click();
			Reporter.log("Click on Update Bank Details.");
			child.log(LogStatus.INFO, "Click on Update Bank Details.");
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
	   
		@Then("^Click on view to open Legal Business Name details page. 7864")
		public boolean VerifMandatoryFieldShouldNotSavedAsEmpty(ExtentTest child) throws Throwable {
			clickOnBankDetailsTab(child);
			clickOnAddBankDetailsButton(child);
			enterRoutingNumber("122243596", child);
			clickAndSelectAccountType("Checking", child);
			clickAndSelectBankTypeDD("Select Bank Type", child);
			enterBankAccountNumberAndConfirmBankAccountNumber("MHGHHD45321", child);
			clickOnSaveButton(child);
			String ActulResult = BankTypeDDError.getText();
			String ExpectedResult = "Bank type field is required. (Err Code: CQ012)";
			if (ExpectedResult.equals(ActulResult.trim())) {
				actions.waitForElement(2000);
				Reporter.log("Verify Mandatory field should not be saved when is empty: - " + ActulResult);
				child.log(LogStatus.INFO,"Verify Mandatory field should not be saved when is empty:- " + " : -" + ActulResult);
				return true;
			}
			return false;
		}
	   
	   @Then("^Click on view to open Legal Business Name details page. 7971")
		public boolean VerifDataShouldDisplayWhenUserClickOnBillingAndManagerEmailAddressEyeIcon (ExtentTest child) throws Throwable {
		
				clickOnBankDetailsTab(child);
				clickOnViewBankDetails(child);
				Thread.sleep(2000);
				clickOnViewBillingEmailAddress(child);
				String ActulResult1 = GetBillingEmailAddress.getText();
				clickOnViewManagerEmail(child);
				Thread.sleep(2000);
				String ActulResult2 = GetManagerEmail.getText();

			if (ActulResult1.equals("rr@gmail.com")) {
 				actions.waitForElement(2000);
				Reporter.log("Verify Data Display When User Click On Billing Email Address as: - " + ActulResult1);
				child.log(LogStatus.INFO, "Verify Data Display When User Click On Billing Email Address as: - " + ActulResult1);
			} 
			if (ActulResult2.equals("joy@vci.com")) {
				actions.waitForElement(2000);
				Reporter.log("Verify Data Display When User Click On Manager Email Address as: - " + ActulResult2);
				child.log(LogStatus.INFO, "Verify Data Display When User Click On Manager Email Address as: - " + ActulResult2);
			} 
			else{
				Reporter.log("Match Not found");
				child.log(LogStatus.INFO, "Match Not found");
				return false;
			}
			return true;
		}
	   
	   @Then("^Click on view to open Legal Business Name details page. 7863")
		public boolean VerifShouldDisplayCorrectFormatForAccountNumber (ExtentTest child) throws Throwable {
			String input = "Naa456456456,Nick Name,Testing,Rmr23,Joy";
			String[] Expected = input.split(",");
			
			for (int i = 0; i < Expected.length; i++) {
				clickOnBankDetailsTab(child);
				clickOnViewBankDetails(child);
				clickOnEditButton(child);
				String ExpectedResult = Expected[i]
;				String ExpectedResult1 = ExpectedResult.replaceAll("[^\\d\\+]", "").replaceAll("\\d(?=\\d{4})", "X");

				Thread.sleep(2000);
				enterNickName(ExpectedResult, child);

				clickAndSelectSelect("Note RR", child);
				clickOnUpdateBankDetails(child);
				Thread.sleep(2000);
				String ActulResult = GetNickName.getText();

				if (ExpectedResult1.equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Verify Nick Name: - " + ActulResult + " = " + ExpectedResult);
					child.log(LogStatus.INFO, "Verify Nick Name: - " + ActulResult + " = " + ExpectedResult);
				} else {
					Reporter.log("Match Not found for:- " + ActulResult);
					child.log(LogStatus.INFO, "Match Not found for: -" + ActulResult);
					return false;
				}
			}
			String ActulResult = GetBankName.getText();
			if (ActulResult.equals("Commercial Bank Of California")) {
				actions.waitForElement(2000);
				Reporter.log("Verify Bank Name for 122243596 Routing Number: - " + ActulResult);
				child.log(LogStatus.INFO, "Verify Bank Name for 122243596 Routing Number: - " + " : -" + ActulResult);
				return true;
			} else {
				Reporter.log("Match Not found for:- " + ActulResult);
				child.log(LogStatus.INFO, "Match Not found for: -" + ActulResult);
				return false;
			}
		}
	   
		@Then("^Click on view to open Legal Business Name details page. 7865")
		public boolean VerifShouldDisplayCorrectNameAsPerSaved(ExtentTest child) throws Throwable {
			String input = "Ross,Tom,Kyle,Tim Southee,Joy,Na";
			String[] Expected = input.split(",");
			
			for (int i = 0; i < Expected.length; i++) {
				clickOnBankDetailsTab(child);
				clickOnViewBankDetails(child);
				clickOnEditButton(child);
				String ExpectedResult = Expected[i];
				Thread.sleep(2000);
				enterNickName(ExpectedResult, child);

				clickAndSelectSelect("Note RR", child);
				clickOnUpdateBankDetails(child);
				Thread.sleep(2000);
				String ActulResult = GetNickName.getText();

				if (ExpectedResult.equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Verify Nick Name: - " + ActulResult + " = " + ExpectedResult);
					child.log(LogStatus.INFO, "Verify Nick Name: - " + ActulResult + " = " + ExpectedResult);
				} else {
					Reporter.log("Match Not found for:- " + ActulResult);
					child.log(LogStatus.INFO, "Match Not found for: -" + ActulResult);
					return false;
				}
			}
			String ActulResult = GetBankName.getText();
			if (ActulResult.equals("Commercial Bank Of California")) {
				actions.waitForElement(2000);
				Reporter.log("Verify Bank Name for 122243596 Routing Number: - " + ActulResult);
				child.log(LogStatus.INFO, "Verify Bank Name for 122243596 Routing Number: - " + " : -" + ActulResult);
				return true;
			} else {
				Reporter.log("Match Not found for:- " + ActulResult);
				child.log(LogStatus.INFO, "Match Not found for: -" + ActulResult);
				return false;
			}
		}
		
	@Then("^Click on view to open Legal Business Name details page. 7804")
	public boolean VerifMandatoryFieldShouldNotSavedWithNonMandatoryDetails(ExtentTest child) throws Throwable {
		clickOnBankDetailsTab(child);
		clickOnAddBankDetailsButton(child);
		enterRoutingNumber("122243596", child);
		clickAndSelectAccountType("Checking", child);
		clickAndSelectBankTypeDD("Billing", child);
		enterBankAccountNumberAndConfirmBankAccountNumber("MHGHHD45321", child);
		clickOnSaveButton(child);
		try {
			if (GetSuccessMessage.isDisplayed()) {
				String ActulResult = GetSuccessMessage.getText();
				String ExpectedResult = "Bank created successfully!";
				if (ExpectedResult.equals(ActulResult.trim())) {
					actions.waitForElement(2000);
					Reporter.log("Verify bank details get saved with Non mandatory field : - " + ActulResult);
					child.log(LogStatus.INFO,"Verify bank details get saved with Non mandatory field:- " + ActulResult);
					return true;
				}
			} else {
				Reporter.log("Match Not found.");
				child.log(LogStatus.INFO, "Match Not found.");
				return true;
			}
		} catch (NoSuchElementException e) {
			String ActulResult = GetServerError.getText();
			String ExpectedResult = "This bank account already exists with another company";
			if (ExpectedResult.equals(ActulResult.trim())) {
				actions.waitForElement(2000);
				Reporter.log("Verify bank details get saved with Non mandatory field : - " + ActulResult);
				child.log(LogStatus.INFO,"Verify bank details get saved with Non mandatory field:- " + ActulResult);
				return true;
			}
		}
		return false;
	}
	@And("^Cads are display$")
	public void cads_are_display() throws Throwable {
		System.out.println("Card Display ");
	}
}
