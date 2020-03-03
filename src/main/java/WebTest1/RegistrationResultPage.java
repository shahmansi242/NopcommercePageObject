package WebTest1;

import org.openqa.selenium.By;

public class RegistrationResultPage extends Utils {
    private By _registerSuccessMessage = By.className("result");
  // private By _registerSuccessMessage = By.id("register-button");
   // private By _registerSuccessMessage = By.cssSelector("div.result");
    String expected = "Your registration completed !";

    public void verifyUserSeeRegistrationSuccessMessage(){
        //assertURL("registerresult");
        assertTextMessage("Registration not successful....",expected,_registerSuccessMessage);
    }


}
