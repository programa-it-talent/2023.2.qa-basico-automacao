package arthur;

import mickhill.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SegundaAtividade extends Hooks {
    By inputEmail = By.id("email");
    By inputPassword = By.id("password");

    By confirmedLogin = By.xpath("//p[text()=\"Registrar ponto\"]");

    public void verifyInitialPage() {
        driver.get("https://beta.pontogo.app/");
    }

    public void setEmail(String _email) {
        driver.findElement(inputEmail).sendKeys(_email);
    }

    public void setPassword(String _password) {
        driver.findElement(inputPassword).sendKeys(_password);
    }

    public void btnLoginClick() throws InterruptedException {
        driver.findElement(inputPassword).submit();
        Thread.sleep(10000);
    }

    public void verifyLogin(String _lastName) throws InterruptedException {
        String text = driver.findElement(confirmedLogin).getText();
        Assertions.assertTrue(text.contains(_lastName));
        Assertions.assertEquals(text, _lastName);
        System.out.println(text);
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Cenário: Login com sucesso")
    public void testLogin() throws InterruptedException {
        this.verifyInitialPage();
        this.setEmail("flex.comum@teste.com");
        this.setPassword("qa1234");
        this.btnLoginClick();
        this.verifyLogin("Registrar ponto");
    }
}
