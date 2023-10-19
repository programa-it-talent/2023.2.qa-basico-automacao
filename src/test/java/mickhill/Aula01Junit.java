package mickhill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01Junit
{
    @Test
    @DisplayName("Cenario: 1 + 1 = 2")
    public void teste01()
    {
        int r = 1 + 1;
        Assertions.assertEquals(2, r);
    }
}
