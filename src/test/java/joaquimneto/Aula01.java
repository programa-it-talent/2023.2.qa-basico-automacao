package joaquimneto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01 {
    @Test
    @DisplayName("Cenario: 3 - 2 = 1")
    public void teste01()
    {
        int r = 3 - 2;
        Assertions.assertEquals(1, r);
    }
}
