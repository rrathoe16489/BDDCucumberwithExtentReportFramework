#Author: RameshRathod
Feature: ViewApprove Full Project Plan as a DPS Piping Role

  Scenario Outline: Validate ViewApprove Full Project Plan
    Given validate when user login as a Piping Role
    #Then validate user select newly created project card
    Then Verify View/Approve Project Plan header is display and click
    Then Verify the Preliminary Discipline task Plan and click on dropdown
    Then Verify the Day Scale in Preliminary Discipline Plan
    Then Verify user apply the filter by clicking on the filter icon
    Then verify when user clear the filter
    Then verify when user select the gigActivity TaskName
    Then Verify the Project Activity details when clicking ViewEdit Full Information in Piping "<budgetManhoursHrs>"
    Then verify user click on the saveEdit button
    Then Verify when user clicks on Back label
    Then verify when user select the gigActivity TaskName
    Then Verify the Project Activity details when clicking ViewEdit Full Information in Piping "<budgetManhoursHrs>"
    Then Verify the functionality of Save Edits button, Cancel button and Discard Edits button
    Then Verify when user clicks on Back label
    Then verify user click on the complete button
    Then closing the browser

    #Then validate click on Day zoom to fit option
    #Then Verify the pagination functionality when viewing Preliminary Discipline Plan
    Examples: 
      | budgetManhoursHrs |
      |                 5 |
