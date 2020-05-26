package merchantTestCases;

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
import iSOModule.ISOApplicationPage;
import stepDefination.LoginPage;

public class MerchantTestCases extends BaseTest {

	LoginPage loginPage;
	MerchantCustomersPage customersPage;
	ISOApplicationPage iSOApplicationPage;
	DashboardPage dashboardPage;
	BankDetailsPage bankDetailsPage;

	@BeforeClass(alwaysRun = true)
	public void chartPdpPatientDetailsPage() {
		ExtentTestManager.startTest("ISO-Functionality- ISO Functionality", "ISO Functionality Test Cases");
		parent = ExtentTestManager.getTest();
	}

	@Test(priority = 1)
	public void Jira7864(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("PHNX-7864 Bank type when left empty and save , gets saved too displaying na and when edited still shows emtpy");
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
}
