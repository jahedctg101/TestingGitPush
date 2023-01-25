Feature: Amazon Product List Verification

  Scenario: Verify Amazon Product List
    Given I am in the Amazon Homepage
    And I change the delivery location
    And I seacrh Product
    Then Verify Product page
