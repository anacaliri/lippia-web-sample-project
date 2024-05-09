package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogInConstants;
import org.testng.Assert;

public class LogInService extends ActionManager {

    public static void navigateTo(String url) {
        WebActionManager.navigateTo(url);
    }


    public static void inputEmail(String email) {
        WebActionManager.setInput(LogInConstants.EMAIL_INPUT, email);
    }

    public static void inputPassword(String password) {
        WebActionManager.setInput(LogInConstants.PASSWORD_INPUT, password);
    }

    public static void clickOnLogInManuallyButton(String button) {
        WebActionManager.click(LogInConstants.LOG_IN_MANUALLY_BUTTON);
    }

    public static void clickOnLogInButton(String button) {
        WebActionManager.click(LogInConstants.LOG_IN_BUTTON);
    }

    public static void showInvalidCredentialsError(String error) {
        Assert.assertEquals(WebActionManager.getText(LogInConstants.INVALID_EMAIL_PASSWORD_ERROR), error);
    }

    public static void showPassword(String button) {
        WebActionManager.click(LogInConstants.INACTIVE_EYE_BUTTON);
    }

    public static void hidePassword(String button) {
        WebActionManager.click(LogInConstants.ACTIVE_EYE_BUTTON);
    }

    public static void passwordIsHidden(String password) {
        WebActionManager.waitVisibility(LogInConstants.HIDDEN_PASSWORD);
    }

    public static void passwordIsDisplayed(String password) {
        WebActionManager.waitVisibility(LogInConstants.PASSWORD);
    }

    public static void clickOnReset(String button) {
        WebActionManager.click(LogInConstants.FORGOT_PASSWORD_BUTTON);
    }


    public static void showRequiredEmailError(String error) {
        WebActionManager.getText(LogInConstants.REQUIRED_EMAIL_ERROR);
    }

    public static void showRequiredPasswordError(String error) {
        WebActionManager.getText(LogInConstants.REQUIRED_PASSWORD_ERROR);
    }


    public static void disableButton(String locator, String attribute) {
        WebActionManager.getAttribute(LogInConstants.LOG_IN_BUTTON, "disabled");
    }

    public static void enableInputEmail() {
        WebActionManager.click(LogInConstants.EMAIL_INPUT);
    }
    public static void enableInputPassword(String input) {
        WebActionManager.click(LogInConstants.PASSWORD_INPUT);
    }
}
