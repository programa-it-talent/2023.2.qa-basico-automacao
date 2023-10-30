package yohans;

import mickhill.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AutomacaoSeuBarriga extends Hooks {
    @Test
    public void loginSeuBarriga() throws InterruptedException {
        String validEmail = "testelogin@teste";
        String validPassword = "teste123";
        String url = "https://seubarriga.wcaquino.me/login";

        driver.get(url);
        Thread.sleep(2000);

        By email = By.id("email");
        By senha = By.id("senha");
        By botao = By.cssSelector("button[class='btn btn-primary']");

        driver.findElement(email).sendKeys(validEmail);
        driver.findElement(senha).sendKeys(validPassword);
        driver.findElement(botao).click();

        Thread.sleep(2000);
    }
}
