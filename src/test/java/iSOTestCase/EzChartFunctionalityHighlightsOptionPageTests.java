package iSOTestCase;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.BaseTest;
import common.ExtentManager;
import common.ExtentTestManager;
import stepDefination.ChartPdpOpportunityPage;
import stepDefination.EzChartFunctionalityHighlightsOptionPage;
import stepDefination.LoginPage;

public class EzChartFunctionalityHighlightsOptionPageTests extends BaseTest {

	LoginPage loginPage;
	ChartPdpOpportunityPage chartPdpOpportunityPage;
	EzChartFunctionalityHighlightsOptionPage ezChartFunctionalityHighlightsOptionPage;
	
	@BeforeClass(alwaysRun = true)
	public void chartPdpPatientDetailsPage() {
		ExtentTestManager.startTest("EZ-chart-Functionality- EZ Chart Functionality Highlights Option Page", "EZ Chart Functionality Highlights Option Tests");
		parent = ExtentTestManager.getTest();
	}

	// Chart- PDP - Test Case ID -6.39
	@Test(priority = 1)
	public void verifyEvidenceAutoscrollLock(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify that Evidence Autoscroll Lock");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("***********Verify that Evidence Autoscroll Lock ***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyTheEvidenceAutoscrollLockAndDisableIt(child));
		
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child,"disabled"));
		
		Assert.assertTrue(chartPdpOpportunityPage.verifyTheEvidenceAutoscrollLockAndEnableIt(child));
		
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child,"enabled"));
	}
	
	// Chart- PDP - Test Case ID -6.40
	@Test(priority = 2)
	public void verifyEvidenceAutoscrollLockAndEnabled(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify that Evidence Autoscroll Lock- Enabled");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("***********Verify that Evidence Autoscroll Lock -Enabled***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1269");
		chartPdpOpportunityPage.clickOnTheChartTab(child);

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child,"enabled"));
		
		chartPdpOpportunityPage.verifyEvidenceOfTheselectedOpportunity(child, "true", "does not scroll");

		// Act
		chartPdpOpportunityPage.clickOnEvidenceAutoscrollLock(child);
		
		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child,"disabled"));
		
		chartPdpOpportunityPage.verifyEvidenceOfTheselectedOpportunity(child, "flase", "scroll");
	}
	
	// Chart- PDP - Test Case ID -6.41
	@Test(priority = 3)
	public void verifyEvidenceAutoscrollLockAndDisabled(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify that Evidence Autoscroll Lock- Disabled");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("***********Verify that Evidence Autoscroll Lock- Disabled***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);
		chartPdpOpportunityPage.clickOnEvidenceAutoscrollLock(child);
		
		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child,"disabled"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceButtonAppears(child));

		chartPdpOpportunityPage.verifyEvidenceOfTheselectedOpportunity(child, "flase", "scroll");
	}
	
	// Chart- PDP - Test Case ID -6.42
	@Test(priority = 4)
	public void verifyThatAutoScrollLockIsStillDisabledOnTheNextPatientsPDP(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify that Auto Scroll lock is still disabled on the next patient's PDP");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("***********Verify that Auto Scroll lock is still disabled on the next patient's PDP***********");
		ezChartFunctionalityHighlightsOptionPage.searchAndSelectPatient(child, "Stephanie Jones");
		chartPdpOpportunityPage.clickOnTheChartTab(child);
		chartPdpOpportunityPage.clickOnEvidenceAutoscrollLock(child);
		
		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child,"disabled"));	
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceButtonAppears(child));
		
		chartPdpOpportunityPage.verifyEvidenceOfTheselectedOpportunity(child, "flase", "scroll");
	
		// Act
		ezChartFunctionalityHighlightsOptionPage.clickOnNextPatient(child);
		
		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child,"disabled"));
	}
	
	// Chart- PDP - Test Case ID -6.42.2
	@Test(priority = 5)
	public void verifyEvidenceAutoscrollLockEnabledAfterRefreshThePage(Method method) throws Throwable {
		child = ExtentManager.getReporter()
				.startTest("Verify that the PDP has the default - Auto Scroll Lock is enabled After Refresh The Page");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("***********Verify that the PDP has the default - Auto Scroll Lock is enabled After Refresh The Page***********");
		ezChartFunctionalityHighlightsOptionPage.searchAndSelectPatient(child, "Stephanie Jones");
		
		chartPdpOpportunityPage.clickOnTheChartTab(child);
		chartPdpOpportunityPage.clickOnEvidenceAutoscrollLock(child);

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child, "disabled"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceButtonAppears(child));

		chartPdpOpportunityPage.verifyEvidenceOfTheselectedOpportunity(child, "flase", "scroll");

		// Act
		ezChartFunctionalityHighlightsOptionPage.clickOnNextPatient(child);

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child, "disabled"));

		// Act
		chartPdpOpportunityPage.refreshPage(child);

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEvidenceAutoscrollLockIconMode(child, "enabled"));
	}
	
	// Chart- PDP - Test Case ID -6.14
	@Test(priority = 6)
	public void verifyThatOnlyTheHCCEligibleOpportunitysHighlightsAreDisplayed(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify that only the HCC eligible opportunity's highlights are displayed");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("***********Verify that only the HCC eligible opportunity's highlights are displayed***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);
		chartPdpOpportunityPage.clickOnEvidenceAutoscrollLock(child);
		
		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEligibleOpportunitysHighlightsAreDisplayed(child,ezChartFunctionalityHighlightsOptionPage.HCCButton, "HCC",ezChartFunctionalityHighlightsOptionPage.HCCHighlightText));
	}
	
	// Chart- PDP - Test Case ID -6.15
	@Test(priority = 7)
	public void verifyThatOnlyTheRXHCCEligibleOpportunitysHighlightsAreDisplayed(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify that only the RXHCC eligible opportunity's highlights are displayed");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("***********Verify that only the RXHCC eligible opportunity's highlights are displayed***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);
		chartPdpOpportunityPage.clickOnEvidenceAutoscrollLock(child);

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEligibleOpportunitysHighlightsAreDisplayed(child, ezChartFunctionalityHighlightsOptionPage.RXHCCButton, "RXHCC",ezChartFunctionalityHighlightsOptionPage.HighlightRxhccText));
	}

	// Chart- PDP - Test Case ID -6.16
	@Test(priority = 8)
	public void verifyThatOnlyTheHCCRxHCCEligibleOpportunitysHighlightsAreDisplayed(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify that only the HCC + RxHCC eligible opportunity's highlights are displayed");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("***********Verify that only the HCC + RxHCC eligible opportunity's highlights are displayed***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);
		chartPdpOpportunityPage.clickOnEvidenceAutoscrollLock(child);

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEligibleOpportunitysHighlightsAreDisplayed(child, ezChartFunctionalityHighlightsOptionPage.HCCRXHCCButton, "HCC + RxHCC",ezChartFunctionalityHighlightsOptionPage.HighlightHccRxhccText));
	}
	
	// EZ-chart-Functionality -6.43
	@Test(priority = 9)
	public void verifyHighlightRelevantOpportunityWithAutoLockEnabled(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify Highlight Relevant Opportunity - With Auto Lock Enabled.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);
		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());

		// Act
		System.out.println("*********** Verify Highlight Relevant Opportunity - With Auto Lock Enabled.***********");

		chartPdpOpportunityPage.resetData(child, 1024);
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyEvidenceAutoscrollLockIconMode(child));
		chartPdpOpportunityPage.verifyEvidenceOfTheselectedOpportunity(child, "true", "does not scroll");

		// Act
		chartPdpOpportunityPage.refreshPage(child);

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyThatTheRelevantOpportunityIsHighlighted(child));

		// Act
		chartPdpOpportunityPage.refreshPage(child);

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyThatTheDocumentHeaderDisplayTheCorrectNumberOfTheEvidence(child));

		// Act
		chartPdpOpportunityPage.refreshPage(child);

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifythedocumentscrollsToDisplayTheNextOrThePreviousEvidence(child));
	}

	// EZ-chart-Functionality -6.44
	@Test(priority = 10)
	public void verifyHighlightRelevantOpportunityWithAutoLockDisabled(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify Highlight Relevant Opportunity - With Auto Lock Disabled.");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);
		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());

		// Act
		System.out.println("*********** Verify Highlight Relevant Opportunity - With Auto Lock Disabled.***********");

		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);
		chartPdpOpportunityPage.verifyTheEvidenceAutoscrollLockAndDisableIt(child);

		// Assertion
		chartPdpOpportunityPage.verifyEvidenceOfTheselectedOpportunity(child, "true", "scroll");

		// Act
		chartPdpOpportunityPage.refreshPage(child);

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyThatTheRelevantOpportunityIsHighlighted(child));

		// Act
		chartPdpOpportunityPage.refreshPage(child);

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyThatTheDocumentHeaderDisplayTheCorrectNumberOfTheEvidence(child));

		// Act
		chartPdpOpportunityPage.refreshPage(child);

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifythedocumentscrollsToDisplayTheNextOrThePreviousEvidence(child));
	}
	
	// EZ-chart-Functionality -6.1
	@Test(priority = 11)
	public void VerifyButtonsAndWidgetsOnPDPSection(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify that, Buttons / Widgets on PDP Section");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);
		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("*********** Verify that, Buttons / Widgets on PDP Section ***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(child,ezChartFunctionalityHighlightsOptionPage.FitInWindowButton, "Fit In Window button"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(child,ezChartFunctionalityHighlightsOptionPage.PopOutWindowBtn, "Pop Out Window button"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(child,ezChartFunctionalityHighlightsOptionPage.PdfButton, "PDF Radio Button"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(child,ezChartFunctionalityHighlightsOptionPage.IndicatorText, "Page Number indicator"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(child,ezChartFunctionalityHighlightsOptionPage.SearchTextBox, "Text Search Box"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(child,ezChartFunctionalityHighlightsOptionPage.ZoomInButton, "Zoom in button"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(child,ezChartFunctionalityHighlightsOptionPage.ZoomOutButton, "Zoom out button"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(child,ezChartFunctionalityHighlightsOptionPage.RotateButton, "Rotate button"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(child,chartPdpOpportunityPage.EvidenceAutoscrollLock, "Evidence Auto scroll Lock button"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyButtonDisplayedBelowTheWidgetsAndButtons(child,ezChartFunctionalityHighlightsOptionPage.ProjectName, "Project Name"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyButtonDisplayedBelowTheWidgetsAndButtons(child,ezChartFunctionalityHighlightsOptionPage.DateRange, "Date range of the chart"));
	}
	
	// EZ-chart-Functionality -6.3
	@Test(priority = 12)
	public void verifyPDPDefaultsWithTheAutoScrollLockON(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest(" Verify that the PDP defaults with the Auto Scroll Lock ON");
		parent.appendChild(child);
		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);
		
		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(), getHandler());

		// Act
		System.out.println("*********** Verify that the PDP defaults with the Auto Scroll Lock ON.***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);

		// Assertion
		ezChartFunctionalityHighlightsOptionPage.verifyPDPDefaultsWithTheAutoScrollLockON(child);
	}
	
	// EZ-chart-Functionality -6.4
	@Test(priority = 13)
	public void verifyNextEvidenceButtonFunction(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify Next Evidence Button Function");
		parent.appendChild(child);
		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(),getHandler());

		// Act
		System.out.println("*********** Verify Next Evidence Button Function.***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1270");
		chartPdpOpportunityPage.clickOnTheChartTab(child);

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyTheEvidenceAutoscrollLockAndDisableIt(child));
		Assert.assertTrue(chartPdpOpportunityPage.verifythedocumentscrollsToDisplayTheNextOrThePreviousEvidence(child));
	}
	
	// EZ-chart-Functionality -6.17
	@Test(priority = 14)
	public void verifyThatOnlyTheAllEligibleOpportunitysHighlightsAreDisplayed(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify that only the All eligible opportunity's highlights are displayed");
		parent.appendChild(child);

		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(),getHandler());

		// Act
		System.out.println("***********Verify that only the All eligible opportunity's highlights are displayed ***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);
		chartPdpOpportunityPage.clickOnEvidenceAutoscrollLock(child);

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyEligibleOpportunitysHighlightsAreDisplayedForAll(child));
	}
	
	// Chart- PDP - Test Case ID -6.2
	@Test(priority = 15)
	public void verifyHighlightOptionsForPlanType(Method method) throws Throwable {
		child = ExtentManager.getReporter().startTest("Verify Highlight Options For PlanType");
		parent.appendChild(child);
		new LoginPage(getEventDriver(), getHandler()).user_login_into_appliction_with_username_and_password(properties.getProperty("username"),
				properties.getProperty("password"), child);

		chartPdpOpportunityPage = new ChartPdpOpportunityPage(getEventDriver(), getHandler());
		ezChartFunctionalityHighlightsOptionPage = new EzChartFunctionalityHighlightsOptionPage(getEventDriver(),getHandler());

		// Act
		System.out.println("***********Verify Highlight Options For PlanType***********");
		chartPdpOpportunityPage.searchAndSelectPatient(child, "1320");
		chartPdpOpportunityPage.clickOnTheChartTab(child);

		ezChartFunctionalityHighlightsOptionPage.selectPlanType(child, "MA");

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyAllButtonSelectedByDefault(child));

		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyButtonDisplayForRelatedPlanType(child, "MA"));

		// Act
		ezChartFunctionalityHighlightsOptionPage.selectPlanType(child, "ACA");

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyAllButtonSelectedByDefault(child));

		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyButtonDisplayForRelatedPlanType(child, "ACA"));

		// Act
		ezChartFunctionalityHighlightsOptionPage.selectPlanType(child, "All");

		// Assertion
		Assert.assertTrue(chartPdpOpportunityPage.verifyAllButtonSelectedByDefault(child));

		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyButtonDisplayForRelatedPlanType(child, "All"));

		// Act
		ezChartFunctionalityHighlightsOptionPage.selectPlanType(child, "ACA");

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyHighlightTextWithRelatedPlanType(child, "ACA"));

		// Act
		ezChartFunctionalityHighlightsOptionPage.selectPlanType(child, "MA");

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyHighlightTextWithRelatedPlanType(child, "MA"));

		// Act
		ezChartFunctionalityHighlightsOptionPage.selectPlanType(child, "All");

		// Assertion
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifyHighlightTextWithRelatedPlanType(child, "All"));
		Assert.assertTrue(ezChartFunctionalityHighlightsOptionPage.verifySelectAnyHighlightsOptionThanItShouldNotSelectAll(child,	ezChartFunctionalityHighlightsOptionPage.HCCButton, "HCC",ezChartFunctionalityHighlightsOptionPage.HCCHighlightText));
	}
}
