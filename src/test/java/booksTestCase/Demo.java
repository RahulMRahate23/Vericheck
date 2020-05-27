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

public class Demo extends BaseTest {

	LoginPage loginPage;
	TransactionPage transactionPage;

	@BeforeClass(alwaysRun = true)
	public void chartPdpPatientDetailsPage() {
		ExtentTestManager.startTest("Transaction Functionality", "Transaction Test Cases");
		parent = ExtentTestManager.getTest();
	}
	
	@Test(priority = 5)
	public void verifTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseSITURL"));
		child = ExtentManager.getReporter().startTest("Transaction - Amount- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - Amount- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("WEB", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDD("CUS_5756076821937561609756412313", child);
		transactionPage.enterAmount("50", child);
		transactionPage.enterDescription("validation", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
}
