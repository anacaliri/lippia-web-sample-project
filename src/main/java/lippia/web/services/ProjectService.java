package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ProjectsConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class ProjectService extends ActionManager {

    public static void navigateTo(String option) {
        WebActionManager.isVisible(ProjectsConstants.CREATE_NEW_PROJECT_BUTTON);
    }
    public static void clickOnCreateNewProjectButton(String button) {
        WebActionManager.click(ProjectsConstants.CREATE_NEW_PROJECT_BUTTON, false);
        WebActionManager.waitVisibility(ProjectsConstants.CREATE_NEW_PROJECT_MODAL);
    }

    public static void inputProjectName(String name) {
        WebActionManager.setInput(ProjectsConstants.INPUT_NAME,name);
    }
    public static void clickOnCreateButton(String button) {
        WebActionManager.click(ProjectsConstants.CREATE_BUTTON);
    }

    public static void validateProjectCreation(String name) {
        WebActionManager.isVisible(ProjectsConstants.PROJECT_CREATED);
    }
}
