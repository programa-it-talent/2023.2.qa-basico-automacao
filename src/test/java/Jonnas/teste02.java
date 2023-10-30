package Jonnas;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class teste02 extends Hooks

    {
        @Test
        @DisplayName("Cenario: usando o navegador")
        public void teste02() throws InterruptedException
        {
            driver.get("https://front.serverest.dev/login");
            By pathInputPesquisa = By.id("email");
            driver.findElement(pathInputPesquisa).sendKeys("Selenium is good");
        }
    }
