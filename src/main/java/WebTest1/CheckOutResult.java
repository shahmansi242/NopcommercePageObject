package WebTest1;

import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class CheckOutResult extends Utils {
    private By _checkoutsuccessmessage = By.xpath("//strong[contains(text(),'processed')]");

       // user verify checkout success message
    public void verifycheckoutsuccessmessage()
    {

        String expected = "Your order has not been successfully processed!";
        assertTextMessage("checkout is not successful",expected,_checkoutsuccessmessage);
    }

}
