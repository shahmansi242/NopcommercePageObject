package WebTest1;

import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.urlContains;

public class JewelryPage extends Utils{
   private By _product1 = By.xpath("//input[contains(@onclick, '/compareproducts/add/40')]");
   private By _product2 = By.xpath("//input[contains(@onclick,'/compareproducts/add/41')]");
   private By _comparisonLink = By.xpath("//a[text()='product comparison']");
   private By _product = By.xpath("//input[@value='Add to cart']");
   private By _addtocart = By.xpath("//span[@class='cart-label']");
   private By _checkbox = By.xpath("//input[@id='termsofservice']");
   private By _checkout = By.xpath("//button[@type='submit']");

   //verify that user os on jewelry category page
    public void verifyUserIsOnJewelryPage(){
       assertURL("jewelry");
    }
    // user choose product to compare
    public void chooseProductsToCompare(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
           e.printStackTrace();
        }

        clickOnElement(_product1);
        try {
            Thread.sleep(2000);
    }catch (InterruptedException e){
          e.printStackTrace();
       }
       clickOnElement(_product2);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
           e.printStackTrace();
        }
       clickOnElement(_comparisonLink);
    }
      // user click on add to cart product
    public void addToCartProduct(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_product);

        clickOnElement(_addtocart);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_checkbox);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_checkout);

    }



}
