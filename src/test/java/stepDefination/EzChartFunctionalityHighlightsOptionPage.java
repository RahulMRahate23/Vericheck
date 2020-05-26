package stepDefination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import common.AutoLogger;
import common.BasePage;

public class EzChartFunctionalityHighlightsOptionPage extends BasePage {

	@FindBy(xpath = "//i[@class='fa fa-plus text-success']")
	WebElement AddButton;
	
	@FindBy(xpath = "//*[@id='opportunities_row0_col4']//following::span[text()='ICD Code']")
	public WebElement ClaimsCodes;
	
	@FindBy(css = ".opp-dos-selector > div:nth-child(2) > label:nth-child(1) > input:nth-child(1)")
	WebElement DosValue;
	
	@FindBy(xpath = "//*[@class='col-xs-4 truncate']")
	public WebElement DateRange;
	
	@FindBy(xpath = "//*[@title='Evidence autoscroll OFF']")
	public WebElement EvidenceAutoscrollOFF;

	@FindBy(xpath = "//*[@title='Evidence autoscroll ON']")
	public WebElement EvidenceAutoscrollON;
	
	@FindBy(xpath = "//*[@class='btn btn-default filter-opp-btn']")
	WebElement FilterButton;
	
	@FindBy(xpath = "//button[@data-test='scale-to-fit']")
	public WebElement FitInWindowButton;
	
	@FindBy(xpath = "//label[text()='HCC']")
	public WebElement HCCButton;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-hcc-all highlight-hcc')]")
	public WebElement HCCHighlightText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-rxhcc-all highlight-rxhcc')]")
	public WebElement HighlightRxhccText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-hcc-rxhcc-all highlight-hcc-rxhcc')]")
	public WebElement HighlightHccRxhccText;
	
	@FindBy(xpath = "//*[contains(@class, '//*[contains(@class, 'highlight-hhs-all highlight-hhs')]")
	public WebElement HighlightHhsText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-hhs')]")
	public WebElement HhsHighlightText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-hcc-hhs')]")
	public WebElement HccHhsHighlightText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-hcc-hhs-all highlight-hcc-hhs')]")
	public WebElement HccHhsHighlightTexts;
	
	@FindBy(xpath = "//span[contains(@class, 'highlight-hcc-rxhcc-all')]")
	public WebElement HCCRxHCCHighlightText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-hcc-rxhcc-all highlight-hcc-rxhcc')]")
	public WebElement HCCRxHCCHighlightTexts;
	
	@FindBy(xpath = "//*[contains(@class, '//*[contains(@class, 'highlight-hcc-hhs-all highlight-hcc-hhs')]")
	public WebElement HighlightHccHhsText;
	
	@FindBy(xpath = "//label[text()='HCC+RXHCC']")
	public WebElement HCCRXHCCButton;
	
	@FindBy(xpath = "//label[text()='HHS']")
	public WebElement HHSButton;
	
	@FindBy(xpath = "//label[text()='HHS+HCC']")
	public WebElement HHSHCCButton;
	
	@FindBy(xpath = "//label[text()='HSS+RxHCC']")
	public WebElement HHSRxHCCButton;
	
	@FindBy(xpath = "//label[text()='HSS+HCC+RxHCC']")
	public WebElement HSSHCCRxHCCButton;
	
	@FindBy(xpath = "//*[@value='firstName']")
	public WebElement FirstName;
	
	@FindBy(xpath = "//*[@class='indicator-text']")
	public WebElement IndicatorText;
	
	@FindBy(xpath = "//*[@class='fa fa-chevron-right']")
	public WebElement NextPatient;
	
	@FindBy(xpath = "//span[@data-test='evidence-page-numbers']")
	public WebElement NumberOfEvidenceDoc;
	
	@FindBy(xpath = "//*[@id='opportunities']")
	WebElement Opportunitiesgrid;
	
	@FindBy(xpath = "//tr[@ng-repeat='patient in patients']")
	List<WebElement> PatientsList;
	
	@FindBy(xpath = "//select[@ng-model='planType']")
	WebElement PlanTypeDropdownBox;
	
	@FindBy(xpath = "//tr[@ng-repeat='patient in patients']//td//a")
	List<WebElement> PatientsListName;
	
