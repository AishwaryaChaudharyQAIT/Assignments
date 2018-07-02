package com.qait.Automation.Test_HomePage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qait.Automation.Test_HomePage.HomePageActions;


public class POMTest2 extends Base {
	HomePageActions HomePage;
	
	String ExNAME="Aishwarya Chaudhary";
	String ExEmployeeID="4534";
	String ExDesignation="Software Testing Engineer";
	String EXRank="Normal";
	String EXSupervisor="Anchal Asthana";
	String EXYearOfExperience="0 year(s) 0 month(s)";
	String EXPrevious_Exp="0 Years";
	
	@BeforeTest
	public void init()
	{
		HomePage = new HomePageActions(driver);
	}

	@Test
	public void Step01_LongIn() 
	{
		driver.get("http://hris.qainfotech.com");
		HomePage.logInTab();
		HomePage.EnterID_Pass("aishwaryachaudhary", "Aishwarya@321#");
		HomePage.ClickOnSubmit();
	}
	@Test
	public  void Step02_check_Correct_username_is_displayed()
	{
		
		HomePage.check_LogIn_UserName_is_correct();
	}
//	@Test
	public  void Step03_check_time_icon()
	{
		HomePage.check_time_icon_is_present();
		HomePage.check_task_board_icon_is_present();
		HomePage.check_Dashboard_is_present();
		HomePage.check_Leave_icon_is_present();
		HomePage.check_EAR_icon_is_present();
		HomePage.check_Support_icon_is_present();
		HomePage.check_Onsite_icon_is_present();
		HomePage.check_HR_icon_is_present();
		HomePage.check_Feedback_icon_is_present();
		HomePage.check_Assessment_icon_is_present();
	}

//	@Test
	public  void Step04_check_details()
	{
		HomePage.check_General_information_are_correct(ExNAME,ExEmployeeID,ExDesignation,EXRank,EXSupervisor,EXYearOfExperience,EXPrevious_Exp);
	}
	@AfterClass
	public void shut(){
		driver.quit();
	}

}
