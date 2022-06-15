package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	
	
	public static WebDriver startApp(WebDriver driver,String url) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get(url);
		driver.manage().window().maximize();	
		
		return driver;
	}
	
	public static void quit(WebDriver driver)
	{
		driver.quit();
	}

}
