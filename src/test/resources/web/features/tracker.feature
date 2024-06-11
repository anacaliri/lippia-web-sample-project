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

  @updateATimeEntryDescription @run
  Scenario Outline: Update a time entry description
    Given time entry with description <description> has been created
    When user updates the description to <new_description>
    Then time entry with description <new_description> has been updated
    Examples:
      | start | end   | description    | new_description |
      | 12:00 | 13:00 | Destornillador | fruta           |

  #@updateATimeEntryDescription
  #Scenario Outline: Update a time entry description
  #  Given user had set a time entry with description <description>, start time <start> and end time <end>
  #  When user updates the description to <new_description>
  #  Then time entry with description <new_description> has been updated
  #  Examples:
  #    | start | end   | description | new_description |
  #    | 12:00 | 13:00 | camote    | fruta           |
#
  #@updateATimeEntryStartTime
  #Scenario Outline: Update a time entry start time
  #  Given user had set a time entry with description <description>, start time <start> and end time <end>
  #  When user updates the start time to <new_start_time>
  #  Then time entry with start time <description> has been updated
  #  Examples:
  #    | start | end   | description | new_start_time |
  #    | 12:00 | 13:00 | editable    | 12:30          |
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