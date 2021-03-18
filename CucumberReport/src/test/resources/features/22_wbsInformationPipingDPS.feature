#Author: RameshRathod
@WBSInformationDPS
Feature: WBS Information as a Piping discipline Role

  Scenario Outline: validate As a DPS assigned to Piping discipline I will see sections:  Pipe Specification List, Tie-in Priority List
    Given validate when user login as a Piping Role
    #Then validate user select newly created project card
    When validate WBSInformationHeader is Display and click on header as a Piping DPS
    When validate As a DPS assigned to Piping discipline I will see sections:  Pipe Specification List, Tie-in Priority List
    Then validate viewing data that needs to be updated, I can click on Pipe Specification List, Tie-in Priority List to addOrupdate the data and changes have been made on the screen the Save button enable. "<pipeSpecificationNumber>","<pipeSpecificationMaterial>","<pipeSpecificationClass>","<tieInPriority>","<pipeSpecificationNumber1>","<pipeSpecificationMaterial1>","<pipeSpecificationClass1>","<tieInPriority1>"
    #Then validate user delete the newly added row in both section
    Then validate saving the changed data I will see the updated data and the Save button will be disabled and complete button Enabled
    When validate once complete button clicked then Reset, Save and Complete buttons will be replaced with an Edit button and validate Section is completed, a check next to the Section label will display in left panel side
	  When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
		Then validate Top header is completed with cheked mark 
   	Then closing the browser
    Examples:
      | pipeSpecificationNumber | pipeSpecificationMaterial | pipeSpecificationClass | pipeSpecificationNumber1 | pipeSpecificationMaterial1 | pipeSpecificationClass1 | tieInPriority | tieInPriority1 |
      | 66666                   | Automation Piping         | Test Class             | 66646                    | Automation1 Piping         | Test1 Class             | 6666          | 664           |
      
