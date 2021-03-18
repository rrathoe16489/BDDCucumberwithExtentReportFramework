#Author: RameshRathod
@projectInformation
Feature: Project Information as a DPS IandC Role

  Scenario Outline: Validate IandC Section
    Given validate user login as a IandC Role
    Then validate user select newly created project card
    When validate ProjectInformation Headeris Display
    When validate user updateORenter value under IandCSoftware and Design Basis section "<instrumentData>"
    When validate addField button is Display and click
    Then validate user enter value in fieldName textBox "<fieldName>"
    Then Validate user select value from the valueType dropDown
    Then Validate user click on the Save button
    When validate user enter alphabet in numeric field "<alphabetinnumeric>"
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to IandC section is display
    Then validate Top ProjectInformation header is completed with cheked mark
    Then closing the browser

    Examples: 
      | instrumentData | fieldName          | alphabetinnumeric |
      | TestAuto       | Testing Automation | Testing           |
