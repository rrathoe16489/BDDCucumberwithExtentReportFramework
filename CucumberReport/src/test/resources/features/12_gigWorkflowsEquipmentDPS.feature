Feature: Click on Gig Workflows header navigated to Gig Workflow Landing page

  @TestCase44745
  Scenario: Completed all the the five steps on Gig Worflow Landing page
    Given validate user login as a Equipment Role
    #Then validate user select newly created project card
    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown
    And user select activity information and fill the details
      | Activity             |
      | Activity Information |
    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |
    #
    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |
    #
    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive
      | Activity Gignet Giginfo             |
      | Review Process Datasheets           |
      | Prepare Draft Mechanical Datasheets |
      | Check Draft Mechanical Datasheets   |
    Then validate GigWorkFlow header is completed with cheked mark
    Then closing the browser
