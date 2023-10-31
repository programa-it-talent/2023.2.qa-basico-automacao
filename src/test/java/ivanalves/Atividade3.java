package ivanalves;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class Atividade3 extends Hooks {
	
	
	 @Test
	    @DisplayName("Crie uma automacao com Selenium")
	    public void teste02() throws InterruptedException
	    {
		 
	        driver.get("https://www.tce.ce.gov.br/contexto/#/processos-protocolos");
	        
	        Thread.sleep(3000);
	        By pathInputPesquisa = By.xpath("//input");
	        driver.findElement(pathInputPesquisa).sendKeys("05749/2023-8");
	        Thread.sleep(3000);
	        By pathBtnPesquisa = By.xpath("//span[text() = ' Buscar ']");
	        driver.findElement(pathBtnPesquisa).click();
	        Thread.sleep(5000);
	    }

	 
}
