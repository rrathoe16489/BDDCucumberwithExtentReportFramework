#Author: RameshRathod
@WBSInformation
Feature: WBS Information as a PLI role

  Scenario: Validate As a PLI see the sections titles on the left side: Purchase Specification List, CWA List, Module List, MechanicalEquipmentList.
    Given validate when user login as a PLI role
    #Then validate user select newly created project card
    Then validate WBSInformationHeader is Display and click on header
    Then validate CWAList section text is Display
    Then validate ModuleList section text is Display
    Then validate PurchaseSpecificationList Section text is Display
    
  Scenario: Validate CWA List two columns will display: CWA number, CWA name
    When user click on CWAList SubSection
    Then validate CWAList HeaderTitle is Display
    Then validate CWA number column is display
    Then validate CWA name column is display
    Then validate addRow Icon is Display at bottom

  Scenario Outline: Validate CWAList SubSection - User are able to Add new Row
    When Validate user click on CWAList SubSection
    Then validate user click on add row button and user enter the CWA Number and CWA Name "<CWANumberTextBox>","<CWANameTextBox>"
    Then Validate save button is enabled
    Then Validate user click on the save button
    Then validate save button is disabled
    Then validate complete button is enabled
    Then validate user click on complete button
    Examples:
      | CWANumberTextBox | CWANameTextBox | 
      | 1234             | Test123        |

  Scenario: Validate ModuleList three columns will display: Module number, module name, CWA Number/name
    When user click on ModuleList SubSection
    Then validate ModuleList HeaderTitle is Display
    Then validate Module number column is display
    Then validate module name column is display
    Then validate CWA Numbersname column is display
    Then validate addRow Icon is Display at bottom

  Scenario Outline: Validate ModuleList SubSection - User are able to Add new Row
    When Validate user click on ModuleList SubSection
    Then validate user click on add row button and user enter the Modulenumber and modulename and CWA Numbername "<moduleNumberColumnTextBox>","<moduleNameColumnTextBox>"
    Then Validate save button is enabled
    Then Validate user click on the save button
    Then validate save button is disabled
    Then validate complete button is enabled
    Then validate user click on complete button
    Examples:
      | moduleNumberColumnTextBox | moduleNameColumnTextBox | cwaNumberNameDropDown |
      | 1234M                     | ModuleTest							| 1234Test123						| 


  Scenario: Validate Purchase Specification List three columns will display: Purchase Specification number, purchase specification name, Discipline
    When user click on PurchaseSpecificationList SubSection
    Then validate PurchaseSpecificationList HeaderTitle is Display
    Then validate PurchaseSpecificationNumber column is display
    Then validate PurchaseSpecificationName column is display
    Then validate Discipline column is display
    Then validate addRow Icon is Display at bottom

  Scenario: Validate PurchaseSpecificationList - user are able to Add new Row
    When Validate user click on PurchaseSpecificationList SubSection
    Then validate user click on addRow button and user enter the value in PurchaseSpecificationNumber and PurchaseSpecificationName and Discipline column
   	Then Validate save button is enabled
    Then Validate user click on the save button
    Then validate save button is disabled
    Then validate complete button is enabled
    Then validate user click on complete button
    
 Scenario Outline: Validate Process Area List Section - User are able to Add new Row
    When Validate user click on ProcessArea List SubSection
    Then validate user click on addRow button and user enter the value in Process Area ID and Process Area Name "<processAreaID>","<processAreaName>"
   	Then Validate user click on the save button
    Then validate user click on complete button
    #When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
		Then validate a check next to the ProcessArea List Section label will display in left panel
		Then validate Top header is completed with cheked mark 
    Then closing the browser
  Examples:
      | processAreaID | processAreaName |
  		| 123					  | processName			|