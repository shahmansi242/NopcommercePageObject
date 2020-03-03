Feature: user is able to change currency symbol

  @changecurrency
  Scenario: user is able to change currency symbol
    Given user is on home page
    When user select currency from dropdown
    Then user should be able to change currencysymbol

