package italo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teste01 {

    @Test
    public void testSoma() {
        Calculadora c = new Calculadora(2,3);
        assertEquals(5.0, c.soma(), 0.001);
    }
}
