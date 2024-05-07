package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;


import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class TrackerService extends ActionManager {

    public static void isTrackerPageDisplayed(String url) {
        WebActionManager.navigateTo(url);
    }

}
