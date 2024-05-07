package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.TrackerConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class LogInService extends ActionManager {

    public static void isLogInPageLoaded(String url) {
        WebActionManager.navigateTo(url);
      //  WebActionManager.waitVisibility(LogInConstants.EMAIL_INPUT);
      //  WebActionManager.waitVisibility(LogInConstants.PASSWORD_INPUT);
      //  WebActionManager.waitVisibility(LogInConstants.LOG_IN_MANUALLY_BUTTON);
    }

    public static void inputEmail(String email) {
        WebActionManager.setInput(LogInConstants.EMAIL_INPUT, email);
    }

    public static void inputPassword(String password) {
        WebActionManager.setInput(LogInConstants.PASSWORD_INPUT, password);
    }


    public static void pressLogInManuallyButton() {
        WebActionManager.click(LogInConstants.LOG_IN_MANUALLY_BUTTON);
    }

    public static void pressLogInButton() {
        WebActionManager.click(LogInConstants.LOG_IN_BUTTON);
    }

    public static void pressEyeButton() {
        WebActionManager.click(LogInConstants.EYE_BUTTON);
    }


    public static void isLogInPageDisplayed(String url) {
        WebActionManager.navigateTo(url);
    }

    //public static void showErrorMessage() {
    //    switch (error) {
    //        case invalidEmailOrPassword:
    //            WebActionManager.getText(LogInConstants.INVALID_EMAIL_PASSWORD_ERROR);
    //            break;
    //        case missingEmail:
    //            WebActionManager.getText(LogInConstants.REQUIRED_EMAIL_ERROR);
    //            break;
    //        case missingPassword:
    //            WebActionManager.getText(LogInConstants.REQUIRED_PASSWORD_ERROR);
    //            break;
    //    }
    //}

    //  public static void showPassword() {
    //      WebActionManager.waitVisibility(LogInConstants.PASSWORD_INPUT);
    //   }
    //   public static void hidePassword() {
    //       WebActionManager.getText()
    //   }
//
    //   public static void disableButtton(String button) {
    //       WebActionManager.
    //   }


}
