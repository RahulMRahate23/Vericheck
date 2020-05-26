package stepDefination;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import common.AutoLogger;
import common.BasePage;

public class ChartPdpOpportunityPage extends BasePage {

	@FindBy(xpath = "//*[@class='ng-pristine ng-valid ng-empty ng-touched']")
	WebElement AddNewWorkliccstSymbol;

	@FindBy(xpath = "//*[@class='fa fa-plus-circle']")
	WebElement AddNewWorklistSymbol;

	@FindBy(xpath = "//a[text()='Add a New Worklist']")
	WebElement AddNewWorklistBtn;

	@FindBy(xpath = "//label[@class='active btn btn-default highlight-label']")
	WebElement AllButton;

	@FindBy(xpath = "//*[@class='back-icon']")
	WebElement BackButton;

	@FindBy(xpath = "//select[@id='worklistSelect']")
	WebElement Chooseworklist;

	@FindBy(xpath = "//select[@id='worklistSelect']")
	WebElement ChooseDiffworklist;

	@FindBy(xpath = "//*[@ng-model='planType']")
	WebElement ChoosePlanType;

	@FindBy(css = "div[class='chart-complete-row']")
	WebElement ChartCompleteElement;

	@FindBy(xpath = "//a[contains(text(),'Charts')]")
	WebElement ChartButton;

	@FindBy(xpath = "//*[@class='complete-buttons hfill']")
	public WebElement CodeCompleteAll;

	@FindBy(xpath = "//div[@class='popover-content']")
	WebElement CheckToolTip;

	@FindBy(xpath = "//button[@class='btn btn-green']")
	WebElement ClickOnYes;

	@FindBy(xpath = "//button[text()='Ok']")
	WebElement ClickOnOk;

	@FindBy(xpath = "//input[@ng-model='$ctrl._codeComplete']")
	WebElement CodeCompleteAllCheckbox;

	@FindBy(id = "codeComplete")
	WebElement CodeCompleteCheckbox;

	@FindBy(xpath = "//*[@value='id']")
	WebElement Cids;

	@FindBy(name = "defaultSort")
	WebElement DefaultSortByDropdown;

	@FindBy(xpath = "//a[text()='delete']")
	WebElement DeleteBtn;

	@FindBy(xpath = "//button[text()='Delete']")
	WebElement DeleteBtnOnModal;

	@FindBy(xpath = "//*[@data-test='grid-opp-dos-na']")
	WebElement DosValue;

	@FindBy(xpath = "//div[@id='opportunities_row1_col2']")
	WebElement Dosrow1;

	@FindBy(xpath = "//*[@role='checkbox']")
	public WebElement EvidenceAutoscrollLock;

	@FindBy(xpath = "//*[@title='Evidence autoscroll OFF']")
	public WebElement EvidenceAutoscrollOFF;

	@FindBy(xpath = "//*[@title='Evidence autoscroll ON']")
	public WebElement EvidenceAutoscrollON;
	
	@FindBy(xpath = "//a[contains(text(),'Stephens')]")
	public WebElement GHPPatient;

	@FindBy(xpath = "//*[@class='fa fa-flag']")
	public WebElement GreyFlag;

	@FindBy(xpath = "//label[text()='HHS']")
	public WebElement HHSButton;

	@FindBy(xpath = "//label[text()='HHS+HCC']")
	public WebElement HHSHCCButton;

	@FindBy(xpath = "//label[text()='HSS+RxHCC']")
	public WebElement HHSRxHCCButton;

	@FindBy(xpath = "//label[text()='HSS+HCC+RxHCC']")
	public WebElement HSSHCCRxHCCButton;

	@FindBy(xpath = "//label[text()='HCC+RXHCC']")
	public WebElement HCCRXHCCButton;

	@FindBy(xpath = "//label[text()='HCC']")
	public WebElement HCCButton;

	@FindBy(xpath = "//i[@class='far fa-window-restore fa-lg align-middle fifteen-em']")
	WebElement HtmlMode;

	@FindBy(xpath = "//span[contains(@class, 'highlight-hcc-rxhcc-all')]")
	public WebElement HCCRxHCCHighlightText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-hhs')]")
	public WebElement HhsHighlightText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-hcc-hhs')]")
	public WebElement HccHhsHighlightText;
	
	@FindBy(xpath = "//*[@class='indicator-text']")
	public WebElement IndicatorText;

	@FindBy(css = "#hlHccLoginSubmit")
	WebElement LoginBtn;

	@FindBy(xpath = "//*[contains(@class, 'highlight-hcc-all')]")
	public WebElement HCCHighlightText;

	@FindBy(xpath = "//*[contains(@class, 'highlight-hcc-all')]")
	public List<WebElement> HCCHighlightTextList;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-rxhcc-all')]")
	public WebElement RxHccHighlightText;
	
	@FindBy(xpath = "//select[starts-with(@class,'form-control input-sm ng')]")
	public WebElement MedicalRecordMemberMatchDropDown;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement NextBtn;

	@FindBy(xpath = "//section[3]/div[1]/button[2]")
	WebElement NextBtnOnColumns;

	@FindBy(xpath = "//section[2]/div[1]/button[2]")
	WebElement NextBtnOnCriteria;

	@FindBy(xpath = "//input[@name='name']")
	WebElement NewWorklistNameField;

	@FindBy(xpath = "//*[starts-with(@class,'next-evidence')]")
	public WebElement NextEvidence;

	@FindBy(xpath = "//*[@id='opportunities']")
	WebElement Opportunitiesgrid;

	@FindBy(xpath = "//button[text()='OK']")
	WebElement OkBtn;

	@FindBy(xpath = "//*[@id='opportunities_row0_col4']")
	WebElement OpportunityBorder;
	
	@FindBy(xpath = "//*[@id=\"patientTable\"]/ng-include/div/div[2]/form/ul/li[1]/span/span[2]/span/div[2]/div/input")
	WebElement PatientNameInSelectFilters;

	@FindBy(name = "planTypeAllowanceName")
	WebElement PlanType;

	@FindBy(css = "#hlHccLoginInput-1")
	WebElement Password;

	@FindBy(name = "planYear")
	WebElement PlanYear;

	@FindBy(xpath = "//button[@data-test='pdf-toggle']")
	public WebElement PdfButton;

	@FindBy(xpath = "//a[contains(text(),'Stephanie')]")
	public WebElement Patient;

	@FindBy(xpath = "//a[contains(text(),'Stephen')]")
	public WebElement PatientMarshall;

	@FindBy(xpath = "//*[@id=\"opportunities\"]/div/div/div[1]/div[2]/div[2]/form/input")
	WebElement PageLinkTextBox;

	@FindBy(xpath = "//*[@class='modal-body ng-scope']")
	WebElement PopUpText;

	@FindBy(xpath = "//*[@class='prev-evidence-btn btn btn-default']")
	public WebElement PrevEvidence;

	@FindBy(xpath = "//tr[@ng-repeat='patient in patients']")
	List<WebElement> PatientsList;

	@FindBy(xpath = "//tr[@ng-repeat='patient in patients']//td//a")
	List<WebElement> PatientsListName;

	@FindBy(xpath = "//*[@id='label-qa-complete-btn']")
	public WebElement QACompleteAllL1;

	@FindBy(css = "[placeholder='QA Notes']")
	WebElement QaNotesTextArea;

	@FindBy(xpath = "//*[@data-test='qaComplete']")
	WebElement QaCompleteSelection;

	@FindBy(xpath = "//div[@id='opportunities_row1_col3']")
	WebElement RendeRingProviderRow1;

	@FindBy(xpath = "//*[@class='fa fa-flag enabled']")
	public WebElement Redflag;

	@FindBy(xpath = "//label[text()='RXHCC']")
	public WebElement RXHCCButton;

	@FindBy(xpath = "//*[contains(@class, 'highlight-rxhcc-all')]")
	public WebElement RxHCCHighlightText;
	
	@FindBy(xpath = "//*[contains(@class, 'highlight-rxhcc-all')]")
	public List<WebElement> RxHCCHighlightTextList;

	@FindBy(xpath = "//div[@class ='reset-icon']")
	WebElement Reset;

	@FindBy(xpath = "//span[contains(text(),'N/A')]")
	WebElement RenderProviderValue;

	@FindBy(xpath = "//button[@data-test='rotate']")
	public WebElement RotateButton;

	@FindBy(xpath = "//*[@id=\"patientTable\"]/form/div[3]/button[1]")
	WebElement ShowMoreFilterTab;

	@FindBy(css = "[ng-repeat='field in dataEntryFields'] select")
	WebElement SelectQaOptionDdl;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement SaveBtn;

	@FindBy(xpath = "//button[@data-test='scale-to-fit']")
	public WebElement ScaleToFitButton;