	@FindBy(xpath = "//button[@data-test='pdf-toggle']")
	public WebElement PdfButton;
	
	@FindBy(xpath = "//button[@class='popout-evidence btn btn-default ng-click-active']")
	public WebElement PopOutWindowBtn;
	
	@FindBy(xpath = "//span[@class='col-xs-5 truncate']")
	public WebElement ProjectName;
	
	@FindBy(xpath = "//label[text()='RXHCC']")
	public WebElement RXHCCButton;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-rxhcc-all')]")
	public WebElement RxHCCHighlightText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-rxhcc-all highlight-rxhcc')]")
	public WebElement RxHCCHighlightTexts;
	
	@FindBy(xpath = "//button[@data-test='rotate']")
	public WebElement RotateButton;
	
	@FindBy(xpath = "//input[@placeholder='Select a rendering provider...']")
	WebElement RenderingPlaceholder;
	
	@FindBy(xpath = "//*[@class='ui-select-choices-row-inner']")
	List<WebElement> RenderProviderValue;
	
	@FindBy(xpath = "//div[@data-col='3'][@id='opportunities_row0_col3']")
	WebElement RenderingProvider;
	
	@FindBy(xpath = "//div[@data-col='3']//div")
	List<WebElement> RenderingProviderList;
	
	@FindBy(linkText = "Search")
	WebElement SearchLink;
	
	@FindBy(xpath = "//*[@id='opportunities_row0_col4']")
	public WebElement SuspectCodes;
	
	@FindBy(xpath = "//input[@type='text']")
	public WebElement SearchTextBox;
	
	@FindBy(xpath = "//button[@data-test='zoom-in']")
	public WebElement ZoomInButton;

	@FindBy(xpath = "//button[@data-test='zoom-out']")
	public WebElement ZoomOutButton;
	
	
	// EzChart Functionality Highlights Option Page Constructor.
	public EzChartFunctionalityHighlightsOptionPage(WebDriver driver, AutoLogger handler) {
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}
	
