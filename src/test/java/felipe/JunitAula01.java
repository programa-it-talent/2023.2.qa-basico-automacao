package felipe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitAula01 {
    @Test
    @DisplayName("Cenário 01: resto da divisão 5%2=1")
    public void teste01(){
        float resto = 5%2;
        Assertions.assertEquals(resto, 1);
    }
}
