package karensousa;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AtividadeSelenium extends Hooks {
    @Test
    @DisplayName("Cenario: usando o navegador")
    public void teste02() throws InterruptedException
    {
        driver.get("https://google.com.br");
        By pathInputPesquisa = By.id("APjFqb");
        driver.findElement(pathInputPesquisa).sendKeys("mousepad");

        By pathBtnPesquisa = By.xpath("(//input[@name='btnK'])[2]");
        driver.findElement(pathBtnPesquisa).click();
        Thread.sleep(5000);
    }
}
