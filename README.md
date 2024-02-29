   # Identify-Courses #
 ## Problem Statement : Identify Courses

### Detailed Description: Hackath Ideas

1. Search for web development courses for Beginners level & English Language and extract the course names, total learning hours & rating for first 2 courses
2. Look for Language Learning; Extract all the languages and different levels with its total count & display them
3. In Home page, go to "For Enterprise"; Look into Courses for Campus under Product; Fill the  "Ready to transform" form with any one input invalid (example: email); Capture the error message & display

   
### Key Automation Scope

* Handling different browser windows, search option
* Extract multiple drop down list items & store in collections
* Navigating back to home page
* Filling form (in different objects in web page)
* Capture warning message
* Scrolling down in web page


###  Data source :
https://www.coursera.org/

### Technology used:
* Java(Maven project)
* Selenium 4.17.0
* TestNG 7.9.0
* Eclipse 2023-12(4.30.0)
* Extend Reports 5.1.1
* Apache POI
* Cucumber
* Jenkins
* Selenium Grid
* Git & GitHub

### Folder Structure
This Project uses Page Object Model:

![Pom screenshot](https://github.com/a-shreya-sood/Identify-Courses/assets/96197352/916a5f03-db54-4614-bddd-4480525b2ceb)

### POM- Page Object Model
#### src/test/java -
*  Page object package - This package contains page elements and methods for all pages in the apllication.
*  Step definition package - This package contains step definition and hooks file for cucumber.
*  TestBase package - contains BaseClass file which have setup and tearDown methods.
*  TestCases package - contains all the required test cases for the application.
*  testRunner package - contains testRun file for running testcases through cucumber.
*  Utilities package - contains Excel and ExtentReport files for TestNG.

#### src/resources/java -
* config.Proerties - contains aplication URL and execution environment details.
* extent.Properties - contains  ExtentReport files for cucumber.
*  log4j2.xml - contains file for generating logs.

#### Features folder -
 contains feature file which have scenarios for cucumber. 

### Reporting :
The framework gives report in three ways:
* Log - In file automation.log
* A testng report - Which is generated using extent reports, under the folder reports.
* A cucumber report - which is generated using extent reports, under the folder CucumberExtentReports.
 
### Test Cases :
* Tc_001_HolidayHomeTest.java
* Tc_002_LearningLanguageTest.java
* Tc_003_EnterpriseTest.java

### How to run the project -
* Through TestNG_- run the file through testng.xml or master.xml(for multiple browser execution ) as TestNG Suite.
* Through Cucumber - run the file through TestRunner class as JUnit Test.
* Through Jenkins -
   run the project in command prompt using following commands :java -jar jenkins.war
* Through Selenium grid -
  Firtsly set the environment as remote in extent.properties 
  and then run the project in command prompt using following commands: java -jar "selenium file name" standalone
* Through command prompt -
  Firstly set the path of the project - cd/path of file.
  and then run the project in command prompt using following commands : mvn test


  ### Author
  Shriya Sood Kashyap
