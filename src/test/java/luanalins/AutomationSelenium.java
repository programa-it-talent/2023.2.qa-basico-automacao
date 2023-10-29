package luanalins;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class AutomationSelenium extends Hooks {
    @Test
    @DisplayName("Busca de CD's da Taylor Swift na Amazon")
    public void SearchingTayTayCD() throws InterruptedException {
        driver.get("https://www.amazon.com.br/");
        By pathInputSearch = By.xpath("//*[@id='twotabsearchtextbox']");
        driver.findElement(pathInputSearch).sendKeys("Taylor Swift");

        By pathButtonSearch = By.xpath("//*[@id=\"nav-search-submit-button\"]");
        driver.findElement(pathButtonSearch).click();

        By pathFilterSearch = By.xpath("//*[@id=\"p_n_binding_browse-bin/19416262011\"]/span/a/div/label/i");
        driver.findElement(pathFilterSearch).click();

        Thread.sleep(5000);

    }
}
