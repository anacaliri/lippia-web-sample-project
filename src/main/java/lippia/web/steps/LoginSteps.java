package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.ResetService;
import lippia.web.services.TrackerService;

public class LoginSteps {

    @Given("^user already is in (.*)$")
    public void userIsInLogIn(String url) {
        LoginService.navigateTo(url);
    }


    @When("^user clicks (.*) button to log in manually$")
    public void clickOnLogInManuallyButton(String button) {
        LoginService.clickOnLogInManuallyButton(button);
    }

    @And("^user clicks (.*) button to log in$")
    public void clickOnLogInButton(String button) {
        LoginService.clickOnLogInButton(button);
    }

    @When("^user inputs email (.*)$")
    public void userInputsEmail(String email) {
        LoginService.inputEmail(email);
    }

    @And("^user inputs password (.*)$")
    public void userInputsPassword(String password) {
        LoginService.inputPassword(password);
    }


    @And("^user clicks (.*) button to show password$")
    public void userShowsPassword(String button) {
        LoginService.showPassword(button);
    }

    @And("^user clicks (.*) button to hide password$")
    public void userHidesPassword(String button) {
        LoginService.hidePassword(button);
    }

    @And("^user clicks (.*) button to reset password$")
    public void userClickOnResetButton(String button) {
        LoginService.clickOnReset(button);
    }

    @Then("^error (.*) is displayed$")
    public void invalidCredentialsErrorIsDisplayed(String error) {
        LoginService.showInvalidCredentialsError(error);

    }
    @Then("^(.*) email error is displayed$")
    public void requiredEmailErrorIsDisplayed(String error) {
        LoginService.showRequiredEmailError(error);
    }


    @Then("^(.*) password error is displayed$")
    public void requiredPasswordErrorIsDisplayed(String error) {
        LoginService.showRequiredPasswordError(error);
    }

    @Then("^password (.*) is displayed$")
    public void passwordIsDisplayed(String password) {
        LoginService.passwordIsDisplayed(password);
    }

    @Then("password is hidden")
    public void passwordIsHidden(String password) {
        LoginService.passwordIsHidden(password);
    }

    @Then("^user is in (.*) to Log In$")
    public void userGoesToLogIn(String url) {
        LoginService.navigateTo(url);
    }

    @Then("^(.*) button is (.*)$")
    public void logInButtonIsDisable(String locator, String attribute) {
        LoginService.disableButton(locator, attribute);
    }
    @Then("^user is in (.*) to reset the password$")
    public void userGoesToReset(String url) {
        ResetService.navigateTo(url);
    }
    @Then("^user is in (.*) to start tracking work$")
    public void userGoesToTracker(String url) {
        TrackerService.navigateTo(url);
    }


    @And("^user enables input email")
    public void userEnablesInputEmail() {
        LoginService.enableInputEmail();
    }
    @And("user enables input (.*)$")
    public void userEnablesInputPassword(String input) {
        LoginService.enableInputPassword(input);
    }
}
