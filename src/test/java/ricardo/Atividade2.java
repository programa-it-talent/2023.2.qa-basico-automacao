package ricardo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import mickhill.Hooks;

public class Atividade2 extends Hooks{
	
	@Test
	@DisplayName("BuscaTeste")
	public void Test() throws InterruptedException {
		driver.get("https://google.com.br");
        By pathInputPesquisa = By.id("APjFqb");
        driver.findElement(pathInputPesquisa).sendKeys("Programa IT Talent do IREDE");

        By pathBtnPesquisa = By.xpath("(//input[@name='btnK'])[2]");
        driver.findElement(pathBtnPesquisa).click();
        Thread.sleep(5000);
	}
	
}
