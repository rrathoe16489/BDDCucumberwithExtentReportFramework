#Author: RameshRathod
@wbsInformation
Feature: WBS Information as a DPS Process Role

Scenario Outline: Validate Philosophy Document List Section
		Given validate user login as a Process Role
    #Then validate user select newly created project card
    When validate WBSInformationHeader is Display and click on header as a Piping DPS
    Then validate viewing data that needs to be updated, I can click on Philosophy Document List and clicking on addOrupdate button to add the data and changes have been made on the screen the Save button enable "<philosophyDocumentnumber>","<philosophyDocumentName>"
    Then Validate user click on the save button
   	Then validate user click on complete button
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
		When validate a check next to the Philosophy Document List Section label will display in left panel
		
    Examples:
      | philosophyDocumentnumber | philosophyDocumentName |
      | 6666                     | Automation Philo       |
      
Scenario Outline: Validate Study List Section
		When validate viewing data that needs to be updated, I can click on Study List and clicking on addOrupdate button to add the data and changes have been made on the screen the Save button enable "<studyNumber>","<studyName>"
    Then Validate user click on the save button
   	Then validate user click on complete button
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed
		When validate a check next to the Study List Section label will display in left panel
		
    Examples:
      | studyNumber | studyName 			 |
      | 666         | Automation study |
      
 Scenario Outline: Validate SystemFluid List Section
		When validate viewing data that needs to be updated, I can click on SystemFluid List and clicking on addOrupdate button to add the data and changes have been made on the screen the Save button enable "<fluidName>"
    Then Validate user click on the save button
   	Then validate user click on complete button
   	When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
		Then validate a check next to the SystemFluid List Section label will display in left panel
		Then validate Top header is completed with cheked mark 
		Then closing the browser
    Examples:
      | fluidName | 
      | AutoFliud | 
      