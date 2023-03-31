package utilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	public static String capturedPageScreenShots(WebDriver driver) throws IOException
	{   String path="C:\\Users\\91935\\eclipse-workspace\\HRM\\test-output\\screenshot\\test"+System.currentTimeMillis()+".png";
	    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File  dest=new File(path);
		FileHandler.copy(source,dest);
	    return path;
	}

}
 