package WebTest1;

import org.openqa.selenium.By;

public class PaymentMethod extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _checkbox = By.xpath("//input[@id='paymentmethod_1']");
    private By _continue = By.xpath("//input[@onclick='PaymentMethod.save()']");
    private By _dropdown = By.xpath("//select[@class='dropdownlists']");
    String card = "MasterCard";
    private By _cardHolderName = By.xpath("//input[@id='CardholderName']");
    private By _cardNumber = By.xpath("//input[@name='CardNumber']");
    private By _expireMonth = By.xpath("//select[@name='ExpireMonth']");
    private int exoireMonth = 1;
    private By _expireYear = By.xpath("//select[@name='ExpireYear']");
    private String expireyear = "2025";
    private By _cardcode = By.xpath("//input[@name='CardCode']");
    private By _contine1 = By.xpath("//input[@onclick='PaymentInfo.save()']");
    private By _confirm = By.xpath("//input[@onclick='ConfirmOrder.save()']");

    String cardHolderName = loadProp.getProperty("cardHolderName");
    String cardNumber =loadProp.getProperty ("cardNumber");
    String cardcode = loadProp.getProperty("cardcode");



       // user choose payment method and fil the details
    public void userChoosPaymentMethod(){
        clickOnElement(_checkbox);
        clickOnElement(_continue);
        selectFromDropdownByValue(_dropdown,"MasterCard");
        enterText(_cardHolderName,cardHolderName);
        enterText(_cardNumber,cardNumber);
        selectFromDropdownByIndex(_expireMonth,exoireMonth);
        selectFromDropdownByValue(_expireYear,expireyear);
        enterText(_cardcode,cardcode);
        clickOnElement(_contine1);
        clickOnElement(_confirm);

    }

}
