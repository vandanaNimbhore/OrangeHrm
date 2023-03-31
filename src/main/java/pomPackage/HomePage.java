package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement leave;
	@FindBy(xpath="//span[text()='Time']")
	private WebElement time;
	@FindBy(xpath="//span[text()='Recruitment']")
	private WebElement recruitmnt;
	@FindBy(xpath="//span[text()='My Info']")
	private WebElement myInfo;
	WebDriver driver;
	public HomePage(WebDriver driver)
	{this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void adminIsDisplayed()
	{
		boolean result=admin.isDisplayed();
		if(result==true)
		{
			System.out.println("admin tab is displayed");
		}
	}
	public void pimIsDisplayed()
	{
		boolean result=pim.isDisplayed();
		if(result==true)
		{
			System.out.println("pim tab is displayed");
		}
	}
	public void leaveIsDisplayed()
	{
		boolean result=leave.isDisplayed();
		if(result==true)
		{
			System.out.println("leave tab is displayed");
		}
	}
	public void timeIsDisplayed()
	{
		boolean result=time.isDisplayed();
		if(result==true)
		{
			System.out.println("time tab is displayed");
		}
	}
	public void recruitmentIsDisplayed()
	{
		boolean result=recruitmnt.isDisplayed();
		if(result==true)
		{
			System.out.println("recruitment tab is displayed");
		}
	}
	public void myInfoIsDisplayed()
	{
		boolean result=myInfo.isDisplayed();
		if(result==true)
		{
			System.out.println("my info tab is displayed");
		}
	}
	
	
	
	


}
