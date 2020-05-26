package iSOTestCase;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.BaseTest;
import common.ExtentManager;
import common.ExtentTestManager;
import stepDefination.DashboardPage;
import merchantModule.MerchantCustomersPage;
import iSOModule.BankDetailsPage;
import iSOModule.ExistingPortfolio;
import iSOModule.ISOApplicationPage;
import stepDefination.LoginPage;

public class ISOTestCase extends BaseTest {

	LoginPage loginPage;
	MerchantCustomersPage customersPage;
	ISOApplicationPage iSOApplicationPage;
	DashboardPage dashboardPage;
	BankDetailsPage bankDetailsPage;
	ExistingPortfolio existingPortfolio;


	@BeforeClass(alwaysRun = true)
	public void chartPdpPatientDetailsPage() {
		ExtentTestManager.startTest("ISO-Functionality- ISO Functionality", "ISO Functionality Test Cases");
		parent = ExtentTestManager.getTest();
	}

	@Test(priority = 1)
	public void Jira7864(Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("AdminbaseURL"));
		child = ExtentManager.getReporter().startTest("PHNX-7864 ISO -Bank Details-Bank type when left empty and save , gets saved too displaying na and when edited still shows emtpy");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(
				properties.getProperty("Adminusername"), properties.getProperty("Adminpassword"), child);

		customersPage = new MerchantCustomersPage(getEventDriver(), getHandler());
		dashboardPage = new DashboardPage(getEventDriver(), getHandler());
		iSOApplicationPage = new ISOApplicationPage(getEventDriver(), getHandler());
		bankDetailsPage = new BankDetailsPage(getEventDriver(), getHandler());

		System.out.println("******PHNX-7864 Bank type when left empty and save , gets saved too displaying na and when edited still shows emtpy.*********");

