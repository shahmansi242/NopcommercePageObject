Feature: Guest user should be able to checkout successfully

  @guestusercheckout
  Scenario: Guest user should be able to checkout successfully
    Given user is on home page
    When user navigate to jewellery category page
    And user select add to cart product
    And user checkout as a guest
    And user click on shipping address
    And user select payment method
    Then guest user should be able to checkout successfully