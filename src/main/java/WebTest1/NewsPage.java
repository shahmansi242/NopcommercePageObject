package WebTest1;

import org.openqa.selenium.By;

public class NewsPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _news = By.xpath("//a[contains(@href,'about')and(@class='read-more')]");
    private By _title = By.xpath("//input[@class='enter-comment-title']");
    private By _comment = By.xpath("//textarea[@class='enter-comment-text']");
    private By _newcomment = By.xpath("//input[@name = 'add-comment']");
    private By _successmessage = By.xpath("//div[contains(text(),'successfully ')]");

     String title = loadProp.getProperty("title");
     String comment = loadProp.getProperty("comment");


    //user click on details and write the comment
    public void userClickOnDetails(){
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_news);
        enterText(_title,title);
        enterText(_comment,comment);
        clickOnElement(_newcomment);

    }

    public void verifysuccessmessageofcomment(){
        String expected = "new comment is successfully added.";
        assertTextMessage("News comment is successfully added.",expected,_successmessage);
    }






}
