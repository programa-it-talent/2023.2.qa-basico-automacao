package leonardo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01Junit {

    @Test
    @DisplayName("Cenario: Teste")
    public void teste01() {

        int s = 2 + 5;
        Assertions.assertEquals(7, s);

    }
}
