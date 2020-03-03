package org.example;

import WebTest1.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewelryPage jewelryPage = new JewelryPage();
    ProductComparison productComparison = new ProductComparison();
    Catagories catagories = new Catagories();
    EmailFriendPage emailFriendPage = new EmailFriendPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    Computers computers = new Computers();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    CheckOutResult checkOutResult = new CheckOutResult();
    NewsPage newsPage = new NewsPage();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    AddToCartButton addToCartButton = new AddToCartButton();


    //user is register successfully 1
    @Given("user is on register page")
    public void userIsOnRegisterPage() throws InterruptedException {
        homePage.clickonregisterbutton();
        registrationPage.verifyUserOnRegisterPage();
    }
    @When("user enters all registration details")
    public void userEntersAllRegistrationDetails() {
        registrationPage.verifyUserOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
    }
    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
    }
    @Then("user should able to register successfully")
    public void userShouldAbleToRegisterSuccessfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    // user should be able to compare two different product 2
    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.verifyUserIsOnHomePage();
    }
    @When("user click on jewelry categories page")
    public void userClickOnJewelryCategoriesPage() {
        homePage.clickOnJewellery();
        jewelryPage.verifyUserIsOnJewelryPage();
    }
    @And("user compare two different products")
    public void userCompareTwoDifferentProducts() {
        jewelryPage.chooseProductsToCompare();
    }
    @Then("user should be able to compare two different products successfully")
    public void userShouldBeAbleToCompareTwoDifferentProductsSuccessfully() {
        productComparison.VerifyUserIsOnComparisionPage();
    }

    // register user should be able to refer a friend successfully 3
    @When("register user click on computer categories")
    public void registerUserClickOnComputerCategories() {
        registrationPage.userEnterRegistrationDetails();
        homePage.clickOnComputerCategory();
    }
    @And("user select products to refer a friend")
    public void userSelectProductsToReferAFriend() {
        catagories.userClickOnNoteBook();
        catagories.userClickOnAppleMac();
    }
    @Then("register user should be able to refer a friend successfully")
    public void registerUserShouldBeAbleToReferAFriendSuccessfully() {
        catagories.UserReferToFriend();
    }

    // non register user should not be able to refer a product to friend 4
    @Given("Given user is on home page")
    public void givenUserIsOnHomePage() {
        homePage.verifyUserIsOnHomePage();
    }
    @When("When user navigate to computer categories page")
    public void whenUserNavigateToComputerCategoriesPage() {
        homePage.clickOnComputerCategory();
        productDetailPage.verifyUserOnComputerCatagoriesPage();
    }
    @And("And user select products to refer a friend")
    public void andUserSelectProductsToReferAFriend() {
        productDetailPage.userClickOnNoteBook();
        productDetailPage.userClickOnAppleMac();
        productDetailPage.UserReferToFriend();
    }
    @Then("non register user should not be able to refer a product to friend")
    public void nonRegisterUserShouldNotBeAbleToReferAProductToFriend() {
        productDetailPage.verifyUserNotRegisterUserSeeErrorMessage();
    }

      //user should be able to sort product high to low by price 5
    @When("user navigate to computer categories page")
    public void userNavigateToComputerCategoriesPage() {
        homePage.clickOnComputerCategory();
        catagories.verifyUserOnComputerCatagoriesPage();
    }
    @And("user click on product")
    public void userClickOnProduct() {
        computers.userClickOnNoteBook();
    }
    @And("user click on filter sort by high to low")
    public void userClickOnFilterSortByHighToLow() {
        computers.userSelectFromPositionPriceHighToLow();
    }
    @Then("user should be able to sort product high to low by price")
    public void userShouldBeAbleToSortProductHighToLowByPrice() {
        computers.verifyUserShouldBeAbleToSeePriceHighToLow();
    }

    // guest user should be able to checkout successfully 6
    @When("user navigate to jewellery category page")
    public void userNavigateToJewelleryCategoryPage() {
        homePage.clickOnJewellery();
        jewelryPage.verifyUserIsOnJewelryPage();
    }
    @And("user select add to cart product")
    public void userSelectAddToCartProduct() {
        jewelryPage.addToCartProduct();
    }
    @And("user checkout as a guest")
    public void userCheckoutAsAGuest() {
        guestCheckout.checkoutAsGuest();
    }
    @And("user click on shipping address")
    public void userClickOnShippingAddress() {
        shippingAddress.userShippingAddress();
    }
    @And("user select payment method")
    public void userSelectPaymentMethod() {
        paymentMethod.userChoosPaymentMethod();
    }
    @Then("guest user should be able to checkout successfully")
    public void guestUserShouldBeAbleToCheckoutSuccessfully() {
        checkOutResult.verifycheckoutsuccessmessage();
    }

    // guest user should be able to add new comment on website 7
    @When("user click on view news archive")
    public void userClickOnViewNewsArchive() {
        homePage.clickOnViewNewsArchive();
    }
    @And("user click on details")
    public void userClickOnDetails() {
        newsPage.userClickOnDetails();
    }
    @Then("guest user should be able to add new comment on website")
    public void guestUserShouldBeAbleToAddNewCommentOnWebsite() {
        newsPage.verifysuccessmessageofcomment();
    }

    // user should be able to change currency symbol 8
    @When("user select currency from dropdown")
    public void userSelectCurrencyFromDropdown() {
        homePage.verifyUserIsOnHomePage();
        changeCurrency.selectCurrencyFromDropDown();
    }
    @Then("user should be able to change currencysymbol")
    public void userShouldBeAbleToChangeCurrencysymbol() {
        changeCurrency.verifyCurrencySymbolPresent();
    }

    // verify add to cartbutton is present 9
    @Then("Then user should be able to see add to cart button is present on feature products")
    public void thenUserShouldBeAbleToSeeAddToCartButtonIsPresentOnFeatureProducts() {
        homePage.verifyUserIsOnHomePage();
        addToCartButton.verifyAddToCartButton();
    }
}
