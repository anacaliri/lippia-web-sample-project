package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ProjectsConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.LocalDateTime;
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
    //private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    public static void inputProjectName(String name) {
        //WebActionManager.setInput(ProjectsConstants.INPUT_NAME, name);
        String uniqueProjectName = name + LocalDateTime.now();
        WebActionManager.setInput(ProjectsConstants.INPUT_NAME, uniqueProjectName);
    }
    public static void clickOnCreateButton(String button) {
        WebActionManager.click(ProjectsConstants.CREATE_BUTTON);
    }

    public static void validateProjectCreation(String name) {
        //WebActionManager.isVisible(ProjectsConstants.PROJECT_CREATED);
        String dynamicLocator = String.format(ProjectsConstants.PROJECT_CREATED, name);
        WebActionManager.isVisible(dynamicLocator);
    }
}
