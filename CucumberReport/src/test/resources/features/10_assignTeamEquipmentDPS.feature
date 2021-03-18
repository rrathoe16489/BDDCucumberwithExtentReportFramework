#Author: RameshRathod
Feature: Assign Discipline Team for Equipment Role

  Scenario: Validate equipmentTeamLeads Section : Select Roles and add professional name and Navigation
    Given validate user login as a Equipment Role
    #Then validate user select newly created project card
    Then validate AssignTeamHeader is Display and click on AssignTeamHeader Link
    Then validate user click on equipmentTeamLeads
    When validate validate Section is NOT completed, an empty circle next to the equipmentTeamLeadsSection is display
    When validate toggle is on, the name field will enable in equipmentTeamLeads
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from equipmentTeamLeads section screen without saving data
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable in equipmentTeamLeads
    When validate For select roles, user can select +Add Professional from equipmentTeamLeads which will create a new blank field to populate an additional professional for a given role
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the equipmentTeamLeads is display
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for equipmentTeamLeads
    #Then validate multiple permissions can be selected for a single individual.
    Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections

  Scenario: Validate equipmentTeam Section : Select Roles and add professional name and Navigation
    When validate user click on equipmentTeam
    When validate validate Section is NOT completed, an empty circle next to the equipmentTeam is display
    When validate toggle is on, the name field will enable in equipmentTeam
    When validate entering the assignee name, it will search matching names and display NameJobFamilyOffice
    When validate name is populated a Notify and Define User Permissions option will activate to the right of the name box
    When validate upon making an edit, the Save button will be enabled and the Complete button will be disabled
    When validate System will prompt user to save record if user is moving away from equipmentTeam section screen without saving data
    When validate the section information has been saved, the Complete button will be enabled
    When validate toggling off a role with a name populated the name will clear and field will disable in equipmentTeam
    When validate For select roles, user can select +Add Professional from equipmentTeam which will create a new blank field to populate an additional professional for a given role
    When validate a section within a header area that does not have dependencies Project Information, Project Reference Library, Assign Project Lead has been marked complete, the Reset, Save and Complete buttons will be replaced with an Edit button.
    When validate Section is completed, a check next to the equipmentTeam is display
    When validate clicking on Define User Permissions displays a list of user permissions that I can assign an individual for equipmentTeam
    #Then validate multiple permissions can be selected for a single individual.
    Then validate hovering over i next to user permissions provides additional informationORdescription of permissions.
    Then validate user can select Save to save selections

  Scenario Outline: Validate Add Project Role
    Then validate user click on equipmentTeamLeads
    Then valiate user click on the Edit button
    When verify that user is able add new role and view added Role "<roleTitle>","<roleDiscription>"
    Then validate check the duplicate validation by adding duplicate row "<duplicateRole>"
    Then Validate user click on the save button
    Then validate user click on complete button
    Then closing the browser

    Examples: 
      | roleTitle       | roleDiscription       | duplicateRole   |
      | Automation Role | Testing Automation... | Automation Role |
