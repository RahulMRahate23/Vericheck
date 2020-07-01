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
	public void verifWebCreditTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - WEB Credit- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - WEB Credit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("WEB", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("WEB Credit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("validation", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 2)
	public void verifWebDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - WEB Debit- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - WEB Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("WEB", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("WEB Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("WEB Debit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 3)
	public void verifWebPrenoteTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - WEB Prenote- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - WEB Prenote- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("WEB", child);
		transactionPage.clickAndSelectTransactionTypeDD("Prenote", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("WEB Prenote",child);
		transactionPage.enterAmount("0", child);
		transactionPage.enterDescription("WEB Prenote", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 4)
	public void verifBocDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - BOC Debit- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - BOC Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("BOC", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("BOC Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterCheckNumber("9876" ,child);
		transactionPage.clickOnCheckImageBack("check1" ,child);
		transactionPage.clickOnCheckImageFront("check2" ,child);
		transactionPage.enterDescription("BOC Debit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 5)
	public void verifCcdCreditTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - CCD Credit- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - CCD Credit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("CCD", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("CCD Credit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("CCD Credit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 6)
	public void verifCcdDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - CCD Debit- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - CCD Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("CCD", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("CCD Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("CCD Debit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 7)
	public void verifCcdPrenoteTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - CCD Prenote- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - CCD Prenote- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("CCD", child);
		transactionPage.clickAndSelectTransactionTypeDD("Prenote", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("CCD Prenote",child);
		transactionPage.enterAmount("0", child);
		transactionPage.enterDescription("CCD Prenote", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 8)
	public void verifCieCreditTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - CIE Credit- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - CIE Credit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("CIE", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("CIE Credit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("CIE Credit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 9)
	public void verifCiePrenoteTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - CIE Prenote- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - CIE Prenote- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("CIE", child);
		transactionPage.clickAndSelectTransactionTypeDD("Prenote", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("CIE Prenote",child);
		transactionPage.enterAmount("0", child);
		transactionPage.enterDescription("CIE Prenot", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 10)
	public void verifCTXCreditTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - CTX Credit- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - CTX Credit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("CTX", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("CTX Credit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("CTX Credit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 11)
	public void verifCTXDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - CTX Debit- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - CTX Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("CTX", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("CTX Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("CTX Debit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 12)
	public void verifCTXPrenoteTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - CTX Prenote- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - CTX Prenote- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("CTX", child);
		transactionPage.clickAndSelectTransactionTypeDD("Prenote", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("CTX Prenote",child);
		transactionPage.enterAmount("0", child);
		transactionPage.enterDescription("CTX Prenot", child);
		transactionPage.clickOnSubmitButton(child);
	}
	
	@Test(priority = 13)
	public void verifPOPDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - POP Debit- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - POP Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("POP", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("POP Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterCity("Chicago" ,child);
		transactionPage.enterState("Boston" ,child);
		transactionPage.enterCheckNumber("9876" ,child);
		transactionPage.clickOnCheckImageBack("check1" ,child);
		transactionPage.clickOnCheckImageFront("check2" ,child);
		transactionPage.enterDescription("POP Debit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 14)
	public void verifPOSDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - POS Debit- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - POS Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("POS", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("POS Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterCity("Chicago" ,child);
		transactionPage.enterState("Boston" ,child);
		transactionPage.enterTerminalLocation("Birmingham" ,child);
		transactionPage.enterTransactionSerialNumber("978789" ,child);
		transactionPage.enterTransactionTypeCode("2" ,child);
		transactionPage.enterTerminalIdentificationCode("987654" ,child);
		transactionPage.enterDescription("POS Debit", child);
		transactionPage.enterAddenda("POS Addenda transaction", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 15)
	public void verifPPDCreditTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - PPD Credit- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - PPD Credit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("PPD", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("PPD Credit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("PPD Credit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 16)
	public void verifPPDDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - PPD Debit- Transaction Created Successfully.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - PPD Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("PPD", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("PPD Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("PPD Debit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 17)
	public void verifPPDPrenoteTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - PPD Prenote- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - PPD Prenote- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("PPD", child);
		transactionPage.clickAndSelectTransactionTypeDD("Prenote", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("PPD Prenote",child);
		transactionPage.enterAmount("0", child);
		transactionPage.enterDescription("PPD Prenote", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 18)
	public void verifRCKDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - RCK Debit- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - RCK Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("RCK", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("RCK Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterCheckNumber("9876" ,child);
		transactionPage.clickOnCheckImageBack("check1" ,child);
		transactionPage.clickOnCheckImageFront("check2" ,child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 19)
	public void verifTELDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - TEL Debit- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - TEL Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("TEL", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("TEL Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterDescription("TEL Debit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
	}
	
	@Test(priority = 20)
	public void verifARCDebitTransactionCreatedSuccessfully() throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - ARC Debit- Transaction Created Successfully");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - ARC Debit- Transaction Created Successfully.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("ARC", child);
		transactionPage.clickAndSelectTransactionTypeDD("Debit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("ARC Debit",child);
		transactionPage.enterAmount("10", child);
		transactionPage.enterCheckNumber("9876" ,child);
		transactionPage.clickOnCheckImageBack("check1" ,child);
		transactionPage.clickOnCheckImageFront("check2" ,child);
		transactionPage.enterDescription("ARC Debit", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifTransactionCreatedSuccessfully(child));
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
	
	@Test(priority = 51)
	public void verifyAmountIsMandatoryField(Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
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
		transactionPage.clickAndSelectExistingCustomerDDIndex("TEL Debit",child);
		transactionPage.enterDescription("validation", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.VerifAmountIsMandatoryField(child));
	}

	@Test(priority = 52)
	public void verifyWithAmountas0(Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
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
		transactionPage.clickAndSelectExistingCustomerDDIndex("TEL Debit",child);
		transactionPage.enterAmount("0", child);
		transactionPage.enterDescription("validation", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifAmountvalidationas0(child));
	}
	
	@Test(priority = 53)
	public void verifAmountFieldMustBeLessThanOrEqualTo999999999(Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
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
		transactionPage.clickAndSelectExistingCustomerDDIndex("TEL Debit",child);
		transactionPage.enterAmount("7,988,888,88889", child);
		transactionPage.enterDescription("validation", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifAmountvalidation(child));
	}
	
	@Test(priority = 54)
	public void verifAmountFieldAcceptsOnlyPositiveAndDecimalNumberUpTo2Places(Method method) throws Throwable {
		getEnviromentDetailsReady(properties.getProperty("BookbaseUATURL"));
		child = ExtentManager.getReporter().startTest("Transaction - validation- Verify Amount field accepts only positive and decimal number up to 2 places.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("bookesMerchant"),
				properties.getProperty("password"), child);
		transactionPage = new TransactionPage(getEventDriver(), getHandler());
		
		System.out.println("******Transaction - validation- Verify Amount field accepts only positive and decimal number up to 2 places.*********");
		transactionPage.clickOnTransactionTab(child);
		transactionPage.clickOnCreateTransactionButton(child);
		transactionPage.clickAndSelectStandardEntryClassDD("WEB", child);
		transactionPage.clickAndSelectTransactionTypeDD("Credit", child);
		transactionPage.clickAndSelectExistingCustomerDDIndex("TEL Debit",child);
		transactionPage.enterAmount("23.7889", child);
		transactionPage.enterDescription("validation", child);
		transactionPage.clickOnSubmitButton(child);
		Assert.assertTrue(transactionPage.verifAmountvalidation(child));
	}
}
