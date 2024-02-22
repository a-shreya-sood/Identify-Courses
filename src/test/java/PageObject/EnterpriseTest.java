package PageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.excelUtility;


public class EnterpriseTest extends BasePage
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Select s;
	
	public EnterpriseTest(WebDriver driver)
	{
		super(driver);
		
	}
	
	//xpath of coursera
	@FindBy(xpath="//div[@class='css-19qryfx']/img")
	WebElement coursera;

	
	//xpath of enterprise button
	@FindBy(xpath="//a[text()='For Enterprise']")
	WebElement enterpriseButton;
	
	
	
	//xpath for what we offer 
	@FindBy(xpath="//a[@href='https://about.coursera.org/how-coursera-works/']")
	WebElement whatWeOffer;
	

	//xpath for scroll till coursera for campus
	@FindBy(xpath="//*[@id='falseCourseraForCampus']")
	WebElement scroll;
	
	
	//xpath for learn more
	@FindBy(xpath="(//span[text()='Learn more'])[2]")
	WebElement learnMore;
	
	
	//xpath of form
	@FindBy(xpath="(//*[@class='cds-119 css-13rt5ey cds-121'])[4]")
	WebElement form;
	
	
	//xpath of firstname
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement firstName;
	
	//xpath for lastname
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement lastName;
	
	//xpath for mail address
	@FindBy(xpath="//input[@placeholder='Work Email Address']")
	WebElement Mail;
	
	//xpath for phone number
	@FindBy(xpath="//input[@placeholder='Country Code + Phone Number']")
	WebElement phoneNumber;
	
	//xpath for
	@FindBy(id="Institution_Type__c")
	WebElement selectInstitute;
	
//	//xpath for select institue
//	@FindBy(xpath="//select[@id='Institution_Type__c']/option[2]")
//	WebElement institueType;
	
	
	//xpath for instituion name
	@FindBy(id="Company")
	WebElement institueName;
	
	//xpath fo job search
	@FindBy(id="Title")
	WebElement jobSearch;
	
	
	//xpath for describing
	@FindBy(id="Department")
	WebElement department;
	
	
	//xpath of describe
	@FindBy(id="What_the_lead_asked_for_on_the_website__c")
	WebElement describe;
		
	
	//xpath for country
	@FindBy(id="Country")
	WebElement country;
	
	
	//xpath of state
	@FindBy(id="State")
	WebElement state;
	
	//xpath for submit button
	@FindBy(xpath="//*[@class='mktoButton']")
	WebElement submit;
	
	//xpath of error message
	@FindBy(id="ValidMsgEmail")
	WebElement errorMsg;
	
	String[] data=excelUtility.read();
	
	//action for coursera
	public void coursera_button()
	{
		coursera.click();	
	}
	
	
	//action for enterprise button
	public void enterprise_button()
	{
		js.executeScript("arguments[0].scrollIntoView();",enterpriseButton);
		js.executeScript("arguments[0].click();",enterpriseButton);
		
	}
	
	
	//action for whatWeOffer button
	public void whatWeOffer_button()
	{
		js.executeScript("arguments[0].scrollIntoView();",whatWeOffer);
		js.executeScript("arguments[0].click();",whatWeOffer);
	
	}
	
	//action for learnMore button
	public void learnMore_button()
	{
		
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		js.executeScript("arguments[0].click();",learnMore);
		
	}
	
	//action till form
	public void Form()
	{
		
		js.executeScript("arguments[0].scrollIntoView();",form);
	}
	
	//action for firstName
	public void name()
	{
		firstName.sendKeys(data[0]);
		lastName.sendKeys(data[1]);
	}
	
	//action for mail and number
	public void mail_phone()
	{
		Mail.sendKeys(data[2]);
		phoneNumber.sendKeys(data[3]);
		
	}
	
	//action for institue type
	public void institute_type()
	{

		s=new Select(selectInstitute);
		//s.selectByValue("University/4 Year College");	
		s.selectByValue(data[4]);		
	}
	
	
	//action for institue name
	public void institute_name()
	{
		//institueName.sendKeys("Cognizant");
		institueName.sendKeys(data[5]);
	}
	
	//action for search jobRole
	public void job_search()
	{
		//jobSearch.click();
		s=new Select(jobSearch);
		//s.selectByValue("President/Provost");
		s.selectByValue(data[6]);
		
	}
	
	//action for department
	public void department()
	{
		
		//department.click();
		s=new Select(department);
		//s.selectByValue("Academic Affairs");
		s.selectByValue(data[7]);
		
		
	}
//	
	//xpath for describe
	public void describe()
	{
		//describe.click();
		s=new Select(describe);
//		s.selectByValue("Learner Support");
		s.selectByValue(data[8]);
		
	}
	
	
	//action to click on country
	public void Country()
	{
		//country.click();
		s=new Select(country);
		s.selectByValue(data[9]);
		
	}
	
	//action for state
	public void State()
	{
		//state.click();
		s=new Select(state);
		s.selectByValue(data[10]);
		
	}
	
	//action for submit button
	public void Submit()
	{
		js.executeScript("arguments[0].click();",submit);
		
	}
	
	//action for error msg
	public void error_msg()
	{
		String msg=errorMsg.getText();
		System.out.println("The error message is:"+msg);
	}
}



