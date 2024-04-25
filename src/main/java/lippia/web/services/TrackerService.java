package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LandingConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class TrackerService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(LandingConstants.LANDING_URL);
    }

}
