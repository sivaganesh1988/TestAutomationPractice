Feature: Purchase Tshirt

  Scenario: Purchase Tshirt and validate the order details in order history

    Given customer is already signed in the ordering website
    When customer navigates to tshirts page from homepage
    Then customer is able to see the tshirts getting displayed

    When customer adds the product to cart
    Then customer is able to see the item added to the cart
    When customer validates and proceeds further for checkout
    Then customer is shown the loginpage
    When customer enters valid credentials and logsin
    Then customer should be taken to Address section
    When customer validates and proceeds further for checkout
    Then customer should be taken to shipping section
    When customer agrees to the terms and proceeds further for checkout







