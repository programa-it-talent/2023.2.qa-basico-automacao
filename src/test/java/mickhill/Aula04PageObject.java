package mickhill;

import mickhill.pages.GooglePesquisaPage;
import mickhill.pages.GoogleResultadosPesquisaPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Aula04PageObject extends Hooks
{
    @Test
    @DisplayName("Cenario: Pesquisa do Google")
    public void teste04() {
        GooglePesquisaPage paginaPesquisa = new GooglePesquisaPage(driver);
        GoogleResultadosPesquisaPage paginaResultados = new GoogleResultadosPesquisaPage(driver);

        paginaPesquisa.abrir();
        paginaPesquisa.preencherCampoPesquisa("O Ronin é estribado!");
        paginaPesquisa.clicarBtnPesquisar();

        Assertions.assertTrue(paginaResultados.verificarSeEstouNapagina());

        Integer valor = paginaResultados.getStatusResultados();
        Assertions.assertTrue(valor > 0);

        List<WebElement> lista = paginaResultados.getListaLinks();
        Assertions.assertTrue(lista.size() > 0);
    }
}