	@FindBy(linkText = "Search")
	WebElement SearchLink;

	@FindBy(xpath = "//input[@ng-model='searchModel.searchText']")
	WebElement SearchTextBox;

	@FindBy(name = "worklistType")
	WebElement TypeOfWorklist;

	@FindBy(css = "#hlHccLoginInput-0")
	WebElement Username;

	@FindBy(xpath = "//span[text()='Update']")
	WebElement UpdateBtn;

	@FindBy(xpath = "//a[text()='Worklist Creator']")
	WebElement WorklistCreatorTab;

	@FindBy(linkText = "Worklist")
	WebElement WorklistsLink;

	@FindBy(xpath = "//a[contains(text(),'Worklist')]")
	public WebElement Worklists;


	// Chart Pdp Opportunity Page Constructor.
	public ChartPdpOpportunityPage(WebDriver driver, AutoLogger handler) {
		super(driver);
		PageFactory.initElements(driver, this);
		super.handler = handler;
		handler.setCurrentPageClass(this.getClass());
	}

	/*
	 * This method is used to verify Qa Complete Enable
	 * 
	 * @param ExtentTest child
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyQaCompleteEnable(ExtentTest child) throws InterruptedException {
		actions.waitForElement(1000);
		try {
			actions.waitForElement(2000);
			actions.clickOnElementWhenElementNotClickable(QaCompleteSelection);
			actions.waitForElement(1000);

			if (QaCompleteSelection.isEnabled() && QaCompleteSelection.isDisplayed()) {
				Reporter.log("QA Complete button is enabled.");
				child.log(LogStatus.INFO, "QA Complete button is enabled.");
				return true;
			} else {
				Reporter.log("QA Complete button is disabled.");
				child.log(LogStatus.INFO, "QA Complete button is disabled.");
				return false;
			}
		} catch (Exception ex) {
			child.log(LogStatus.ERROR, ex.fillInStackTrace());
			return false;
		}
	}

	/*
	 * This method is used to click On The ChartTab and select Medical Record Member
	 * Match DropDown
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickOnTheChartTab(ExtentTest child) throws InterruptedException {
		try {
			actions.waitForElementToBeClickable(ChartButton, 60);
			ChartButton.click();
			Reporter.log("Click on charts tab.");
			child.log(LogStatus.INFO, "Click on charts tab.");
			Select select = new Select(MedicalRecordMemberMatchDropDown);
			actions.waitForElement(4000);
			select.selectByVisibleText("YES");
		} catch (NoSuchElementException e) {
			actions.waitForElement(2000);
			refreshPage(child);
			actions.waitForElementToBeClickable(ChartButton, 60);
			ChartButton.click();
			Reporter.log("Click on charts tab.");
			child.log(LogStatus.INFO, "Click on charts tab.");
			actions.waitForElementToBeClickable(MedicalRecordMemberMatchDropDown, 60);
			Select select = new Select(MedicalRecordMemberMatchDropDown);
			actions.waitForElement(4000);
			select.selectByVisibleText("YES");
		}
	}
	
	/*
	 * This method is used to click On The Pdf Button
	 * Match DropDown
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickOnThePdfButton(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		PdfButton.click();
		Reporter.log("Click on PDF Button.");
		child.log(LogStatus.INFO, "Click on PDF Button.");
		actions.waitForElement(2000);	
	}
	
	/*
	 * This method is used to click On Evidence Autoscroll Lock Match DropDown
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickOnEvidenceAutoscrollLock(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		EvidenceAutoscrollLock.click();
		Reporter.log("Click on the Evidence Autoscroll Lock.");
		child.log(LogStatus.INFO, "Click on the Evidence Autoscroll Lock");
	}

	/*
	 * This method is used to choose A Worklist
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void planType(ExtentTest child, String Type) throws InterruptedException {
		actions.waitForElement(2000);
		Select select = new Select(ChoosePlanType);
		actions.waitForElement(2000);
		select.selectByVisibleText(Type);
	}

	/*
	 * This method is used to verify The Evidence Autoscroll Lock And EnableIt
	 * 
	 * @param ExtentTest child
	 * 
	 * @return to enable Evidence autoscroll
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyTheEvidenceAutoscrollLockAndEnableIt(ExtentTest child) throws InterruptedException {
		actions.waitForElementToBeClickable(EvidenceAutoscrollLock, 15);
		EvidenceAutoscrollLock.click();
		boolean EnableIt = EvidenceAutoscrollLock.isEnabled();
		Reporter.log("Clicked on the Evidence autoscroll Lock and enable it.");
		child.log(LogStatus.INFO, "Clicked on the Evidence autoscroll Lock and enable it.");
		return EnableIt;
	}

	/*
	 * This method is used to Verify The Evidence Auto scroll Lock And DisableIt
	 * 
	 * @param ExtentTest child
	 * 
	 * @return to disable Evidence autoscroll
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyTheEvidenceAutoscrollLockAndDisableIt(ExtentTest child) throws InterruptedException {
		actions.waitForElementToBeClickable(EvidenceAutoscrollLock, 15);
		EvidenceAutoscrollLock.click();
		boolean isDisplayed = EvidenceAutoscrollLock.isDisplayed();
		Reporter.log("Clicked on the Evidence autoscroll Lock and disable it.");
		child.log(LogStatus.INFO, "Clicked on the Evidence autoscroll Lock and disable it.");
		return isDisplayed;
	}

	/*
	 * This method is used to click On The Review Flag And EnableIt
	 * 
	 * @param ExtentTest child
	 * 
	 * @return flag_color
	 * 
	 * @exception InterruptedException
	 */
	public boolean clickOnTheReviewFlagAndEnableIt(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		actions.waitForElementToBeClickable(GreyFlag);
		boolean flag_color = false;
		GreyFlag.click();
		Reporter.log("Clicked on the Review Flag and enable it.");
		child.log(LogStatus.INFO, "Clicked on the Review Flag and enable it.");
		return flag_color;
	}

	/*
	 * This method is used to Get Tool tip Text
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void getooltipText(ExtentTest child) throws InterruptedException {
		Actions tool = new Actions(driver);
		actions.waitForElement(2000);
		tool.moveToElement(CodeCompleteAll).build().perform();
		actions.waitForElement(2000);
		boolean isToolTipDisplayed = CodeCompleteAll.isDisplayed();
		if (isToolTipDisplayed) {
			actions.waitForElement(2000);
			String ActulResult = CheckToolTip.getText();
			String ExpectedResult = "Tooltip Text:- Disabled because:\r\n" + "Review flag is on.\r\n"
					+ "Please correct opportunity errors.\r\n"
					+ "Cannot select complete while any opportunity has the status \"tentative\".";
			Reporter.log("Verify the Tool Tip shows the reason why the QA Complete is disabled" + ActulResult);
			child.log(LogStatus.INFO,
					"Verify the Tool Tip shows the reason why the QA Complete is disabled" + " : -" + ActulResult);
			Assert.assertTrue(ActulResult.contains(ExpectedResult));
		}
	}

	/*
	 * This method is used to verify hoverOver The Code Complete Button when Flag Is
	 * Off
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void hoverOverTheCodeCompleteButtonFlagIsOff(ExtentTest child) throws InterruptedException {
		Actions tool = new Actions(driver);
		actions.waitForElementToBeClickable(CodeCompleteAll, 15);
		tool.moveToElement(CodeCompleteAll).build().perform();
		Reporter.log("Mouse Hover to the Code Complete button");
		child.log(LogStatus.INFO, "Mouse Hover to the Code Complete button");
		actions.waitForElementToBeClickable(CodeCompleteAll, 15);
		boolean isToolTipDisplayed = CodeCompleteAll.isDisplayed();
		if (isToolTipDisplayed) {
			actions.waitForElementToBeClickable(CheckToolTip, 15);
			String ActulResult = CheckToolTip.getText();
			String ExpectedResult = "Disabled because:\r\n" + "Review flag is on.";
			Reporter.log("Verify the Tool Tip shows why QA Complete is disabled because: -" + ActulResult);
			child.log(LogStatus.INFO, "Verify the Tool Tip shows why QA Complete is disabled: -" + ActulResult);
			if (ExpectedResult.equals(ActulResult.trim())) {
				Assert.assertEquals(ActulResult.trim(), ExpectedResult);
			}
		}
	}

	/*
	 * This method is used to verify hoverOver The CodeComplete Button Flag With
	 * Review Status
	 * 
	 * @param ExtentTest child
	 * 
	 * @return isToolTipDisplayed
	 * 
	 * @exception InterruptedException
	 */
	public boolean hoverOverTheCodeCompleteButtonFlagWithReviewStatus(ExtentTest child) throws InterruptedException {
		Actions tool = new Actions(driver);
		actions.waitForElementToBeClickable(CodeCompleteAll, 16);
		tool.moveToElement(CodeCompleteAll).build().perform();
		Reporter.log("Mouse Hover to the Code Complete button");
		child.log(LogStatus.INFO, "Mouse Hover to the Code Complete button");
		actions.waitForElement(2000);
		boolean isToolTipDisplayed = CodeCompleteAll.isDisplayed();
		if (isToolTipDisplayed) {
			actions.waitForElement(2000);
			String ActulResult = CheckToolTip.getText();
			String ExpectedResult = "Disabled because:\r\n"
					+ "Cannot select complete while any opportunity has the status \"review\".";
			Reporter.log("Verify the Tool Tip shows why QA Complete is disabled because: -" + ActulResult);
			child.log(LogStatus.INFO, "Verify the Tool Tip shows why QA Complete is disabled: -" + ActulResult);
			if (ExpectedResult.equals(ActulResult.trim())) {
				Assert.assertEquals(ActulResult.trim(), ExpectedResult);
			}
		}
		return isToolTipDisplayed;
	}

