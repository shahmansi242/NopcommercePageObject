package WebTest1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {
    //wait for click on element method
    public static void clickOnElement(By by) {
        // driver.findElement(by).click();
        driver.findElement(by).click();

    }

    public static void clickOnComputers(By by) {
        driver.findElement(by).click();
    }

    //wait for clickable method
    public static void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void clickOnNotBook(By by) {
        driver.findElement(by).click();
    }

    //wait for visibility method
    public static void waitForVisibility(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //wait for Elements is present method
    public static void waitForElementsIsPresent(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    //enter text method
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
        waitForClickable(by, 60);

    }

    //get text from element method
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //select from dropdown by value method
    public static void selectFromDropdownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //select from dropdown by visible text method
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //select from dropdown by index method
    public static void selectFromDropdownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    //time stamp method
    public static String timeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.ss").format(new Date());
        //  DateFormat dateFormat = new SimpleDateFormat("ddmmyyhhmmss");
        //  Date date = new Date();
        // return (dateFormat.format(date));

    }

    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    public static void sendText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void assertTextMessage(String message, String expected, By by) {
        String actual = getTextFromElement(by);
        Assert.assertEquals(message, expected, actual);
    }
    public static void assertText(String message,By by){
    }

}

