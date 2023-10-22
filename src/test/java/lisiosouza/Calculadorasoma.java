package lisiosouza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculadorasoma {
    @Test

    public void testSomar() {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(2, 3);
        Assertions.assertEquals(5, resultado);

    }
}


