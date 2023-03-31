package testClassPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pomPackage.LoginPage;
import utilityPackage.ScreenShots;
import utilityPackage.StaticBrowser;



public class BaseClass {
	static WebDriver driver;
	//LoginPage login;
	public static ExtentReports report;
	public static ExtentHtmlReporter extent;
	public static ExtentTest logger;
	@Parameters({"browserName"}) 
	@BeforeTest
	public  void beforeTest(String browserName)
	{ 
	  driver=StaticBrowser.openBrowser(browserName,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  this.driver=driver;
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	extent=new ExtentHtmlReporter("test-output\\reports\\"+System.currentTimeMillis()+".html");
	report= new ExtentReports();
	report.attachReporter(extent);
	} 
	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{    
		if(result.getStatus()==ITestResult.FAILURE)
	    {
		    String path=ScreenShots.capturedPageScreenShots(driver);
	    
		logger.fail("test case is failed",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
	    }
		report.flush();
	}
	@AfterTest
	public void aftertest()  
	{
		
	}
}
