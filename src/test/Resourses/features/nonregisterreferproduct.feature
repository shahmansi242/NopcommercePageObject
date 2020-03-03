Feature: nonRegisterUserShouldNotBeAbleToReferAProductToaFriend


  @nonregisterreferproduct
  Scenario:  non register user should not be able to refer a product to friend
    Given  user is on home page
    When user navigate to computer categories page
    And   user select products to refer a friend
    Then  non register user should not be able to refer a product to friend
