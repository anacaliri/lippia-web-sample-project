package lippia.web.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.ProjectsService;
import lippia.web.services.TrackerService;

public class TrackerSteps {

    private Object ProjectService;

    @Given("^user is logged in Clockify with email (.*) and password (.*)$")
    public void userIsLoggedIn(String email, String password) {
        LoginService.doLogIn(email, password);
    }
    @When("^user clicks option (.*) from the menu$")
    public void userClicksOptionFromTheMenu(String button) {
        TrackerService.click(button);
    }

    @Then("^user is in (.*) to start creating projects$")
    public void userGoesToProjects(String url) {
        ProjectsService.navigateTo(url);
    }


}
