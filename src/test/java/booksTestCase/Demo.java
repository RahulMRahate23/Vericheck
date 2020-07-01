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
	
	@Test(priority = 21)
	public void verifXCKDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - XCK Debit- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - XCK Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("XCK", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("XCK Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterCheckNumber("9876" ,child);
		transactionPage.clickOnCheckImageBack("check1" ,child);
		transactionPage.clickOnCheckImageFront("check2" ,child);
		transactionPage.enterProcessControl("Process control" ,child);
		transactionPage.enterItemResearchNumber("research" ,child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
}
