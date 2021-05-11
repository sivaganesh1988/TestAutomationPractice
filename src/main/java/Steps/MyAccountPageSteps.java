package Steps;

import Pages.MyAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyAccountPageSteps {

    MyAccountPage myAccountPage = new MyAccountPage();
    @Given("^customer is navigated to personaldetails page$")
    public void customerIsAlreadySignedInTheOrderingWebsite() {
        myAccountPage.navigateToPersonalInfoPage();
    }

    @When("^customer updates the firstname and submits the form$")
    public void customerUpdatesTheFirstnameAndSubmitsTheForm() {
myAccountPage.updateFirstName();
    }

    @Then("^firstname should be updated sucessfully$")
    public void firstnameShouldBeUpdatedSucessfully() {


    }
}
