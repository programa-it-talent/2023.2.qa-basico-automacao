package sandro;

import mickhill.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aula02SeleniumTest extends Hooks
{
    By campoEmail = By.id("email");
    By campoSenha = By.id("senha");
    By btnEntrar = By.cssSelector("button[type=submit]");
    By validaLogin = By.className("alert");

    public void waitElement(By element){
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void getPagLogin(){
        driver.get("https://seubarriga.wcaquino.me/login");
    }

    public void preencherCampos(String email, String senha){
        driver.findElement(campoEmail).sendKeys(email);
        driver.findElement(campoSenha).sendKeys(senha);
    }

    public void btnLogin() {
        driver.findElement(btnEntrar).click();
    }

    public void validaLogin(String message){
        String text = driver.findElement(validaLogin).getText();
        Assertions.assertEquals(text, message);
    }

    @Test
    public void test2() {
        this.getPagLogin();
        this.preencherCampos("teste@teste.com", "123456");
        this.btnLogin();
        this.waitElement(validaLogin);
        this.validaLogin("Bem vindo, thiago!");
    }
}
