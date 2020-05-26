package iSOModule;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common.AutoLogger;
import common.BasePage;

@RunWith(Cucumber.class)
public class BusinessDataPage extends BasePage {

	
	@FindBy(xpath = "//*[contains(text(),'Company')]")
	WebElement CompanyTab;
	
	@FindBy(xpath = "//*[@formcontrolname='description']")
	WebElement TeansactionDescription;
	
	@FindBy(xpath = "//*[@formcontrolname='product_service']")
	WebElement ProductAndService;
	
	@FindBy(xpath = "//*[@id='expected_amount_per_month']")
	WebElement ExpectedAmountPerMonth;

	@FindBy(xpath = "//*[@id='expected_total_dollars_per_month']")
	WebElement ExpectedTotalDollarsPerMonth;

	@FindBy(xpath = "//*[@id='average_txn_amount']")
	WebElement AverageTxnAmount;

	@FindBy(xpath = "//*[@mask='99']")
	WebElement HoursOfOperation;

	@FindBy(xpath = "//*[@mask='999-99-9999']")
	WebElement SocialSecurityNumber;

	@FindBy(xpath = "//*[@id='generalSearch']")
	WebElement SearchLegalBusinessName;
	
	@FindBy(xpath = "//*[@data-original-title='View']")
	List<WebElement> SelectLegalBusinessName;
	

	
	@FindBy(xpath = "//*[@id='customer_service_phone']")
	WebElement CustomerServicePhone;

	@FindBy(xpath = "//*[@class='form-control']")
	WebElement SelectNoteDD;

	@FindBy(linkText = "ISO")
	WebElement ISO;


	public BusinessDataPage(WebDriver driver, AutoLogger handler) {
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}

	@When("^Entered ISO Personal Information Legal name")
	public void enterCostomerName(String Customer, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TeansactionDescription, 60);
		actions.sendKeys(this.TeansactionDescription, Customer);
		Reporter.log("ISO Legal name entered as:- " + Customer);
		child.log(LogStatus.INFO, "ISO Legal name entered as:- " + Customer);
	}

	@When("^Entered ISO Personal Information Title")
	public void enterTitle(ExtentTest child, String IsoTitle) throws Throwable {
		actions.waitForElementToBeClickable(TeansactionDescription, 60);
		actions.sendKeys(this.TeansactionDescription, IsoTitle);
		Reporter.log("Title entered");
		child.log(LogStatus.INFO, "Title entered");
	}

	@When("^Entered ISO Personal Information Social security number")
	public void enterSocialSecurityNumber(String SSN, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TeansactionDescription, 60);
		actions.sendKeys(this.TeansactionDescription, SSN);
		Reporter.log("Entered Social security number");
		child.log(LogStatus.INFO, "Entered Social security number");
	}

	@When("^Entered ISO Business Information Address One")
	public void enterAddressOne(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TeansactionDescription, 60);
		actions.sendKeys(this.TeansactionDescription, "Address One");
		Reporter.log("Entered Address One");
		child.log(LogStatus.INFO, "Entered Address One");
	}

	@When("^Entered ISO Business Information Address Two")
	public void enterAddressTwo(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TeansactionDescription, 60);
		actions.sendKeys(this.TeansactionDescription, "Address One");
		Reporter.log("Entered Address One");
		child.log(LogStatus.INFO, "Entered Address One");
	}

	@When("^Entered ISO Business Information ZipCode")
	public void enterEmail(String Zip, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TeansactionDescription, 60);
		actions.sendKeys(this.TeansactionDescription, Zip);
		Reporter.log("ZipCode entered as:- " + Zip);
		child.log(LogStatus.INFO, "ZipCode entered as:- " + Zip);
	}

	@When("^Entered Bank Routing number")
	public void enterBankRoutingNumber(String Routing, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TeansactionDescription, 60);
		actions.sendKeys(this.TeansactionDescription, Routing);
		Reporter.log("Phone number entered as:- " + Routing);
		child.log(LogStatus.INFO, "Phone number entered as:- " + Routing);
	}

	@When("^Click And Select Customer AccountType")
	public void clickAndSelectAccountType(WebElement AccountType, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(AccountType, 60);
		actions.waitForElementToBeClickable(AccountType);
		AccountType.click();
		Reporter.log("Selected Customer AccountType as:- " + AccountType.getText());
		child.log(LogStatus.INFO, "Selected Customer AccountType as:- " + AccountType.getText());
	}

	@When("^Click on Save Button")
	public void clickOnSaveButton(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TeansactionDescription, 60);
		TeansactionDescription.click();
		Reporter.log("Click on Save button.");
		child.log(LogStatus.INFO, "Click on Save button.");
	}

	@When("^Click on Submit Button")
	public void clickOnSubmitButton(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(TeansactionDescription, 60);
		TeansactionDescription.click();
		Reporter.log("Click on Submit Button.");
		child.log(LogStatus.INFO, "Click on Submit Button.");
	}

	@Then("^Home page is populated$")
	public boolean VerifyPersonalInformationGetAutoSave(ExtentTest child) throws Throwable {
		String LegalName = "John Smith";
		String Title = "John Smith title";
		String SSN = "987654321";
		enterCostomerName(LegalName, child);
		enterTitle(child, LegalName);
		enterSocialSecurityNumber(SSN, child);
		String ExpectedResult =TeansactionDescription.getText();
		if (ExpectedResult.equals(LegalName.trim())) {
			Assert.assertEquals(LegalName.trim(), ExpectedResult);
		}
		
		try {
			ExpectedResult.equals(LegalName.trim());
		} catch (NoSuchElementException e) {
			return false;
		}
		return false;
		
	}
	
	@When("^Click on view to open Legal Business Name details page.")
	public void searchAndSelectPatient(ExtentTest child, String Search) throws InterruptedException {
		actions.waitForElementToBeClickable(SearchLegalBusinessName, 15);
		SearchLegalBusinessName.click();
		Reporter.log("Click on 'Search' tab.");
		child.log(LogStatus.INFO, "Click on 'Search' tab.");
		
		actions.waitForElementToBeClickable(SearchLegalBusinessName, 15);
		SearchLegalBusinessName.sendKeys(Keys.chord(Keys.CONTROL, "a"), Search);
		Reporter.log("Enter patient name into search box.");
		child.log(LogStatus.INFO, "Enter patient name into search box.");
		int pcount = SelectLegalBusinessName.size();
		for (int k = 0; k < pcount; k++) {
				actions.waitForElementToBeClickable(SelectLegalBusinessName.get(k), 15);
				SelectLegalBusinessName.get(k).click();
				actions.waitForElement(4000);
				Reporter.log("Click on view to open Legal Business Name details page.");
				child.log(LogStatus.INFO, "Click on view to open Legal Business Name details page.");
		}
	}
	@And("^Cads are display$")
	public void cads_are_display() throws Throwable {
		System.out.println("Card Display ");
	}
}
