package Steps;

import Pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("^customer is already signed in the ordering website$")
    public void customerIsAlreadySignedInTheOrderingWebsite() {
        homePage.navigateToHomePage();
    }

    @When("^customer navigates to tshirts page from homepage$")
    public void customerNavigatesToShirtspage() {
        homePage.GotoTshirtsPage();
    }

    @Given("^customer is already signed up for the ordering website$")
    public void customerIsAlreadySignedUpForTheOrderingWebsite() {
homePage.navigateToHomePage();
    }

    @When("^customer navigates to login page$")
    public void customerNavigatesToLoginPage() {
        homePage.clickLogin();
    }
}
