package alexsandro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Atv01Junit {

    @Test
    @DisplayName("Cenario: 5 * 5 = 25")
    public void teste1()
    {
        int x = 5 * 5;
        Assertions.assertEquals(25, x);
    }

}
