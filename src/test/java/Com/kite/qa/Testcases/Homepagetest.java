package Com.kite.qa.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Com.kite.qa.base.Testbase;
import Com.kite.qa.pages.Homepage3;

import Com.kite.qa.pages.Loginpage;

public class Homepagetest extends Testbase{

	Loginpage loginpage;
	Homepage3 homepage;
	public Homepagetest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
	loginpage =	new Loginpage();
	homepage =  new Homepage3();
	
	}
	@Test
	public void HomepageTitle() throws InterruptedException {
	boolean Title=	homepage.validateKiteUserID1(props.getProperty("Username"),props.getProperty("Password"),props.getProperty("PIN"));
	Assert.assertEquals(Title, "Kite - Zerodha's fast and elegant flagship trading platform");
	
	}
		
	@AfterMethod
	public void TearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}

}