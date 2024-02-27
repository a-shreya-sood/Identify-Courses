package stepDefinition;

import java.io.IOException;

import TestBase.BaseClass;
import TestCases.Tc_001_HolidayHomeTest;
import TestCases.Tc_002_LeaninglanguageTest;
import TestCases.Tc_003_EnterpriseTest;
import io.cucumber.java.en.*;

public class webDevelopmentPage
{
	BaseClass bc;
	 Tc_001_HolidayHomeTest tc1=new Tc_001_HolidayHomeTest();
	 Tc_002_LeaninglanguageTest tc2=new Tc_002_LeaninglanguageTest();
	 Tc_003_EnterpriseTest tc3=new Tc_003_EnterpriseTest();

	@Given("user is navigating to coursera site")
	public void user_is_navigating_to_coursera_site() throws IOException
	{
		BaseClass.getLogger().info("---------Opening of the Coursera Site-------");  
		bc=new BaseClass();
		bc.setUp("windows","chrome");
		                                    
	  
	}

	@When("User searches web development courses in input box")
	public void user_searches_web_development_courses_in_input_box() throws InterruptedException 
	{
		BaseClass.getLogger().info("---------Sending value into the textbox--------");
		 tc1=new Tc_001_HolidayHomeTest();
		tc1.verify_text_box();
	    
	}

	@When("user clicks on Beginners level & English Language")
	public void user_clicks_on_beginners_level_english_language() throws InterruptedException 
	{
		BaseClass.getLogger().info("----------Capturing the language and course level details-------");
		 tc1=new Tc_001_HolidayHomeTest();
		 tc1.verify_language();
		 tc1.verify_course_level();
		
	   
	}

	@Then("extract the course names, total learning hours & rating of two courses")
	public void extract_the_course_names_total_learning_hours_rating_of_two_courses() 
	{
		BaseClass.getLogger().info("---------Capturing course 1 and course 2 details--------");
		tc1.verify_course_box();
		tc1.verify_second_course_box();
	   
	}

	@Then("user is navigating back to the main page and searches Language learning in input box")
	 public void user_is_navigating_back_to_the_main_page_and_searches_language_learning_in_input_box() throws InterruptedException, IOException 
	 {
	     
		BaseClass.getLogger().info("---------Entering value into text box--------");
		 tc2 = new Tc_002_LeaninglanguageTest();
		 tc2.verify_input_box();
	    
	 }

	 @When("User clicks on Language and capture all the langugaes and close the dialog box")
	 public void user_clicks_on_language_and_capture_all_the_langugaes_close_the_dialog_box() throws InterruptedException 
	 {
	    
		 BaseClass.getLogger().info("---------Capturing all the languages and closing the dialog box--------");
		 tc2 = new Tc_002_LeaninglanguageTest();
		 tc2.verify_language();
		 tc2.verify_show_more();
		 tc2.verify_all_language();
	 }


	 @Then("user clicks on Beginners level and capture all the levels")
	 public void user_clicks_on_beginners_level_and_capture_all_the_levels() throws IOException 
	 {
		 BaseClass.getLogger().info("------------Capturing all the levels---------");
		 tc2 = new Tc_002_LeaninglanguageTest();
	     tc2.verify_all_levels();
	 }

	 @Then("user is navigating back to coursera site")
		public void user_is_navigating_back_to_coursera_site() throws IOException 
		{
		 BaseClass.getLogger().info("---------Navigating back to cousera site---------");
			
			tc3=new Tc_003_EnterpriseTest();
		    tc3.verify_coursera_button();
		}

		@When("User click on enterprise icon and click on what we offer icon")
		public void user_click_on_enterprise_icon_and_click_on_what_we_offer_icon() 
		{
			BaseClass.getLogger().info("---------Clicking on enterprise and what we offer icon--------");
			tc3=new Tc_003_EnterpriseTest();
		   tc3.verify_enterprise_button();
		   tc3.verify_whatWeOffer_button();
		}

		@When("scroll till learn more and click on it")
		public void scroll_till_learn_more_and_click_on_it()
		{
			BaseClass.getLogger().info("---------Scrolling till learn more and click on it--------");
			tc3=new Tc_003_EnterpriseTest();
			tc3.verify_learnMore_button();
		   
		}

		@Then("fill the form with details")
		public void fill_the_form_with_details() 
		{
			BaseClass.getLogger().info("---------Entering the details into the form--------");
			tc3=new Tc_003_EnterpriseTest();
			 tc3.verify_Form();
			 tc3.verify_first_name();
			 tc3.verify_mail_phone();
			 tc3.verify_institute_type();
			 tc3.verify_institute_name();
			 tc3.verify_job_search();
			 tc3.verify_department();
			 tc3.verify_describe();
			 tc3.verify_Country();
			 tc3.verify_State();
			 tc3.verify_Submit();
		   
		}

		@Then("capture the error message")
		public void capture_the_error_message() 
		{
			BaseClass.getLogger().info("---------Capturing the error message--------");
			tc3=new Tc_003_EnterpriseTest();
			tc3.verify_error_msg();
		  
		}



	
}
