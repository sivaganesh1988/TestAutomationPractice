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
}
