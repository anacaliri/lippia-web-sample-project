@login
Feature: Login

  @Smoke @manual_login @success @run
  Scenario Outline: Successful access to manual login
    Given user is in <login_url>
    When user clicks "Log in manually" button
    Then <login_url> page is displayed
    Examples:
      | login_url                        |
      | https://app.clockify.me/en/login |

  @Smoke @manual_login @success @run
  Scenario Outline: Successful manual login
    Given user is in <login_url>
    And user clicks "Log in manually" button
    When user inputs email <email>
    And user inputs password <password>
    And user clicks "Log in" button
    Then <tracker_url> page is displayed
    Examples:
      | login_url                        | email                  | password        | tracker_url                 |
      | https://app.clockify.me/en/login | anabelcaliri@gmail.com | EzysE@7bY6_KAwX | https://clockify.me/tracker |


  @smoke @manual_login @fail
  Scenario Outline: Unsuccessful manual login due to <reason> input
    Given user is in <login_url>
    When user inputs email <email>
    And user inputs password <password>
    And user clicks <button> button
    Then error message <message> is displayed
    Examples:
      | reason         | login_url                        | email                   | password        | button | message                   |
      | wrong password | https://app.clockify.me/en/login | anabelcaliri@gmail.com  | EzysE@7bY6_KAwJ | Log in | Invalid email or password |
      | wrong email    | https://app.clockify.me/en/login | anabel.caliri@gmail.com | EzysE@7bY6_KAwX | Log in | Invalid email or password |

  @success
  Scenario Outline: Show password successfully
    Given user is in <login_url>
    When user inputs password <password>
    And user clicks <button> button
    Then password <password> is displayed
    Examples:
      | login_url                        | password        | button |
      | https://app.clockify.me/en/login | EzysE@7bY6_KAwX | eye    |

  @success
  Scenario Outline: Hide password successfully
    Given user is in <login_url>
    And user had input password <password>
    And user had clicked the eye button to show the password
    When user clicks <button> button
    Then password is hidden
    Examples:
      | login_url                        | password        | button |
      | https://app.clockify.me/en/login | EzysE@7bY6_KAwX | eye    |

  @success
  Scenario Outline: Go to reset password
    Given user is in <login_url>
    When user clicks <button> button
    Then user is in <reset_password_url>
    Examples:
      | login_url                        | button           | reset_password_url                        |
      | https://app.clockify.me/en/login | Forgot password? | https://app.clockify.me/reset-password?t= |