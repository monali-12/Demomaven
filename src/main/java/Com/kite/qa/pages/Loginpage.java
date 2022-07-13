package Com.kite.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import Com.kite.qa.base.Testbase;

public class Loginpage extends Testbase{

	
	//PageFactory
	@FindBy(id ="userid")
	WebElement Username;	
//	driver.fndelement(By.id("userid"));
	
	@FindBy(id="password")
	WebElement Password;
		
	@FindBy(xpath ="//button[@type=\"submit\"]")
	WebElement LoginButton;
	
	@FindBy(id="pin")
	WebElement Pin;
	   
	@FindBy(xpath ="//button[@type=\"submit\"]")
	 WebElement ContinueButton;
	
	@FindBy(xpath ="//span[contains(text(),'GP8097')]")
	WebElement UserID1;
	
	
	//Initializing the page object
	public Loginpage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
    public String ValidateLoginPageTitle() throws InterruptedException {
    	
    	Thread.sleep(2000);
    	return driver.getTitle();
    	
    }
	public boolean ValidateKiteLoginUserID(String UN,String PWD,String PIN) throws InterruptedException {
		
		Username.sendKeys(UN);
		Thread.sleep(2000);
		Password.sendKeys(PWD);
		Thread.sleep(2000);
		LoginButton.click();
		Thread.sleep(2000);
		Pin.sendKeys(PIN);
		Thread.sleep(2000);
		ContinueButton.click();
				
		return UserID1.isDisplayed();
				
	}
	
}