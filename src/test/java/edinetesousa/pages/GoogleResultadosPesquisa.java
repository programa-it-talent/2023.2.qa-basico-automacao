package edinetesousa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.List;

public class GoogleResultadosPesquisa {

    private String url = "google.com.br/search";
    private By textStatusResultados = By.id("result-stats");
    private By listaLinksIndexados = By.cssSelector("div.MjjYud a > h3");
    private WebDriver driver;

    public GoogleResultadosPesquisa(WebDriver navegador) {
        driver = navegador;
    }

    public Boolean verificarSeEstouNapagina(){
        String urlAtual = driver.getCurrentUrl();
        return urlAtual.contains(url);
    }
    public Integer getStatusResultados() {
       String text = driver.findElement(textStatusResultados).getText();
       String numero = text.split(" ")[1];
       numero = numero.replace(",", "");
       numero = numero.replace(".", "");
       return Integer.valueOf(numero);
    }
    public List<WebElement> getListaLinks() {
        List<WebElement> lista = driver.findElements(listaLinksIndexados);
        return lista;
    }
}
