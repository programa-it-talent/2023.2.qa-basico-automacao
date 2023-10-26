package mickhill;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Aula03MapeandoObjeto extends Hooks
{
    By pathInputPesquisa = By.id("APjFqb");

    @Test
    @DisplayName("Teste do Google")
    public void testeGoogle() throws InterruptedException
    {
        driver.get("https://google.com.br");
        driver.findElement(pathInputPesquisa).sendKeys("Mick Lindo!");
        Thread.sleep(2000);
    }
}
