package PageObject;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.excelUtility;

public class LanguageLearningpage extends BasePage
{
	 Actions act;
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 
	public LanguageLearningpage(WebDriver driver) 
	{
		super(driver);
	
	}
	
	//xath of search input box
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement inputBox;

	//xpath till the langauge
	@FindBy(xpath="//div[@class=\"cds-ContextualHelp-label\"]")
	WebElement lang;
	
	//xpath of show more
	@FindBy(xpath="(//span[text()=\"Show more\"])[2]")
	WebElement showMore;
	
	
	//xpath  of all languages
	@FindBy(xpath="//div[@id=\"checkbox-group\"]/div")
	List<WebElement> allLanguages;
	
	
	//xpath of close button
	@FindBy(xpath="//div[@class=\"css-jyd7rb\"]//button")
	WebElement close;
	
	//xpath for all difficultylevels
	@FindBy(xpath="//div[@data-testid='search-filter-group-Level']//div/span/span[text()]")
	List<WebElement>levels;
	
	
	//action for input box
	public void input_box() throws InterruptedException
	{
		try
		{
		
		wait.until(ExpectedConditions.visibilityOfAllElements(inputBox));
		inputBox.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		inputBox.sendKeys(Keys.DELETE);
		//inputBox.clear();
		inputBox.sendKeys("Language learning");
		act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

	  }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//action against lang is visible
	public void language()
	{
		try
		{
		wait.until(ExpectedConditions.visibilityOfAllElements(lang));
		act.moveToElement(lang).perform();
		//js.executeAsyncScript("arguments[0].scrollIntoView();",lang);
//		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//action for show more
	public void show_more() throws InterruptedException
	{
		try
		{
		wait.until(ExpectedConditions.visibilityOfAllElements(showMore));
		act.moveToElement(showMore).click().perform();
		//js.executeAsyncScript("arguments[0].click();",showMore);
		}
		 catch(Exception e)
		{
			 e.printStackTrace();
		}
		
	}
	
	//action for all languages
	public void all_language() throws IOException
	{
		System.out.println("Count of the languages:"+allLanguages.size());
		System.out.println("All the languages are:");
		String lang="";
		int row=1;
		for(int i=0;i<allLanguages.size();i++)
		{
			 lang = allLanguages.get(i).getText();
			excelUtility.write("Sheet2",0,0,"Languages");
			excelUtility.write("Sheet2",row,0,lang);
			System.out.println(lang);
			row++;
		}
	

	}
		
		//action for closing 
		public void closingBox()
		{
			act.keyDown(Keys.ENTER).perform();
		
		}
		
		//for difficulty levels
		public void Levels() throws IOException
		{
			String data="";
			System.out.println("All the levels:"+levels.size());
			int row=1;
			for(WebElement level : levels)
			{
				 data=level.getText();
				System.out.println(data);
				excelUtility.write("Sheet2",0,2,"Languages");
				excelUtility.write("Sheet2",row,2,data);
				row++;
			}
		}
	
	}	

