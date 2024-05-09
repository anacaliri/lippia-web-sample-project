@manual_login
Feature: Manual login

  @success @smoke
  Scenario Outline: Successful access to manual login
    Given user already is in <login_url>
    When user clicks "Log in manually" button to log in manually
    Then user is in <login_url>
    Examples:
      | login_url                        |
      | https://app.clockify.me/en/login |

  @success @Smoke
  Scenario Outline: Successful manual login
    Given user already is in <login_url>
    When user clicks "Log in manually" button to log in manually
    And user inputs email <email>
    And user inputs password <password>
    And user clicks "Log In" button to log in
    Then user is in <tracker_url> to start tracking work
    Examples:
      | login_url                        | email                  | password        | tracker_url                     |
      | https://app.clockify.me/en/login | anabelcaliri@gmail.com | EzysE@7bY6_KAwX | https://app.clockify.me/tracker |

  @fail @smoke
  Scenario Outline: Unsuccessful manual login due to <reason> input
    Given user already is in <login_url>
    When user clicks "Log in manually" button to log in manually
    And user inputs email <email>
    And user inputs password <password>
    And user clicks "Log In" button to log in
    Then error <error> is displayed
    Examples:
      | reason         | login_url                        | email                   | password        | error                     |
      | wrong password | https://app.clockify.me/en/login | anabelcaliri@gmail.com  | EzysE@7bY6_KAwJ | Invalid email or password |
      | wrong email    | https://app.clockify.me/en/login | anabel.caliri@gmail.com | EzysE@7bY6_KAwX | Invalid email or password |


  @fail
  Scenario Outline: Unsuccessful manual login due to missing email
    Given user already is in <login_url>
    When user clicks "Log in manually" button to log in manually
    And user enables input email
    And user inputs password <password>
    Then "Log In" button is "disabled"
    And "Email is required" email error is displayed
    Examples:
      | login_url                        | password        |
      | https://app.clockify.me/en/login | EzysE@7bYjhfAwX |

  @fail
  Scenario Outline: Unsuccessful manual login due to missing password
    Given user already is in <login_url>
    When user clicks "Log in manually" button to log in manually
    And user inputs email <email>
    And user enables input "password"
    Then "Log In" button is disable
    And "Password is required" password error is displayed

    Examples:
      | login_url                        | email            |
      | https://app.clockify.me/en/login | anabel@gmail.com |

  @success @smoke
  Scenario Outline: Show password successfully
    Given user already is in <login_url>
    When user clicks "Log in manually" button to log in manually
    And user inputs password <password>
    And user clicks "eye" button to show password
    Then password <password> is displayed
    Examples:
      | password        |
      | EzysE@7bY6_KAwX |

  @success
  Scenario Outline: Hide password successfully
    Given user already is in <login_url>
    When user clicks "Log in manually" button to log in manually
    And user inputs password <password>
    And user clicks "eye" button to show password
    And user clicks "eye" button to hide password
    Then password is hidden
    Examples:
      | password        |
      | EzysE@7bY6_KAwX |

  @success @smoke
  Scenario Outline: Go to reset password
    Given user already is in <login_url>
    When user clicks "Log in manually" button to log in manually
    And user clicks <button> button to reset password
    Then user is in <reset_password_url> to reset the password
    Examples:
      | button           | reset_password_url                        |
      | Forgot password? | https://app.clockify.me/reset-password?t= |