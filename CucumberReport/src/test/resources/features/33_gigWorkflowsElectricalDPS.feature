#Author: RameshRathod
Feature: Project Activity as a DPS Electrical Role

  # Electrical
  @TestCase44745
  Scenario Outline: Completed all the the five steps on Gig Worflow for Electrical discipline
    Given validate user login as a Electrical Role
     #Then validate user select newly created project card
    And user select  giga workflow from top menu
    And user select the option gig workflow  dropdown "<gigworkflow>"
    And user select activity information and fill the details for Process
      | Activity             |
      | Activity Information |
    And user select Customize Fragnet and fill the details
      | Activity          |
      | Customize Fragnet |
    And user select FragnetStep Information and fill the details
      | Activity                |
      | FragnetStep Information |
    And User selects Stepfour gigents checkbox and it validates all the selected values in Stepfive "<gigworkflow>","<submenus>"
    Then closing the browser
    Examples: 
      | gigworkflow                                              | submenus                                                                                                        |
      | Electrical Load List including Voltage Drop Calculations | Engineer populate deliverable list,Engineer review studies/results with PDE,Populate preliminary circuit length |
      | Electrical Load List excluding Voltage Drop Calculations | Engineer populate deliverable list,Engineer review studies/results with PDE,Populate preliminary circuit length |
		
		
    