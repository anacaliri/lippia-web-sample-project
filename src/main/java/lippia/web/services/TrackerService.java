package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TrackerConstants;


public class TrackerService extends ActionManager {


    public static void navigateTo(String url) {
        WebActionManager.navigateTo(url);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void isSelected() {
        WebActionManager.click(TrackerConstants.MENU_PROJECTS_OPTION);
    }
}
