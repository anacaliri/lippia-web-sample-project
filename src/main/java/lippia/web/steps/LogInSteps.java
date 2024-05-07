package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInService;
import lippia.web.services.TrackerService;

public class LogInSteps {

    @Given("^user is in (.*)$")
    public void userIsInLogInPage(String url) {
        LogInService.isLogInPageLoaded(url);
    }

    @And("^user clicks (.*) button$")
    public void userClicksButton(String button) {
        switch (button) {
            case "Log in manually":
                LogInService.pressLogInManuallyButton();
                break;
            case "Log in":
                LogInService.pressLogInButton();
                break;
        };
    }
    @When("^user inputs email (.*)$")
    public void userInputsEmail(String email) {
        LogInService.inputEmail(email);
    }

    @And("^user inputs password (.*)$")
    public void userInputsPassword(String password) {
        LogInService.inputPassword(password);
    }

//    @And("user clicks (.*) button")
//    public void userClicksButton() {
//        LogInService.pressLogInButton();
//    }


    //   @And("user clicks (.*) button")
 //   public void userClicksButton() {
 //       LogInService.pressEyeButton();
 //   }
  // @Then("^(.*) page is displayed$")
  // public void trackerPageIsDisplayed(String url) {
  //     TrackerService.isTrackerDisplayed(url);
  // }


  // @Then("^(.*) page is displayed$")
  // public void logInPageIsDisplayed(String url) {
  //     LogInService.isLogInPageLoaded(url);
  // }
    @Then("^(.*) page is displayed$")
    public void pageIsDisplayed(String url) {
        switch (url) {
            case "login_url":
                LogInService.isLogInPageDisplayed(url);
                break;
            case "tracker_url":
                TrackerService.isTrackerPageDisplayed(url);
                break;
        }
        ;
    }
}
//   @Then("error message (.*) is displayed")
 //   public void errorMessageIsDisplayed(String error) {
 //       LogInService.showErrorMessage(error);
 //   }

//   @Then("password (.*) is displayed")
//   public void passwordIsDisplayed(String password) {
//       LogInService.showPassword();
//   }

//   @And("user had input password {}")
//   public void userHadInputPassword(String arg0) {
//   }

//   @And("user had clicked the eye button to show the password")
//   public void userHadClickedTheEyeButtonToShowThePassword() {
//   }

//   @Then("password is hidden")
//   public void passwordIsHidden() {
//   }

//   @And("(.*) button isn't enabled")
//   public void isNotEnabled(String button) {
//       LogInService.disableButton(button);
//   }

