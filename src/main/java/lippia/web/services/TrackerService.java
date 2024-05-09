package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;


public class TrackerService extends ActionManager {

    public static void isTrackerPageDisplayed(String url) {
        WebActionManager.navigateTo(url);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

}