	/*
	 * This method is used to act On All Opportunities
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void actOnAllOpportunities(ExtentTest child, String Status) throws InterruptedException {
		actions.waitForElement(2000);
		// for Row Count
		List<WebElement> opportunityRows = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
				.findElements(By.cssSelector("div[class='ui-grid-row']"));

		if (opportunityRows != null && !opportunityRows.isEmpty() && opportunityRows.size() > 0) {

			for (int cnt = 0; cnt <= opportunityRows.size() - 2; cnt++) {
				WebElement dosElement = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col2"));
				actions.waitForElementToBeClickable(dosElement, 15);
				dosElement.click();
				actions.waitForElementToBeClickable(DosValue, 15);
				DosValue.click();
				WebElement renderingproviderrow = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col3"));
				actions.waitForElementToBeClickable(renderingproviderrow, 15);
				renderingproviderrow.click();
				actions.waitForElementToBeClickable(RenderProviderValue, 15);
				RenderProviderValue.click();
				actions.waitForElement(2000);
				WebElement statusrow = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col6"));
				actions.waitForElementToBeClickable(statusrow, 15);
				statusrow.click();
				List<WebElement> radioChilds1 = driver.findElements(By.cssSelector("[name='inputForm'] input[type='radio']"));
				int count1 = radioChilds1.size();
				for (int j = 0; j < count1; j++) {
					if (cnt == 1 && j == 2) {
						if (radioChilds1.get(j).getAttribute("value").equals(Status)) {
							actions.waitForElementToBeClickable(radioChilds1.get(j), 15);
							radioChilds1.get(j).click();
							actions.waitForElement(4000);
						}
					} else {
						if (radioChilds1.get(j).getAttribute("value").equals("accept")) {
							actions.waitForElementToBeClickable(radioChilds1.get(j), 15);
							radioChilds1.get(j).click();
							actions.waitForElement(4000);
						}
					}
				}
				WebElement pagenumberrow = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col13"));
				pagenumberrow.click();
				actions.waitForElementToBeClickable(PageLinkTextBox, 15);
				PageLinkTextBox.sendKeys("1");
				actions.waitForElementToBeClickable(PageLinkTextBox, 15);
				PageLinkTextBox.sendKeys(Keys.TAB);
				actions.waitForElement(4000);
			}
			Reporter.log("Acted on all opportunities");
			child.log(LogStatus.INFO, "Acted on all opportunities");
		}
	}

	/*
	 * This method is used to For resetData
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void resetData(ExtentTest child, int CID) throws InterruptedException {
		try {
			actions.waitForElement(2000);
			driver.navigate().to("https://insight-tstautomation.talix.com/hcc/main?showReset#/home/patients/details/"
					+ CID + "/2018/coding/encounter/-1");
			actions.waitForElement(4000);
			refreshPage(child);
			actions.waitForElement(2000);
			ChartButton.click();
			actions.waitForElement(2000);
			Reset.click();
			actions.waitForElement(10000);
			refreshPage(child);
			actions.waitForElement(10000);
			BackButton.click();
			actions.waitForElement(2000);
		} catch (ElementClickInterceptedException e) {
			actions.waitForElement(10000);
			BackButton.click();
			actions.waitForElement(2000);
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
	public boolean verifyReviewFlagButtonEnabled(ExtentTest child, WebElement Button) throws InterruptedException {
		actions.waitForElementToBeClickable(Button, 15);
		String isDisabled = Button.getAttribute("disabled");
		if (isDisabled == null || !isDisabled.equals("disabled")) {
			Reporter.log("Verified that the review flag is enabled");
			child.log(LogStatus.INFO, "Verified that the review flag is enabled");
			return true;
		} else {
			Reporter.log("Review flag is Disabled");
			child.log(LogStatus.INFO, "Review flag is Disabled");
			return false;
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
	public boolean verifyIndicatorTextEnabled(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		boolean evidence = IndicatorText.isEnabled();
			Reporter.log("Verify the number of evidence button appears on the doc header");
			child.log(LogStatus.INFO, "Verify the number of evidence button appears on the doc header");
			return evidence;
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
	public boolean verifyTheNumberOfEvidenceButtonAppears(ExtentTest child, WebElement Button, String ButtonName)
			throws InterruptedException {
		actions.waitForElement(2000);
		String isDisabled = Button.getAttribute("disabled");
		if (isDisabled == null || !isDisabled.equals("disabled")) {
			Reporter.log("Verified that " + ButtonName + " button appears on the doc header");
			child.log(LogStatus.INFO, "Verified that " + ButtonName + " button appears on the doc header");
			return true;
		} else {
			Reporter.log(ButtonName + ":- Disabled");
			child.log(LogStatus.INFO, ButtonName + ":- Disabled");
			return false;
		}
	}

	/*
	 * Verify QACompleteL1 Button is Disabled
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyQACompleteL1ButtonDisabled(ExtentTest child, WebElement Button) throws InterruptedException {
		actions.waitForElement(2000);
		String isDisabled = Button.getAttribute("disabled");
		if (isDisabled == null || !isDisabled.equals("disabled")) {
			Reporter.log("Verified that the QA Complete L1 is disabled");
			child.log(LogStatus.INFO, "Verified that the QA Complete L1 is disabled");
			return true;
		} else {
			Reporter.log("QA Complete L1 is Enabled");
			child.log(LogStatus.INFO, "QA Complete L1 is Enabled");
			return false;
		}
	}

	/*
	 * Verify QACompleteL1 Button is Disabled
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyCodeCompleteButtonDisabled(ExtentTest child, WebElement Button) throws InterruptedException {
		actions.waitForElementToBeClickable(Button, 15);
		String isDisabled = Button.getAttribute("disabled");
		if (isDisabled == null || !isDisabled.equals("disabled")) {
			Reporter.log("Verified that the Code Complete is disabled");
			child.log(LogStatus.INFO, "Verified that the Code Complete is disabled");
			return true;
		} else {
			Reporter.log("Code Complete L1 is Enabled");
			child.log(LogStatus.INFO, "Code Complete L1 is Enabled");
			return false;
		}
	}

	/*
	 * This method is used to Verify Review Flag Button is Disabled
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyReviewFlagButtonDisabled(ExtentTest child, WebElement Button) throws InterruptedException {
		actions.waitForElementToBeClickable(Button, 15);
		String isDisabled = Button.getAttribute("disabled");
		if (isDisabled == null || !isDisabled.equals("disabled")) {
			Reporter.log("Verified that the review flag is disabled");
			child.log(LogStatus.INFO, "Verified that the review flag is disabled");
			return true;
		} else {
			Reporter.log("Review flag is Enabled");
			child.log(LogStatus.INFO, "Review flag is Enabled");
			return false;
		}
	}

	/*
	 * This method is used to Verify User Cannot CodeComplete
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyUserCannotCodeComplete(ExtentTest child, WebElement Button) throws InterruptedException {
		actions.waitForElementToBeClickable(Button, 15);
		boolean isFlagIsEnable = Button.isDisplayed();
		Reporter.log("Verify that the user cannot Code Complete with review flag ON");
		child.log(LogStatus.INFO, "Verify that the user cannot Code Complete with review flag ON");
		return isFlagIsEnable;
	}

	/*
	 * This method is used to Verify User Cannot QAComplete
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyUserCannotQAComplete(ExtentTest child, WebElement Button) throws InterruptedException {
		actions.waitForElement(2000);
		boolean isFlagIsEnable = Button.isDisplayed();
		Reporter.log("Verify that the user cannot QA Complete L1 with review flag ON");
		child.log(LogStatus.INFO, "Verify that the user cannot QA Complete L1 with review flag ON");
		return isFlagIsEnable;
	}

	/*
	 * This method is used to Click On The Review Flag And DisableIt
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickOnTheReviewFlagAndDisableIt(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		actions.waitForElementToBeClickable(Redflag);
		Redflag.click();
		Reporter.log("Clicked on the Review Flag and disable it");
		child.log(LogStatus.INFO, "Clicked on the Review Flag and disable it");
	}

	/*
	 * This method is used to click On CodeComplete
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickOnCodeComplete(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		CodeCompleteAll.click();
		actions.waitForElement(2000);
		Reporter.log("Clicked on the Code Compelet");
		child.log(LogStatus.INFO, "Clicked on the Code Compelet");
	}

	/*
	 * This method is used to click On CodeComplete
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickOnQACompleteL1(ExtentTest child) throws InterruptedException {
		actions.waitForElementToBeClickable(QACompleteAllL1, 15);
		QACompleteAllL1.click();
		Reporter.log("Clicked on the QA Complete L1");
		child.log(LogStatus.INFO, "Clicked on the QA Complete L1");
	}

	/*
	 * This method is used to click Last Patient Name
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickLastPatientName(ExtentTest child, String PatientName, WebElement PatientType)
			throws InterruptedException {
		ShowMoreFilterTab.click();
		actions.waitForElement(2000);
		PatientNameInSelectFilters.click();
		actions.waitForElement(2000);
		PatientNameInSelectFilters.sendKeys(PatientName);
		actions.waitForElement(2000);
		PatientNameInSelectFilters.sendKeys(Keys.ENTER);
		actions.waitForElement(5000);
		PatientType.click();
		actions.waitForElement(2000);
		Reporter.log("Click on the Patient from list.");
		child.log(LogStatus.INFO, "Click on the First Patient from list.");
	}

	/*
	 * This method is used to select Option From DropDown ByValue
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void selectOptionFromDropDownByValue(WebElement element, String value, ExtentTest child)
			throws InterruptedException {
		actions.selectDropdownByValue(element, value);
		actions.waitForElement(2000);
		Reporter.log("Select worklist from the drop down.");
		child.log(LogStatus.INFO, "Select worklist from the drop down.");
	}

	/*
	 * This method is used to click On WorklistTab
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickOnWorklistTab(ExtentTest child) throws InterruptedException {
		Worklists.click();
		actions.waitForElement(2000);
		Reporter.log("Clicked On Worklist Tab");
		child.log(LogStatus.INFO, "Clicked On Worklist Tab.");
		actions.waitForElement(2000);
		actions.selectDropdownByIndex(Chooseworklist, 0);
		actions.waitForElement(2000);
		Reporter.log("Select worklist.");
		child.log(LogStatus.INFO, "Select worklist.");
	}

	/*
	 * This method is used to hoverOver The QAComplete Button FlagIsON
	 * 
	 * @param ExtentTest child
	 * 
	 * @return tool tip
	 * 
	 * @exception InterruptedException
	 */
	public void hoverOverTheQACompleteButtonFlagIsON(ExtentTest child) throws InterruptedException {
		Actions tool = new Actions(driver);
		actions.waitForElementToBeClickable(QACompleteAllL1, 15);
		tool.moveToElement(QACompleteAllL1).build().perform();
		actions.waitForElement(2000);
		boolean isToolTipDisplayed = QACompleteAllL1.isDisplayed();
		if (isToolTipDisplayed) {
			actions.waitForElement(2000);
			actions.waitForElementToBeClickable(CheckToolTip, 15);
			String ActulResult = CheckToolTip.getText();
			String ExpectedResult = "Disabled because:\r\n" + "Review flag is on.\r\n"
					+ "Opportunity missing required QA Options.";

			Reporter.log("Verify the Tool Tip shows the reason why the QA Complete is disabled : -" + ActulResult);
			child.log(LogStatus.INFO,
					"Verify the Tool Tip shows the reason why the QA Complete is disabled: -" + ActulResult);
			if (ExpectedResult.equals(ActulResult.trim())) {
				Assert.assertEquals(ActulResult.trim(), ExpectedResult);
			}
		}
	}

	/*
	 * This method is used to hoverOver The QAComplete Button FlagIsON
	 * 
	 * @param ExtentTest child
	 * 
	 * @return tool tip
	 * 
	 * @exception InterruptedException
	 */
	public boolean hoverOverTheQACompleteL1ButtonwithQAOptionsEmpty(ExtentTest child) throws InterruptedException {
		Actions tool = new Actions(driver);
		actions.waitForElementToBeClickable(QACompleteAllL1, 15);
		tool.moveToElement(QACompleteAllL1).build().perform();
		actions.waitForElement(2000);
		boolean isToolTipDisplayed = QACompleteAllL1.isDisplayed();
		if (isToolTipDisplayed) {
			actions.waitForElement(2000);
			actions.waitForElementToBeClickable(CheckToolTip, 15);
			String ActulResult = CheckToolTip.getText();
			String ExpectedResult = "Disabled because:\r\n" + "Opportunity missing required QA Options.";
			Reporter.log("Verify the Tool Tip shows the reason why the QA Complete is disabled : -" + ActulResult);
			child.log(LogStatus.INFO,
					"Verify the Tool Tip shows the reason why the QA Complete is disabled: -" + ActulResult);
			if (ExpectedResult.equals(ActulResult.trim())) {
				Assert.assertEquals(ActulResult.trim(), ExpectedResult);
			}
		}
		return isToolTipDisplayed;
	}

	/*
	 * This method is used to hoverOver The QAComplete Button FlagIsON
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void closedPopUp(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		String PopText = PopUpText.getText();
		actions.waitForElementToBeClickable(ClickOnYes);
		ClickOnYes.click();
		Reporter.log(PopText + ": -Yes");
		child.log(LogStatus.INFO, "PopText+ \": -Yes\"");
	}

	/*
	 * This method is used to hoverOver The QAComplete Button FlagIsON
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void closedResetPopUp(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		String PopText = PopUpText.getText();
		actions.waitForElementToBeClickable(ClickOnOk);
		ClickOnOk.click();
		Reporter.log(PopText + ": -Ok");
		child.log(LogStatus.INFO, "PopText+ \": -OK\"");
	}

	/*
	 * This method is used to verify User Can Code CompleteL1
	 * 
	 * @param ExtentTest child
	 * 
	 * @return user can Code Complete
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyUserCanCodeComplete(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		String CodeComplete = "transparent";
		String CodeCompleteL1 = "rgba(0, 0, 0, 0)";
		String ActualBackgroundColor = CodeCompleteAll.getCssValue("background-color");
		actions.waitForElement(3000);
		if (CodeCompleteL1.equals(ActualBackgroundColor)) {
			Reporter.log(ActualBackgroundColor + "Verified that the user can Code Complete the chart");
			child.log(LogStatus.INFO, "Verified that the user can Code Complete the chart");
			return true;
		}
		else if (CodeComplete.equals(ActualBackgroundColor)) {
			Reporter.log(ActualBackgroundColor + "Verified that the user can Code Complete the chart");
			child.log(LogStatus.INFO, "Verified that the user can Code Complete the chart");
			return true;
		}
		return false;
	}

	/*
	 * This method is used to verify User Can Code CompleteL1
	 * 
	 * @param ExtentTest child
	 * 
	 * @return user can Code Complete
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyUserCanQACompleteL1(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		String CodeCompleteL1 = "rgba(0, 0, 0, 0)";
		String ActualBackgroundColor = CodeCompleteAll.getCssValue("background-color");
		if (CodeCompleteL1.equals(ActualBackgroundColor)) {
			Reporter.log(ActualBackgroundColor
					+ "Verified that the user can QA Complete L1 after filling in the QA Options");
			child.log(LogStatus.INFO, "Verified that the user can QA Complete L1 after filling in the QA Options");
			return true;
		}
		return false;
	}

	/*
	 * This method is used to verify All Button Selected By Default
	 * 
	 * @param ExtentTest child
	 * 
	 * @return user can Code Complete
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyAllButtonSelectedByDefault(ExtentTest child) throws InterruptedException {
		Boolean ButtonSelected = AllButton.isEnabled();
		if (ButtonSelected) {
			Reporter.log("All Button Selected By Default");
			child.log(LogStatus.INFO, "All Button Selected By Default");
			return true;

		} else {
			Reporter.log("All Button is not Selected By Default");
			child.log(LogStatus.INFO, "All Button is not Selected By Default");
			return false;
		}
	}

	/*
	 * This method is used to Verify Backbound Color Of 8 Buttons For PlanType
	 * 
	 * @param ExtentTest child
	 * 
	 * @return Actual Background Color of buttons
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyBackboundColorOf8ButtonsForPlanType(ExtentTest child) throws InterruptedException {
		
		PdfButton.click();
		actions.waitForElement(2000);
		verifyAllButtonSelectedByDefault(child);
		verifyBackgroundColor(child, HCCButton);
		verifyBackgroundColor(child, RXHCCButton);
		verifyBackgroundColor(child, HCCRXHCCButton);
		verifyBackgroundColor(child, HHSButton);
		verifyBackgroundColor(child, HHSHCCButton);
		verifyBackgroundColor(child, HHSRxHCCButton);
		verifyBackgroundColor(child, HSSHCCRxHCCButton);
		return true;
	}

	/*
	 * This method is used to Method for Background Color
	 * 
	 * @param ExtentTest child
	 * 
	 * @return Actual Background Color
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyBackgroundColor(ExtentTest child, WebElement Button) throws InterruptedException {
		actions.waitForElement(2000);
		String HCCBackgroundColor = "rgba(255, 255, 0, 1)";
		String RXHCCBackgroundColor = "rgba(255, 60, 60, 1)";
		String HCCRXHCCBackgroundColor = "rgba(255, 128, 0, 1)";
		String HHSBackgroundColor = "rgba(102, 255, 204, 1)";
		String HHSHCCBackgroundColor = "rgba(153, 0, 153, 1)";
		String HHSRxHCCBackgroundColor = "rgba(51, 153, 255, 1)";
		String HHSHCCRxHCCBackgroundColor = "rgba(51, 153, 255, 1)";
		actions.waitForElement(1000);
		String ActualBackgroundColor = Button.getCssValue("background-color");
		actions.waitForElement(2000);
		if (HCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log("HCC (Default indicate with Light YELLOW Color): -" + ActualBackgroundColor);
			child.log(LogStatus.INFO, "HCC (Default indicate with Light YELLOW Color): -" + ActualBackgroundColor);
			return true;
		} else if (RXHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log("RxHCC (Default indicate with RED): -" + ActualBackgroundColor);
			child.log(LogStatus.INFO, "RxHCC (Default indicate with RED): -" + ActualBackgroundColor);
			return true;
		} else if (HCCRXHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log("HCC+RxHCC (Default indicate with ORANGE Color): -" + ActualBackgroundColor);
			child.log(LogStatus.INFO, "HCC+RxHCC (Default indicate with ORANGE Color): -" + ActualBackgroundColor);
			return true;
		} else if (HHSBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log("HHS (Default indicate with purple  Color): -" + ActualBackgroundColor);
			child.log(LogStatus.INFO, "HHS (Default indicate with purple  Color): -" + ActualBackgroundColor);
			return true;
		} else if (HHSHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log("HHS+HCC (Default indicate with light purple Color): -" + ActualBackgroundColor);
			child.log(LogStatus.INFO, "HHS+HCC (Default indicate with light purple Color): -" + ActualBackgroundColor);
			return true;
		} else if (HHSRxHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log("HHS+RxHCC (Default indicate with BLUE Color): -" + ActualBackgroundColor);
			child.log(LogStatus.INFO, "HHS+RxHCC (Default indicate with BLUE Color): -" + ActualBackgroundColor);
			return true;
		} else if (HHSHCCRxHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log("HHS+HCC+RxHCC (Default indicate with Neon (light green) Color): -" + ActualBackgroundColor);
			child.log(LogStatus.INFO,
					"HHS+HCC+RxHCC (Default indicate with Neon (light green) Color): -" + ActualBackgroundColor);
			return true;
		} else if (HCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log("HHS+HCC+RxHCC (Default indicate with Neon (light green) Color): -" + ActualBackgroundColor);
			child.log(LogStatus.INFO,
					"HHS+HCC+RxHCC (Default indicate with Neon (light green) Color): -" + ActualBackgroundColor);
			return true;
		} else if (HCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log("HHS+HCC+RxHCC (Default indicate with Neon (light green) Color): -" + ActualBackgroundColor);
			child.log(LogStatus.INFO,
					"HHS+HCC+RxHCC (Default indicate with Neon (light green) Color): -" + ActualBackgroundColor);
			return true;
		}
		return false;
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
	public boolean verifyEvidenceAutoscrollLockIconMode(ExtentTest child) throws InterruptedException {		
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
				return true;
			}
		return false;
	}

	/*
	 * This method is used to refreshPage
	 * 
	 * @param ExtentTest child
	 * 
	 * @return Evidence autoscroll lock icon shown in undocked mode.
	 * 
	 * @exception InterruptedException
	 */
	public void refreshPage(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		driver.navigate().refresh();
		Reporter.log("Page has been Refresh.");
		child.log(LogStatus.INFO, "Page has been Refresh.");
		actions.waitForElement(3000);

	}

	/*
	 * This method is used to is QA Options Displayed
	 * 
	 * @param ExtentTest child
	 * 
	 * @return fields are enabled
	 * 
	 * @exception InterruptedException
	 */
	public boolean isQAOptionsDisplayed(ExtentTest child) throws InterruptedException {
		actions.waitForElement(1000);
		while (CodeCompleteCheckbox.isSelected()) {
			// verify QA option drop down is enabled
			if (SelectQaOptionDdl.isEnabled() && QaNotesTextArea.isEnabled()) {
				Reporter.log("QA options & QA notes fields are enabled.");
				child.log(LogStatus.INFO, "QA options & QA notes fields are enabled.");
			}
			// verify QA option drop down has correct options list
			String[] list = { "Select", "Correct", "Incorrect", "Incorrect - Revised", "Added", "Added - Revised",
					"Ignore" };
			Select sel = new Select(SelectQaOptionDdl);
			boolean finalStatus = true;
			for (String actualList : list) {
				boolean currentEleStatus = false;
				for (WebElement expList : sel.getOptions()) {
					if (expList.getText().equals(actualList)) {
						currentEleStatus = true;
						break;
					}
				}
				if (!currentEleStatus)
					finalStatus = false;
			}
			return finalStatus;
		}
		return false;
	}

	/*
	 * This method is used to select Required QA Option
	 * 
	 * @param ExtentTest child
	 * 
	 * @return QA option selected with blank option
	 * 
	 * @exception InterruptedException
	 */
	public boolean selectRequiredQAOption(String blankOption, String reqOption, ExtentTest child)
			throws InterruptedException {
		actions.waitForElement(1000);
		actions.selectDropdownByVisibleText(SelectQaOptionDdl, reqOption);
		Reporter.log("QA option selected with required option.");
		child.log(LogStatus.INFO, "QA option selected with required option.");
		actions.waitForElement(1000);
		Select sel = new Select(SelectQaOptionDdl);
		for (WebElement Ele : sel.getOptions())
			if (Ele.getText().contains(blankOption)) {
				Ele.click();
				actions.waitForElement(2000);
				Reporter.log("QA option selected with blank option.");
				child.log(LogStatus.INFO, "QA option selected with blank option.");
				return true;
			}
		return false;
	}

