package diegoaquino;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Aula02Selenium extends Hooks
{
    @Test
    @DisplayName("Login válido")

    public void teste02() throws InterruptedException
    {
        driver.get("https://the-internet.herokuapp.com/login");
        By pathInputUsername = By.id("username");
        driver.findElement(pathInputUsername).sendKeys("tomsmith");

        By pathInputPassword = By.id("password");
        driver.findElement(pathInputPassword).sendKeys("SuperSecretPassword!");

        Thread.sleep(3000);
    }
}
