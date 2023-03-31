package testClassPackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.LoginPage;
import utilityPackage.ReadDataExcel;
import utilityPackage.StaticBrowser;

public class LoginTestClass3 extends BaseClass  
{	LoginPage login;
	 //WebDriver driver;
	ReadDataExcel read;
	@BeforeClass
	public void beforeClass()
	{    
           
		login=new LoginPage(driver);
		
     }
	@BeforeMethod
	public void beforeMethod()
	{ 
		
		System.out.println("before method");
	  
	}
	@Test(priority=1)
	public void WronguserNamePassword() throws InterruptedException, EncryptedDocumentException, IOException
	{ logger=report.createTest("verify loggin functionality incorrect data");
		login.enterUserName(read.fetchDataFromExcel(1, 0));
		login.enterPassword(read.fetchDataFromExcel(1, 1));
		login.clickOnLoginButton();
		System.out.println("pass");
		
		String expectedResult="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		//Thread.sleep(2000);s
		String currentUrl=driver.getCurrentUrl();
		//String result=login.verifyToGetCurrentUrl();
		Assert.assertEquals(currentUrl, expectedResult);
	//SoftAssert soft=new SoftAssert();
		//login.clearUserNamePassword();
		//soft.assertTrue(true);
		//soft.assertAll();
		
	}
	@Test(priority=2)
	public void correctUserNamePassword () throws InterruptedException, EncryptedDocumentException, IOException
	{ Thread.sleep(4000);
	logger=report.createTest("verify loggin functionality incorrect data");
	login.enterUserName(read.fetchDataFromExcel(2, 0));
	login.enterPassword(read.fetchDataFromExcel(2, 1));
	login.clickOnLoginButton();
	System.out.println("login Successfully");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class 3");
	}
	

}
