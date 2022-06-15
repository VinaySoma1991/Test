package Practice;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class firstTest extends BaseClass{
	
	@Test
	public void loginApp() throws InterruptedException, IOException {
		
		logger=report.createTest("Login to FB");
		logger.info("Starting Applications");
		Login login=PageFactory.initElements(driver, Login.class);
		logger.pass("Login Succeffuly");
		login.loginFB(excel.GetStringData("log", 0, 0), excel.GetStringData("log", 0, 1));
		//Helper.CaptureScreenShot(driver);
	
		
	}
	
	
	}
