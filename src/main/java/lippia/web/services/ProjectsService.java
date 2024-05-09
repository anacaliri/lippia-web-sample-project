package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;


public class ProjectsService extends ActionManager {


    public static void navigateTo(String url) {
        WebActionManager.navigateTo(url);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
