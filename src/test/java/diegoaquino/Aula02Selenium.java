package diegoaquino;

import mickhill.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

@DisplayName("Aula 02 - Testes Automatizados da Funcionalidade Login")
public class Aula02Selenium extends Hooks
{
    @Test
    @DisplayName("Login válido")
    public void testLoginValido()
    {
        driver.get("https://the-internet.herokuapp.com/login");

        By pathInputUsername = By.id("username");
        driver.findElement(pathInputUsername).sendKeys("tomsmith");

        By pathInputPassword = By.id("password");
        driver.findElement(pathInputPassword).sendKeys("SuperSecretPassword!");

        By pathBtnLogin =  By.xpath("//form[@id='login']/button");
        driver.findElement(pathBtnLogin).click();

        By pathSuccesMsg = By.id("flash");
        String succesMsg = driver.findElement(pathSuccesMsg).getText();

        Assertions.assertTrue(succesMsg.contains("You logged into a secure area!"), "O elemento não contem o texto esperado!");
    }

    @Test
    @DisplayName("Login inválido")
    public void testLoginIinvalido()
    {
        driver.get("https://the-internet.herokuapp.com/login");

        By pathInputUsername = By.id("username");
        driver.findElement(pathInputUsername).sendKeys("username");

        By pathInputPassword = By.id("password");
        driver.findElement(pathInputPassword).sendKeys("password!");

        By pathBtnLogin =  By.xpath("//form[@id='login']/button");
        driver.findElement(pathBtnLogin).click();

        By pathErrorMsg = By.id("flash");
        String errorMsg = driver.findElement(pathErrorMsg).getText();

        Assertions.assertTrue(errorMsg.contains("Your username is invalid!"), "O elemento não contem o texto esperado!");
    }
}