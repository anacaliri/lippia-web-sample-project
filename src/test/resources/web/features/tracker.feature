@tracker
Feature: Tracker

  Background:
    Given user is logged in Clockify with email anabelcaliri@gmail.com and password EzysE@7bY6_KAwX

  @goToProjects @Smoke
  Scenario: Go to Projects
    When user clicks Projects in the side menu
    Then user is in Projects page to start creating projects

  @addNewTimeEntry
  Scenario Outline: Add new time entry
    When user inputs <start> time entry to indicate the start of the period
    And user inputs <end> time entry to indicate the end of the period
    And user inputs a description <description>
    And user clicks Add button to add a new time entry
    Then time entry with description <description> has been created
    Examples:
      | start | end   | description    |
      | 12:00 | 13:00 | Destornillador |

  @editATimeEntryDescription
  Scenario Outline: Edit a time entry description
    Given user had set a time entry with description <description>, start time <start> and end time <end>
    When user updates the description <description> to <new_description>
    Then time entry with description <new_description> has been updated
    Examples:
      | start | end   | description | new_description |
      | 12:00 | 13:00 | Caldo      | Puchero         |

 # @editATimeEntryStartTime @run
 # Scenario Outline: Edit a time entry start time
 #   Given user is logged in Clockify with email <email> and password <password>
 #   And user had set a time entry with description <description>, start time <start> and end time <end>
 #   When user changes the start time to <change>
 #   Then time entry with start time <start> has been updated
 #   Examples:
 #     | email                  | password        | start | end   | start   | change |
 #     | anabelcaliri@gmail.com | EzysE@7bY6_KAwX | 12:00 | 13:00 | Corcho2 | 08:00  |
#
 # @editATimeEntryEndTime @run
 # Scenario Outline: Edit a time entry end time
 #   Given user is logged in Clockify with email <email> and password <password>
 #   And user had set a time entry with description <description>, start time <start> and end time <end>
 #   When user changes the end time to <change>
 #   Then time entry with end time <end> has been updated
 #   Examples:
 #     | email                  | password        | start | end   | description | change |
 #     | anabelcaliri@gmail.com | EzysE@7bY6_KAwX | 12:00 | 13:00 | Corcho2     | 23     |
#