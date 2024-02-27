Feature: Title of your feature

  @sanity @regression
  Scenario: Capturing course details
    Given user is navigating to coursera site
    When User searches web development courses in input box
    And user clicks on Beginners level & English Language
    Then extract the course names, total learning hours & rating of two courses
    And user is navigating back to the main page and searches Language learning in input box
    When User clicks on Language and capture all the langugaes and close the dialog box
    Then user clicks on Beginners level and capture all the levels
    And user is navigating back to coursera site
    When User click on enterprise icon and click on what we offer icon
    And scroll till learn more and click on it
    Then fill the form with details
    And capture the error message
