#Author: RameshRathod
@wbsInformation
Feature: WBS Information as a DPS Equipment Role

Scenario Outline: Validate Mechenical Equipment List
		Given validate user login as a Equipment Role
    #Then validate user select newly created project card
    When validate WBSInformationHeader is Display and click on header as a Piping DPS
    Then validate viewing data that needs to be updated, I can click on Mechenical Equipment List and clicking on addOrupdate button to add the data and changes have been made on the screen the Save button enable "<equipmentTag>","<equipmentTagName>"
    Then Validate user click on the save button
   	Then validate user click on complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
		When validate a check next to the Mechenical Equipment List Section label will display in left panel
		Then validate Top header is completed with cheked mark 
    Then closing the browser
  Examples:
      | equipmentTag | equipmentTagName |
      | AutoTag      | Autoequipment    |