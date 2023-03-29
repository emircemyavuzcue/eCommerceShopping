Feature: includes scenarios for the smoke test suite

  @purchase
  Scenario: Purchasing a product on Cue Health
    Given The user clicks login icon and logs in with correct credentials
    And The user goes to main page
    And The user goes to Respiratory Health section on Products module
    And The user adds a random Respiratory Health product to the cart and checks out
    And The user adds fills the information boxes and clicks continue to payment
    And The user fills payment information and clicks Pay Now button
    Then The user makes sure the payment is successfull