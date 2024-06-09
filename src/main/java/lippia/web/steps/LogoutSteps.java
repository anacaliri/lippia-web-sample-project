package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.LogoutService;

public class LogoutSteps {
    @Given("^user is logged in with email (.*) and password (.*)$")
    public void userIsLoggedIn(String email, String password) {
        LoginService.doLogIn(email, password);
    }

    @When("^user clicks (.*) button$")
    public void userClicksOnAvatarButton(String button) {
        LogoutService.clickOnAvatar(button);
    }

    @And("^user clicks (.*) button to log out$")
    public void userClicksOnLogoutButton(String button) {
        LogoutService.clickOnLogOutButton(button);
    }
}
