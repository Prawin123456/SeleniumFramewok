package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utility.ReadExcelData;

public class MyFirstTestCases extends BaseTest {
	
	
	@Test(dataProviderClass=ReadExcelData.class,dataProvider="bvtdata")
	public static void LoginTest(String username,String password) throws InterruptedException   {
		
		System.out.println("clicked successfully");
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();//locators--properties
		driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys(username);
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(2000);
        driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys(password);	
        Thread.sleep(2000);
        driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(loc.getProperty("skip_button"))).click();
	    
		}
	
//	@DataProvider(name="testdata")
//	public Object[][] tData()
//	{
//		return new Object[][]{
//			{"pky@gmail.com","pk@123"},
//			{"pkr@gmail.com","pk@123"},
//			{"pkp@gmail.com","pk@123"},
//			{"pkj@gmail.com","pk@123"},
//			{"prawinkumar.222@gmail.com","Prawin@1995"}
//		};
		

	
}
