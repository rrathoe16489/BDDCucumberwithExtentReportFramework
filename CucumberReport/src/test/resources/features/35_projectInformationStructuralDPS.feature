#Author: RameshRathod
@projectInformation
Feature: Project Information as a DPS Structural Role

  Scenario Outline: Validate Structural Section
    Given validate user login as a Structural Role
    #Then validate user select newly created project card
    When validate ProjectInformation Headeris Display
    When validate user updateORenter value under Structural section "<structuralModeling>","<seismicSds>"
    When validate addField button is Display and click
    Then validate user enter value in fieldName textBox "<fieldName>"
    Then Validate user select value from the valueType dropDown
    Then Validate user click on the Save button
    When validate user enter alphabet in numeric field "<alphabetinnumeric>"
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to Structural section is display
    Then validate Top ProjectInformation header is completed with cheked mark
    Then closing the browser

    Examples: 
      | structuralModeling | seismicSds | fieldName          | alphabetinnumeric |
      | TestAuto           |         12 | Testing Automation | Testing           |
