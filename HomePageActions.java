package com.qait.Automation.Test_HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageActions {
	WebDriver driver;
	boolean status=false;
	public void logInTab() {
		driver.findElement(By.cssSelector("a[href='#panel1']")).click();
		System.out.println("clicked on login tab");
	}
	public  HomePageActions(WebDriver driver)
	{
		this.driver= driver;
	}
	public void EnterUserid(String username){
		driver.findElement(By.cssSelector("#txtUserName")).sendKeys(username);
		System.out.println("Enter UserID");

	}
	public void EnterPassword(String pass){
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys(pass);
		System.out.println("Enter Password");
	}
	public void ClickOnSubmit() 
	{
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println("Click on submit");
	}
	
	public void EnterID_Pass(String username,String pass)
	{
		EnterUserid(username);
		EnterPassword(pass);

	}
	public void check_LogIn_UserName_is_correct()

	{
		String ExpectedName= "Aishwarya";
		String nameDisplayed=driver.findElement(By.cssSelector("a[class='profile-btn'] >span")).getText();
		if(nameDisplayed.equals(ExpectedName))
		status=true;
		Assert.assertTrue(status,"Expected user name was not found");
		System.out.println("User name displayed is correct!");	
	}

	public void check_time_icon_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size time")).size()>0))
			{status=true;}
		Assert.assertTrue(status,"Time icon not found");
		System.out.println("Time icon is present");
	}

	public void check_task_board_icon_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size taskboard")).size()>0))
			status=true;
		Assert.assertTrue(status,"Task board is not found");
		System.out.println("Task board is found");
	}

	public void check_Dashboard_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size dashboard")).size()>0))
			status=true;
		Assert.assertTrue(status,"Dashboard is not found");
		System.out.println("Dashboard is found");
	}
	public void check_Leave_icon_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size leave")).size()>0))
			status=true;
		Assert.assertTrue(status,"Leave ICON is not found");
		System.out.println("Leave ICON is found");
	}
	public void check_EAR_icon_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size ear")).size()>0))
			status=true;
		Assert.assertTrue(status,"EAR ICON is not found");
		System.out.println("EAR ICON is found");
	}
	public void check_Support_icon_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size support")).size()>0))
			status=true;
		Assert.assertTrue(status,"Support ICON is not found");
		System.out.println("support ICON is found");
	}
	public void check_Onsite_icon_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size onsite")).size()>0))
			status=true;
		Assert.assertTrue(status,"Onsite ICON is not found");
		System.out.println("Onsite ICON is found");
	}
	public void check_HR_icon_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size HR")).size()>0))
			status=true;
		Assert.assertTrue(status,"HR ICON is not found");
		System.out.println("HR ICON is found");
	}
	public void check_Feedback_icon_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size feedback")).size()>0))
			status=true;
		Assert.assertTrue(status," Feedback is not found");
		System.out.println("Feedback ICON is found");
	}
	public void check_Assessment_icon_is_present()
	{
		if((driver.findElements(By.cssSelector("icon_size assessment")).size()>0))
			status=true;
		Assert.assertTrue(status,"Assessment is not found");
		System.out.println("Assessment ICON is found");
	}
	public void check_General_information_are_correct(String ExName, String ExEmployeedID, String ExDesignation, String EXRank,String EXSupervisor,String EXYearOfExperience,String EXPrevious_Exp)
	{

		String NAME=driver.findElement(By.cssSelector("span[class='pro-dtl-val ng-scope']>a")).getText();
		String EmployeeID=driver.findElement(By.cssSelector("ul[class='list-unstyled pro-details-left marginTop15'] >li:nth-child(3) >span[class='pro-dtl-val ng-binding']")).getText();
		String Designation=driver.findElement(By.cssSelector("ul[class='list-unstyled pro-details-left marginTop15'] >li:nth-child(4) >span[class='pro-dtl-val ng-binding'] ")).getText();
		String Rank=driver.findElement(By.cssSelector("ul[class='list-unstyled pro-details-left marginTop15'] >li:nth-child(5) >span[class='pro-dtl-val ng-binding']")).getText();
		String Supervisor=driver.findElement(By.cssSelector("ul[class='list-unstyled pro-details-left marginTop15'] >li:nth-child(6) >span[class='pro-dtl-val'] >a")).getText();
		String YearOfExperience=driver.findElement(By.cssSelector("ul[class='list-unstyled pro-details-left marginTop15'] >li:nth-child(7) >span[class='pro-dtl-val ng-binding']")).getText();
		String Previous_Exp=driver.findElement(By.cssSelector("ul[class='list-unstyled pro-details-left marginTop15'] >li:nth-child(8) >span[class='pro-dtl-val ng-binding']")).getText();

		Assert.assertEquals(NAME,ExName,"Expected user name was not found");
		System.out.println("Name displayed is correct!");
		
		Assert.assertEquals(EmployeeID,ExEmployeedID,"Expected EmployeeID  was not found");
		System.out.println("EmployeeID displayed is correct!");
		
		Assert.assertEquals(Designation,ExDesignation,"Expected Designation  was not found");
		System.out.println("Designation displayed is correct!");
		
		Assert.assertEquals(Rank,EXRank,"Expected Rank  was not found");
		System.out.println("Rank displayed is correct!");
		
		Assert.assertEquals(Supervisor, EXSupervisor,"Expected Supervisor  was not found");
		System.out.println("Supervisor displayed is correct!");
		
		Assert.assertEquals(YearOfExperience, EXYearOfExperience,"Expected YearOfExperience  was not found");
		System.out.println("YearOfExperience displayed is correct!");
		
		Assert.assertEquals(Previous_Exp, EXPrevious_Exp,"Expected Previous_Exp  was not found");
		System.out.println("Previous_Exp displayed is correct!");
		}

	}


