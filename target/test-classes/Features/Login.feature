#Author: Abhishek
#Feature: Login


Feature:Login to Vtiger application

 
  Scenario Outline: Login to vtiger application
    Given I want to Launch the browser
    And   Enter the URL
    When Login page should displayed
    And  Enter the username and password
    And click on login button
    Then validate if Home page is displayed or not

    
