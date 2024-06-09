package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.LogoutConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LogoutService extends ActionManager {

    public static void clickOnAvatar(String button) {
        WebActionManager.click(LogoutConstants.AVATAR);
    }

    public static void clickOnLogOutButton(String button) {
        WebActionManager.click(LogoutConstants.LOG_OUT_BUTTON);
    }
}
