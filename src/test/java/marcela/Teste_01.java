package marcela;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Teste_01 {
    @Test
    public void teste_01(){
        String primeiraFrase = "Olá, mundo!";
        String segundaFrase = "Olá, mundo!";
        Assertions.assertEquals(primeiraFrase, segundaFrase);
    }
}
