package TestCases;

import java.io.IOException;

import org.testng.annotations.*;

import PageObject.LanguageLearningpage;
import TestBase.BaseClass;
import Utilities.excelUtility;

public class Tc_002_LeaninglanguageTest extends BaseClass
{
	LanguageLearningpage ll;
  @Test(priority=6)
  public void verify_input_box() throws InterruptedException
  {
	  logger.info("-------Entering data into input box--------");	
	  ll=new LanguageLearningpage(driver);
			 ll.input_box();
  }	 
		
   @Test(priority=7)
   public void verify_language()
   {
	   logger.info("--------Scrolling till the language icon-------");	
			ll.language();
   }
			 
			 
	@Test(priority=8)
	public void verify_show_more() throws InterruptedException
	{
		  logger.info("-------Scrolling till show more--------");	
			 ll.show_more();
	}
	
	
	@Test(priority=9)
	public void verify_all_language()
	{
		 logger.info("-------Capturing all the languages--------");	
			
//		 try
//		 {
//		
//		 String[] language=ll.all_language();
//		 int row=1;
//		 for(int i=0;i<language.length;i++)
//		 {
//		 excelUtility.write("Sheet2",0,0,"Languages");
//		 excelUtility.write("Sheet2",row,0,language[i]);
//		 row++;
//		 }
//	
//		 }
//		 catch(Exception e)
//		 {
//			 //
//		 }
//		
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
		 logger.info("-------Capturing all the levels--------");	
			   
//		 try
//		 {
//		String[]lev=ll.Levels();
//		int row=1;
//		for(int i=0;i<lev.length;i++)
//		{ 
//		 excelUtility.write("Sheet2",0,1,"Levels");
//		 excelUtility.write("Sheet2",row,1,lev[i]);
//		 row++;
//		}
//		}
//		 catch(Exception e)
//		 {
//			 //
//		 }
		 ll.Levels();
		 
    }
	
}
