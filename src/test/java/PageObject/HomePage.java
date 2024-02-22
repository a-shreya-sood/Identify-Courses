package PageObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage 
{
	
	public String parent;
	public String child;
	public Set<String> windids;
	List<String> wins;
	
 Actions act=new Actions(driver);
 
	public HomePage(WebDriver driver)
	{
		super(driver);
		
	}
	
   
	//xpath of inut box
	@FindBy(xpath="//input[@placeholder='What do you want to learn?']")
	WebElement textBox;
	
	
	//xpath of search button
	@FindBy(xpath="(//div[@class='magnifier-wrapper'])[2]")
	WebElement searchButton;
			
	//xpath to\
	//@FindBy(xpath="(//span[text()='English'])[2]")
	@FindBy(xpath="(//div[@class='cds-checkboxAndRadio-labelText'])[6]")
	WebElement lang;
	
	//xpath to select course type
	@FindBy(xpath="//span[text()='Beginner']")
	WebElement courseLevel;
	
	
	//xpath of courseHeading of 1st course
	@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-1sktkql'])[1]")
	WebElement courseBox1;
	
	//xpath of courseHeading
	@FindBy(xpath="//div[@class=\"css-1psltl0\"]//h1")
	WebElement courseHeading1;

	
	//xpath of courseduration
	@FindBy(xpath="(//div[@class=\"cds-119 cds-Typography-base css-h1jogs cds-121\"])[8]")
	WebElement courseDuration1;
	
	//xpath of course rating
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[1]/div[1]")
	WebElement courseRating1;
	
	
	//xpath of second course box
	@FindBy(xpath="(//*[@class=\"cds-ProductCard-base cds-ProductCard-grid css-1gwppjr\"])[2]")
	WebElement courseBox2;
	
	//xpath of 2nd course heading
	@FindBy(xpath="//*[@class=\"cds-119 cds-Typography-base css-1xy8ceb cds-121\"]")
	WebElement courseHeading2;
	
	
	//xpath of 2nd course duration
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[3]/div[1]")
	WebElement courseDuration2;
	
	//xpath fo 2nd course rating
	@FindBy(xpath="//*[@id='rendered-content']/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[1]/div[1]")
	WebElement courseRating2;
	
	//action for textBox
	public void text_box() throws InterruptedException
	{
		textBox.sendKeys("web development");
		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(2000);
		
	}
	
	
	//action to select langauge
	public void language() throws InterruptedException
	{
		try
		{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();",lang);
		js.executeScript("arguments[0].click();",lang);
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	//action to select level of course
	public void course_level()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",courseLevel);
		js.executeScript("arguments[0].click();",courseLevel);
	
	}
	
	//action to select 1st course box
	public void course_box_first()
	{

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",courseBox1);
		js.executeScript("arguments[0].click();",courseBox1);
	
	}
	
	//action to get course header
	public String  course_header()
	{
		try
		{
		String heading1=courseHeading1.getText();
		System.out.println("Course Name:"+heading1);
		return heading1;
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}

	}
	
	//action to get course duration
	public String course_duration()
	{
		try
		{
		String Duration1=courseDuration1.getText();
		System.out.println("Course Duration:"+Duration1);
		return Duration1;
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	
	//action for course rating
	public String course_rating()
	{
		try
		{
		String rating1=courseRating1.getText();
		System.out.println("Course Rating:"+rating1);
		return rating1;
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
		
	}
	
	//action for second course box
	public void second_course_box()
	{
		try
		{
			courseBox2.click();		
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		
	}
	
	//action for course heading 2
	public String second_course_heading()
	{
		try
		{
		String heading2=courseHeading2.getText();
		System.out.println("The second course heading:"+heading2);
		return heading2;
		
		}
		catch(Exception e)
		{
			 return(e.getMessage());
		}
		
	}
	
	
	//action for course duration 2
  public String second_course_duration()
  {
	  try
	  {
	  String duration2=courseDuration2.getText();
	  System.out.println("The second course duration:"+duration2);
	  return duration2;
      }
	  catch(Exception e)
		{
		  return(e.getMessage());
		}
  }
  
  //action for course rating 2
  public String second_course_rating()
  {
	  try
	 {
	  String rating2=courseRating2.getText();
	  System.out.println("The second course rating:"+rating2);
	  return rating2;
     }
	  catch(Exception e)
		{
		  return(e.getMessage());
		}
  }
  
  public void childPage(WebDriver driver) {
	  
	    windids = driver.getWindowHandles();
	    wins = new ArrayList<>(windids);
	    parent = wins.get(0);
	    child = wins.get(1);
	    driver.switchTo().window(child);
  }

  public void Parentpage(WebDriver driver) {
	
	  	driver.close();
		driver.switchTo().window(parent);
	  
  }
	
	
	

	
	

}
