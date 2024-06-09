@logout
Feature: Log out


  @successfulLogout @smoke @success
  Scenario Outline: Successful log out
    Given user is logged in with email <email> and password <password>
    When user clicks avatar button
    And user clicks <logout_button> button to log out
    Then user is in login page <login_url>
    Examples:
      |   logout_button | email                  | password        |login_url                        |
      |   Log Out       | anabelcaliri@gmail.com | EzysE@7bY6_KAwX |https://app.clockify.me/en/login |

