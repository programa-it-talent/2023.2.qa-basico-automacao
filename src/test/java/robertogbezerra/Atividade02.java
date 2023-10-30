package robertogbezerra;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Atividade02 extends Hooks {
    public static final  String SITE_URL = "https://www.youtube.com/";
    public static final  String QUERY_STRING = "E2E Automation With Selenium Webdriver";
    By pathSearchInput = By.cssSelector("input#search");
    By pathSubmitButton = By.cssSelector("button#search-icon-legacy");

    @Test
    @DisplayName("Automação end-to-end de pesquisa no Youtube")
    public void searchOnYoutube() throws InterruptedException {
        driver.get(SITE_URL);
        driver.findElement(pathSearchInput).sendKeys(QUERY_STRING);
        driver.findElement(pathSubmitButton).click();
        Thread.sleep(8000);
    }
}
