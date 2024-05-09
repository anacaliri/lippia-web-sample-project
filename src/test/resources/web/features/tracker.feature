@tracker
Feature: Tracker

  @Smoke
  Scenario Outline: Go to Projects
    Given user is logged in Clockify with email <email> and password <password>
    When user clicks option "Projects" from the menu
    Then user is in Projects page to start creating projects
    Examples:
      | url                              | email                  | password        |
      | https://app.clockify.me/en/login | anabelcaliri@gmail.com | EzysE@7bY6_KAwX |


