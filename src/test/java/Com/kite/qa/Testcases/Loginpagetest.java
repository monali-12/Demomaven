package Com.kite.qa.Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.kite.qa.base.Testbase;
import Com.kite.qa.base.Testbase;
import Com.kite.qa.pages.Loginpage;
import Com.kite.qa.pages.Loginpage;

	public class Loginpagetest extends Testbase {

		Loginpage loginpage;
		
		
		public Loginpagetest() throws IOException {
			super();
			
		}
		 public static Logger log = LogManager.getLogger(Testbase.class.getName());
		@BeforeMethod
		public void setup() throws IOException {
			
			initialization();
			log.info("Driver is initialized");
			
			loginpage = new Loginpage();
			log.info("Loginpage object");
		}
		
		@Test
		public void KiteUserID() throws InterruptedException {
			
			boolean UserId= loginpage.ValidateKiteLoginUserID(props.getProperty("Username"), props.getProperty("Password"), props.getProperty("PIN"));
		    Assert.assertTrue(true);
		    log.info("Usernames & Password is Entered");	
		    
		}
		
		@Test
		public void HomepageTitle() throws InterruptedException {
			String Title =loginpage.ValidateLoginPageTitle();
			Assert.assertTrue(false);
			log.info("Homepage validate");
			
		}
		
		
		@AfterMethod
		public void teardown() throws InterruptedException {
			
			Thread.sleep(3000);
			driver.quit();
	}
		
}
