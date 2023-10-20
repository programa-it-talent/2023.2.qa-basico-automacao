package leonardoconceicao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01Junit {
    @Test
    @DisplayName("Cenario: 1 + 1 = 2")
    public void teste01()
    {
        int s = 2 + 5;
        Assertions.assertEquals(7, s);
    }
}
