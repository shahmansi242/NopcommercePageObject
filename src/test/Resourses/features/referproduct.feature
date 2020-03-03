Feature: registerUserShouldAbleToReferAFriendSuccessfully


  @referproduct
  Scenario: register user should be able to refer a product to friend successfully
    Given  user is on register page
    When register user click on computer categories
    And user select products to refer a friend
    Then register user should be able to refer a friend successfully