package carlosbrandao;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Atividade02Selenium extends Hooks {

    @Test
    @DisplayName("Seu Madruga - Login com SUCESSO")

    public void testeLoginComSucesso() throws InterruptedException {

        By pathInputLogin = By.id("email");
        By pathInputPass = By.id("senha");
        By pathBtnLogin = By.cssSelector(".btn");

        driver.get("https://seubarriga.wcaquino.me/login");
        driver.findElement(pathInputLogin).sendKeys("seumadrugaselenium@yopmail.com");
        driver.findElement(pathInputPass).sendKeys("123123123");
        driver.findElement(pathBtnLogin).click();

        Thread.sleep(2000);
    }
}
