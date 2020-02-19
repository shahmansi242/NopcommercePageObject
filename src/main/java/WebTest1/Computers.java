package WebTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Computers extends Utils {
    private By _noteBooks = By.linkText("Notebooks");
    private By _dropDown = By.id("products-orderby");
    private String priceHighToLow = "Price: High to Low";
     //verify that user click on notebook category
    public void userClickOnNoteBook() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_noteBooks);
    }
    public void userSelectFromPositionPriceHighToLow(){
        //verify that user click on dropdown price high to low
        selectFromDropdownByVisibleText(_dropDown,priceHighToLow);
    }

}