#Author: RameshRathod
@ReferenceLibrary
Feature: Reference Library as a PLI Role

  Scenario Outline: Validate ProjectSpecificDocument sections
    Given validate when user login as a PLI role
    Then validate user select newly created project card
    Then validate ReferenceLibraryHeader is display and click on header Link
    Then validate ProjectSpecificDocument section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    Then Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click
    When user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then Validate user click on the save and complete button and then edit button and checked mark next to section is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ClientDocumentManagementSection sections
    When validate user click on ClientDocumentsManagement SubSection
    When validate user click on AddReference Button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to ClientDocumentManagement Section is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ProcedureManagement section
    Then validate ProcedureManagement section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save and complete button and then edit button and checked mark next to ProcedureManagementsection is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate manualsHandbooksManagement sections
    Then validate user click on manualsHandbooksManagement SubSection
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to manualsHandbooksManagement Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate OtherManagement sections
    Then validate user click on OtherManagement SubSection
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to OtherManagement Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate checklistsManagement sections
    Then validate user click on checklistsManagement SubSection
    When Validate user when moving the slider to on position
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    When user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to checklistsManagement Section is display
    Then validate Top ReferenceLibrary header is completed with cheked mark
		Then closing the browser
    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |
