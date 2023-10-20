package lucasnorte;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01 {

    @Test
    @DisplayName("Cenario: Soma de dois valores inteiros")
    public void teste01() {

        int resultado = 5 + 5;
        Assertions.assertEquals(10, resultado);

    }

}
