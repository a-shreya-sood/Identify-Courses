package TestCases;

import java.io.IOException;

import org.testng.annotations.*;

import PageObject.LanguageLearningpage;
import TestBase.BaseClass;
import Utilities.excelUtility;

public class Tc_002_LeaninglanguageTest extends BaseClass
{
	static LanguageLearningpage ll;
  @Test(priority=6)
  public void verify_input_box() throws InterruptedException
  {
	  BaseClass.getLogger().info("-------Entering data into input box--------");	
	  ll=new LanguageLearningpage(driver);
			ll.input_box();
  }	 
		
   @Test(priority=7)
   public void verify_language()
   {
	   BaseClass.getLogger().info("--------Scrolling till the language icon-------");	
			ll.language();
   }
			 
			 
	@Test(priority=8)
	public void verify_show_more() throws InterruptedException
	{
		BaseClass.getLogger().info("-------Scrolling till show more--------");	
			 ll.show_more();
	}
	
	
	@Test(priority=9)
	public void verify_all_language()
	{
		BaseClass.getLogger().info("-------Capturing all the languages--------");	
				
		 try {
			ll.all_language();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 ll.closingBox();
		
  }
	@Test(priority=10)
	public void verify_all_levels() throws IOException
	{
		BaseClass.getLogger().info("-------Capturing all the levels--------");	
			   

		 ll.Levels();
		 
    }
	
}
