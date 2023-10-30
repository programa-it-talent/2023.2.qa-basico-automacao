package amitair;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Aula02Selenium extends Hooks{
    @Test
    @DisplayName("Cenario: Acessando o site da Amazon")
    public void aula02() {
        driver.get("https://www.amazon.com.br/");
        By pathInputPesquisa = By.id("twotabsearchtextbox");
        driver.findElement(pathInputPesquisa).sendKeys("Iphone");

        By pathBtnPesquisa = By.id("nav-search-submit-button");
        driver.findElement(pathBtnPesquisa).click();

        try{
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
