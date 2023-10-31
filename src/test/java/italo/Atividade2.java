package italo;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Atividade2 extends Hooks {
    @Test
    @DisplayName("Pesquisando na Web")
    public void testando02() throws InterruptedException    {
        driver.get("https://google.com.br");
        By pathInputPesquisa = By.id("APjFqb");
        driver.findElement(pathInputPesquisa).sendKeys("Modo Futsal Fifa 23");

        By pathBtnPesquisa = By.xpath("(//input[@name='btnK'])[2]");
        driver.findElement(pathBtnPesquisa).click();
        Thread.sleep(5000);

    }
}
