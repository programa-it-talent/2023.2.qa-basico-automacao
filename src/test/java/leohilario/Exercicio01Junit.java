package leohilario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercicio01Junit {

    @Test
    @DisplayName("Cenario: 10 + 10 = 20")
    public void testesoma()
    {
        int soma = 10 + 10;
        Assertions.assertEquals(20, soma);
    }

    @Test
    @DisplayName("Cenario: 15 - 3 = 12")
    public void testesubtracao()
    {
        int subtracao = 15 - 3;
        Assertions.assertEquals(12, subtracao);
    }

    @Test
    @DisplayName("Cenario: 15 * 3 = 45")
    public void testemultiplicacao()
    {
        int multiplicacao = 15 * 3;
        Assertions.assertEquals(45, multiplicacao);
    }

    @Test
    @DisplayName("Cenario: 50 / 2 = 25")
    public void testedivisao()
    {
        int divisao = 50 / 2;
        Assertions.assertEquals(25, divisao);
    }
}
