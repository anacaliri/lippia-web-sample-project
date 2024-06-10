package lippia.web.constants;

import lippia.web.services.ProjectService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class ProjectsConstants {

    public static final String CREATE_NEW_PROJECT_BUTTON = "xpath://button[@type='button'][@data-cy='create-new-project']";
    public static final String CREATE_NEW_PROJECT_MODAL = "xpath://div[@class='cl-modal-header ng-star-inserted'][contains(.,'Create new project')]";
    public static final String INPUT_NAME = "xpath://input[contains(@placeholder,'Enter project name')]";
    public static final String CREATE_BUTTON = "xpath://button[@type='button'][@data-cy='create-project'][contains(text(),'Create')]";

    public static final String PROJECT_CREATED = String.format("xpath:///html/body/app-root/default-layout/div[1]/main/div/projects/main/div/table/tbody[last()]/div[last()]/tr/td[first()]/div/div/a/span[contains(text(), 'Project #%s')]", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));

}