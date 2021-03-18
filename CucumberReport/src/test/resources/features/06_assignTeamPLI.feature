#Author: RameshRathod
Feature: Assign Discipline as a PLI Role

  Scenario: Validate under Piping Lead section: Select Roles and add professional name and Navigation
    Given validate when user login as a PLI role
    #Then validate user select newly created project card
    Then validate AssignTeamHeader is Display and click on AssignTeamHeader Link
    When validate user click on Piping Leads section
    When validate Section is NOT completed, an empty circle next to the PipingLeadsSection label will display in left panel
    When validate toggle is on, the name field will enable in PipingLeadsSection.
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from PipingLeadsSection without saving data
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable in PipingLeadsSection.
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the PipingLeadsSection label will display in left panel
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual in PipingLeadsSection.
    Then validate multiple permissions can be selected for a single individual.
    Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections

  Scenario: Validate under Electrical Leads section: Select Roles and add professional name and Navigation
    When validate user click on Electrical Leads section
    When validate validate Section is NOT completed, an empty circle next to the ElectricalLeadsSection is display
    When validate toggle is on, the name field will enable in ElectricalLeadsSection
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from ElectricalLeadsSection section screen without saving data
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable in ElectricalLeadsSection
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the ElectricalLeadsSection is display
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for ElectricalLeadsSection
    #Then validate multiple permissions can be selected for a single individual.
    #Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections

  #Scenario Outline: Validate Add Project Role
    #When validate user click on Piping Leads section
    #Then valiate user click on the Edit button
    #When verify that user is able add new role and view added Role "<roleTitle>","<roleDiscription>"
    #Then validate check the duplicate validation by adding duplicate row "<duplicateRole>"
    #Then Validate user click on the save button
    #Then validate user click on complete button

    #Examples: 
      #| roleTitle          | roleDiscription       | duplicateRole      |
      #| Automation Role152 | Testing Automation... | Automation Role152 |

  Scenario: Validate under I&CSub Section: Select Roles and add professional name and Navigation
    When validate user click on I&CSubSection
    When validate Section is NOT completed, an empty circle next to the I&C Section label will display in left panel
    When validate toggle is on, the name field will enable under I&C Section
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from sectionscreen without saving data under I&C Section
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable under I&C Section
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the I&C Section label will display in left panel
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under I&C Section
    #Then validate multiple permissions can be selected for a single individual.
    #Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections

  Scenario: Validate under Structural Leads Section : Select Roles and add professional name and Navigation
    When validate user click on StructuralLeadsSubSection
    When validate Section is NOT completed, an empty circle next to the StructuralLeads Section label will display in left panel
    When validate toggle is on, the name field will enable under StructuralLeads Section
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from sectionscreen without saving data under StructuralLeads Section
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable under StructuralLeads Section
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the StructuralLeads Section label will display in left panel
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under StructuralLeads Section
    #Then validate multiple permissions can be selected for a single individual.
    #Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections

  Scenario: Validate under ProcessLeads Section: Select Roles and add professional name and Navigation
    When validate user click on ProcessLeadsSubSection
    When validate Section is NOT completed, an empty circle next to the Section label will display in left panel under ProcessLeads
    When validate toggle is on, the name field will enable under ProcessLeads
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from sectionscreen without saving data under ProcessLeads
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable under ProcessLeads
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the Section label will display in left panel under ProcessLeads
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under ProcessLeads
    #Then validate multiple permissions can be selected for a single individual.
    #Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections

  Scenario: Validate under EquipmentLeads Section: Select Roles and add professional name and Navigation
    When validate user click on EquipmentLeadsSubSection
    When validate Section is NOT completed, an empty circle next to the Section label will display in left panel under EquipmentLeads
    When validate toggle is on, the name field will enable under EquipmentLeads
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from sectionscreen without saving data under EquipmentLeads
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable under EquipmentLeads
    #When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the Section label will display in left panel under EquipmentLeads
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under EquipmentLeads
    #Then validate multiple permissions can be selected for a single individual.
    #Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections

  Scenario: Validate under ManagementTeam Section: Select Roles and add professional name and Navigation
    When validate user click on ManagementTeamSubSection
    When validate Section is NOT completed, an empty circle next to the Section label will display in left panel under ManagementTeam
    When validate toggle is on, the name field will enable under ManagementTeam
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from sectionscreen without saving data under ManagementTeam
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable under ManagementTeam
     When validate For select roles, user can select +Add Professional which will create a new blank field to populate an additional professional for a given role for management
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the Section label will display in left panel under ManagementTeam
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual under ManagementTeam
    #Then validate multiple permissions can be selected for a single individual.
    #Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections
    Then closing the browser
