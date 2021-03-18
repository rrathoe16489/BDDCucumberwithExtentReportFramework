#Author: RameshRathod
@WBSInformationDPS
Feature: WBS Information as a Electrical discipline Role

  Scenario Outline: Validate Electrical Equipment List Section
    Given validate user login as a Electrical Role
    #Then validate user select newly created project card
    When validate WBSInformationHeader is Display and click on header as a Piping DPS
    Then validate viewing data that needs to be updated, I can click on Electrical Equipment List to select the data and changes have been made on the screen "<eleEquipNumber>","<eleEquipName>","<eleEquipType>","<voltage>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
    When validate a check next to the Electrical Equipment List Section label will display in left panel

    Examples: 
      | eleEquipNumber | eleEquipName | eleEquipType | voltage |
      | EquipNumber    | EquipName    | EquipType    |      12 |

  Scenario Outline: Validate Powerhouse List Section
    Then validate viewing data that needs to be updated, I can click on Powerhouse List to select the data and changes have been made on the screen "<powerHouseTag>","<powerHouseName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
    When validate a check next to the Powerhouse List Section label will display in left panel

    Examples: 
      | powerHouseTag | powerHouseName |
      | powerTagTest  | powerNameTest  |

  Scenario Outline: Validate Electrical Systems List Section
    Then validate viewing data that needs to be updated, I can click on Electrical Systems List to select the data and changes have been made on the screen "<electricalSystemName>"
    Then Validate user click on the save button
    Then validate user click on complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    When validate a check next to the Electrical Systems List Section label will display in left panel
    Then validate Top header is completed with cheked mark
    Then closing the browser

    Examples: 
      | electricalSystemName |
      | TestName             |
