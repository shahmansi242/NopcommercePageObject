package org.example;

import WebTest1.*;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewelryPage jewelryPage = new JewelryPage();
    ProductComparison productComparison = new ProductComparison();
    Catagories catagories = new Catagories();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    Computers computers = new Computers();


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
}
