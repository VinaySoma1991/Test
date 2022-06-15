package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	@FindBy(id="email") WebElement uname;
	@FindBy(id="pass") WebElement passw;
	@FindBy(xpath="//button[@name='login']") WebElement login;
	
	public void loginFB(String name, String pass) throws InterruptedException
	{
		Thread.sleep(5000);
		uname.sendKeys(name);
		passw.sendKeys(pass);
		login.click();
	}
	
	
	
}
