package testClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pomPackage.CrossBrrowserPom;

public class LoginTestClass2 {
	WebDriver driver;
	CrossBrrowserPom cross;
	@Parameters({"browserName"})
	@BeforeTest
	public void beforeTest(String browserName)
	{ 
	    cross=new CrossBrrowserPom(driver);
	    cross.chromBrowserLaunch();
	    cross.edgeBrowserLaunch();
		cross.verifyCrossBrowser(browserName);
	
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method2");
	}
	@Test
	public void login()
	{ 
		System.out.println("test classlogin 2");
	}
	@Test
	public void home()
	{
		System.out.println("testclasshome 2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method2");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class 2");
	}
	
    @AfterTest
   public void aftertest()
   {
	System.out.println("aftet test");
    }
}
