#Author: RameshRathod
Feature: Reference Library as a Piping role

  Scenario Outline: Validate ProjectSpecificDocumentsPiping sections
    Given validate when user login as a Piping Role
    #Then validate user select newly created project card
    Then validate ReferenceLibraryHeader is display and click on header Link
    Then validate ProjectSpecificDocumentsPiping section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    Then Validate user can copy the existing row then Category copied and all other columns blank and Save Complete and Edit button click
    When user click on AddReference button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then Validate user click on the save and complete button and then edit button and checked mark next to ProjectSpecificDocumentsPipingsection is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ClientDocumentManagementSection sections
    When validate user click on ClientDocumentsPiping SubSection
    When validate user click on AddReference Button
    Then validate Newly added row can be saved with categoryName and without ID or link "<categoryName>"
    Then validate only editing of name "<name>" and ID "<ID>", deletingorpasting of Link "<link>" allowed
    Then validate user click on save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    Then validate check mark next to ClientDocumentsPiping Section is display

    Examples: 
      | categoryName        | name       | ID  | link                    |
      | Automation Category | Automation | 123 | https://www.google.com/ |

  Scenario Outline: Validate ProceduresPiping section
    Then validate ProceduresPiping section is Display and click
    When Validate user when moving the slider to on position
    Then validate moving the slider to on position only deletingorpasting of link allowed in ProcedureManagement "<link>"
    Then Validate Hovering over link cell will display entire link
    Then Validate user can save the updated data and link will become a hyperlink to open the file or website
    Then Validate clicking in the link cell for a given row that already has a link populated the PLI can choose to delete the link by selecting X icon
    When user click on AddReference button
    Then validate Newly added row can be saved with name "<name>" only and without ID or link
    Then Validate user click on the save and complete button and then edit button and checked mark next to ProcedurePipingsection is display

    Examples: 
      | name            | ID  | link                    |
      | Automation Name | 123 | https://www.google.com/ |

  Scenario Outline: Validate calculationTemplatesPiping sections
    Then validate user click on calculationTemplatesPiping SubSection
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
    Then validate check mark next to calculationTemplatesPiping Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate typicalDetailsPiping sections
    Then validate user click on typicalDetailsPiping SubSection
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
    Then validate check mark next to typicalDetailsPiping Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate ManualsHandbooksPiping sections
    Then validate user click on ManualsHandbooksPiping SubSection
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
    Then validate check mark next to ManualsHandbooksPiping Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate trainingPiping sections
    Then validate user click on trainingPiping SubSection
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
    Then validate check mark next to trainingPiping Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate otherPiping sections
    Then validate user click on otherPiping SubSection
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
    Then validate check mark next to otherPiping Section is display

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |

  Scenario Outline: Validate checklistsPiping sections
    Then validate user click on checklistsPiping SubSection
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
    Then validate check mark next to checklistsPiping Section is display
    Then validate Top ReferenceLibrary header is completed with cheked mark
    Then closing the browser

    Examples: 
      | name            | link                    |
      | Automation Name | https://www.google.com/ |