	/*
	 * This method is used to click On Add NewWork list Btn
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickOnAddNewWorklistBtn(ExtentTest child) throws InterruptedException {
		AddNewWorklistBtn.click();
		actions.waitForElement(2000);
	}

	/*
	 * This method is used to click On Worklist Creator Tab
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void clickOnWorklistCreatorTab(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2500);
		WorklistCreatorTab.click();
	}

	@SuppressWarnings("finally")
	public String worklistName(ExtentTest child) throws InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		String worklistName = "01ACreateNewWorklistSW" + date;
		try {
			if (NewWorklistNameField.isDisplayed()) {
				NewWorklistNameField.sendKeys(worklistName);
				Reporter.log("Enter new worklist name.");
				child.log(LogStatus.INFO, "Enter new worklist name.");
				return worklistName;
			}
		} finally {
			return worklistName;
		}
	}

	// create New Worklist
	public void createNewWorklist(ExtentTest child) throws InterruptedException {
		clickOnWorklistCreatorTab(child);
		clickOnAddNewWorklistBtn(child);

		NewWorklistNameField.click();

		worklistName(child);

		actions.waitForElement(2500);
		NextBtn.click();

		actions.waitForElement(3000);
		actions.selectDropdownByIndex(TypeOfWorklist, 1);

		actions.waitForElement(2500);
		actions.selectDropdownByIndex(PlanYear, 2);

		actions.waitForElement(2500);
		actions.selectDropdownByIndex(PlanType, 1);

		actions.waitForElement(2500);
		UpdateBtn.click();

		actions.waitForElement(2500);
		NextBtnOnCriteria.click();

		actions.waitForElement(2500);
		actions.selectDropdownByIndex(DefaultSortByDropdown, 1);

		actions.waitForElement(2500);
		NextBtnOnColumns.click();

		actions.waitForElement(2500);
		SaveBtn.click();

		actions.waitForElement(2500);
		OkBtn.click();
		actions.waitForElement(2500);
	}

	/*
	 * This method is used to clean Up Code To Delete Created Worklist
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void cleanUpCodeToDeleteCreatedWorklist(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		BackButton.click();
		actions.waitForElement(2000);
		WorklistCreatorTab.click();
		actions.waitForElement(2000);
		DeleteBtn.click();
		actions.waitForElement(2000);
		DeleteBtnOnModal.click();
	}

	/*
	 * This method is used to hCC Highlight Text on Clinical Evidence Document And
	 * for Background Color
	 * 
	 * @param ExtentTest child
	 * 
	 * @return hCCHighlight TextA BackgroundColor
	 * 
	 * @exception InterruptedException
	 */
	public boolean hCCHighlightTextAndBackgroundColor(ExtentTest child, WebElement Button) throws InterruptedException {
		String HCCTextBackgroundColor = "rgba(255, 255, 0, 0.3)";
		String ActualTextBackgroundColor = HCCHighlightText.getCssValue("background-color");
		SoftAssert Result = new SoftAssert();
		if (HCCTextBackgroundColor.equals(ActualTextBackgroundColor)) {
			actions.waitForElement(2000);
			Button.click();
			actions.waitForElement(2000);
			Result.assertTrue(HCCTextBackgroundColor.equals(ActualTextBackgroundColor));
			Reporter.log("Clicked on HCC button, Related Result is effected on Clinical Evidence Document.");
			child.log(LogStatus.INFO,"Clicked on HCC button, Related Result is effected on Clinical Evidence Document.");

			actions.waitForElement(2000);
			HCCHighlightText.isEnabled();
			Reporter.log("HCC : - Verify that, If user change plan type then related plan type highlights should show.");
			child.log(LogStatus.INFO,"HCC : - Verify that, If user change plan type then related plan type highlights should show.");

			HCCHighlightText.click();
			actions.waitForElement(2000);
			Reporter.log("HCC : - Verify that, User can able to click on highlighted text from the evidence.");
			child.log(LogStatus.INFO,"HCC : - Verify that, User can able to click on highlighted text from the evidence.");

			Result.assertEquals(ActualTextBackgroundColor, HCCTextBackgroundColor,
					"The text highlighted with Light YELLOW Color displayed on the document-");
			Reporter.log("The text highlighted with Light YELLOW Color displayed on the document-)"
					+ ActualTextBackgroundColor);
			child.log(LogStatus.INFO, "The text highlighted with Light YELLOW Color displayed on the document-)"
					+ ActualTextBackgroundColor);
			return true;
		} else if (HCCTextBackgroundColor.equals(ActualTextBackgroundColor)) {
			Reporter.log("RxHCC (Default indicate with RED): -" + ActualTextBackgroundColor);
			child.log(LogStatus.INFO, "RxHCC (Default indicate with RED): -" + ActualTextBackgroundColor);
			return true;
		}
		Result.assertAll();
		return false;
	}

