package lucasrodrigues;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Aula01Junit
{
    @Test
    public void teste1 ()
    {
        int subtracao =  15 - 8;
        Assertions.assertEquals(7, subtracao);

    }

    @Test
    public void teste2 ()
    {
        boolean namequalquer = "GiveMeUp".contains("Me");
        Assertions.assertTrue(namequalquer);

    }

}
