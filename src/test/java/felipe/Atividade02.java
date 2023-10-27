package felipe;

import mickhill.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Atividade02 extends Hooks {
    public static final  String BASE_URL = "https://the-internet.herokuapp.com/login";
    @Test
    @DisplayName("Login com sucesso")
    public void successLogin() throws InterruptedException {
        driver.navigate().to(BASE_URL);

        By usernameField = By.id("username");
        driver.findElement(usernameField).sendKeys("tomsmith");
        By passwordField = By.id("password");
        driver.findElement(passwordField).sendKeys("SuperSecretPassword!");
        By loginButton = By.id("login");
        driver.findElement(loginButton).submit();

        //Assertion
        Assertions.assertTrue(driver.getCurrentUrl().equals("https://the-internet.herokuapp.com/secure"));
        Assertions.assertTrue(driver.getPageSource().contains("You logged into a secure area!"));
        Thread.sleep(3000);

    }
}
