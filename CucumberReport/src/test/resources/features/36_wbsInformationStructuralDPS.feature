#Author: RameshRathod
@WBSInformationDPS
Feature: WBS Information as a Structural discipline Role

  Scenario Outline: Validate Foundation List Section
    Given validate user login as a Structural Role
    #Then validate user select newly created project card
    When validate WBSInformationHeader is Display and click on header as a Piping DPS
    Then validate viewing data that needs to be updated, I can click on Foundation List to addOrupdate the data and changes have been made on the screen the Save button enable "<foundationTag>","<foundationName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
    When validate a check next to the Foundation List Section label will display in left panel

    Examples: 
      | foundationTag   | foundationName   |
      | FAutomation Tag | FAutomation Name |

  Scenario Outline: Validate Structural List Section
    Then validate viewing data that needs to be updated, I can click on Structural List to addOrupdate the data and changes have been made on the screen the Save button enable "<structureTag>","<structureName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    When validate a check next to the Structural List Section label will display in left panel
    Then validate Top header is completed with cheked mark
    Then closing the browser

    Examples: 
      | structureTag    | structureName    |
      | SAutomation Tag | SAutomation Name |
