package lippia.web.services;

import com.crowdar.core.actions.ActionManager;

import lippia.web.constants.LandingConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LandingService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(LandingConstants.LANDING_URL);
    }
//    private static WebElement stats() {
//        return getElement(LoginConstants.STATS_ID);
//    }
//
//    public static String getStats() {
//        return stats().getText();
//    }
//
//    public static void verifyResults(){
//        Assert.assertFalse(getStats().isEmpty());
//    }
}
