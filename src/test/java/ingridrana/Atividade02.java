package ingridrana;


import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Atividade02 extends Hooks {

    @Test
    @DisplayName("Cenario: teste com navegador")
    public void teste02() throws InterruptedException
    {
        driver.get("https://www.alura.com.br/");
        By pathInputPesquisa = By.id("header-barraBusca-form-campoBusca");
        driver.findElement(pathInputPesquisa).sendKeys("curso selenium");

        By pathBtnPesquisa = By.cssSelector("button.header__nav--busca-submit");
        driver.findElement(pathBtnPesquisa).click();
        Thread.sleep(5000);
    }
}