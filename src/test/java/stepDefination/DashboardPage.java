package stepDefination;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
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
public class DashboardPage extends BasePage {
	
	@FindBy(xpath = "//*[@id=\"span_company\"]")
	WebElement CompanyTab;
	
	@FindBy(xpath = "//*[@id=\"mCSB_1_container\"]/ul/li[6]/a/span")
	WebElement TransactionTab;
	
	@FindBy(xpath = "//*[@id=\"mCSB_1_container\"]/ul/li[7]/a/span")
	WebElement BillingTab;
	
	@FindBy(xpath = "//*[@id=\"mCSB_1_container\"]/ul/li[8]/a/span")
	public WebElement ReconciliationTab;
	
	@FindBy(xpath = "//*[@id=\"mCSB_1_container\"]/ul/li[5]/div/ul/li[1]/a/span")
	WebElement ISOTab;
	
	@FindBy(xpath = "//*[@id=\"mCSB_1_container\"]/ul/li[5]/div/ul/li[2]/a/span")
	WebElement MerchantTab;

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
	
	@FindBy(xpath = "//*[@id='generalSearch']")
	WebElement SearchLegalBusinessName;
	
	@FindBy(xpath = "//*[@data-original-title='View']")
	List<WebElement> SelectLegalBusinessName;
	
	@FindBy(xpath = "//*[@formcontrolname='email']")
	WebElement yourEmailAddress;

	public DashboardPage(WebDriver driver, AutoLogger handler) {
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
	   
	   @When("^Click on Company Tab")
	    public void clickOnCompanyTab(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(CompanyTab, 60);
			CompanyTab.click();
			Reporter.log("Click on Company Tab.");
			child.log(LogStatus.INFO, "Click on Company Tab.");
	    }
	   
	   @When("^Click on ISO Tab")
	    public void clickISOTab(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(ISOTab, 60);
			ISOTab.click();
			Reporter.log("Click on ISO Tab.");
			child.log(LogStatus.INFO, "Click on ISO Tab.");
	    }
	   
	   @When("^Click on Merchant Tab")
	    public void clickMerchantTab(ExtentTest child) throws Throwable {
			actions.waitForElementToBeClickable(MerchantTab, 60);
			MerchantTab.click();
			Reporter.log("Click on Merchant Tab.");
			child.log(LogStatus.INFO, "Click on Merchant Tab.");
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
	    
	    @When("^Click on view to open Legal Business Name details page.")
		public boolean searchAndSelectLegalBusinessName(ExtentTest child, String Search) throws InterruptedException {
			Thread.sleep(2000);
	    	actions.waitForElementToBeClickable(SearchLegalBusinessName, 160);
			SearchLegalBusinessName.click();
			Reporter.log("Click on 'Search' tab.");
			child.log(LogStatus.INFO, "Click on 'Search' tab.");
			
			actions.waitForElementToBeClickable(SearchLegalBusinessName, 60);
			SearchLegalBusinessName.sendKeys(Keys.chord(Keys.CONTROL, "a"), Search);
			Reporter.log("Enter Legal Business Name into search box.");
			child.log(LogStatus.INFO, "Enter Legal Business Name into search box.");
			Thread.sleep(2000);
			int pcount = SelectLegalBusinessName.size();
			for (int k = 0; k < pcount; k++) {
					actions.waitForElementToBeClickable(SelectLegalBusinessName.get(k), 60);
					SelectLegalBusinessName.get(k).click();
					actions.waitForElement(4000);
					Reporter.log("Click on view to open Legal Business Name details page.");
					child.log(LogStatus.INFO, "Click on view to open Legal Business Name details page.");
					return true;
			}
			return false;
		}
	    @And("^Cads are display$")
	    public void cads_are_display() throws Throwable {
	    	System.out.println("Card Display ");
	    }
}
