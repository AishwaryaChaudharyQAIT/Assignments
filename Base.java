package com.qait.Automation.Test_HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
WebDriver driver;
public Base()
{
//System.out.println(System.getProperty("user.dir"));
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
driver = new ChromeDriver();

}


}