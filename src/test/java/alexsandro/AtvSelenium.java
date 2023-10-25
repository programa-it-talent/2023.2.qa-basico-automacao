package alexsandro;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AtvSelenium extends Hooks {

    @Test
    @DisplayName("Cenario: usando o navegador")
    public void teste02() throws InterruptedException {
        driver.get("https://bb.com.br");


    }
}
