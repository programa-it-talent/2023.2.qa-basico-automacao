package robertogbezerra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01Junit
{
    private int calcularFatorial (int x) {
        if (x == 0 || x == 1)
            return 1;
        else
            return x * calcularFatorial(x - 1);
    }

    @Test
    @DisplayName("Cenário: fatorial de 5 = 120")
    public void testFatorial()
    {
        int fatorial = calcularFatorial(5);
        Assertions.assertEquals(120, fatorial);
    }
}
