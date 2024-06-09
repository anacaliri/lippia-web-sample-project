package lippia.web.constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProjectsConstants {

    public static final String BASURA = "xpath://img[@alt='Help options'][@src='assets/nav-icons/help.svg']";

    //img[@alt='Help options'][@src='assets/nav-icons/help.svg']
    public static final String CREATE_NEW_PROJECT_BUTTON = "xpath://button[@type='button'][@data-cy='create-new-project']";
    public static final String CREATE_NEW_PROJECT_MODAL = "xpath://div[@class='cl-modal-header ng-star-inserted'][contains(.,'Create new project')]";
    public static final String INPUT_NAME = "xpath://input[contains(@placeholder,'Enter project name')]";
    public static final String CREATE_BUTTON = "xpath://button[@type='button'][@data-cy='create-project'][contains(text(),'Create')]";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHH");

    public static String getDynamicProjectLocator(String name) {
        String currentTime = LocalDateTime.now().format(formatter);
        return String.format("//table/tbody/div/tr/td/div/a/span[contains(text(), '%s_%s')]", name, currentTime);
    }
    public static final String PROJECT_CREATED = "xpath://table/tbody/div/tr/td/div/a/span[contains(text(), 'Project #%s')]";

}
