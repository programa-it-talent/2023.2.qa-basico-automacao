package renato;

import mickhill.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Aula02Automacao extends Hooks {

    By pathInputEmail = By.id("email");
    By pathInputSenha = By.id("senha");
    By pathButton = By.xpath("//form['@div'][1]/button");

    By pathTextLogin = By.xpath("//body/div[@class]");


    @Test
    @DisplayName("Testando login")
    public void testandoLogin(){

        driver.get("http://seubarriga.wcaquino.me/login");
        driver.findElement(pathInputEmail).sendKeys("usuario@bol.com.br");
        driver.findElement(pathInputSenha).sendKeys("usuario123");
        driver.findElement(pathButton).click();

        Assertions.assertFalse(driver.getCurrentUrl().equals("http://seubarriga.wcaquino.me/login"));
        Assertions.assertTrue(driver.getPageSource().contains("Bem vindo, usuario!"));
    }
}