	/*
	 * This method is used to verify Evidence Autoscroll LockIcon Shown In Undocked
	 * Mode
	 * 
	 * @param ExtentTest child
	 * 
	 * @return Evidence autoscroll lock icon shown in undocked mode.
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyEvidenceAutoscrollLockIconMode(ExtentTest child,String Button) throws InterruptedException {
			if (Button =="enabled") {
				actions.waitForElementToBeClickable(EvidenceAutoscrollON, 15);
				boolean Result =EvidenceAutoscrollON.isEnabled();
				Reporter.log("Evidence autoscroll lock icon is still enabled: - Evidence Autoscroll ON.");
				child.log(LogStatus.INFO, "Evidence autoscroll lock icon is still enabled: - Evidence Autoscroll ON.");
				return Result;
			}
			else if (Button =="disabled") {
				actions.waitForElementToBeClickable(EvidenceAutoscrollOFF, 15);
				boolean Result =EvidenceAutoscrollOFF.isEnabled();
				Reporter.log("Evidence autoscroll lock icon is still disabled: -Evidence Autoscroll OFF.");
				child.log(LogStatus.INFO, "Evidence autoscroll lock icon is still disabled: -Evidence Autoscroll OFF.");
				return Result;
			}
		return false;
	}
	
	/*
	 * This method is used to click On Next Patient
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean clickOnNextPatient(ExtentTest child) throws InterruptedException {
		try {
			actions.waitForElementToBeClickable(NextPatient, 15);
			NextPatient.click();
			actions.waitForElement(4000);
			Reporter.log("Click on the NextPatient.");
			child.log(LogStatus.INFO, "Click on the Next Patient");
			return true;
		} catch (NoSuchElementException e) {
			Reporter.log("Next Button is not available for this patient");
			child.log(LogStatus.INFO, "Next Button is not available for this patient");
			return false;
		}
	}
	
	/*
	 * This method is used to go to search tab and Search And Select Patient
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void searchAndSelectPatient(ExtentTest child, String patientId) throws InterruptedException {
		actions.waitForElementToBeClickable(SearchLink, 15);
		SearchLink.click();
		Reporter.log("Click on 'Search' tab.");
		child.log(LogStatus.INFO, "Click on 'Search' tab.");
		actions.waitForElementToBeClickable(FirstName, 15);
		FirstName.click();
		actions.waitForElementToBeClickable(SearchTextBox, 15);
		SearchTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a"), patientId);
		Reporter.log("Enter patient name into search box.");
		child.log(LogStatus.INFO, "Enter patient name into search box.");
		int pcount = PatientsList.size();
		for (int k = 0; k < pcount; k++) {
			String patientName = PatientsList.get(k).getText();
			if (patientName.contains(patientId)) {
				actions.waitForElementToBeClickable(PatientsListName.get(k), 15);
				PatientsListName.get(k).click();
				actions.waitForElement(1000);
				Reporter.log("Click on patient to open patient details page.");
				child.log(LogStatus.INFO, "Click on patient to open patient details page.");
				break;
			}
		}
	}
	
	/*
	 * This method is used to Verify Review Flag Button is Enabled.
	 * 
	 * @param ExtentTest child
	 * 
	 * @return select current date as due date and enter it manually or not.
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyEvidenceButtonAppears(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		boolean evidence = IndicatorText.isEnabled();
			Reporter.log("Verify the number of evidence button appears on the doc header");
			child.log(LogStatus.INFO, "Verify the number of evidence button appears on the doc header");
			return evidence;
	}
	
	/*
	 * This method is used to verify Eligible Opportunity Highlights Are Displayed
	 * 
	 * @param ExtentTest child,Button,ButtonName and ButtonSelected
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyEligibleOpportunitysHighlightsAreDisplayed(ExtentTest child, WebElement Button, String ButtonName,WebElement ButtonSelected) throws InterruptedException {
		actions.waitForElement(3000);
		Button.click();
		List<WebElement> opportunityRows = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
				.findElements(By.cssSelector("div[class='ui-grid-row']"));
		if (opportunityRows != null && !opportunityRows.isEmpty() && opportunityRows.size() > 0) {
			for (int cnt = 0; cnt <= opportunityRows.size() - 2; cnt++) {
				String IcdCodme = "";
				try {
					actions.waitForElement(2000);
					WebElement IcdCode = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
							.findElement(By.id("opportunities_row" + cnt + "_col4"));
					IcdCode.click();
					actions.waitForElement(4000);
					IcdCodme = IcdCode.getText();
					WebElement dosElement = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
							.findElement(By.id("opportunities_row" + cnt + "_col2"));
					dosElement.click();
					actions.waitForElement(4000);
					DosValue.click();
					actions.waitForElement(4000);
					if (ButtonSelected.isDisplayed()) {
						Reporter.log(ButtonName + " " + "eligible opportunity's highlights are displayed for :-" + IcdCodme);
						child.log(LogStatus.INFO,ButtonName + " " + "eligible opportunity's highlights are displayed for :-" + IcdCodme);
					}
				} catch (NoSuchElementException e) {
					Reporter.log(ButtonName + " " + "eligible opportunity's highlights are not displayed for :-" + IcdCodme);
					child.log(LogStatus.INFO,ButtonName + " " + "eligible opportunity's highlights are not displayed for :-" + IcdCodme);
				}
			}
			return true;
		}
		return false;
	}
	
	/*
	 * This method is used to select PlanType
	 * @param Extent Test Child and PlanType
	 * @return nothing
	 * @exception InterruptedException 
	 */
	public void selectPlanType(ExtentTest child, String PlanType) throws InterruptedException {
		actions.waitForElement(3000);
		actions.selectDropdownByVisibleText(PlanTypeDropdownBox, PlanType);
		Reporter.log("Switch to Plan Type as : -" + PlanType);
		child.log(LogStatus.INFO, "Switch to view claims as : -" + PlanType);
	}
	
