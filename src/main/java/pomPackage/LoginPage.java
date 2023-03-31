 package pomPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pomUtility.WaitElementClass;

public class LoginPage {
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement login;
	@FindBy(xpath="//p[text()='Paul Collings']")
	private WebElement paoulcollings;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	@FindBy(xpath="//p[text()='Invalid credentials']")
	private WebElement invalidCred;
	
	 WebDriver driver;
	 Actions act;
	public  LoginPage( WebDriver driver)
	{this.driver=driver;
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
	}
	public void enterUserName(String uName1)
	{ WaitElementClass.waitForElement("//button[text()=' Login ']", 10, driver);
		act.moveToElement(userName).sendKeys("Admin").build().perform();
	}
	public void enterPassword(String pName1)
	{
		password.sendKeys(pName1);
	}
	public void clickOnLoginButton()
	{  
		   login.click();
	}
	
	public void clearUserNamePassword()
	{
		userName.sendKeys(Keys.CLEAR);
		password.sendKeys(Keys.CLEAR);
	}
	/*public void enterCorrectUserNamePassword()
	{
		String str=invalidCred.getText();
		if(str.equals("Invalid credential"))
		{
			userName.sendKeys("Admin");
		
			password.sendKeys("admin123");
		}
	}*/
	public void verifyPaoulCollings()
	{   boolean result= paoulcollings.isDisplayed();
		//String result=paoulcollings.getText();
		if(result==true)
		{
			paoulcollings.click();
		}
		else
		{
			String str=login.getText();
			System.out.println(str);
		}
	}
	
	/*public void clickOnPaoulCollings()
	{
		paoulcollings.click();
	}*/
	public void clickOnLogout()
	{
		logout.click();
	}
	
	

	/*public String verifyToGetCurrentUrl()
	{
		String result=driver.getCurrentUrl();
		return result;
	}*/
	/*public boolean compareCurrentUrl() 
	{
		String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String url=driver.getCurrentUrl();
		boolean result=expectedUrl.equals(url);
		
		return result;
	}*/

}
