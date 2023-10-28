package lucasrodrigues;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Aula03MapeandoObjeto extends Hooks
{
    By pathInputUsername = By.cssSelector("input[placeholder='Username']");
    By pathInputPassword = By.cssSelector("input[placeholder='Password']");
    By buttonLogin = By.cssSelector("button[type='submit']");

    @Test
    @DisplayName("Teste OrangeHrm")

    public void testeHRM() throws InterruptedException
    {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.findElement(pathInputUsername).sendKeys("Admin");
        driver.findElement(pathInputPassword).sendKeys("admin123");
        driver.findElement(buttonLogin).click();
        Thread.sleep(5000);
    }
}
