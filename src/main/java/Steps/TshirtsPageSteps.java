package Steps;

import Pages.TshirtsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TshirtsPageSteps{

    TshirtsPage tshirtsPage = new TshirtsPage();
    @When("^customer adds the product to cart$")
    public void customerAddsTheProductToCart() {
        tshirtsPage.addToCart();

    }

    @Then("^customer is able to see the tshirts getting displayed$")
    public void customerIsAbleToSeeTheTshirtsGettingDisplayed() {
        tshirtsPage.assertTshirtsLoaded();
    }

    @Then("^customer is able to see the item added to the cart$")
    public void customerIsAbleToSeeTheItemAddedToTheCart() {

        tshirtsPage.assertItemsAdded();
    }
}