	/*
	 * This method is used to act On QA Complete L1 Opportunities
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void actOnQACompleteL1Opportunities(ExtentTest child, String Status) throws InterruptedException {
		actions.waitForElement(2000);
		List<WebElement> opportunityRows = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
				.findElements(By.cssSelector("div[class='ui-grid-row']"));
		if (opportunityRows != null && !opportunityRows.isEmpty() && opportunityRows.size() > 0) {
			for (int cnt = 0; cnt <= opportunityRows.size() - 2; cnt++) {
				WebElement dosElement = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col2"));
				actions.waitForElementToBeClickable(dosElement, 15);
				dosElement.click();
				actions.waitForElementToBeClickable(DosValue, 15);
				DosValue.click();
				WebElement renderingproviderrow = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col3"));
				actions.waitForElementToBeClickable(renderingproviderrow, 15);
				renderingproviderrow.click();
				actions.waitForElementToBeClickable(RenderProviderValue, 15);
				RenderProviderValue.click();
				WebElement statusrow = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col7"));
				actions.waitForElementToBeClickable(statusrow, 15);
				statusrow.click();
				List<WebElement> radioChilds1 = driver
						.findElements(By.cssSelector("[name='inputForm'] input[type='radio']"));
				int count1 = radioChilds1.size();
				for (int j = 0; j < count1; j++) {
					if (cnt == 1 && j == cnt) {
						if (radioChilds1.get(j).getAttribute("value").equals("Correct")) {
							actions.waitForElementToBeClickable(radioChilds1.get(j), 15);
							radioChilds1.get(j).click();
							actions.waitForElement(2000);
						}
					} else {
						if (radioChilds1.get(j).getAttribute("value").equals("Correct")) {
							actions.waitForElementToBeClickable(radioChilds1.get(j), 15);
							radioChilds1.get(j).click();
							actions.waitForElement(1000);
						}
					}
					actions.waitForElement(1000);
					if (j == count1 - 1) {
						actions.waitForElementToBeClickable(radioChilds1.get(j), 15);
						radioChilds1.get(j).sendKeys(Keys.chord(Keys.TAB));
						WebElement currentElement = driver.switchTo().activeElement();
						currentElement.sendKeys("QA Notes");
						actions.waitForElement(3000);
					}
				}
				WebElement renderingproviderrowf = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col3"));
				actions.waitForElementToBeClickable(renderingproviderrowf, 15);
				renderingproviderrowf.click();
				WebElement pagenumberrow = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col14"));
				actions.waitForElementToBeClickable(pagenumberrow, 15);
				pagenumberrow.click();
				actions.waitForElementToBeClickable(PageLinkTextBox, 15);
				PageLinkTextBox.sendKeys("1");
				actions.waitForElementToBeClickable(PageLinkTextBox, 15);
				PageLinkTextBox.sendKeys(Keys.TAB);
				actions.waitForElement(2000);
			}
			Reporter.log("Acted on QA Complete L1 opportunities");
			child.log(LogStatus.INFO, "Acted on QA Complete L1 opportunities");
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
		actions.waitForElementToBeClickable(Cids, 15);
		Cids.click();
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
				actions.waitForElement(4000);
				Reporter.log("Click on patient to open patient details page.");
				child.log(LogStatus.INFO, "Click on patient to open patient details page.");
			}
		}
	}

	/*
	 * This method is called to verify That Clicking On Different Highlight Options
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyThatClickingOnDifferentHighlightOptions(ExtentTest child, WebElement Buttton,WebElement HighlightText, String ButtonName) throws InterruptedException {
		String HCCBackgroundColor = "rgba(255, 255, 0, 0.3)";
		String RXHCCBackgroundColor = "rgba(255, 60, 60, 0.3)";
		String HCCRXHCCBackgroundColor = "rgba(255, 128, 0, 0.3)";
		String HHSBackgroundColor = "rgba(102, 255, 204, 0.3)";
		String HHSHCCBackgroundColor = "rgba(153, 0, 153, 0.3)";
		String HHSRxHCCBackgroundColor = "rgba(51, 153, 255, 0.3)";
		String HHSHCCRxHCCBackgroundColor = "rgba(51, 153, 255, 0.3)";
		
		String[] ACA = { "HHS" };
		String[] MA = { "HCC", "RxHCC", "HCC+RxHCC" };
		String[] ALL = { "HCC", "RxHCC", "HCC+RxHCC","HHS", "HHS+HCC", "HHS + RxHCC","HHS + HCC+ RxHCC" };
		String[] Common;
		actions.waitForElement(1000);
		Buttton.click();
		actions.waitForElement(2000);
		try {
			if (HighlightText.isDisplayed()) {
				if (ButtonName == "ACA") {
					Common = ACA;
				} else if (ButtonName == "MA") {
					Common = MA;
				} else {
					Common = ALL;
				}
				if (Arrays.asList(Common).contains(ButtonName)) {
					String ActualBackgroundColor = HighlightText.getCssValue("background-color");
		if (HCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log(ButtonName + " " + "Related Result is effected on Clinical Evidence Document with: -"+ ActualBackgroundColor);
			child.log(LogStatus.INFO, ButtonName + " "+ "Related Result is effected on Clinical Evidence Document with: -" + ActualBackgroundColor);
			HighlightText.click();
			actions.waitForElement(2000);
			Reporter.log(ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			child.log(LogStatus.INFO,
					ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			return true;
		} else if (RXHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log(ButtonName + " " + "Related Result is effected on Clinical Evidence Document with: -"+ ActualBackgroundColor);
			child.log(LogStatus.INFO, ButtonName + " "+ "Related Result is effected on Clinical Evidence Document with: -" + ActualBackgroundColor);
			HighlightText.click();
			actions.waitForElement(2000);
			Reporter.log(ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			child.log(LogStatus.INFO,ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			return true;
		} else if (HCCRXHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log(ButtonName + " " + "Related Result is effected on Clinical Evidence Document with: -"+ ActualBackgroundColor);
			child.log(LogStatus.INFO, ButtonName + " "+ "Related Result is effected on Clinical Evidence Document with: -" + ActualBackgroundColor);
			HighlightText.click();
			actions.waitForElement(2000);
			Reporter.log(ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			child.log(LogStatus.INFO,ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			return true;
		} else if (HHSBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log(ButtonName + " " + "Related Result is effected on Clinical Evidence Document with: -"+ ActualBackgroundColor);
			child.log(LogStatus.INFO, ButtonName + " "+ "Related Result is effected on Clinical Evidence Document with: -" + ActualBackgroundColor);
			HighlightText.click();
			actions.waitForElement(2000);
			Reporter.log(ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			child.log(LogStatus.INFO,ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			return true;
		} else if (HHSHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log(ButtonName + " " + "Related Result is effected on Clinical Evidence Document with: -"+ ActualBackgroundColor);
			child.log(LogStatus.INFO, ButtonName + " "+ "Related Result is effected on Clinical Evidence Document with: -" + ActualBackgroundColor);
			HighlightText.click();
			actions.waitForElement(2000);
			Reporter.log(ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			child.log(LogStatus.INFO,ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			return true;
		} else if (HHSRxHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log(ButtonName + " " + "Related Result is effected on Clinical Evidence Document with: -"+ ActualBackgroundColor);
			child.log(LogStatus.INFO, ButtonName + " "+ "Related Result is effected on Clinical Evidence Document with: -" + ActualBackgroundColor);
			HighlightText.click();
			actions.waitForElement(2000);
			Reporter.log(ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			child.log(LogStatus.INFO,ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			return true;
		} else if (HHSHCCRxHCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log(ButtonName + " " + "Related Result is effected on Clinical Evidence Document with: -"+ ActualBackgroundColor);
			child.log(LogStatus.INFO, ButtonName + " "	+ "Related Result is effected on Clinical Evidence Document with: -" + ActualBackgroundColor);
			HighlightText.click();
			actions.waitForElement(2000);
			Reporter.log(ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			child.log(LogStatus.INFO,ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			return true;
		} else if (HCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log(ButtonName + " " + "Related Result is effected on Clinical Evidence Document with: -"+ ActualBackgroundColor);
			child.log(LogStatus.INFO, ButtonName + " "+ "Related Result is effected on Clinical Evidence Document with: -" + ActualBackgroundColor);
			HighlightText.click();
			actions.waitForElement(2000);
			Reporter.log(ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			child.log(LogStatus.INFO,ButtonName + " " + "User can able to click on highlighted text from the evidence.");
			return true;
		} else if (HCCBackgroundColor.equals(ActualBackgroundColor)) {
			Reporter.log(ButtonName + " " + "Related Result is effected on Clinical Evidence Document with: -"+ ActualBackgroundColor);
			child.log(LogStatus.INFO, ButtonName + " "+ "Related Result is effected on Clinical Evidence Document with: -" + ActualBackgroundColor);
			HighlightText.click();
			actions.waitForElement(2000);
			Reporter.log(ButtonName + " " + "User can able to click on highlighted text from the evidence."+ ActualBackgroundColor);
			child.log(LogStatus.INFO,ButtonName + " " + "User can able to click on highlighted text from the evidence."+ ActualBackgroundColor);
			return true;
		}
				} else {
					Reporter.log(ButtonName + " Should Not display as related Highlight Options");
					child.log(LogStatus.INFO, ButtonName+ " Should Not display as related Highlight Options");
					return false;
				}
			}
		} catch (NoSuchElementException e) {
			Reporter.log(ButtonName + " Not display as related Highlight Options");
			child.log(LogStatus.INFO, ButtonName + " Not display as related Highlight Options");
			return true;
		}
		return false;
	}

	/*
	 * This method is called to verify Evidence Highlight Text With Background Color
	 * 
	 * @param ExtentTest child
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyEvidenceHighlightTextWithRelatedHighlightOptionsButton (ExtentTest child) throws InterruptedException {
		verifyThatClickingOnDifferentHighlightOptions(child, HCCButton, HCCHighlightText, "HCC");
		verifyThatClickingOnDifferentHighlightOptions(child, RXHCCButton, RxHCCHighlightText, "RxHCC");
		verifyThatClickingOnDifferentHighlightOptions(child, HCCRXHCCButton, HCCRxHCCHighlightText, "HCC+RxHCC");
		verifyThatClickingOnDifferentHighlightOptions(child, HHSButton, HhsHighlightText, "HHS");
		return true;
	}

	/*
	 * This method is used to verify Highlight Button With Related PlanType All
	 * 
	 * @param ExtentTest child
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyHighlightButtonWithRelatedPlanType(ExtentTest child,String PlanType) throws InterruptedException {
		verifyButtonIsEnabledOrDisabled(child, HCCButton, "HCC Button", PlanType);
		verifyButtonIsEnabledOrDisabled(child, RXHCCButton, "RxHCC Button", PlanType);
		verifyButtonIsEnabledOrDisabled(child, HCCRXHCCButton, "HCC+RxHCC Button", PlanType);
		verifyButtonIsEnabledOrDisabled(child, HHSButton, "HHS Button", PlanType);
		verifyButtonIsEnabledOrDisabled(child, HHSHCCButton, "HHS+HCC Button", PlanType);
		verifyButtonIsEnabledOrDisabled(child, HHSRxHCCButton, "HHS+RxHCC Button", PlanType);
		verifyButtonIsEnabledOrDisabled(child, HSSHCCRxHCCButton, "HHS+HCC+RxHCC Button", PlanType);
		verifyButtonIsEnabledOrDisabled(child, AllButton, "All Button", PlanType);
		 return true;
	}

	/*
	 * This method is used to switch To Html Mode
	 * 
	 * @param ExtentTest child
	 * 
	 * @return true
	 * 
	 * @exception InterruptedException
	 */
	public void switchToHtmlMode(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		HtmlMode.click();
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			subWindowHandler = iterator.next();
		}
		driver.switchTo().window(subWindowHandler);
		actions.waitForElement(10000);
		Reporter.log("Evidence autoscroll Lock feature - Switch to HTML Mode");
		child.log(LogStatus.INFO, "Evidence autoscroll Lock feature - Switch to HTML Mode");
	}

	/*
	 * This method is used to verify The Evidence Number Indicator
	 * 
	 * @param ExtentTest child
	 * 
	 * @return true
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyTheEvidenceNumberIndicatorEnabled(ExtentTest child) throws InterruptedException {
		actions.waitForElement(1000);
		try {
			actions.waitForElement(1000);
			WebElement Selectedoppurtinity = IndicatorText;
			String SelectedOppurtinityCell = Selectedoppurtinity.getText();
			boolean evidence = SelectedOppurtinityCell.contains("—");
			Reporter.log("Verify the evidence number indicator show < - / ?>: -" + SelectedOppurtinityCell);
			child.log(LogStatus.INFO,
					"Verify the evidence number indicator show < - / ?>: -" + SelectedOppurtinityCell);
			return evidence;
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * This method is used to verify The Evidence Number Indicator
	 * 
	 * @param ExtentTest child
	 * 
	 * @return true
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyTheEvidenceNumberIndicatorDisabled(ExtentTest child) throws InterruptedException {
		actions.waitForElement(1000);
		try {
			actions.waitForElement(1000);
			WebElement Selectedoppurtinity = IndicatorText;
			String SelectedOppurtinityCell = Selectedoppurtinity.getText();
			boolean evidence = SelectedOppurtinityCell.contains("1 /");
			Reporter.log("Verify that document scrolls to the first evidence when a suggested opportuntiy is selected: -"+ SelectedOppurtinityCell);
			child.log(LogStatus.INFO,"Verify that document scrolls to the first evidence when a suggested opportuntiy is selected: -"+ SelectedOppurtinityCell);
			return evidence;
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * This method is used to verify The First Evidence Of The Selected Opportunity
	 * Display
	 * 
	 * @param ExtentTest child
	 * 
	 * @return true
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyTheFirstEvidenceOfTheSelectedOpportunityDisplay(ExtentTest child) throws InterruptedException {
		actions.waitForElement(2000);
		NextEvidence.click();
		actions.waitForElement(2000);
		WebElement Selectedoppurtinity = IndicatorText;
		String SelectedOppurtinityCell = Selectedoppurtinity.getText();
		if (SelectedOppurtinityCell.contains("1 /")) {

			Reporter.log("Verify that the evidence document scrolls to display the first evidence of the selected opportunity: -"+ SelectedOppurtinityCell);
			child.log(LogStatus.INFO,"Verify that the evidence document scrolls to display the first evidence of the selected opportunity: -: -"+ SelectedOppurtinityCell);
			return true;
		} else {
			Reporter.log("Verify that the evidence document dose not scrolls to display the first evidence of the selected opportunity: -"+ SelectedOppurtinityCell);
			child.log(LogStatus.INFO,"Verify that the evidence document dose not scrolls to display the first evidence of the selected opportunity: -: -"+ SelectedOppurtinityCell);
			return false;
		}
	}

	/*
	 * This method is used to verify That The Document Header Display The Correct
	 * Number Of The Evidence
	 * 
	 * @param ExtentTest child
	 * 
	 * @return true
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyThatTheDocumentHeaderDisplayTheCorrectNumberOfTheEvidence(ExtentTest child)throws InterruptedException {
		actions.waitForElementToBeClickable(HCCButton, 15);
		HCCButton.click();
		actions.waitForElement(2000);
		List<WebElement> opportunityRows = HCCHighlightTextList;
		for (int cnt = 0; cnt <= opportunityRows.size();) {
			for (WebElement list : opportunityRows) {
				actions.waitForElementToBeClickable(list, 15);
				list.click();
				actions.waitForElement(2000);
				WebElement SelectedOppurtinity = IndicatorText;
				String SelectedOppurtinityNum = SelectedOppurtinity.getText();
				actions.waitForElement(1000);
				Reporter.log("Verify that the document header display the correct number of the evidence selected by the user: -"+ SelectedOppurtinityNum);
				child.log(LogStatus.INFO,"Verify that the document header display the correct number of the evidence selected by the user: -"+ SelectedOppurtinityNum);
			}
			return true;
		}
		{
			return false;
		}
	}
	
	/*
	 * This method is used to Verify the document scrolls To Display The Next Or The Previous Evidence
	 * 
	 * @param ExtentTest child
	 * 
	 * @return true
	 * 
	 * @exception InterruptedException
	 */
	public boolean  verifythedocumentscrollsToDisplayTheNextOrThePreviousEvidence(ExtentTest child)throws InterruptedException {
		actions.waitForElementToBeClickable(HCCButton, 15);
		HCCButton.click();
		actions.waitForElementToBeClickable(HCCHighlightText, 15);
		HCCHighlightText.click();
		actions.waitForElementToBeClickable(NextEvidence, 15);
		NextEvidence.click();
		Reporter.log("Click on Next Evidence");
		child.log(LogStatus.INFO, "Click on Next Evidence");
		WebElement SelectedOppurtinity = IndicatorText;
		String SelectedOppurtinityNum = SelectedOppurtinity.getText();		
		boolean evidence = SelectedOppurtinityNum.contains("2 /");
		if (SelectedOppurtinityNum.contains("2 /")) {
		  	Reporter.log(" Verify the document scrolls to display the next evidence as selected by the user: -"+ SelectedOppurtinityNum);
			child.log(LogStatus.INFO," Verify the document scrolls to display the next evidence as selected by the user: -"+ SelectedOppurtinityNum);
			}
		actions.waitForElementToBeClickable(PrevEvidence, 15);
		PrevEvidence.click();
		Reporter.log("Click on previous Evidence");
		child.log(LogStatus.INFO, "Click on previous Evidence");
		WebElement SelectedOppurtinity1 = IndicatorText;
		String SelectedOppurtinityNum1 = SelectedOppurtinity1.getText();
		
		  evidence = SelectedOppurtinityNum1.contains("1 /");
		 if(SelectedOppurtinityNum1.contains("1 /")) {
			Reporter.log(" Verify the document scrolls to display the previous evidence as selected by the user: -"	+ SelectedOppurtinityNum1);
			child.log(LogStatus.INFO,	" Verify the document scrolls to display the previous evidence as selected by the user: -"+ SelectedOppurtinityNum1);
		 }
		return evidence;
	}

	/*
	 * This method is used to verify Evidence Of The selected Opportunity
	 * 
	 * @param ExtentTest child
	 * 
	 * @return nothing
	 * 
	 * @exception InterruptedException
	 */
	public void verifyEvidenceOfTheselectedOpportunity(ExtentTest child, String Enabled, String scroll) throws InterruptedException {	
		actions.waitForElement(3000);
		List<WebElement> opportunityRows = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
				.findElements(By.cssSelector("div[class='ui-grid-row']"));
		if (opportunityRows != null && !opportunityRows.isEmpty() && opportunityRows.size() > 0) {

			for (int cnt = 0; cnt <= opportunityRows.size() - 2; cnt++) {
				WebElement dosElement = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col2"));
				actions.waitForElementToBeClickable(dosElement, 15);
				dosElement.click();
				actions.waitForElementToBeClickable(DosValue, 15);
				DosValue.click();
				actions.waitForElement(2000);
				WebElement renderingproviderrow = Opportunitiesgrid.findElement(By.cssSelector("div[class='ui-grid-canvas']"))
						.findElement(By.id("opportunities_row" + cnt + "_col3"));
				actions.waitForElementToBeClickable(renderingproviderrow, 15);
				renderingproviderrow.click();
				actions.waitForElementToBeClickable(RenderProviderValue, 15);
				RenderProviderValue.click();
				actions.waitForElement(2000);

				if (Enabled == "true") {
					verifyTheEvidenceNumberIndicatorEnabled(child);
					verifyEvidenceAutoscrollLockIconMode(child);
				} else {
					verifyTheEvidenceNumberIndicatorDisabled(child);
				}
			}
			Reporter.log("Verify that evidence document document " + scroll + " when a suggested opportuntiy is selected from the grid");
			child.log(LogStatus.INFO, "Verify that evidence document " + scroll + " when a suggested opportuntiy is selected from the grid");
		}
	}
	
	/*
	 * This method is used to Verify That The Relevant Opportunity Is Highlighted
	 * 
	 * @param ExtentTest child
	 * 	
	 * @exception InterruptedException
	 */
	public boolean verifyThatTheRelevantOpportunityIsHighlighted(ExtentTest child) throws InterruptedException {
		actions.waitForElement(1000);
		String AcColor ="#ff0000";
		String IeColor ="#d4d4d4";
		RXHCCButton.click();
		actions.waitForElement(2000);
		RxHCCHighlightText.click(); 
		Reporter.log("Click on Hypertension RxHCC Highlight Text");
		child.log(LogStatus.INFO, "Click on Hypertension RxHCC Highlight Text");
		actions.waitForElement(2000);
		String ActualColor =OpportunityBorder.getCssValue("border-top-color");
		String ActualResult =Color.fromString(ActualColor).asHex();
		if (ActualResult.equals(AcColor)) {
			Reporter.log("Verify that the relevant opportunity is highlighted");
			child.log(LogStatus.INFO, "Verify that the relevant opportunity is highlighted");
			return true;
			}
		else if (ActualResult.equals(IeColor)) {
			Reporter.log("Verify that the relevant opportunity is highlighted");
			child.log(LogStatus.INFO, "Verify that the relevant opportunity is highlighted");
			return true;
			}
		return false;	
	}
	
	/*
	 * This method is used to verify Evidence button
	 * 
	 * @param ExtentTest child
	 * 
	 * @return Evidence display or Not
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyEvidenceEnable(ExtentTest child, WebElement Evidence,String Button) throws InterruptedException {
		actions.waitForElement(1000);
		try {
			actions.waitForElement(2000);
			if (Evidence.isDisplayed()) {
				Reporter.log("Verify that," +Button+ " Evidence button display beside 'Highlight Options' widget: - Enabled");
				child.log(LogStatus.INFO, "Verify that," +Button+ " Evidence button display beside 'Highlight Options' widget: - Enabled");
				return true;
			} else {
				Reporter.log("Verify that," +Button+ " Evidence button display beside 'Highlight Options' widget: - Disabled");
				child.log(LogStatus.INFO, "Verify that, " +Button+ " Evidence' button display beside 'Highlight Options' widget: - Disabled");
				return false;
			}
		} catch (Exception ex) {
			child.log(LogStatus.ERROR, ex.fillInStackTrace());
			return false;
		}
	}
	
	/*
	 * This method is used to verify Button Is Enabled Or Disabled
	 * 
	 * @param ExtentTest child,ButtonSelected,ButtonName and PalnType
	 * 
	 * @return true
	 * 
	 * @exception InterruptedException
	 */
	public boolean verifyButtonIsEnabledOrDisabled(ExtentTest child,WebElement ButtonSelected, String ButtonName, String PalnType) throws InterruptedException {
		actions.waitForElement(2000);
		try {
			if (ButtonSelected.isDisplayed()) { 
				Reporter.log(ButtonName + " " + "Display as related plan type -");
				child.log(LogStatus.INFO, ButtonName + " " + "Display as related plan type -" + PalnType);
				return true;
		}}
		catch(NoSuchElementException e) {
			Reporter.log(ButtonName + " " + "Not display as related plan type -");
			child.log(LogStatus.INFO, ButtonName + " " + "Not display as related plan type -" + PalnType);
			return true;
			}
		return false;
	}
}
