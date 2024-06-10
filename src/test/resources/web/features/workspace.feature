@workspace
Feature: Workspace

  @goToManageWokspaces @smoke @success
  Scenario Outline: Go to manage workspaces
    Given user is logged in with email <email> and password <password>
    When user clicks workspace dropdown to see workspace options
    And user clicks manage workspaces to go to workspaces
    Then user is in workspaces page <workspaces_url>
    Examples:
      | email                  | password        | workspaces_url                     |
      | anabelcaliri@gmail.com | EzysE@7bY6_KAwX | https://app.clockify.me/workspaces |

  @addNewWorkspace @smoke @success
  Scenario Outline: Add new workspace
    Given user is logged in with email <email> and password <password>
    When user clicks workspace dropdown to see workspace options
    And user clicks manage workspaces to go to workspaces
    And user clicks Create new workspace to go to create new workspace
    And user inputs workspace name <name>
    And user clicks Create to create the workspace
    #Then user is in workspaces page <workspaces_url>
    Examples:
     | email                  | password        | workspaces_url                     | name                 |
     | anabelcaliri@gmail.com | EzysE@7bY6_KAwX | https://app.clockify.me/workspaces | Lippia Web Workspace 2 |

