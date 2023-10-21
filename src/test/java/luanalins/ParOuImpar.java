package luanalins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class ParOuImpar {
    public static boolean parOuImpar(int num) {
        if(num % 2  == 0) {
            return true;
        } else {
            return false;
        }
    }
    @Test
    @DisplayName("TESTE 01")
    public void validationPar() {
        Assertions.assertTrue(parOuImpar(8));
    }

    @Test
    @DisplayName("TESTE 02")
    public void validationImpar() {
        Assertions.assertFalse(parOuImpar(19));
    }
}
