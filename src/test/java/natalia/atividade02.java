package natalia;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class atividade02 extends Hooks {

    public static final  String BASE_URL = "https://www.amazon.com.br/";
    @Test
    @DisplayName("Busca com sucesso")

    public void successLogin()throws InterruptedException{
        driver.get(BASE_URL);

        By campoBusca = By.id("twotabsearchtextbox");
        driver.findElement(campoBusca).sendKeys("tv 55");
        Thread.sleep(5000);
        By botaoBusca = By.id("nav-search-submit-button");
        driver.findElement(botaoBusca).click();
        Thread.sleep(5000);
    }


}
