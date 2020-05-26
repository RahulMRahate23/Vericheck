package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utilities.PropertyDictionary;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;


public class BaseTest {
    protected Properties properties;
    Map<String, String> propertiesData = new HashMap<String, String>();
    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    protected static ThreadLocal<EventFiringWebDriver> eventDriver = new ThreadLocal<>();
    protected static ThreadLocal<AutoLogger> handler = new ThreadLocal<>();
    private boolean isMobile;
    private AppiumDriver<WebElement> mDriver;
    DesiredCapabilities caps = new DesiredCapabilities();
    protected ExtentTest parent, child;
    public ExtentReports report; 
  

    public Properties getPropertiesData() {
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/input data/config.properties");
            properties.load(inputStream);
            return properties;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return properties;
        } catch (IOException e) {
            e.printStackTrace();
            return properties;
        }
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public WebDriver getEventDriver() {
        return eventDriver.get();
    }

    public AutoLogger getHandler() {
        return handler.get();
    }
    
    @Given("^User in on landing page$")
    public void launchBrowser(String browser, String TestURL) throws MalformedURLException, InterruptedException {
        WebDriver webdriver = null;
        EventFiringWebDriver event = null;
        AutoLogger logger = null;
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                //System.setProperty("webdriver.chrome.driver", "/home/silicus-admin/Selenium/Selenium-Automation-framework_TalixPOC/drivers/chromedriver");
                ChromeOptions options = new ChromeOptions();
                //options.addArguments("headless");
                options.addArguments("test-type");
                options.addArguments("ignore-certificate-errors");
                options.addArguments("no-sandbox");
                webdriver = new ChromeDriver(options);
                event = new EventFiringWebDriver(webdriver);
                logger = new AutoLogger();
                driver.set(webdriver);
                eventDriver.set(event);
                handler.set(logger);
                event.register(logger);
                event.manage().window().maximize();
                //Dimension browserDimension = new Dimension(1600,900);
                //eventDriver.manage().window().setSize(browserDimension);
                event.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
                openApplication(TestURL);
                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/drivers/IEDriverServer.exe");
                webdriver = new InternetExplorerDriver();
                event = new EventFiringWebDriver(webdriver);
                logger = new AutoLogger();
                driver.set(webdriver);
                eventDriver.set(event);
                handler.set(logger);
                event.register(logger);
                event.manage().window().maximize();
                event.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
                openApplication(TestURL);
                break;
        }
   }
    
    public void openApplication(String TestURL) throws InterruptedException{
		//To check application is working
		boolean isSiteUp = false;
		int tryCount = 0;
		int sleepTime = 60000;
		while(isSiteUp==false && tryCount<20){
			try {
				URL myURL = new URL(TestURL);
				URLConnection myURLConnection = myURL.openConnection();
				myURLConnection.connect();
				System.out.println("Connection established successfully!!!");
				getEventDriver().get(TestURL);
				Thread.sleep(3000);
				if(getDriver().findElement(By.xpath("//*[@id='next']")).isDisplayed()){
					isSiteUp=true;
					System.out.println("Application is up...!!!");
					break;
				}
			} 
			catch (Exception e) {   
				System.out.println("Application is down, wait for some time....");
				System.out.println(tryCount);
				Thread.sleep(sleepTime);
				tryCount++;
			}
		}
		if(!isSiteUp){
			System.out.println("Application is down!!!");
			System.exit(-1);
		}
	}
    
    public void Browser(String browser) throws MalformedURLException, Exception {
        WebDriver webdriver = null;
        switch (browser) {
            case "chrome":
            	
            	// Create object of DesiredCapabilities class
            	DesiredCapabilities cap=DesiredCapabilities.chrome();

            	// Set ACCEPT_SSL_CERTS  variable to true
            	cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
            	DesiredCapabilities caps = DesiredCapabilities.chrome();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("test-type");
                options.addArguments("ignore-certificate-errors");
                options.addArguments("no-sandbox");
                options.addArguments("disable-infobars");
                caps.setCapability(ChromeOptions.CAPABILITY, options);
                System.setProperty("selenide.browser", "chrome");
                LoggingPreferences logPrefs = new LoggingPreferences();
                logPrefs.enable(LogType.BROWSER, Level.SEVERE);
                caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
                break;
            case "firefox":
            	//It create firefox profile
            	FirefoxProfile profile=new FirefoxProfile();

            	// This will set the true value
            	profile.setAcceptUntrustedCertificates(true);
                caps = DesiredCapabilities.firefox();
            case "appiumandroid":
                caps = DesiredCapabilities.android();
                caps.setCapability("version", "5.0.2");
                caps.setCapability("deviceName", "Android");
                caps.setCapability("platformName", "Android");
                caps.setCapability("browserName", "chrome");
                webdriver = new RemoteWebDriver(new URL(PropertyDictionary.map.get("gridUrl")), caps);
                driver.set(webdriver);
                isMobile = true;
                break;

            case "appiumsafari":
                caps = DesiredCapabilities.android();
                caps.setCapability("platformVersion", "9.3.3");
                caps.setCapability("platformName", "iOS");
                caps.setCapability("deviceName", "Silicus iPhone 6-3");
                caps.setCapability("platform", "MAC");
                caps.setCapability("automationName", "Appium");
                caps.setCapability("udid", "785894383e2f3b59f80f381c8820c5c76c620a2a");
                caps.setCapability("app", "com.lampsplus.app");
                caps.setCapability("safariAllowPopups", false);
                caps.setCapability("safariIgnoreFraudWarning", true);
                caps.setCapability("locationContextEnabled", true);
                caps.setCapability("webStorageEnabled", true);
                mDriver = new IOSDriver<WebElement>(new URL("http://10.55.0.137:4444/wd/hub"), caps);
                Set<String> contextNames = mDriver.getContextHandles();
                for (String contextName : contextNames) {
                    if (contextName.contains("WEBVIEW")) {
                        mDriver.context(contextName);
                        driver.set(mDriver);
                    }
                }

                EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(mDriver);
                break;
        }
    }

    @BeforeSuite(alwaysRun = true)
    public void validateExtentReportFile() {
        File Report = new File((System.getProperty("user.dir") + "/test-output/ExtentReport.html"));
        if (Report.exists())
        	Report.delete();
    }

    @BeforeClass(alwaysRun = true)
    public void readPropertiesData(ITestContext iTestContext) throws MalformedURLException {
        getPropertiesData();
        report = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReport.html",false);
    }

    public static ITestContext setContext(ITestContext iTestContext, WebDriver driver) {
        iTestContext.setAttribute("driver", driver);
        return iTestContext;
    }

    public void quitBrowser() {
        if (getEventDriver() != null)
            getEventDriver().quit();
    }

	public void getEnviromentDetailsReady(String TestURL) throws MalformedURLException, InterruptedException{
		launchBrowser(properties.getProperty("browser"),TestURL);
	}

    @AfterMethod(alwaysRun = true)
    public void captureScreenshot(ITestResult result) throws Exception {
        if (ITestResult.FAILURE == result.getStatus()) {
            String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) getDriver()).
                    getScreenshotAs(OutputType.BASE64);
            child.log(LogStatus.FAIL, "Test Failed",
                    child.addBase64ScreenShot(base64Screenshot));
            child.log(LogStatus.FAIL, "Error",
                    result.getThrowable());
        } else if (ITestResult.SUCCESS == result.getStatus()){
            child.log(LogStatus.PASS, "Test passed");
        } else if (ITestResult.SKIP == result.getStatus()){
            child.log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentManager.getReporter().endTest(child);
        quitBrowser();
    }

	@AfterClass(alwaysRun=true)
	public void afterClass() {
        ExtentManager.getReporter().endTest(parent);
	}

	/*@AfterSuite
	public void afterSuite() throws IOException, AddressException, MessagingException{
		Utility.SendMail();
		//Utility.sendUpdatedEmail();
	}*/
}
