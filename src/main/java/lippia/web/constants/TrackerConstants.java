package lippia.web.constants;

public class TrackerConstants {
    public static final String MENU_PROJECTS_OPTION = "xpath://input[@class='cl-d-flex cl-align-items-center']";

    public static final String MENU_PROJECTS = "xpath://ul/li/div/a[@href='/projects']";
    public static final String INPUT_START = "xpath://div[1]/input-time-ampm[1]/input";
    public static final String INPUT_END = "xpath://div[1]/input-time-ampm[2]/input";
    public static final String ADD_BUTTON = "xpath://button[@type='button'][contains(text(),'Add')]";
    public static final String INPUT_DESCRIPTION = "xpath://input[contains(@placeholder,'What have you worked on?')]";
    public static final String TIME_ENTRIES_TABLE = "xpath://*[@id='layout-main']/div/tracker2/div/div/div/div/entry-group[1]/div";
    public static final String TIME_ENTRY = "xpath://div[contains(text(),'%s')]";

}
