package org.example;

import WebTest1.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewelryPage jewelryPage = new JewelryPage();
    ProductComparison productComparison = new ProductComparison();
    Catagories catagories = new Catagories();
    EmailFriendPage emailFriendPage = new EmailFriendPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    Computers computers = new Computers();
    SoftAssert softAssert = new SoftAssert();
    GuestCheckout guestCheckout = new GuestCheckout();
    ShippingAddress shippingAddress = new ShippingAddress();
    PaymentMethod paymentMethod = new PaymentMethod();
    CheckOutResult checkOutResult = new CheckOutResult();
    NewsPage newsPage = new NewsPage();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    AddToCartButton addToCartButton = new AddToCartButton();




    @Test
    public void userShouldAbleToRegisterSuccessfully(){

        homePage.clickOnRegisterButton();
        registrationPage.verifyUserOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();

    }
    @Test
    public void userShouldAbleToCompareTwoDifferentProductSuccessfully(){
        homePage.clickOnJewellery();
        jewelryPage.verifyUserIsOnJewelryPage();
        jewelryPage.chooseProductsToCompare();
        productComparison.VerifyUserIsOnComparisionPage();


    }
    @Test
    public void registerUserShouldAbleToReferAFriendSuccessfully(){
        homePage.clickOnRegisterButton();
        registrationPage.verifyUserOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        homePage.clickOnComputerCategory();
        catagories.verifyUserOnComputerCatagoriesPage();
        catagories.userClickOnNoteBook();
        catagories.userClickOnAppleMac();
        catagories.UserReferToFriend();
        emailFriendPage.verifyUserOnEmailAFriendPage();
        emailFriendPage.verifyUserSeeSuccessMessageOfEmailAFriend();
    }
    @Test
    public void nonRegisterUserShouldNotBeAbleToReferAProductToaFriend(){
        homePage.clickOnComputerCategory();
        productDetailPage.verifyUserOnComputerCatagoriesPage();
        productDetailPage.userClickOnNoteBook();
        productDetailPage.userClickOnAppleMac();
        productDetailPage.UserReferToFriend();

    }
    @Test
    public void userShouldBeAbleToSortProductHighToLowByPrice(){
        homePage.clickOnComputerCategory();
        computers.userClickOnNoteBook();
        computers.userSelectFromPositionPriceHighToLow();
    }
    @Test
    public void verifyAddToCompareButtonForEachProduct() {

        List<WebElement> productList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement we : productList) {
            System.out.println(we.getText());
            System.out.println("************");
           softAssert.assertTrue(we.getText().contains("£"),"£ not found"+we.getText());

        }
        softAssert.assertAll();

    }
    @Test
    public void verifyGuestUserShouldBeAbleToCheckOutSuccessfully() {
        homePage.clickOnJewellery();
        jewelryPage.verifyUserIsOnJewelryPage();
        jewelryPage.addToCartProduct();
        guestCheckout.checkoutAsGuest();
        shippingAddress.userShippingAddress();
        paymentMethod.userChoosPaymentMethod();
        checkOutResult.verifycheckoutsuccessmessage();
    }
    @Test
    public void guestUserShouldBeAbleToAddNewComment(){
        homePage.clickOnViewNewsArchive();
        newsPage.userClickOnDetails();
        newsPage.verifysuccessmessageofcomment();

    }
    @Test
    public void userShouldBeAbleToChangeTheCurrency(){
        changeCurrency.userselectcurrency();
        changeCurrency.verifyCurrency();


    }
    @Test
    public void verifyAddToCartButtonIsPresentOnAllFeaturedProduct(){
        addToCartButton.verifyAddToCartButton();


        }





}


