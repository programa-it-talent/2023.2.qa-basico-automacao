package edinetesousa;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class Aula02_Selenium extends Hooks {

    @Test
    @DisplayName("Cenario: Acessando o site kabum")
    public void aula02() {
        driver.get("https://www.kabum.com.br/");
        By pathInputPesquisa = By.id("input-busca");
        driver.findElement(pathInputPesquisa).sendKeys("Gamer");
        By pathBtnPesquisa = By.xpath("(//button[@type='submit'])[1]");
        driver.findElement(pathBtnPesquisa).click();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}