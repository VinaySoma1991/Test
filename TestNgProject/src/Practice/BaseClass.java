package Practice;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utility.ConfigDataProvider;
import utility.ExcelDataProvider;

public class BaseClass {
	
WebDriver driver;

    public ExcelDataProvider excel;
    public ConfigDataProvider con;
    public ExtentReports report;
    public Helper h;
    public ExtentTest logger;
    
 
	@BeforeSuite
	public void dataSuite() throws FileNotFoundException {
		excel=new ExcelDataProvider();
		con=new ConfigDataProvider();
		String path=System.getProperty("user.dir")+"\\Reports\\"+h.getDate()+".html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		report=new ExtentReports();
		report.attachReporter(reporter);
		
				
	}
    
    
	@BeforeClass
	public void start()
	{
		driver=BrowserFactory.startApp(driver, con.getUrl());
	}
	
	@AfterClass
	public void closebrowser()
	{
		BrowserFactory.quit(driver);
	}
	@AfterMethod
	public void teardown(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.CaptureScreenShot(driver);
			System.out.println("Captured");
		}
		report.flush();
	}
	

}
