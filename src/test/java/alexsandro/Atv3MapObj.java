package alexsandro;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Atv3MapObj extends Hooks {

    @Test
    @DisplayName("Login Success")

    public void atv3() throws InterruptedException {



        driver.get("http://the-internet.herokuapp.com/login");

        By pathInputUser = By.id("username");
        driver.findElement(pathInputUser).sendKeys("tomsmith");

        By pathInputPass = By.id("password");
        driver.findElement(pathInputPass).sendKeys("SuperSecretPassword!");

        By pathBtn = By.xpath("//button[@class='radius']");
        driver.findElement(pathBtn).click();

        Thread.sleep(2000);

    }





}
