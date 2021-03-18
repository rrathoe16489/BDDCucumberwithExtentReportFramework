#Author: RameshRathod
@WBSInformationDPS
Feature: WBS Information as a IandC discipline Role

  Scenario: Validate Instrument Type List Section
    Given validate user login as a IandC Role
    Then validate user select newly created project card
    When validate WBSInformationHeader is Display and click on header as a Piping DPS
    Then validate viewing data that needs to be updated, I can click on Instrument Type List to select the data and changes have been made on the screen
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
    When validate a check next to the Instrument Type List Section label will display in left panel

  Scenario: Validate Control System List Section
    Then validate viewing data that needs to be updated, I can click on Control System List to select the data and changes have been made on the screen
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
    When validate a check next to the Control System List Section label will display in left panel

  Scenario Outline: Validate Control Panel List Section
    Then validate viewing data that needs to be updated, I can click on Control Panel List to select the data and changes have been made on the screen "<controlPanelNumber>","<controlPanelName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
    When validate a check next to the Control Panel List Section label will display in left panel

    Examples: 
      | controlPanelNumber | controlPanelName |
      |                123 | ControlName      |

  Scenario Outline: Validate Control Room List Section
    Then validate viewing data that needs to be updated, I can click on Control Room List to select the data and changes have been made on the screen "<controlRoomNumber>","<controlRoomName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    When validate a check next to the Control Room List Section label will display in left panel
    Then validate Top header is completed with cheked mark
    Then closing the browser

    Examples: 
      | controlRoomNumber | controlRoomName |
      |               123 | ControlName     |
