package WebTest1;

import org.openqa.selenium.By;

public class ShippingAddress extends Utils {
    private By _continue = By.xpath("//input[@onclick='ShippingMethod.save()']");


     //user confirm shipping addred and method
    public void userShippingAddress()
    {
        clickOnElement(_continue);
    }

}
