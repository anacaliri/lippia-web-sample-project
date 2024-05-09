package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInService;
import lippia.web.services.ResetService;
import lippia.web.services.TrackerService;

public class LogInSteps {

    @Given("^user already is in (.*)$")
    public void userIsInLogIn(String url) {
        LogInService.navigateTo(url);
    }


    @When("^user clicks (.*) button to log in manually$")
    public void clickOnLogInManuallyButton(String button) {
        LogInService.clickOnLogInManuallyButton(button);
    }

    @And("^user clicks (.*) button to log in$")
    public void clickOnLogInButton(String button) {
        LogInService.clickOnLogInButton(button);
    }

    @When("^user inputs email (.*)$")
    public void userInputsEmail(String email) {
        LogInService.inputEmail(email);
    }

    @And("^user inputs password (.*)$")
    public void userInputsPassword(String password) {
        LogInService.inputPassword(password);
    }


    @And("^user clicks (.*) button to show password$")
    public void userShowsPassword(String button) {
        LogInService.showPassword(button);
    }

    @And("^user clicks (.*) button to hide password$")
    public void userHidesPassword(String button) {
        LogInService.hidePassword(button);
    }

    @And("^user clicks (.*) button to reset password$")
    public void userClickOnResetButton(String button) {
        LogInService.clickOnReset(button);
    }

    @Then("error (.*) is displayed$")
    public void invalidCredentialsErrorIsDisplayed(String error) {
        LogInService.showInvalidCredentialsError(error);

    }
    @Then("(.*) email error is displayed$")
    public void requiredEmailErrorIsDisplayed(String error) {
        LogInService.showRequiredEmailError(error);
    }


    @Then("(.*) password error is displayed$")
    public void requiredPasswordErrorIsDisplayed(String error) {
        LogInService.showRequiredPasswordError(error);
    }

    @Then("password (.*) is displayed$")
    public void passwordIsDisplayed(String password) {
        LogInService.passwordIsDisplayed(password);
    }

    @Then("password is hidden")
    public void passwordIsHidden(String password) {
        LogInService.passwordIsHidden(password);
    }

    @Then("^user is in (.*)$")
    public void userGoesToLogIn(String url) {
        LogInService.navigateTo(url);
    }

    @Then("(.*) button is (.*)$")
    public void logInButtonIsDisable(String locator, String attribute) {
        LogInService.disableButton(locator, attribute);
    }
    @Then("^user is in (.*) to reset the password$")
    public void userGoesToReset(String url) {
        ResetService.navigateTo(url);
    }
    @Then("user is in (.*) to start tracking projects$")
    public void userGoesToTracker(String url) {
        TrackerService.navigateTo(url);
    }


    @And("user enables input email")
    public void userEnablesInputEmail() {
        LogInService.enableInputEmail();
    }
    @And("user enables input (.*)$")
    public void userEnablesInputPassword(String input) {
        LogInService.enableInputPassword(input);
    }
}
