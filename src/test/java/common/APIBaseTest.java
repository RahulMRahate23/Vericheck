package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class APIBaseTest {
	public ExtentReports report; 
	public  ExtentTest parent ;
	public  ExtentTest child ;
	public Properties properties;
	protected ExtentReports extent;
	protected ExtentTest logger;
	@BeforeTest
	public Properties getAPIPropertiesData(){
		try{
			properties = new Properties();
			FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/input data/api.properties");
			properties.load(inputStream);
			return properties;
		}
		catch(FileNotFoundException r){
			r.printStackTrace();
			return properties;
		} 
		catch (IOException r) {
			r.printStackTrace();
			return properties;
		}
	}
	
	@BeforeTest
	public void startReport(){

		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/APIExtentReport.html", true, DisplayOrder.NEWEST_FIRST);
		extent
                .addSystemInfo("Host Name", "Software Testing")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "ABC");
                extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
	}
	
	String dody = "{ \r\n" + 
			"        \"clientId\":\"dmo\",  \"rangeStartDate\": 1567666800000, \"rangeEndDate\": 1567839599000 \r\n" + 
			"        \r\n" + 
			"}";
	
	@AfterMethod
	public void getResult(ITestResult result) throws InterruptedException{
		if(result.getStatus() == ITestResult.FAILURE){
			logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		}
		Thread.sleep(2000);
		extent.endTest(logger);
		
	}	
}
