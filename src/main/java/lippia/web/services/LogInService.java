package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogInConstants;

public class LogInService extends ActionManager {

    public static void navigateToLogInPage(String url) {
        WebActionManager.navigateTo(url);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void inputEmail(String email) {
        WebActionManager.setInput(LogInConstants.EMAIL_INPUT, email);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void inputPassword(String password) {
        WebActionManager.setInput(LogInConstants.PASSWORD_INPUT, password);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void pressLogInManuallyButton(String button) {
        WebActionManager.click(LogInConstants.LOG_IN_MANUALLY_BUTTON);
    }

    public static void isLogInPageDisplayed(String url) {
        WebActionManager.navigateTo(url);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showErrorMessage(String error) {
        WebActionManager.getText(LogInConstants.INVALID_EMAIL_PASSWORD_ERROR);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showPassword(String button) {
        WebActionManager.click(LogInConstants.INACTIVE_EYE_BUTTON);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void hidePassword(String button) {
        WebActionManager.click(LogInConstants.ACTIVE_EYE_BUTTON);
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void passwordIsHidden(String password) {
        WebActionManager.waitVisibility(LogInConstants.HIDDEN_PASSWORD);
    }

    public static void passwordIsDisplayed(String password) {
        WebActionManager.waitVisibility(LogInConstants.PASSWORD);
    }

    public static void isResetPasswordPageDisplayed(String url) {
        WebActionManager.navigateTo(url);
    }


    //   public static void disableButtton(String button) {
    //       WebActionManager.
    //   }
    //   public static void showErrorMessage(String error) {
    //       switch (error) {
    //           case invalidEmailOrPassword:
    //               WebActionManager.getText(LogInConstants.INVALID_EMAIL_PASSWORD_ERROR);
    //               break;
    //           case missingEmail:
    //               WebActionManager.getText(LogInConstants.REQUIRED_EMAIL_ERROR);
    //               break;
    //           case missingPassword:
    //               WebActionManager.getText(LogInConstants.REQUIRED_PASSWORD_ERROR);
    //               break;
    //       }

}
