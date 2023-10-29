package josewinny;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AutomacaoSelenium extends Hooks {
    String url = "https://www.youtube.com/";
    String searchText = "Automação com Junit5 e Selenium";
    By pathSearchBox = By.cssSelector("input#search");
    By pathSearchButton = By.cssSelector("button#search-icon-legacy");
    @Test
    @DisplayName("Automação end-to-end de pesquisa")
    public void teste() throws InterruptedException {
        driver.get(url);
        driver.findElement(pathSearchBox).sendKeys(searchText);
        driver.findElement(pathSearchButton).click();
        Thread.sleep(8000);
    }
}
