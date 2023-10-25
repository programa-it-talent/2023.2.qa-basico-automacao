package mickhill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Aula02Selenium {
    @Test
    @DisplayName("Cenario: usando o navegador")
    public void teste02() throws InterruptedException {
        WebDriver driver = BrowserFactory.getBrowser();
        driver.get("https://google.com.br");
        By caminhoInputPesquisa = By.id("APjFqb");
        driver.findElement(caminhoInputPesquisa).sendKeys("Tio mick estribado");
        By cliclar = By.xpath("(//input[@name='btnK'])[2]");
        driver.findElement(cliclar).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
