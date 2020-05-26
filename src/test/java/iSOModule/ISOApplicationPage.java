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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common.AutoLogger;
import common.BasePage;

@RunWith(Cucumber.class)
public class ISOApplicationPage extends BasePage {

	@FindBy(xpath = "//*[@id='address_one']")
	WebElement AddressOne;

	@FindBy(xpath = "//*[@formcontrolname='address_line2']")
	WebElement AddressTwo;

	@FindBy(xpath = "//*[@id='business_structure']")
	WebElement BusinessStructureDD;

	@FindBy(xpath = "//*[@id='banckAccNo']")
	WebElement BankAccountNumbe;

	@FindBy(xpath = "//*[@id='busscityId']")
	WebElement CityId;

	@FindBy(xpath = "//*[@id='date_of_birth']")
	WebElement DateOfBirth;

	@FindBy(xpath = "//*[@id='doing_business_as']")
	WebElement DoingBusinessAs;

	@FindBy(xpath = "//*[@id='legal_name']")
	WebElement ISOLegalName;

	@FindBy(xpath = "//*[text()='I am authorized to sign on behalf of the business.']")
	WebElement IAmAuthorizedCheckBox;

	@FindBy(xpath = "//*[@id='title']")
	WebElement Title;

	@FindBy(xpath = "//*[@id='ssn_no']")
	WebElement TaxId;

	@FindBy(xpath = "//*[@id='business_name']")
	WebElement LegalBusinessName;

	@FindBy(xpath = "//*[@id='phone']")
	WebElement phone;

	@FindBy(xpath = "//*[contains(text(),'I agree to the independent sales organization')]")
	WebElement IAgreeToTheIndependentSalesCheckBox;

	@FindBy(xpath = "//*[@id='websiteUrlId']")
	WebElement WebsiteUrlId;

	@FindBy(xpath = "//*[@id='state']")
	WebElement StateDD;

	@FindBy(xpath = "//*[@id='zipcode']")
	WebElement ZipCode;

	@FindBy(xpath = "//*[@id='bank_routing_num']")
	WebElement RoutingNum;

	@FindBy(xpath = "//*[contains(text(),'Save')]")
	WebElement SaveButton;

	@FindBy(xpath = "//*[@id='social_security_num']")
	WebElement SocialSecurityNum;

	@FindBy(xpath = "//*[@id='btnSubmitISO']")
	WebElement SubmitButton;

	public ISOApplicationPage(WebDriver driver, AutoLogger handler) {
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}

	@When("^Entered ISO Personal Information Legal name")
	public void enterCostomerName(String Customer, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(ISOLegalName, 60);
		actions.sendKeys(this.ISOLegalName, Customer);
		Reporter.log("ISO Legal name entered as:- " + Customer);
		child.log(LogStatus.INFO, "ISO Legal name entered as:- " + Customer);
	}

	@When("^Entered ISO Personal Information Title")
	public void enterTitle(ExtentTest child, String IsoTitle) throws Throwable {
		actions.waitForElementToBeClickable(Title, 60);
		actions.sendKeys(this.Title, IsoTitle);
		Reporter.log("Title entered");
		child.log(LogStatus.INFO, "Title entered");
	}

	@When("^Entered ISO Personal Information Social security number")
	public void enterSocialSecurityNumber(String SSN, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(SocialSecurityNum, 60);
		actions.sendKeys(this.SocialSecurityNum, SSN);
		Reporter.log("Entered Social security number");
		child.log(LogStatus.INFO, "Entered Social security number");
	}

	@When("^Entered ISO Business Information Address One")
	public void enterAddressOne(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(AddressOne, 60);
		actions.sendKeys(this.AddressOne, "Address One");
		Reporter.log("Entered Address One");
		child.log(LogStatus.INFO, "Entered Address One");
	}

	@When("^Entered ISO Business Information Address Two")
	public void enterAddressTwo(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(AddressOne, 60);
		actions.sendKeys(this.AddressOne, "Address One");
		Reporter.log("Entered Address One");
		child.log(LogStatus.INFO, "Entered Address One");
	}

	@When("^Entered ISO Business Information ZipCode")
	public void enterEmail(String Zip, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(ZipCode, 60);
		actions.sendKeys(this.ZipCode, Zip);
		Reporter.log("ZipCode entered as:- " + Zip);
		child.log(LogStatus.INFO, "ZipCode entered as:- " + Zip);
	}

	@When("^Entered Bank Routing number")
	public void enterBankRoutingNumber(String Routing, ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(RoutingNum, 60);
		actions.sendKeys(this.RoutingNum, Routing);
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
		actions.waitForElementToBeClickable(SaveButton, 60);
		SaveButton.click();
		Reporter.log("Click on Save button.");
		child.log(LogStatus.INFO, "Click on Save button.");
	}

	@When("^Click on Submit Button")
	public void clickOnSubmitButton(ExtentTest child) throws Throwable {
		actions.waitForElementToBeClickable(SubmitButton, 60);
		SubmitButton.click();
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
		String ExpectedResult =ISOLegalName.getText();
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

	@And("^Cads are display$")
	public void cads_are_display() throws Throwable {
		System.out.println("Card Display ");
	}
}
