package WebTest1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    public void openBrowser(){
       // System.setProperty("webdriver.chrome.driver", "src/test/java/BrowserDriver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/test/Resourses/BrowserDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        driver.quit();
    }

}
