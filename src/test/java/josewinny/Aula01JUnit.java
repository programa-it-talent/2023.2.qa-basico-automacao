package josewinny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Aula01JUnit {
    @Test
    @DisplayName("Cenário - não é o José Winny")
    public void testIsntMyName(){
        String input = "José";
        String expected = "José Winny";
        Assertions.assertNotEquals(input,expected);
    }
}