	/*
	 * This method is used to verify Button Is Enabled Or Disabled
	 * 
	 * @param ExtentTest child,ButtonSelected,ButtonName and PlanType
	 * 
	 * @return true
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyButtonIsEnabledOrDisabled(ExtentTest child, WebElement ButtonSelected, String ButtonName,String PlanType) throws InterruptedException {
		String[] ACA = { "HHS Highlight Text"};
		String[] MA = { "HCC Highlight Text", "RxHCC Highlight Text", "HCC + RxHCC Highlight Text" };
		String[] ALL = {  "HCC Highlight Text", "RxHCC Highlight Text", "HCC + RxHCC Highlight Text","HHS Highlight Text","HHS+HCC Highlight Text","HSS+RxHCC Highlight Text","HSS+HCC+RxHC Highlight Text" };
		String[] Common;

		actions.waitForElement(2000);
		try {
			if (ButtonSelected.isDisplayed()) {
				if (PlanType == "ACA") {
					Common = ACA;
				} else if (PlanType == "MA") {
					Common = MA;
				} else {
					Common = ALL;
				}
				if (Arrays.asList(Common).contains(ButtonName)) {
					Reporter.log(ButtonName + " " + "Display as related plan type -"+ PlanType);
					child.log(LogStatus.INFO, ButtonName + " " + "Display as related plan type -" + PlanType);
					return true;
				} else {
					Reporter.log(ButtonName + " " + "Clinical document Should Not display as related plan type -"+ PlanType);
					child.log(LogStatus.INFO, ButtonName + " "	+ "Clinical document Should Not display as related plan type -" + PlanType);
					return false;
				}
			}
		} catch (NoSuchElementException e) {
			Reporter.log(ButtonName + " " + "Not display as related plan type -"+ PlanType);
			child.log(LogStatus.INFO, ButtonName + " " + "Not display as related plan type -" + PlanType);
			return true;
		}
		return false;
	}
	
	/*
	 * This method is used to verify Highlight Button With Related PlanType All
	 * 
	 * @param ExtentTest child
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyHighlightTextWithRelatedPlanType(ExtentTest child,String PlanType) throws InterruptedException {
		
		actions.waitForElement(2000);
		Assert.assertTrue(verifyButtonIsEnabledOrDisabled(child, HhsHighlightText, "HHS Highlight Text", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabled(child, HCCHighlightText, "HCC Highlight Text", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabled(child, RxHCCHighlightText, "RxHCC Highlight Text", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabled(child, HCCRxHCCHighlightText, "HCC + RxHCC Highlight Text", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabled(child, HccHhsHighlightText, "HHS+HCC Highlight Text", PlanType));	
		return true;
	}

	/*
	 * This method is used to verify Followig Widget And Buttons Are Present Below The Chart Data Entry
	 * 
	 * @param ExtentTest child,ButtonElement and ButtonName
	 * 
	 * @return isDisplayed
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyFollowigWidgetAndButtonsArePresentBelowTheChartDataEntry(ExtentTest child,WebElement ButtonElement,String ButtonName) throws InterruptedException {
		actions.waitForElement(3000);
		Point value =ButtonElement.getLocation();
		Point Center =FilterButton.getLocation();
		actions.waitForElement(3000);
		int X =value.getX();
		int CenterX =Center.getX();
		boolean isDisplayed = ButtonElement.isDisplayed();
		if( X >= CenterX){
			Reporter.log(ButtonName +" are present below the Chart Data Entry on the RSH.");
			child.log(LogStatus.INFO, ButtonName +" are present below the Chart Data Entry on the RSH.");
			return false;
		}else if(X <= CenterX){
			Reporter.log(ButtonName +" are present below the Chart Data Entry on the LHS.");
			child.log(LogStatus.INFO, ButtonName +" are present below the Chart Data Entry on the LHS.");
			return true;
		}
		return isDisplayed;
	}
	
	/*
	 * This method is used to verify button displayed below the Widgets and buttons
	 * 
	 * @param ExtentTest child,ButtonElement and ButtonName
	 * 
	 * @return isDisplayed
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyButtonDisplayedBelowTheWidgetsAndButtons(ExtentTest child,WebElement ButtonElement,String ButtonName) throws InterruptedException {
		actions.waitForElement(3000);
		Point value =ButtonElement.getLocation();
		Point Center =PdfButton.getLocation();
		actions.waitForElement(3000);
		int Y =value.getY();
		int CenterX =Center.getY();
		boolean isDisplayed = ButtonElement.isDisplayed();
		if( Y >= CenterX){
			Reporter.log(ButtonName +" displayed below the Widgets and buttons.");
			child.log(LogStatus.INFO, ButtonName +" displayed below the Widgets and buttons.");
			return true;
		}else if(Y <= CenterX){
			Reporter.log(ButtonName +" displayed above Widgets and buttons.");
			child.log(LogStatus.INFO, ButtonName +" displayed above Widgets and buttons");
			return false;
		}
		return isDisplayed;
	}
	
	/*
	 * This method is used to verify Evidence Autoscroll LockIcon Shown In Undocked
	 * Mode
	 * 
	 * @param ExtentTest child
	 * 
	 * @return Evidence autoscroll lock icon shown in undocked mode.
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyPDPDefaultsWithTheAutoScrollLockON(ExtentTest child) throws InterruptedException {		
		actions.waitForElement(2000);
		try {
			if (EvidenceAutoscrollON.isEnabled()) {
				Reporter.log("Evidence autoscroll lock icon is still enabled: - Evidence Autoscroll ON.");
				child.log(LogStatus.INFO, "Evidence autoscroll lock icon is still enabled: - Evidence Autoscroll ON.");
				return true;
			}
		} catch (NoSuchElementException e) {
				Reporter.log("Evidence autoscroll lock icon is still disabled: -Evidence Autoscroll OFF.");
				child.log(LogStatus.INFO, "Evidence autoscroll lock icon is still disabled: -Evidence Autoscroll OFF.");
				return false;
			}
		return false;
	}
	
	/*
	 * This method is used to verify Button Is Enabled Or Disabled For Related PlanType
	 * 
	 * @param ExtentTest child,ButtonSelected,ButtonName and PlanType
	 * 
	 * @return Actual Background Color
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyButtonIsEnabledOrDisabledForRelatedPlanType(ExtentTest child, WebElement ButtonSelected, String ButtonName,String PlanType) throws InterruptedException {
		actions.waitForElement(2000);
		String HCCBackgroundColor = "rgba(255, 255, 0, 1)";
		String RXHCCBackgroundColor = "rgba(255, 60, 60, 1)";
		String HCCRXHCCBackgroundColor = "rgba(255, 128, 0, 1)";
		String HHSBackgroundColor = "rgba(102, 255, 204, 1)";
		String HHSHCCBackgroundColor = "rgba(153, 0, 153, 1)";
		String HHSRxHCCBackgroundColor = "rgba(51, 153, 255, 1)";
		String HHSHCCRxHCCBackgroundColor = "rgba(255, 221, 51, 1)";
		
		String[] ACA = { "HHS Button" };
		String[] MA = { "HCC Button", "RxHCC Button", "HCC+RxHCC Button" };
		String[] ALL = { "HCC Button", "RxHCC Button", "HCC+RxHCC Button","HHS Button", "HHS+HCC Button", "HHS + RxHCC Button","HHS + HCC+ RxHCC Button" };
		String[] Common;
		
		actions.waitForElement(2000);
		try {
			if (ButtonSelected.isDisplayed()) {
				if (PlanType == "ACA") {
					Common = ACA;
				} else if (PlanType == "MA") {
					Common = MA;
				} else {
					Common = ALL;
				}
				if (Arrays.asList(Common).contains(ButtonName)) {
					String ActualBackgroundColor = ButtonSelected.getCssValue("background-color");
					actions.waitForElement(2000);
					if (HCCBackgroundColor.equals(ActualBackgroundColor)) {
						Reporter.log("HCC (Default indicate with Light YELLOW Color) Display as related plan type -"+ PlanType);
						child.log(LogStatus.INFO,"HCC (Default indicate with Light YELLOW Color) Display as related plan type -"+ PlanType);
						return true;
					} else if (RXHCCBackgroundColor.equals(ActualBackgroundColor)) {
						Reporter.log("RxHCC (Default indicate with RED) Display as related plan type -"+ PlanType);
						child.log(LogStatus.INFO, "RxHCC (Default indicate with RED) Display as related plan type -"+ PlanType);
						return true;
					} else if (HCCRXHCCBackgroundColor.equals(ActualBackgroundColor)) {
						Reporter.log("HCC+RxHCC (Default indicate with ORANGE Color) Display as related plan type -"+ PlanType);
						child.log(LogStatus.INFO,"HCC+RxHCC (Default indicate with ORANGE Color) Display as related plan type -"+ PlanType);
						return true;
					} else if (HHSBackgroundColor.equals(ActualBackgroundColor)) {
						Reporter.log("HHS (Default indicate with purple  Color) Display as related plan type -"+ PlanType);
						child.log(LogStatus.INFO,"HHS (Default indicate with purple  Color) Display as related plan type -"+ PlanType);
						return true;
					} else if (HHSHCCBackgroundColor.equals(ActualBackgroundColor)) {
						Reporter.log("HHS+HCC (Default indicate with light purple Color) Display as related plan type -"+ PlanType);
						child.log(LogStatus.INFO,"HHS+HCC (Default indicate with light purple Color) Display as related plan type -"+ PlanType);
						return true;
					} else if (HHSRxHCCBackgroundColor.equals(ActualBackgroundColor)) {
						Reporter.log("HHS+RxHCC (Default indicate with BLUE Color) Display as related plan type -"+ PlanType);
						child.log(LogStatus.INFO,"HHS+RxHCC (Default indicate with BLUE Color) Display as related plan type -"+ PlanType);
						return true;
					} else if (HHSHCCRxHCCBackgroundColor.equals(ActualBackgroundColor)) {
						Reporter.log("HHS+HCC+RxHCC (Default indicate with Neon (light green) Color) Display as related plan type -"+ PlanType);
						child.log(LogStatus.INFO, "HHS+HCC+RxHCC (Default indicate with Neon (light green) Color) Display as related plan type -"+ PlanType);
						return true;
					} else if (HCCBackgroundColor.equals(ActualBackgroundColor)) {
						Reporter.log("HHS+HCC+RxHCC (Default indicate with Neon (light green) Color) Display as related plan type -"+ PlanType);
						child.log(LogStatus.INFO, "HHS+HCC+RxHCC (Default indicate with Neon (light green) Color) Display as related plan type -"+ PlanType);
						return true;
					} else if (HCCBackgroundColor.equals(ActualBackgroundColor)) {
						Reporter.log("HHS+HCC+RxHCC (Default indicate with Neon (light green) Color) Display as related plan type -"+ PlanType);
						child.log(LogStatus.INFO, "HHS+HCC+RxHCC (Default indicate with Neon (light green) Color) Display as related plan type -"+ PlanType);
						return true;
					}	
				} else {
					Reporter.log(ButtonName + " Should Not display as related plan type -" + PlanType);
					child.log(LogStatus.INFO, ButtonName+ " Should Not display as related plan type -" + PlanType);
					return false;
				}
			}
		} catch (NoSuchElementException e) {
			Reporter.log(ButtonName + " " + "Not display as related plan type -"+ PlanType);
			child.log(LogStatus.INFO, ButtonName + " " + "Not display as related plan type -" + PlanType);
			return true;
		}
		return false;
	}
	
	/*
	 * This method is used to verify Button Display For Related PlanType
	 * 
	 * @param ExtentTest child,PlanType
	 * 
	 * @return Actual Background Color of buttons
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyButtonDisplayForRelatedPlanType(ExtentTest child,String PlanType) throws InterruptedException {
		actions.waitForElement(2000);
		Assert.assertTrue(verifyButtonIsEnabledOrDisabledForRelatedPlanType(child,HCCButton, "HCC Button", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabledForRelatedPlanType(child,RXHCCButton, "RxHCC Button", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabledForRelatedPlanType(child,HCCRXHCCButton, "HCC+RxHCC Button", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabledForRelatedPlanType(child,HHSButton, "HHS Button", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabledForRelatedPlanType(child,HHSHCCButton, "HHS+HCC Button", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabledForRelatedPlanType(child,HHSRxHCCButton, "HHS + RxHCC Button", PlanType));
		Assert.assertTrue(verifyButtonIsEnabledOrDisabledForRelatedPlanType(child,HSSHCCRxHCCButton, "HHS + HCC+ RxHCC Button", PlanType));
		return true;
	}
	
	/*
	 * This method is used to verify Select Any Highlights Option Than It Should Not Select All
	 * 
	 * @param ExtentTest child,Button,ButtonName and ButtonSelected
	 * 
	 * @return Button is Selected
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifySelectAnyHighlightsOptionThanItShouldNotSelectAll(ExtentTest child, WebElement Button,String ButtonName, WebElement ButtonSelected) throws InterruptedException {
		actions.waitForElement(3000);
		String[] ExpectedResult = {"rgb(40, 167, 69)","#ccc","#28a745"};
		Button.click();
		actions.waitForElement(3000);
		List<WebElement> opportunityRows = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
				.findElements(By.cssSelector("div[class='ui-grid-row']"));
		if (opportunityRows != null && !opportunityRows.isEmpty() && opportunityRows.size() > 0) {
			for (int cnt = 0; cnt <= opportunityRows.size() - 2; cnt++) {
				String IcdCodme = "";
				try {
					actions.waitForElement(2000);
					WebElement IcdCode = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
							.findElement(By.id("opportunities_row" + cnt + "_col4"));
					IcdCode.click();
					actions.waitForElement(4000);
					IcdCodme = IcdCode.getText();
					WebElement dosElement = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
							.findElement(By.id("opportunities_row" + cnt + "_col2"));
					dosElement.click();
					actions.waitForElement(4000);
					DosValue.click();
					actions.waitForElement(4000);
					String ActualBackgroundColor = Button.getCssValue("border-color");
					if (Arrays.asList(ExpectedResult).contains(ActualBackgroundColor)) {
						Reporter.log("Verify that, If user select " + ButtonName + " highlight option button and change to opportunity then it should not select 'all'."+ IcdCodme);
						child.log(LogStatus.INFO,ButtonName + " " + "eligible opportunity's highlights are displayed for :-" + IcdCodme);
					} else {
						Reporter.log("Verify that, If user select " + ButtonName+ " highlight option button and change to opportunity then it should not select 'all'."+ IcdCodme);
						child.log(LogStatus.INFO,	ButtonName + " " + "eligible opportunity's highlights are displayed for :-" + IcdCodme);
						return false;
					}
				} catch (NoSuchElementException e) {
					Reporter.log(ButtonName + " " + "eligible opportunity's highlights are not displayed for :-" + IcdCodme);
					child.log(LogStatus.INFO,ButtonName + " " + "eligible opportunity's highlights are not displayed for :-" + IcdCodme);
				}
			}
			return true;
		}
		return false;
	}
	
	/*
	 * This method is used to verify Eligible Opportunity Highlights Are Displayed for All
	 * 
	 * @param ExtentTest child,ButtonName
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyEligibleOpportunitysHighlightsAreDisplayedForAll(ExtentTest child)throws InterruptedException {
		actions.waitForElement(3000);
		List<WebElement> opportunityRows = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
				.findElements(By.cssSelector("div[class='ui-grid-row']"));
		if (opportunityRows != null && !opportunityRows.isEmpty() && opportunityRows.size() > 0) {
			for (int cnt = 0; cnt <= opportunityRows.size() - 2; cnt++) {
				String IcdCodme = "";
				actions.waitForElement(2000);
				WebElement IcdCode = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']")).findElement(By.id("opportunities_row" + cnt + "_col4"));
				IcdCode.click();
				actions.waitForElement(4000);
				IcdCodme = IcdCode.getText();
				WebElement dosElement = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']")).findElement(By.id("opportunities_row" + cnt + "_col2"));
				dosElement.click();
				actions.waitForElement(4000);
				DosValue.click();
				actions.waitForElement(4000);

				try {
					HCCHighlightText.isDisplayed();
					Reporter.log("HCC HighlightText indicate with Light YELLOW Color for:-" + IcdCodme);
					child.log(LogStatus.INFO,"HCC HighlightText indicate with Light YELLOW Color for:-" + IcdCodme);
				} catch (NoSuchElementException e) {
				}
				try {
					RxHCCHighlightTexts.isDisplayed();
					Reporter.log("RxHCC HighlightText indicate with RED for:-" + IcdCodme);
					child.log(LogStatus.INFO,"RxHCC HighlightText indicate with RED for:-" + IcdCodme);
				} catch (NoSuchElementException e) {
				}
				try {
					HCCRxHCCHighlightTexts.isDisplayed();
					Reporter.log("HCC+RxHCC HighlightText indicate with ORANGE Color for :-" + IcdCodme);
					child.log(LogStatus.INFO,"HCC+RxHCC HighlightText indicate with ORANGE Color for :-" + IcdCodme);
				} catch (NoSuchElementException e) {
				}
				try {
					HhsHighlightText.isDisplayed();
					Reporter.log("HHS HighlightText indicate with purple Color for" + IcdCodme);
					child.log(LogStatus.INFO,"HHS HighlightText indicate with purple Color for" + IcdCodme);
				} catch (NoSuchElementException e) {
				}
				try {
					HccHhsHighlightTexts.isDisplayed();
					Reporter.log("HHS+HCC HighlightText indicate with purple Color for" + IcdCodme);
					child.log(LogStatus.INFO,"HHS HighlightText indicate with purple Color for" + IcdCodme);
				} catch (NoSuchElementException e) {
				}
			}
			return true;
		}
		return false;
	}

	/*
	 * This method is used to verify Place holder Text
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyPlaceHolderText(ExtentTest child) throws InterruptedException {
		actions.waitForElement(3000);
		RenderingProvider.click();
		actions.waitForElement(2000);
		String ActualResult = RenderingPlaceholder.getAttribute("placeholder");
		String ExpectedResult = "Select a rendering provider...";
		if (ExpectedResult.equals(ActualResult)) {
			Reporter.log("Verified Place Holder Text shown as: - "+ ActualResult);
			child.log(LogStatus.INFO, "Verified Place Holder Text shown as: - "+ ActualResult);
			return true;
		}
		return false;
	}
	
	/*
	 * This method is used to verify N/A Appears As The First Option
	 * 
	 * @param ExtentTest child
	 * 
	 * @return The First Option
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyNAAppearsAsTheFirstOption(ExtentTest child) throws InterruptedException {
		for (int i = 0; i < RenderProviderValue.size(); i++) {
			String ActualResult = RenderProviderValue.get(0).getText();
			String ExpectedResult = "N/A";
			if (ExpectedResult.equals(ActualResult)) {
				RenderProviderValue.get(0).sendKeys(Keys.TAB);
				Reporter.log("Verified N/A appears as the first option");
				child.log(LogStatus.INFO, "Verified N/A appears as the first option");
				return true;
			}
		}
		return false;
	}
	
	/*
	 * This method is used to verify RP name In Ascending order
	 * @param ExtentTest child
	 * @return nothing
	 * @exception InterruptedException 
	 */
	public boolean verifyRPNameInAscendingOrder(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		String element = "Talix,TalixHealth,TestHealth";
		String[] a = element.split(",");
		for (int i = 0; i < a.length; i++) {
			actions.waitForElement(2000);
			actions.waitForElementToBeClickable(RenderingProviderList.get(0), 15);
			RenderingProviderList.get(0).click();
			actions.waitForElement(2000);
			actions.waitForElementToBeClickable(RenderingPlaceholder, 15);
			RenderingPlaceholder.clear();
			RenderingPlaceholder.sendKeys(a[i]);
			actions.waitForElementToBeClickable(AddButton, 10);
			AddButton.click();
			actions.waitForElement(3000);
		}
		ArrayList<String> ActualList = new ArrayList<>();
		actions.waitForElementToBeClickable(RenderingProviderList.get(1), 15);
		RenderingProviderList.get(1).click();
		actions.waitForElement(2000);
		List<WebElement> SelectColData = RenderProviderValue;

		for (WebElement List : SelectColData) {
			actions.waitForElementToBeClickable(List, 15);
			String ActualData = List.getText();
			ActualList.add(ActualData);
		}
		ArrayList<String> ExpectedList = new ArrayList<>();
		ExpectedList.addAll(ActualList);
		Collections.sort(ExpectedList);
		if (ExpectedList.equals(ActualList)) {
			Reporter.log("Verified Previously entered providers are listed in ascending alphabetical order");
			child.log(LogStatus.INFO,"Verified Previously entered providers are listed in ascending alphabetical order");
			return true;
		}
		Reporter.log("Entered providers are not listed in ascending alphabetical order");
		child.log(LogStatus.INFO,"Entered providers are not listed in ascending alphabetical order");
		return false;
	}
}
