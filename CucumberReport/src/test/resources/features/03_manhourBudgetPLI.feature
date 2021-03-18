#Author: RameshRathod
Feature: manHourBudget as a PLI Role

  Scenario Outline: Validate Piping Section
    Given validate when user login as a PLI role
    #Then validate user select newly created project card
    Then validate manHourBudget is Display and click on manHourBudget Link
    When validate user click on piping SubSection
    Then validate user click on SB Pipe Stress Activity "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then validate user click on LB Pipe Stress Activity "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button

    Examples: 
      | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      |          111 |           333 |           111 |            333 |

  Scenario Outline: Validate Electrical Section
    When validate user click on electrical SubSection
    Then validate user fill the data in first activity and checking the field validation "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then validate user fill the data in second activity and save, complete the form "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button

    Examples: 
      | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      |          111 |           333 |           111 |            333 |

  Scenario Outline: Validate I&C Section
    When validate user click on IandC SubSection
    Then validate user fill the data in first activity and checking the field validation "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then validate user fill the data in second activity and save, complete the form "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button

    Examples: 
      | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      |          111 |           333 |           111 |            333 |

  Scenario Outline: Validate Structural Section
    When validate user click on Structural SubSection
    Then validate user fill the data in first activity and checking the field validation "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then validate user fill the data in second activity and save, complete the form "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button

    Examples: 
      | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      |          111 |           333 |           111 |            333 |

  Scenario Outline: Validate Process Section
    When validate user click on Process SubSection
    Then validate user fill the data in first activity and checking the field validation "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then validate user fill the data in second activity and save, complete the form "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
    Then validate when user click on the complete button, edit button is display instead of reset, save and complete button

    Examples: 
      | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      |          111 |           333 |           111 |            333 |

  Scenario Outline: Validate Equipment Section
    When validate user click on Equipment SubSection
    Then validate user fill the data in first activity and checking the field validation "<US ENG Hours>", "<US DSGN Hours>","<OUS ENG Hours>","<OUS DSGN Hours>"
    Then Validate user click on the save button
    Then validate user click on complete button
    #Then validate when user click on the complete button, edit button is display instead of reset, save and complete button
    When The last section within the last header area with dependencies is being marked Complete, and it IS the LAST section of the LAST of two header areas to be marked complete, a popup will be displayed identifying the process that will be initiated if they continue
    Then validate manHourBudget header is completed with cheked mark
    Then closing the browser

    Examples: 
      | US ENG Hours | US DSGN Hours | OUS ENG Hours | OUS DSGN Hours |
      |          111 |           333 |           111 |            333 |
