package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class CrossBrrowserPom {
	WebDriver driver;
	public CrossBrrowserPom(WebDriver driver)
	{  this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void chromBrowserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void edgeBrowserLaunch()
	{
		System.setProperty("webdriver.edge.driver","src\\test\\resources\\driver\\msedgedriver.exe");
		driver=new EdgeDriver();
	}
	public void verifyCrossBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
	{
		System.out.println("chrome browser.............");
	}
	else if(browserName.equals("edge"))
	{
		System.out.println("edge browser.............");
	}
		
	}

}
