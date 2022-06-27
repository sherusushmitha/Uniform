Feature: Uniform login page
Background: Background section
Given user is on homepage

 Scenario Outline: Login with valid credentials
    When User enter invalid Username "<username>" and Password "<password>"
    And User click on submit button
    Then Validation message appears
    When User click on Repots
    And User Check the start date,end date,Order status
    When User click on filter button
     
        Examples: 
    | username | password     |
    | admin    | Admin@123    |
    
    #Scenario: Login with valid credentials
    #Given user is on homepage
    #When User enter valid credentials
    #And User click on submit button
    #Then User navigates to home page