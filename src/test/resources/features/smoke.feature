Feature: includes scenarios for the smoke test suite

  @purchaseFlowForBeta
  Scenario: Purchasing a product on Cue Health Beta environment
    Given The user clicks login icon
    And The user logs in with correct credentials
    And The user goes to main page
    And The user goes to Respiratory Health section on Products module
    And The user adds a random Respiratory Health product to the cart and checks out
    And The user adds fills the information boxes and clicks continue to payment
    And The user fills payment information and clicks Pay Now button
    Then The user makes sure the payment is successful
  @purchaseFlowForDev
  Scenario: Purchasing a product on Cue Health Dev environment
    Given The user clicks enter using your password icon and logs in with correct credentials
    And The user picks a random product on main page
    Then The user is on product detail page
    And The user picks a random preferred strength
    And The user picks a random monthly quantity
    And The user picks a random shipping frequency
    And The user clicks order now button
    And The user logs in with correct credentials
    And The user adds fills the information boxes and clicks continue to payment
    And The user fills payment information and clicks Pay Now button
    Then The user makes sure the payment is successful

