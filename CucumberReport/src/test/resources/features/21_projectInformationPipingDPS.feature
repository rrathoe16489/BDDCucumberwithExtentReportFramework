#Author: RameshRathod
@projectInformation
Feature: Project Information as a DPS Piping Role 

  Scenario: Validate piping discipline
    Given validate when user login as a Piping Role
    #Then validate user select newly created project card
    When validate ProjectInformation Headeris Display
    When validate user click on piping section
    When validate piping section is Display
    #Then validate General Project Information section is Display
    #Then valdiate Project Scope section is Display
    #Then valdiate Technical Requirements section is Display
    #Then valdiate Project Controls section is Display
    #Then validate Electrical esction is Display
    #Then validate I&C section is Display
    #Then validate Process section is Display
    #Then validate Procurement section is Display
    #Then validate Structural section is Display
    
  Scenario Outline: checking the buttons operations
    When validate user updateORenter value in 2D Design Software Textbox "<stressAnalysisSoftware>" and then reset, save button is enable
    When Validate user click on ResetButton
    Then Validate ResetPage modal is popUp
    Then validate Reset message is display under pop Modal
    Then validate click on cancel button modal is disapear
    Then validate again user click on reset button
    Then validate user click on continue button
    Then validate reset and save button is disable and complete button is enabled 
    Then validate user updateORenter value in 2D Design Software Textbox "<stressAnalysisSoftware>" and then reset, save button is enable
    Then validate user click on save button then reset and save button is disable and complete button is enabled
 
    
     Examples: 
      | stressAnalysisSoftware |
      | Automation Test				 |
      
 Scenario Outline: Checking the functionality of Add additional Project Metadata Field
    When validate addField button is Display and click
    Then validate user enter value in fieldName textBox "<fieldName>"
    Then Validate user select value from the valueType dropDown
    Then Validate user click on the cancel button
    When validate addField button is Display and click
    Then validate user click on cross icon

    Examples:
      | fieldName |
      | Testing   |

  Scenario: Check when user save the blank add field form
    When validate addField button is Display and click
    Then validate user click on the save button
    Then validate filed validation eror message is display

  Scenario Outline: Check when user enter duplicate fieldName in Add Field Modal which is already used within ProjectInformation
    When validate user enter duplicate field name "<duplicatefieldname>"
    Then validate validation error message is display
    Then Validate user select Numeric value from dropdown
    Then validate UOMType and UOM option is display
    Then validate select value from the UOMType and UOM dropDown field
    Then Validate user enter fieldName "<userenterfieldvalue>"
    Then Validate user click on the Save button
    Then validate added field is display under BasicProjectData section
    Then validate pencil icon for edit is display

    Examples:
      | duplicatefieldname    | userenterfieldvalue |
      | 2D Design Software | Testing Automation  |

  
  Scenario Outline: Checking validation on Newly added numeric field
    When validate user enter alphabet in numeric field "<alphabetinnumeric>"
    Then Validate Validation error message is displays
    Then validate enter only numeric value "<onlyNumeric>"
    Then validate user click on save button
    Then validate user click on complete button
   	Then validate Top ProjectInformation header is completed with cheked mark
    Then closing the browser
    Examples:
      | alphabetinnumeric | onlyNumeric |
      | Numeric Testing   | 444         |
 
    