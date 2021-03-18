#Author: RameshRathod
Feature: Reference Library as a Equipment role

  Scenario Outline: Validate ProjectSpecificDocumentsEquipment sections
    Given validate user login as a Equipment Role
    #Then validate user select newly created project card
    Then validate ReferenceLibraryHeader is display and click on header Link
    Then validate ProjectSpecificDocumentsEquipment section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    Then Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click
    When user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsEquipmentsection is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ClientDocumentManagementSection sections
    When validate user click on ClientDocumentsEquipment SubSection
    When validate user click on AddReference Button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to ClientDocumentsEquipment Section is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ProceduresEquipment section
    Then validate ProceduresEquipment section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save and complete button and then edit button and checked mark next to ProcedureEquipmentsection is display

    Examples: 
      | name            | ID  | link                    |
      | Automation Name | 123 | https://www.google.com/ |

  Scenario Outline: Validate calculationTemplatesEquipment sections
    Then validate user click on calculationTemplatesEquipment SubSection
    When validate user click on AddReference Button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to calculationTemplatesEquipment Section is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate typicalDetailsEquipment sections
    Then validate user click on typicalDetailsEquipment SubSection
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
    Then validate check mark next to typicalDetailsEquipment Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate ManualsHandbooksEquipment sections
    Then validate user click on ManualsHandbooksEquipment SubSection
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
    Then validate check mark next to ManualsHandbooksEquipment Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate trainingEquipment sections
    Then validate user click on trainingEquipment SubSection
    When validate user click on AddReference Button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to trainingEquipment Section is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate otherEquipment sections
    Then validate user click on otherEquipment SubSection
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
    Then validate check mark next to otherEquipment Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate checklistsEquipment sections
    Then validate user click on checklistsEquipment SubSection
    When validate user click on AddReference Button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to checklistsEquipment Section is display
    Then validate Top ReferenceLibrary header is completed with cheked mark
    Then closing the browser

   Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |
