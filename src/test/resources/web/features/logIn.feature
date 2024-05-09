@manual_login
Feature: Manual login

  @Smoke
  Background:
    Given user is in https://app.clockify.me/en/login

  @success @Smoke
  Scenario Outline: Successful access to manual login
    When user clicks "Log in manually" button
    Then <login_url> page is displayed
    Examples:
      | login_url                        |
      | https://app.clockify.me/en/login |

  @success
  Scenario Outline: Successful manual login
    When user clicks "Log in manually" button
    And user inputs email <email>
    And user inputs password <password>
    And user press "Log In" button
    Then <tracker_url> page is displayed
    Examples:
      |  email                  | password        | tracker_url                     |
      |  anabelcaliri@gmail.com | EzysE@7bY6_KAwX | https://app.clockify.me/tracker |

  @fail @Smoke
  Scenario Outline: Unsuccessful manual login due to <reason> input
    When user clicks "Log in manually" button
    And user inputs email <email>
    And user inputs password <password>
    And user press "Log In" button
    Then error message <message> is displayed
    Examples:
      | reason         |  email                   | password        |  message                   |
      | wrong password |  anabelcaliri@gmail.com  | EzysE@7bY6_KAwJ |  Invalid email or password |
      | wrong email    |  anabel.caliri@gmail.com | EzysE@7bY6_KAwX |  Invalid email or password |

  @success @Smoke
  Scenario Outline: Show password successfully
    When user clicks "Log in manually" button
    And user inputs password <password>
    And user clickk "eye" button
    Then password <password> is displayed
    Examples:
      | password        |
      | EzysE@7bY6_KAwX |

  @success @Smoke
  Scenario Outline: Hide password successfully
    Given user clicks "Log in manually" button
    And user inputs password <password>
    And user clickk "eye" button
    When user press "eye" button
    Then password is hidden
    Examples:
      | password        |
      | EzysE@7bY6_KAwX |

  @success
  Scenario Outline: Go to reset password
    When user clicks <button> button
    Then user is in <reset_password_url>
    Examples:
    | button           | reset_password_url                        |
    | Forgot password? | https://app.clockify.me/reset-password?t= |