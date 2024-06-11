package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.LoginConstants;
import lippia.web.services.LoginService;
import lippia.web.services.LogoutService;
import lippia.web.services.TrackerService;
import lippia.web.services.WorkspaceService;

public class WorkspaceSteps {
    @When("^user clicks (.*) to see workspace options$")
    public void userClicksWorkspaceDropdownOptions(String button) {
        WorkspaceService.clickOnWorkspaceDropdownOptions(button);
    }

    @And("^user clicks (.*) to go to workspaces$")
    public void userClicksManageWorkspaces(String button) {
        WorkspaceService.clickOnManageWorkspaces(button);
    }

    @And("^user clicks (.*) to go to create new workspace$")
    public void userClicksCreateNewWorkspaceButton(String button) {
        WorkspaceService.clickOnCreateNewWorkspaceButton(button);
    }

    @And("^user inputs workspace name (.*)$")
    public void userInputsWorkspaceName(String name) {
        WorkspaceService.inputWorkspaceName(name);
    }


    @And("^user clicks (.*) to create the workspace$")
    public void userClicksCreateButton(String button) {
        WorkspaceService.clickOnCreateButton(button);
    }

    @Then("^workspace with name (.*) has been created$")
    public void workspaceHasBeenCreated(String name) {
        WorkspaceService.checkWorkspace(name);
    }

}
