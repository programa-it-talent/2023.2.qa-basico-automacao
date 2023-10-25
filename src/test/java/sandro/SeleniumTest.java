package sandro;

import mickhill.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SeleniumTest extends Hooks
{
    @Test
    public void test2() throws InterruptedException {

        driver.get("https://seubarriga.wcaquino.me/login");
        By campoEmail = By.id("email");
        By campoSenha = By.id("senha");
        By btnEntrar = By.cssSelector("button[type=submit]");

        driver.findElement(campoEmail).sendKeys("teste@teste.com");
        driver.findElement(campoSenha).sendKeys("123456");
        driver.findElement(btnEntrar).click();
        Thread.sleep(5000);
    }
}
