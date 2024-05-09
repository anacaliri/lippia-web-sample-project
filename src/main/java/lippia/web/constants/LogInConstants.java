package lippia.web.constants;

import org.openqa.selenium.WebElement;

public class LogInConstants {


    public static final String GOOGLE_LOGIN_BUTTON = "name:btnK";

    public static final String EMAIL_INPUT = "id:email";
    public static final String PASSWORD_INPUT = "xpath://input[@class='cl-form-control'][@id='password']";
    public static final String LOG_IN_BUTTON = "xpath://button[@data-test-id='login-button'][contains(.,'Log In')]";
    public static final String LOG_IN_MANUALLY_BUTTON = "xpath://a[contains(.,'Log in manually')]";
    public static final String REQUIRED_EMAIL_ERROR = "xpath://span[@data-test-id='invalid-email']";
    public static final String REQUIRED_PASSWORD_ERROR = "xpath://span[contains(.,'Password is required')]";
    public static final String INVALID_EMAIL_PASSWORD_ERROR = "xpath://div[@class='cl-invalid-feedback cl-block cl-mt-0 ng-tns-c128-2']";

    public static final String INACTIVE_EYE_BUTTON = "xpath://img[@src='/assets/ui-icons/password-toggle.svg']";
    public static final String ACTIVE_EYE_BUTTON = "xpath://img[@src='/assets/ui-icons/password-toggle-active.svg']";
    public static final String PASSWORD = "xpath://input[@id='password'][@type='text']";
  public static final String HIDDEN_PASSWORD = "xpath://input[@id='password'][@type='password']";
}
