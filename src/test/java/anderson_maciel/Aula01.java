package anderson_maciel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Aula01 {
    @Test
    public void testaSoma(){
        int num1 = 5;
        int num2 = 5;
        int soma = num1 + num2;
        Assertions.assertEquals(10,soma);
    }



}