		dashboardPage.clickOnCompanyTab(child);
		dashboardPage.clickISOTab(child);
		dashboardPage.searchAndSelectLegalBusinessName(child, "ISO legal business");
		Assert.assertTrue(bankDetailsPage.VerifMandatoryFieldShouldNotSavedAsEmpty(child));
	}
	
	@Test(priority = 1)
	public void Jira7863 (Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("AdminbaseURL"));
		child = ExtentManager.getReporter().startTest("PHNX-7863 ISO -Bank Details- In list form display bank name na whereas when view or edited displaying correct bank name");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("Adminusername"),
				properties.getProperty("Adminpassword"), child);
		
		customersPage = new MerchantCustomersPage(getEventDriver(), getHandler());
		dashboardPage = new DashboardPage(getEventDriver(), getHandler());
		iSOApplicationPage = new ISOApplicationPage(getEventDriver(), getHandler());
		bankDetailsPage = new BankDetailsPage(getEventDriver(), getHandler());
		
		System.out.println("******PHNX-7863 ISO -Bank Details- In list form display bank name na whereas when view or edited displaying correct bank name.*********");
		
		dashboardPage.clickOnCompanyTab(child);
		dashboardPage.clickISOTab(child);
		dashboardPage.searchAndSelectLegalBusinessName(child, "legal business");
		Assert.assertTrue(bankDetailsPage.VerifShouldDisplayCorrectNameAsPerSaved(child));
	}
	
	@Test(priority = 1)
	public void Jira7971 (Method method) throws Throwable {
		getEnviromentDetailsReady (properties.getProperty("AdminbaseURL"));
		child = ExtentManager.getReporter().startTest("PHNX-7971 Admin > Company > Add ISO > Bank details > View > On Billing Email address displaying empty but when clicked on view displays data");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("Adminusername"),
				properties.getProperty("Adminpassword"), child);
		
		customersPage = new MerchantCustomersPage(getEventDriver(), getHandler());
		dashboardPage = new DashboardPage(getEventDriver(), getHandler());
		iSOApplicationPage = new ISOApplicationPage(getEventDriver(), getHandler());
		bankDetailsPage = new BankDetailsPage(getEventDriver(), getHandler());
		
		System.out.println("******PHNX-7971 Admin > Company > Add ISO > Bank details > View > On Billing Email address displaying empty but when clicked on view displays data.*********");
		
		dashboardPage.clickOnCompanyTab(child);
		dashboardPage.clickISOTab(child);
		dashboardPage.searchAndSelectLegalBusinessName(child, "legal business");
		Assert.assertTrue(bankDetailsPage.VerifDataShouldDisplayWhenUserClickOnBillingAndManagerEmailAddressEyeIcon(child));
	}
	
	@Test(priority = 1)
	public void Jira7999 (Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("AdminbaseURL"));
		child = ExtentManager.getReporter().startTest("PHNX-7999 Admin -> Company -> ISO -> Existing Portfolio Tab -> If the user edit and tries to save it again so application not allowing to save the data again. Because the field Expected Dollar Per Month is showing 2 extra decimal points while editing the data.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("Adminusername"),
				properties.getProperty("Adminpassword"), child);
		
		dashboardPage = new DashboardPage(getEventDriver(), getHandler());
		existingPortfolio = new ExistingPortfolio(getEventDriver(), getHandler());
		
		System.out.println("******PHNX-7999 Admin -> Company -> ISO -> Existing Portfolio Tab -> If the user edit and tries to save it again so application not allowing to save the data again. Because the field Expected Dollar Per Month is showing 2 extra decimal points while editing the data.*********");
		
		dashboardPage.clickOnCompanyTab(child);
		dashboardPage.clickISOTab(child);
		dashboardPage.searchAndSelectLegalBusinessName(child, "ISO legal business 1");
		Assert.assertTrue(existingPortfolio.VerifExpectedDollarsPerMonth(child));
	}
	
	@Test(priority = 1)
	public void Jira7804 (Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("AdminbaseURL"));
		child = ExtentManager.getReporter().startTest("PHNX-7804 Admin -> Company -> ISO -> Bank Details -> Verify bank details get saved with Non mandatory field.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("Adminusername"),
				properties.getProperty("Adminpassword"), child);
		
		dashboardPage = new DashboardPage(getEventDriver(), getHandler());
		bankDetailsPage = new BankDetailsPage(getEventDriver(), getHandler());
		
		System.out.println("******PHNX-7804 Admin -> Company -> ISO -> Bank Details -> Verify bank details get saved with Non mandatory field.*********");
		
		dashboardPage.clickOnCompanyTab(child);
		dashboardPage.clickISOTab(child);
		dashboardPage.searchAndSelectLegalBusinessName(child, "David ISO");
		Assert.assertTrue(bankDetailsPage.VerifMandatoryFieldShouldNotSavedWithNonMandatoryDetails(child));
	}
	
	@Test(priority = 1)
	public void Jira7865R (Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("AdminbaseURL"));
		child = ExtentManager.getReporter().startTest("PHNX-7865 Admin-ISO-Bank Details-Enter Nick Name as NA - User not able to save Nick Name as NA");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("Adminusername"),
				properties.getProperty("Adminpassword"), child);
		
		customersPage = new MerchantCustomersPage(getEventDriver(), getHandler());
		dashboardPage = new DashboardPage(getEventDriver(), getHandler());
		iSOApplicationPage = new ISOApplicationPage(getEventDriver(), getHandler());
		bankDetailsPage = new BankDetailsPage(getEventDriver(), getHandler());
		
		System.out.println("******PHNX-7863 Admin-ISO-Bank Details-Enter Nick Name as NA - User not able to save Nick Name as NA.*********");
		
		dashboardPage.clickOnCompanyTab(child);
		dashboardPage.clickISOTab(child);
		dashboardPage.searchAndSelectLegalBusinessName(child, "legal business");
		Assert.assertTrue(bankDetailsPage.VerifShouldDisplayCorrectNameAsPerSaved(child));
	}
}
