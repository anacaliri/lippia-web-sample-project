package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.LogoutConstants;
import lippia.web.constants.WorkspaceConstants;


public class WorkspaceService extends ActionManager {

    public static void clickOnWorkspaceDropdownOptions(String button) {
        WebActionManager.click(WorkspaceConstants.WORKSPACE_DROPDOWN_OPTIONS);
    }
    public static void clickOnManageWorkspaces(String button) {
        WebActionManager.click(WorkspaceConstants.MANAGE_WORKSPACES);
    }

    public static void clickOnCreateNewWorkspaceButton(String button) {
        WebActionManager.waitVisibility(WorkspaceConstants.CREATE_NEW_WORKSPACE);
        WebActionManager.waitClickable(WorkspaceConstants.CREATE_NEW_WORKSPACE);
        WebActionManager.click(WorkspaceConstants.CREATE_NEW_WORKSPACE);
    }


    public static void inputWorkspaceName(String name) {
        WebActionManager.setInput(WorkspaceConstants.NAME_INPUT, name);
    }
    public static void clickOnCreateButton(String button) {
        WebActionManager.click(WorkspaceConstants.CREATE_BUTTON);
    }
    public static void navigateTo(String url) {
        WebActionManager.navigateTo(url);
    }

}
