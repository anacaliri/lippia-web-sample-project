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

@addNewTimeEntry
