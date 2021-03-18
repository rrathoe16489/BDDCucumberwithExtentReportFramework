Feature: Click on Gig Workflows header navigated to Gig Workflow Landing page

  @TestCase44745
  Scenario Outline: Completed all the the five steps on Gig Worflow for Process discipline
    Given validate user login as a Process Role
    #Then validate user select newly created project card
    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information and fill the details
      | Activity             |
      | Activity Information |
    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |
    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |
    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive "<gigworkflow>","<submenus>"
    Then validate GigWorkFlow header is completed with cheked mark
    Then closing the browser

    Examples: 
      | gigworkflow    | submenus                                                                                                                                |
      | Line Schedule  | Engineer Prepare,Engineer Review,Engineer Update and Sign,Engineer Review and Sign,Lead Engineer Review Fragnet for Completion and Sign |
      | Equipment List | Engineer Prepare,Engineer Review,Engineer Update and Sign,Engineer Review and Sign,Lead Engineer Review Fragnet for Completion and Sign |
