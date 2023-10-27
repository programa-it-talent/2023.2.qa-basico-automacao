package lucasnorte;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Aula02Selenium extends Hooks {

    @Test
    @DisplayName("Cenario: Login Swag Labs")
    public void teste02() throws InterruptedException
    {
        driver.get("https://www.saucedemo.com/v1/");
        By user = By.id("user-name");
        driver.findElement(user).sendKeys("standard_user");

        By password = By.id("password");
        driver.findElement(password).sendKeys("secret_sauce");

        By bnt = By.id("login-button");
        driver.findElement(bnt).click();
        Thread.sleep(5000);
    }

}
