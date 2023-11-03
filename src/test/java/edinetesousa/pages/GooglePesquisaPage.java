package edinetesousa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GooglePesquisaPage {
    private String url = "https://www.google.com.br/";
    private By inputPesquisa = By.id("APjFqb");
    private By btnPesquisar = By.xpath("(//input[@name='btnK'])[2]");;
    private WebDriver driver;
    public GooglePesquisaPage(WebDriver navegador) {driver = navegador;}
    public void abrir(){driver.get(url);}
    public void preencherCampoPesquisa(String _texto) {driver.findElement(inputPesquisa).sendKeys(_texto);}
    public void clicarBtnPesquisar() {driver.findElement(btnPesquisar).click();}
}
