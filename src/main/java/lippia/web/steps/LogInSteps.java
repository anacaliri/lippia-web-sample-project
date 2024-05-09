package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInService;
import lippia.web.services.TrackerService;

public class LogInSteps {

    @Given("^user is in (.*)$")
    public void navigateToLogInPage(String url) {
        LogInService.navigateToLogInPage(url);
    }


    @When("^user clicks (.*) button$")
    public void userClicksLoginManuallyButton(String button) {
        LogInService.pressLogInManuallyButton(button);
    }


    @When("^user inputs email (.*)$")
    public void userInputsEmail(String email) {
        LogInService.inputEmail(email);
    }

    @And("^user inputs password (.*)$")
    public void userInputsPassword(String password) {
        LogInService.inputPassword(password);
    }

    @And("^user clickk (.*) button$")
    public void userClicksEyeButton(String button) {
        LogInService.showPassword(button);
    }

    @And("^user press (.*) button$")
    public void userClickEyeButton(String button) {
        LogInService.hidePassword(button);
    }

    @Then("^(.*) page is displayed$")
    public void pageIsDisplayed(String url) {
        switch (url) {
            case "login_url":
                LogInService.isLogInPageDisplayed(url);
                break;
            case "tracker_url":
                TrackerService.isTrackerPageDisplayed(url);
                break;
            case "reset_password_url":
                LogInService.isResetPasswordPageDisplayed(url);
                break;
        }

    }

    @Then("error message (.*) is displayed")
    public void errorMessageIsDisplayed(String error) {
        LogInService.showErrorMessage(error);

    }

    @Then("password (.*) is displayed")
    public void passwordIsDisplayed(String password) {
        LogInService.passwordIsDisplayed(password);
    }

//   @And("user had input password {}")
//   public void userHadInputPassword(String arg0) {
//   }


    @Then("password is hidden")
    public void passwordIsHidden(String password) {
        LogInService.passwordIsHidden(password);
    }

//   @And("(.*) button isn't enabled")
//   public void isNotEnabled(String button) {
//       LogInService.disableButton(button);
//   }

}