package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LoginService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(LoginConstants.LOGIN_URL);
    }
//
//    public static void enterSearchCriteria(String text) {
//        setInput(LoginConstants.INPUT_SEARCH_XPATH, text);
//    }
//
//    public static void clickSearchButton() {
//        click(LoginConstants.SEARCH_BUTTON_NAME);
//    }
}
