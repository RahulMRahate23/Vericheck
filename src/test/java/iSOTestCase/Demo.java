package iSOTestCase;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.BaseTest;
import common.ExtentManager;
import common.ExtentTestManager;
import stepDefination.ChartPdpOpportunityPage;
import stepDefination.DashboardPage;
import merchantModule.MerchantCustomersPage;
import stepDefination.EzChartFunctionalityHighlightsOptionPage;
import iSOModule.BankDetailsPage;
import iSOModule.ExistingPortfolio;
import iSOModule.ISOApplicationPage;
import stepDefination.LoginPage;

public class Demo extends BaseTest {

	LoginPage loginPage;
	MerchantCustomersPage customersPage;
	ISOApplicationPage iSOApplicationPage;
	DashboardPage dashboardPage;
	BankDetailsPage bankDetailsPage;
	
	ExistingPortfolio existingPortfolio;

	@BeforeClass(alwaysRun = true)
	public void chartPdpPatientDetailsPage() {
		ExtentTestManager.startTest("EZ-chart-Functionality- EZ Chart Functionality Highlights Option Page", "EZ Chart Functionality Highlights Option Tests");
		parent = ExtentTestManager.getTest();
	}

	// Chart- PDP - Test Case ID -6.39
/*	@Test(priority = 1)
	public void Jira7989(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("PHNX-7989:- Sandbox Customer: Customer is not getting created in Sandbox.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("sandboxusername"),
				properties.getProperty("sandboxpassword"), child);
		
		customersPage = new CustomersPage(getEventDriver(), getHandler());
		iSOApplicationPage = new ISOApplicationPage(getEventDriver(), getHandler());
		iSOApplicationPage.enterBankRoutingNumber("987654321", child);
		
		System.out.println("******PHNX-7989:- Sandbox Customer: Customer is not getting created in Sandbox.*********");
		
		customersPage.SelectEntity(child);
		customersPage.clickOnOKButton(child);
		customersPage.clickOnCustomerTab(child);
		customersPage.clickCreateCustomerLink(child);
		customersPage.enterCostomerName("Customer Name 1", child);
		customersPage.enterRoutingNumber(child);
		customersPage.enterAccountNumber("MH31HJUK8999", child);
		customersPage.clickAndSelectAccountType(customersPage.SavingsAccountType, child);
		customersPage.enterEmail("rrahate23@gmail.com", child);
		customersPage.enterPhoneNumber("9876543210", child);
		customersPage.clickOnActiveCheckBox(child);
		customersPage.clickOnSaveButton(child);
	}
*/	
/*	@Test(priority = 1)
	public void Jira7864 (Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("PHNX-7864 Bank type when left empty and save , gets saved too displaying na and when edited still shows emtpy");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("Adminusername"),
				properties.getProperty("Adminpassword"), child);
		
		customersPage = new CustomersPage(getEventDriver(), getHandler());
		iSOApplicationPage = new ISOApplicationPage(getEventDriver(), getHandler());
		iSOApplicationPage.enterBankRoutingNumber("987654321", child);
		
		System.out.println("******PHNX-7989:- Sandbox Customer: Customer is not getting created in Sandbox.*********");
		
		customersPage.SelectEntity(child);
		customersPage.clickOnOKButton(child);
		customersPage.clickOnCustomerTab(child);
		customersPage.clickCreateCustomerLink(child);
		customersPage.enterCostomerName("Customer Name 1", child);
		customersPage.enterRoutingNumber(child);
		customersPage.enterAccountNumber("MH31HJUK8999", child);
		customersPage.clickAndSelectAccountType(customersPage.SavingsAccountType, child);
		customersPage.enterEmail("rrahate23@gmail.com", child);
		customersPage.enterPhoneNumber("9876543210", child);
		customersPage.clickOnActiveCheckBox(child);
		customersPage.clickOnSaveButton(child);
	}*/
	
/*	@Test(priority = 1)
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
		System.out.println("DFJDJ");
		dashboardPage.searchAndSelectLegalBusinessName(child, "David ISO");
		Assert.assertTrue(bankDetailsPage.VerifMandatoryFieldShouldNotSavedWithNonMandatoryDetails(child));
	}*/
	
	@Test(priority = 1)
	public void Jira7865 (Method method) throws Throwable {
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
