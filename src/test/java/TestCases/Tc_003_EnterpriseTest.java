package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import PageObject.EnterpriseTest;
import TestBase.BaseClass;

public class Tc_003_EnterpriseTest extends BaseClass
{
	EnterpriseTest et;  
	
	
	@Test(priority=10)
	public void verify_coursera_button()
	{
		 logger.info("-------Scrolling till coursera button--------");	
		 et=new EnterpriseTest(driver);
		et.coursera_button();
	}
	
	@Test(priority=11)
	public void verify_enterprise_button()
	{
	  logger.info("-------Scrolling till enterprise button--------");	
		et=new EnterpriseTest(driver);
		et.enterprise_button();
	}
	
	@Test(priority=12)
	public void verify_whatWeOffer_button()
	{
		//logger.info("-------Clicking on solution button--------");	
		et=new EnterpriseTest(driver);
		et.whatWeOffer_button();
	}
	
	
	@Test(priority=13)
	public void verify_learnMore_button()
	{
		logger.info("-------Clicking on university button--------");	
		et=new EnterpriseTest(driver);
		et.learnMore_button();
	}
	
	
	@Test(priority=14)
	public void verify_Form()
	{
		//logger.info("-------Scrolling till the form --------");
		 et=new EnterpriseTest(driver);
		et.Form();
	}
	

	@Test(priority=15)
	public void verify_first_name()
	{
		logger.info("-------Entering the firstName--------");
		 et=new EnterpriseTest(driver);
		et.name();
	}
	

	@Test(priority=16)
	public void verify_mail_phone()
	{
		//logger.info("-------Entering the lastName--------");
		 et=new EnterpriseTest(driver);
		et.mail_phone();
		
	}
	

	@Test(priority=17)
	public void verify_institute_type()
	{
		logger.info("-------Entering the instituteType--------");
		 et=new EnterpriseTest(driver);
		et.institute_type();
	}
	
//	@Test(priority=18)
//	public void verify_institute_name()
//	{
//		//logger.info("-------Entering the instituteName--------");
//		 et=new EnterpriseTest(driver);
//		et.institute_name();
//	}
	
	
	@Test(priority=19)
	public void verify_job_search()
	{
		logger.info("-------Entering the jobType--------");
		EnterpriseTest et=new EnterpriseTest(driver);
		et.job_search();
	}
	
//	@Test(priority=20)
//	public void verify_job_role()
//	{
//		logger.info("-------Entering the jobName--------");
//		 et=new EnterpriseTest(driver);
//		et.job_role();
//	}
//	
	
	
	@Test(priority=21)
	public void verify_department()
	{
		
		 et=new EnterpriseTest(driver);
		et.department();
	
	}
	
	@Test(priority=22)
	public void verify_describe()
	{
		
		 et=new EnterpriseTest(driver);
		et.describe();
	
	}
	
	
	
	@Test(priority=22)
	public void verify_Country()
	{
		
		 et=new EnterpriseTest(driver);
		et.Country();
	
	}
	
	@Test(priority=23)
	public void verify_State()
	{
	    et=new EnterpriseTest(driver);
		et.State();
	}
	
	@Test(priority=24)
	public void verify_Submit()
	{
	    et=new EnterpriseTest(driver);
	    et.Submit();
	}
	
	@Test(priority=25)
	public void verify_error_msg()
	{
	    et=new EnterpriseTest(driver);
	    et.error_msg();
	}
	
	
	

}
