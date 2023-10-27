package edinetesousa;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Aula03_MapeamentoObjeto extends Hooks {

    By pathInputPesquisa = By.id("APjFqb");

    @Test
    @DisplayName("Teste do google")
    public void testeGoogle() throws InterruptedException
    {

        driver.get("https://www.google.com.br/");
        driver.findElement(pathInputPesquisa).sendKeys("Edinete Sousa");
        Thread.sleep(2000);
    }
}

