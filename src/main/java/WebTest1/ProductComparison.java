package WebTest1;

import org.junit.Assert;
import org.openqa.selenium.By;


    public class ProductComparison extends Utils {
        // comparison expected and actul
        String expected = "Compare products";
        private By _PageTitle = By.xpath("//div [@class='page-title']");
        public void VerifyUserIsOnComparisionPage(){
            assertTextMessage("page not found",expected,_PageTitle);
        }
    }


