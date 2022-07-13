package Com.kite.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.kite.qa.Utility.Testutil;


public class Testbase {
	
	public static WebDriver driver;
	public static Properties props;
	
	
	public Testbase() throws IOException {
		
		
		props = new Properties();
		
		FileInputStream ip = new FileInputStream("F:\\tecure\\java\\Eclipse software\\eclipse-jee-2021-03-R-win32-x86_64\\eclipse"
				+ "\\Demomaven\\src\\main\\java\\Com\\kite\\qa\\base\\Testbase.java");
		
		props.load(ip);
						
	}
	
	public static void initialization() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Installer\\chromedriver.exe");
		
	     driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().timeouts().pageLoadTimeout(Testutil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
	     
	     driver.manage().timeouts().implicitlyWait(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	     
	     driver.get(props.getProperty("url"));
		
	}	
}