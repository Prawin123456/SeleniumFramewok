package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static Properties loc=new Properties();
	public static FileInputStream fis;
	
	@BeforeMethod
	public void setUp() throws IOException {
		
		if(driver==null) {
			FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\MY_FRAMEWORK\\src\\test\\resources\\configfiles\\config.properties");
			FileInputStream fis1=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\MY_FRAMEWORK\\src\\test\\resources\\configfiles\\locators.properties");

			prop.load(fis);
			loc.load(fis1);
			
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();//base
			driver.manage().window().maximize();//base
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getProperty("testurl"));//properties

		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox ")) {
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
			  driver.get(prop.getProperty("testurl"));//properties

		}
		
		}
	
	@AfterMethod
	public void teardown() {
		driver.close();
		System.out.println("teardown successfull");
		
	}

}
