package mickhill;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Aula02Selenium extends Hooks
{
    @Test
    @DisplayName("Cenario: usando o navegador")
    public void teste02() throws InterruptedException
    {
        By pathInputPesquisa = By.id("APjFqb");
        driver.findElement(pathInputPesquisa).sendKeys("Tio mick estribado");

        By pathBtnPesquisa = By.xpath("(//input[@name='btnK'])[2]");
        driver.findElement(pathBtnPesquisa).click();
        Thread.sleep(5000);
    }
}
