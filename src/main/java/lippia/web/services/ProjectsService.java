package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectsConstants;
import lippia.web.constants.TrackerConstants;
import org.testng.Assert;


public class ProjectsService extends ActionManager {

    public static void navigateTo(String option) {
        WebActionManager.isVisible(ProjectsConstants.CREATE_NEW_PROJECT_BUTTON);

    }

    //public static void getElement(String option) {
    //    Assert.assertEquals(TrackerConstants.MENU_PROJECTS, "Projects");
    //}
}
