package com.qait.Automation.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class DataProviderTestNG

{
	WebDriver driver;

	@BeforeTest
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AishwaryaChaudhary\\Desktop\\Aishwarya june\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 


	}
	@Test
	public void step01_LaunchHRIS()
	{
		driver.get("http://hris.qainfotech.com");
	}

	@Test(dataProvider="loginCredentials")                                                                                                                                                                                               
	//@Parameters({"UserName","Password"})
	
	
	public void step02_EnterValidPassword( String UserName, String Password )
	{
		driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		WebElement loginID =driver.findElement(By.cssSelector("#txtUserName"));
		WebElement password =driver.findElement(By.cssSelector("#txtPassword"));
		WebElement submit =driver.findElement(By.cssSelector("[type='submit']"));
		loginID.sendKeys(UserName);
		password.sendKeys(Password);
		submit.click();
		 step03_logout();

	}
	
	public void step03_logout(){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.querySelectorAll(\"a[href*='logoff']\")[0].click()");

	}
	
	  @DataProvider(name="loginCredentials" )
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "arpanmishra", "Arpan@321#" },
	            { "aishwaryachaudhary", "Aishwarya@321#" },
	           
	        };
	  }

	
}