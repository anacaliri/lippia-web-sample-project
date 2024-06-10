package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.github.javafaker.Color;
import com.github.javafaker.Faker;
import lippia.web.constants.TrackerConstants;
import org.openqa.selenium.WebDriver;


public class TrackerService extends ActionManager {


    public static void clickOnProjects(String button) {
        WebActionManager.click(TrackerConstants.MENU_PROJECTS);

    }

    public static void inputDescription(String description) {
        WebActionManager.getElement(TrackerConstants.INPUT_DESCRIPTION).click();
        WebActionManager.setInput(TrackerConstants.INPUT_DESCRIPTION, description);
    }

    public static void inputStartTimeEntry(String startTime) {
        WebActionManager.waitVisibility(TrackerConstants.INPUT_START);
        WebActionManager.getElement(TrackerConstants.INPUT_START).click();
        WebActionManager.setInput(TrackerConstants.INPUT_START, startTime);
    }

    public static void inputEndTimeEntry(String endTime) {
        WebActionManager.waitVisibility(TrackerConstants.INPUT_END);
        WebActionManager.getElement(TrackerConstants.INPUT_END).click();
        WebActionManager.setInput(TrackerConstants.INPUT_END, endTime);
    }

    public static void clickOnAddTimeEntry(String button) {
        WebActionManager.waitPresence(TrackerConstants.ADD_BUTTON);
        WebActionManager.click(TrackerConstants.ADD_BUTTON);
    }

    //public static void setTimeEntry(String startTime, String endTime, String day) {
//
    //}
    public static void checkTimeEntry(String description) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebActionManager.getElement(TrackerConstants.TIME_ENTRY, description);
    }

}
