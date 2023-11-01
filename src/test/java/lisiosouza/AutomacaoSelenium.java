package lisiosouza;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AutomacaoSelenium extends Hooks {
    @Test
    @DisplayName("Cenário: pesquisa no navegador")
    public void pesquisaGoogle() throws InterruptedException {

        this.driver.get("https://www.google.com.br/?hl=pt-BR");
        By pathInputSearch = By.xpath("//*[@id='APjFqb']");

        this.driver.findElement(pathInputSearch).sendKeys(new CharSequence[]{"vagas de qa Fortaleza"});
        By pathButtonSearch = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]");

        this.driver.findElement(pathButtonSearch).click();

        Thread.sleep(5000L);
    }
}
