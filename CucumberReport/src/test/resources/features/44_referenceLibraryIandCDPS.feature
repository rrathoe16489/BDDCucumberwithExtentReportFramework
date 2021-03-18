#Author: RameshRathod
Feature: Reference Library as a I&C role

  Scenario Outline: Validate ProjectSpecificDocumentsI&C sections
    Given validate user login as a IandC Role
    Then validate user select newly created project card
    Then validate ReferenceLibraryHeader is display and click on header Link
    Then validate ProjectSpecificDocumentsI&C section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    Then Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click
    When user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsI&Csection is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ClientDocumentI&C sections
    When validate user click on ClientDocumentsI&C SubSection
    When validate user click on AddReference Button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to ClientDocumentsI&C Section is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ProceduresI&C section
    Then validate ProceduresI&C section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save and complete button and then edit button and checked mark next to ProcedureI&Csection is display

    Examples: 
      | name            | ID  | link                    |
      | Automation Name | 123 | https://www.google.com/ |

  Scenario Outline: Validate calculationTemplatesI&C sections
    Then validate user click on calculationTemplatesI&C SubSection
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
    Then validate check mark next to calculationTemplatesI&C Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate typicalDetailsI&C sections
    Then validate user click on typicalDetailsI&C SubSection
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
    Then validate check mark next to typicalDetailsI&C Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate ManualsHandbooksI&C sections
    Then validate user click on ManualsHandbooksI&C SubSection
    #When Validate user when moving the slider to on position
    When validate user click on AddReference Button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then validate user click on save button
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to ManualsHandbooksI&C Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate trainingI&C sections
    Then validate user click on trainingI&C SubSection
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
    Then validate check mark next to trainingI&C Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate otherI&C sections
    Then validate user click on otherI&C SubSection
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
    Then validate check mark next to otherI&C Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate checklistsI&C sections
    Then validate user click on checklistsI&C SubSection
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
    Then validate check mark next to checklistsI&C Section is display
    Then validate Top ReferenceLibrary header is completed with cheked mark
    Then closing the browser
    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |
