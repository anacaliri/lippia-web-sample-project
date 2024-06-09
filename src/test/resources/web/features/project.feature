@project
Feature: Project

  @goTocreateNewProject @Smoke @run
  Scenario Outline: Create new project
    Given user is logged in Clockify with email <email> and password <password>
    And user clicks Projects in the side menu
    And user is in Projects page to start creating projects
    When user clicks Create new project button to go to create new project
    And user inputs project name <name>
    And user clicks Create to create the project
    Then user is in projects page and the project <name> has been created
    Examples:
      | email                  | password        | name        |
      | anabelcaliri@gmail.com | EzysE@7bY6_KAwX | Project # |


