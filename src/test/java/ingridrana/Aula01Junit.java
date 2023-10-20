package ingridrana;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01Junit {

    @Test
    @DisplayName("Cenario: Verificar numero par")
    public void teste(){
        int valor =  10;
        Assertions.assertTrue(valor%2==0);

    }

    @Test
    @DisplayName("cenario: Verificar numero impar")
    public void teste1(){
        int valor = 23;
        Assertions.assertTrue(valor%2!=0);
    }
}






