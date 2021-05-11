Feature: Update personal information

  Scenario: Update firstname of customer

    Given customer is already signed up for the ordering website
    When customer navigates to login page
    Then customer is navigated to personaldetails page
    When customer updates the firstname and submits the form
    Then firstname should be updated sucessfully
