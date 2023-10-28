package joaquimneto;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class aula02 extends Hooks
{
    @Test
    @DisplayName("Cenario: usando o navegador")
    public void teste02() throws InterruptedException
    {
        driver.get("https://login.live.com/");

        By pathInputLogin = By.id("i0116");
        driver.findElement(pathInputLogin).sendKeys("joaquim1995@hotmail.com");

        By pathBtnProximo = By.id("idSIButton9");
        driver.findElement(pathBtnProximo).click();

        Thread.sleep(2000);

        By pathInputPassword = By.id("i0118");
        driver.findElement(pathInputPassword).sendKeys("NaoVouColocarAMinhaSenha");

        driver.findElement(pathBtnProximo).click();

        Thread.sleep(5000);
    }
}
