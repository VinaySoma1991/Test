package Practice;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	
	public static void CaptureScreenShot(WebDriver driver) throws IOException {
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./ScreenShot/login"+getDate()+".png");
	FileUtils.copyFile(src, dest);
	
	}
	
	public static String getDate()
	{
		DateFormat custdate=new SimpleDateFormat("MM_dd_yyyy_mm_ss");
		Date currentDate=new Date();
		return custdate.format(currentDate);
	}
}
