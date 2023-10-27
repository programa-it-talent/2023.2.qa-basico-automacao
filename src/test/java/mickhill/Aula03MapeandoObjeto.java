package mickhill;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Aula03MapeandoObjeto extends Hooks
{
    //By pathInputPesquisa = By.id("APjFqb");
    //By pathInputPesquisa = By.cssSelector("textarea#APjFqb.gLFyf");
    By pathInputPesquisa = By.xpath("//textarea[@id='APjFqb']"); // Caminho relativo

    @Test
    @DisplayName("Teste do Google")
    public void testeGoogle() throws InterruptedException
    {
        driver.get("https://google.com.br");
        driver.findElement(pathInputPesquisa).sendKeys("Mick Lindo!");
        Thread.sleep(5000);
    }
}
