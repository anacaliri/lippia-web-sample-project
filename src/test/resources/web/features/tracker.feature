@tracker
Feature: Tracker

  @goToProjects @Smoke
  Scenario Outline: Go to Projects
    Given user is logged in Clockify with email <email> and password <password>
    When user clicks Projects in the side menu
    Then user is in Projects page to start creating projects
    Examples:
      | email                  | password        |
      | anabelcaliri@gmail.com | EzysE@7bY6_KAwX |

  @addNewTimeEntry @run
  Scenario Outline: Add new time entry
    Given user is logged in Clockify with email <email> and password <password>
    When user inputs <start> time entry to indicate the start of the period
    And user inputs <end> time entry to indicate the end of the period
    When user inputs a description <description>
    And user clicks Add button to add a new time entry
    Then time entry with description <description> has been created
    Examples:
      | email                  | password        | start | end   | description |
      | anabelcaliri@gmail.com | EzysE@7bY6_KAwX | 12:00 | 13:00 | Corcho2     |

