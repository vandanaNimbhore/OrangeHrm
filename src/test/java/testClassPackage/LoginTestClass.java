package testClassPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.HomePage;
import pomPackage.LoginPage;

public class LoginTestClass {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	SoftAssert s;
	@BeforeClass
	public void beforeClass()
	{   driver=new ChromeDriver();
		System.setProperty("webdriver.driver.chromedriver", "src\\test\\resources\\driver\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		login=new LoginPage(driver);
		home=new HomePage(driver);
		 s=new SoftAssert();
		
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method1");
	}
	@Test (priority=1)
	public void verifyLoginFunctionalityWithCorrectUsernamePassword() throws InterruptedException
	{
		login.enterUserName("Admin");
		login.enterPassword("admin123");
		login.clickOnLoginButton();
		/*String expectedResult="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Thread.sleep(2000);
		//String currentUrl=driver.getCurrentUrl();
		String result=login.verifyToGetCurrentUrl();
		SoftAssert s=new SoftAssert();
		s.assertEquals(result,expectedResult);
		System.out.println("soft assert access");
		Assert.assertEquals(result, expectedResult);
		System.out.println("test case is endd");
		s.assertAll();*/
		//hard Assert
	    //Assert.assertNotEquals(currentUrl, expectedResult);
		//boolean result=login.compareCurrentUrl();
		//Assert.assertTrue(result);
		
		//Assert.assertFalse(false);
		//soft assert
		//SoftAssert s=new SoftAssert();
		//s.assertEquals(currentUrl,expectedResult);
		//s.assertNotEquals(currentUrl, expectedResult);
		//s.assertTrue(true);
		//s.assertFalse(false);
		//s.assertAll();*/
		System.out.println("test1");
		
		}
	/*@Test(priority=2)
	public void verifyLoginFunctionalityWithInCorrectUsernamePassword()
	{
		login.enterUserName("Admin");
		login.enterPassword("admin1234");
		login.clickOnLoginButton();
		String expectedResult="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualResult=login.verifyToGetCurrentUrl();
        s.assertEquals(actualResult, expectedResult);
		System.out.println("TestCase Enddd");
		s.assertAll();
	}*/
	/*@Test(priority=2 ,dependsOnMethods={"verifyLoginFunctionalityWithCorrectUsernamePassword"})
	public void verifyHomePage()
	{SoftAssert s=new SoftAssert();
       s.assertTrue(true);
		home.adminIsDisplayed();
		
		home.pimIsDisplayed();
		home.leaveIsDisplayed();
		home.timeIsDisplayed();
		home.recruitmentIsDisplayed();
		home.myInfoIsDisplayed();
		s.assertAll();
	}*/
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method1");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class1");
	}

}
