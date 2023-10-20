package renato;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Teste_Aula01 {

    @Test
    public void teste01(){

        boolean name = "Mick".contains("ck");
        Assertions.assertTrue(name);
    }
}
