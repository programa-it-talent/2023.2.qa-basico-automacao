package leohilario;

import mickhill.Hooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Exercicio02Selenium extends Hooks{
    @Test
    @DisplayName("Cenario: usando o navegador")
    public void teste02() throws InterruptedException    {
        driver.get("https://google.com.br");
        By pathInputPesquisa = By.id("APjFqb");
        driver.findElement(pathInputPesquisa).sendKeys("Buscar informações sobre Selenium");

        By pathBtnPesquisa = By.xpath("(//input[@name='btnK'])[2]");
        driver.findElement(pathBtnPesquisa).click();
        Thread.sleep(3000);

        driver.get("https://google.com.br");
        By pathInputPesquisa2 = By.id("APjFqb");
        driver.findElement(pathInputPesquisa2).sendKeys("Buscar videos sobre Selenium");

        By pathBtnPesquisa2 = By.xpath("(//input[@name='btnK'])[2]");
        driver.findElement(pathBtnPesquisa2).click();
        Thread.sleep(3000);
    }

    @Test //Desafio de conter click() e sendKeys
    @DisplayName("Cenario: usando site do gmail")
    public void teste03() throws InterruptedException {
        driver.get("https://www.google.com/intl/pt-BR/gmail/about/");
        By pathInputPesquisa2 = By.cssSelector("body > header > div > div > div > a.button.button--medium.button--mobile-before-hero-only");
        driver.findElement(pathInputPesquisa2).click();

        By pathInputPesquisa3 = By.cssSelector("#identifierId");
        driver.findElement(pathInputPesquisa3).sendKeys("hilarioleozinho@gmail.com");
        Thread.sleep(3000);
    }
}
