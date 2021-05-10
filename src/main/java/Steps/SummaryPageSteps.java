package Steps;

import Pages.SummaryPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SummaryPageSteps {
    SummaryPage summaryPage = new SummaryPage();
    @When("^customer validates and proceeds further for checkout$")
    public void customerValidatesAndProceedsFurtherForCheckout() {
        summaryPage.proceedToCheckout();
    }


    @Then("^customer is shown the loginpage$")
    public void customerIsShownTheLoginSection() {
        summaryPage.assertLoginSectionLoaded();
    }


    @When("^customer enters valid credentials and logsin$")
    public void customerEntersValidCredentialsAndLogsin() {
        summaryPage.loginToApp();
    }

    @Then("^customer should be taken to Address section$")
    public void customerShouldBeTakenToAddressSection() {
        summaryPage.proceedToShipping();
    }

    @Then("^customer should be taken to shipping section$")
    public void customerShouldBeTakenToShippingSection() throws InterruptedException {
        Thread.sleep(5000);
        summaryPage.agreeToTerms();
    }

    @When("^customer agrees to the terms and proceeds further for checkout$")
    public void customerAgreesToTheTermsAndProceedsFurtherForCheckout() {
        summaryPage.proceedToCheckout();
    }
}
