package booksTestCase;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import booksMerchant.TransactionPage;
import common.BaseTest;
import common.ExtentManager;
import common.ExtentTestManager;
import stepDefination.LoginPage;

public class TransactionTestCases extends BaseTest {

	LoginPage loginPage;
	TransactionPage transactionPage;

	@BeforeClass(alwaysRun = true)
	public void chartPdpPatientDetailsPage() {
		ExtentTestManager.startTest("Transaction Functionality", "Transaction Test Cases");
		parent = ExtentTestManager.getTest();
	}
	
	@Test(priority = 1)
	public void verifyWithRoutingNumberWithLessThan9Digits(Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseSITURL"));
		child = ExtentManager.getReporter().startTest("Transaction - validation- Verify Amount is mandatory.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(
				properties.getProperty("bookesMerchant"), properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());

		System.out.println("******Transaction - validation- Verify Amount is mandatory.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("WEB", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDD("CUS_5756076821937561609756412313", child);
		transactionPage.enterDescription("validation", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.VerifAmountIsMandatoryField(child));
	}

	@Test(priority = 2)
	public void verifyWithAmountas0(Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseSITURL"));
		child = ExtentManager.getReporter().startTest("Transaction - validation- Verify with Amount =0.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(
				properties.getProperty("bookesMerchant"), properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());

		System.out.println("******Transaction - validation- Verify with Amount =0.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("WEB", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDD("CUS_5756076821937561609756412313", child);
		transactionPage.enterAmount("0", child);
		transactionPage.enterDescription("validation", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifAmountvalidationas0(child));
	}
	
	@Test(priority = 3)
	public void verifAmountFieldMustBeLessThanOrEqualTo999999999(Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseSITURL"));
		child = ExtentManager.getReporter().startTest("Transaction - validation- Verify Amount field must be less than or equal to 99999999.99.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - validation- Verify Amount field must be less than or equal to 99999999.99.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("WEB", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDD("CUS_5756076821937561609756412313", child);
		transactionPage.enterAmount("7,988,888,88889", child);
		transactionPage.enterDescription("validation", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifAmountvalidation(child));
	}
}
