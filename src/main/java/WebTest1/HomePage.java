package WebTest1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HomePage extends Utils {
    private By _registerLInk = By.linkText("Register");
    private By _jewelryLink = By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry')]");
    private By _computer = By.linkText("Computers");
    private By _viewNewsArchive = By.xpath("//a[contains(text(),'Archive')]");



    // verify that user click on register button
    public void clickOnRegisterButton() {
        clickOnElement(_registerLInk);
    }

    //verify that user click on jewellery category
    public void clickOnJewellery() {
        clickOnElement(_jewelryLink);
    }

    //verify that user click on computer category
    public void clickOnComputerCategory() {
        clickOnElement(_computer);
    }
     //verify that user click on News Archive
    public void clickOnViewNewsArchive()
    {
        clickOnElement(_viewNewsArchive);
    }




}
