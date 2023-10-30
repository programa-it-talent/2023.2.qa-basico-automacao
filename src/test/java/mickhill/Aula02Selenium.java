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
        driver.get("https://front.serverest.dev/login");
        By pathInputPesquisa = By.id("data-testid");
        driver.findElement(pathInputPesquisa).sendKeys("Tio mick estribado");

        By pathBtnPesquisa = By.xpath("(//input[@name='btnK'])[2]");
        driver.findElement(pathBtnPesquisa).click();
        Thread.sleep(5000);
    }
}
