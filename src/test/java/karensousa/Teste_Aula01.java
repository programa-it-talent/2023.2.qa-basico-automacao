package karensousa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Teste_Aula01 {

    @Test
    @DisplayName("Cenario: 2 + 1 = 3")
    public void teste01()
    {
        int r = 2 + 1;
        Assertions.assertEquals(3, r);
    }
}
