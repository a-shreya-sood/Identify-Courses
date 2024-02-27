package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.testng.annotations.*;
import PageObject.HomePage;
import TestBase.BaseClass;
import Utilities.excelUtility;
import Utilities.excelUtility;

public class Tc_001_HolidayHomeTest extends BaseClass
{
	
	HomePage hp;
  @Test(priority=1)
  public void verify_text_box() throws InterruptedException
  {
	  BaseClass.getLogger().info("-------Entering data into text feild--------");
	  
	  hp=new HomePage(driver);
	  hp.text_box();

	  
  }
  @Test(priority=2)
	public void verify_language() throws InterruptedException
	{
	  BaseClass.getLogger().info("-------Scrolling till language type--------");	  
		  hp=new HomePage(driver);
		  hp.language();
	}
  
  
  @Test(priority=3)
  public void verify_course_level() throws InterruptedException
  {
	  BaseClass.getLogger().info("-------Scrolling till course level--------");	
	  hp=new HomePage(driver);
       	  hp.course_level();
       	  Thread.sleep(3000);
  }
  @Test(priority=4)
	  public void verify_course_box()
	  {
	  BaseClass.getLogger().info("-------Capturing all data of course first box--------");	
	    hp=new HomePage(driver);
	    hp.course_box_first();
	    hp.childPage(driver);
	   int row=1;
	  try
	 {
		 String header1= hp.course_header();
		 String dur1= hp.course_duration();
		 String rate1= hp.course_rating();
		 excelUtility.write("Sheet1",0,0,"Course Name");
		excelUtility.write("Sheet1",0,1,header1);
		
		 excelUtility.write("Sheet1",1,0,"Course Duration");
		excelUtility.write("Sheet1",1,1,dur1);
			
		excelUtility.write("Sheet1",2,0,"Course Rating");
		excelUtility.write("Sheet1",2,1,rate1);
		
	 }
	 catch(Exception e)
	 {
		e.printStackTrace();
	 }
	  
	    hp.Parentpage(driver);
	  }
  
  @Test(priority=5)
  public void verify_second_course_box()
  {
	  BaseClass.getLogger().info("-------Capturing all data of course second box--------");	
	  hp=new HomePage(driver);
	  
	  	hp.second_course_box();
	  	hp.childPage(driver);
	  	 try
		 {
			 String header2= hp.second_course_heading();;
			 String dur2= hp.second_course_duration();
			 String rate2= hp.second_course_rating();
			 
			 excelUtility.write("Sheet1",5,0,"Course Name");
			excelUtility.write("Sheet1",5,1,header2);
			
			 excelUtility.write("Sheet1",6,0,"Course Duration");
			excelUtility.write("Sheet1",6,1,dur2);
				
			excelUtility.write("Sheet1",7,0,"Course Rating");
			excelUtility.write("Sheet1",7,1,rate2);
			
		 }
		 catch(Exception e)
		 {
			e.printStackTrace();
		 }

	    hp.Parentpage(driver);
  }
  
  
}

