package WebTest1;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Catagories extends Utils {
    private By _noteBooks = By.linkText("Notebooks");
    private By _appleMac = By.linkText("Apple MacBook Pro 13-inch");
    private By _email = By.xpath("//input[contains(@onclick,'/productemailafriend/')]");
    private By _friendEmail = By.xpath("//input[@class='friend-email']");
    private By _yourEmail = By.xpath("//input[@class='your-email']");
    private By _writeInTextBox = By.xpath("//*[@id='PersonalMessage']");
    private By _sendEmail = By.xpath("//input[@name = 'send-email']");
    private By _succesfullReferMessage = By.xpath("//*[class='result']");



    //Verify user on computer catagories page
    public void verifyUserOnComputerCatagoriesPage(){
       // clickOnElement();
       // assertURL("computers");
    }
    //verify user click on notebook category
    public void userClickOnNoteBook(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_noteBooks);
    }
    //verify user click on apple mac products
    public void userClickOnAppleMac()
    {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_appleMac);
    }
    //Refer to friend
    public void UserReferToFriend(){
        //click email refer
        clickOnElement(_email);
        //Enter details to refer a friend
        enterText(_friendEmail,"amit11@yahoo.co.uk");
        //click email refer
      //  enterText(_yourEmail,"mshah6135+"+timeStamp()+ "@gmail.com");
        //Enter text box
        enterText(_writeInTextBox,"I Like This Product,So you can Try it");
        //click send email button
        clickOnElement(_sendEmail);
        //assert Message
        String expected = "Your message has been sent";

      Assert.assertNotEquals(expected,_succesfullReferMessage);
    }



}
