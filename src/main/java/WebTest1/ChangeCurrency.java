package WebTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ChangeCurrency extends Utils {
    private By _currency = By.id("customerCurrency");
    private String currency = "Euro";

    //user click currency from dropdown
    public void userselectcurrency()
    {
        selectFromDropdownByVisibleText(_currency, currency);
    }

    //verify all Web element got chosen euro currency
    public void verifyCurrency() {
        SoftAssert softAssert = new SoftAssert();
        List<WebElement> productList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement we : productList)
        {
            System.out.println(we.getText());
            softAssert.assertTrue(we.getText().contains("Ђ"), "$ not found" + we.getText());
            System.out.println("This is euro currency");
            System.out.println("************");
        }
        softAssert.assertAll();
    }
}